package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzawl implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzawp zzb;

    zzawl(zzawp zzawpVar, View view) {
        this.zzb = zzawpVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
