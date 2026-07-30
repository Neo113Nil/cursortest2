package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class l extends WebChromeClient {

    /* renamed from: b, reason: collision with root package name */
    private static final String f18244b = "H5_ENTRY";

    /* renamed from: a, reason: collision with root package name */
    WindVaneWebView f18245a;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.express.web.c f18246c;

    public l(WindVaneWebView windVaneWebView) {
        this.f18245a = windVaneWebView;
    }

    public final void a(com.anythink.core.express.web.c cVar) {
        this.f18246c = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        d signalCommunication = this.f18245a.getSignalCommunication();
        if (signalCommunication != null) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message) || !message.startsWith("mv://")) {
                return false;
            }
            if (message.contains("wv_hybrid:") && signalCommunication.a("wv_hybrid:")) {
                signalCommunication.c(message.substring(0, message.lastIndexOf(" ") + 1));
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        d signalCommunication = this.f18245a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.a(str3)) {
            return false;
        }
        signalCommunication.c(str2);
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.anythink.core.express.web.c cVar = this.f18246c;
        if (cVar != null) {
            cVar.onProgressChanged(webView, i);
        }
    }
}
