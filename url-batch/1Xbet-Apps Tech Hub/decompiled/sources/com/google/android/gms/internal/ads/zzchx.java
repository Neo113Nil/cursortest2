package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzchx extends zzchy {
    public zzchx(zzcgv zzcgvVar, zzayp zzaypVar, boolean z, zzefa zzefaVar) {
        super(zzcgvVar, zzaypVar, z, zzefaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchc, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, null);
    }
}
