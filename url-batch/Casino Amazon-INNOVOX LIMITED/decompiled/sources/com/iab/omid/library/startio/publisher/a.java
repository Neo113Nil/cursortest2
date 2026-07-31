package com.iab.omid.library.startio.publisher;

import android.webkit.WebView;

/* loaded from: classes2.dex */
public class a extends AdSessionStatePublisher {
    public a(String str, WebView webView) {
        super(str);
        if (webView != null) {
            com.iab.omid.library.startio.webviewclient.a.a(webView);
        }
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
