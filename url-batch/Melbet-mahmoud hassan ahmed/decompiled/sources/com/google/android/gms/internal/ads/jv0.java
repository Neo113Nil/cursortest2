package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* loaded from: classes.dex */
public final class jv0 extends iv0 {
    public jv0(eu0 eu0Var, ar arVar, boolean z6) {
        super(eu0Var, arVar, z6);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return z0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
