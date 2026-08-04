package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfna implements Runnable {
    final /* synthetic */ zzfnb zza;
    private final WebView zzb;

    zzfna(zzfnb zzfnbVar) {
        Objects.requireNonNull(zzfnbVar);
        this.zza = zzfnbVar;
        this.zzb = zzfnbVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
