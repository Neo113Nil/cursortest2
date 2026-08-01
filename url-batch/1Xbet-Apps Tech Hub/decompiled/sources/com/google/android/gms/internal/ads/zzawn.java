package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzawn implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzawf zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzawp zze;

    zzawn(zzawp zzawpVar, final zzawf zzawfVar, final WebView webView, final boolean z) {
        this.zze = zzawpVar;
        this.zzb = zzawfVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzawm
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzawn.this.zze.zzd(zzawfVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
