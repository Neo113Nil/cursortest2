package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzoh implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzop zzb;

    zzoh(zzop zzopVar, long j4) {
        this.zza = j4;
        this.zzb = zzopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzop.zzl(this.zzb, this.zza);
    }
}
