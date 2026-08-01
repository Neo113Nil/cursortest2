package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzchz extends zzchy {
    public zzchz(zzcgv zzcgvVar, zzayp zzaypVar, boolean z, zzefa zzefaVar) {
        super(zzcgvVar, zzaypVar, z, zzefaVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzN(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
