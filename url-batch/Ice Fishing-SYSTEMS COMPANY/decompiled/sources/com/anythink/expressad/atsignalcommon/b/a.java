package com.anythink.expressad.atsignalcommon.b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class a implements com.anythink.expressad.atsignalcommon.windvane.c {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f18102a = "RVWindVaneWebView";

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(Object obj) {
    }

    @Override // com.anythink.core.express.web.c
    public void loadingResourceStatus(WebView webView, int i) {
    }

    @Override // com.anythink.core.express.web.c
    public void onPageFinished(WebView webView, String str) {
    }

    @Override // com.anythink.core.express.web.c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.anythink.core.express.web.c
    public void onProgressChanged(WebView webView, int i) {
    }

    @Override // com.anythink.core.express.web.c
    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    @Override // com.anythink.core.express.web.c
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.anythink.core.express.web.c
    public void onRenderProcessGone(WebView webView) {
    }

    @Override // com.anythink.core.express.web.c
    public void readyState(WebView webView, int i) {
    }

    @Override // com.anythink.core.express.web.c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public void a(String str, int i, int i4) {
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.c
    public String a(String str) {
        return "{}";
    }
}
