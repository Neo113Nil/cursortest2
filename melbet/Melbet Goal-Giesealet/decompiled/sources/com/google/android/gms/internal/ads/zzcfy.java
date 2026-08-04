package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzcfy extends zzcfx {
    public zzcfy(zzcek zzcekVar, zzbbh zzbbhVar, boolean z, zzecy zzecyVar) {
        super(zzcekVar, zzbbhVar, z, zzecyVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzaa(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
