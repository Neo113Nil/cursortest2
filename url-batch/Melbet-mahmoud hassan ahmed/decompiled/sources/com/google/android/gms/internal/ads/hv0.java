package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
/* loaded from: classes.dex */
public final class hv0 extends iv0 {
    public hv0(eu0 eu0Var, ar arVar, boolean z6) {
        super(eu0Var, arVar, z6);
    }

    @Override // com.google.android.gms.internal.ads.lu0, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return z0(webView, str, null);
    }
}
