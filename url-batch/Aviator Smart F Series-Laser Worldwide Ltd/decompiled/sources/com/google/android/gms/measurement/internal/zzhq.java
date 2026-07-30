package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class zzhq implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzij zzc;

    zzhq(zzij zzijVar, AtomicReference atomicReference, boolean z7) {
        this.zzc = zzijVar;
        this.zza = atomicReference;
        this.zzb = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzt.zzt().zzx(this.zza, this.zzb);
    }
}
