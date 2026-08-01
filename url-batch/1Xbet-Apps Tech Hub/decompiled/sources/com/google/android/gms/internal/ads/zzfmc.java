package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfmc implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfmd zzc;

    zzfmc(zzfmd zzfmdVar, WebView webView, String str) {
        this.zzc = zzfmdVar;
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfmd.zzi(this.zza, this.zzb);
    }
}
