package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfmn implements Runnable {
    final /* synthetic */ zzfmo zza;
    private final WebView zzb;

    zzfmn(zzfmo zzfmoVar) {
        WebView webView;
        this.zza = zzfmoVar;
        webView = zzfmoVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
