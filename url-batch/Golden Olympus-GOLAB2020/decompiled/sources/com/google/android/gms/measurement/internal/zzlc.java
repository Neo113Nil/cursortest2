package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzlc implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlw zzc;

    zzlc(zzlw zzlwVar, AtomicReference atomicReference, boolean z4) {
        this.zza = atomicReference;
        this.zzb = z4;
        this.zzc = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzu.zzu().zzJ(this.zza, this.zzb);
    }
}
