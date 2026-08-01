package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
final class zzbv extends WebViewClient {
    final /* synthetic */ zzbw zza;

    /* synthetic */ zzbv(zzbw zzbwVar, zzbu zzbuVar) {
        this.zza = zzbwVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzcc zzccVar;
        if (zzbw.zze(this.zza, str)) {
            zzccVar = this.zza.zzb;
            zzccVar.zzd(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        z = this.zza.zzc;
        if (z) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        this.zza.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        zzcc zzccVar;
        zzccVar = this.zza.zzb;
        zzccVar.zze(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzcc zzccVar;
        String uri = webResourceRequest.getUrl().toString();
        if (!zzbw.zze(this.zza, uri)) {
            return false;
        }
        zzccVar = this.zza.zzb;
        zzccVar.zzd(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzcc zzccVar;
        if (!zzbw.zze(this.zza, str)) {
            return false;
        }
        zzccVar = this.zza.zzb;
        zzccVar.zzd(str);
        return true;
    }
}
