package main

import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleContext

class UEGitPlugin : AbstractUIPlugin() {
    companion object {
        val PLUGIN_ID = "uEGit"
        var defaultPlugin: UEGitPlugin? = null
    }
    
    override fun start(context: BundleContext) {
        super.start(context)
        defaultPlugin = this
    }

    override fun stop(context: BundleContext) {
        defaultPlugin = null
        super.stop(context)
    }
}


