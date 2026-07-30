package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzftn implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzftn(zzfto zzftoVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzftoVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfto.zzk(this.zza, this.zzb);
    }
}
