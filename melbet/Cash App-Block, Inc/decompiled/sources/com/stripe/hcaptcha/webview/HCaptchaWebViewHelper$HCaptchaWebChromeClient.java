package com.stripe.hcaptcha.webview;

import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class HCaptchaWebViewHelper$HCaptchaWebChromeClient extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.getClass();
        Log.d("hCaptchaWebView", "[webview] onConsoleMessage " + consoleMessage.message());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        webView.getClass();
        Log.d("hCaptchaWebView", "[webview] onProgressChanged " + i + "%");
    }
}
