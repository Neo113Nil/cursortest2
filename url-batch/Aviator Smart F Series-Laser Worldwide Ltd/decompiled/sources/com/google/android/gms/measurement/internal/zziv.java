package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zziv implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zziy zzb;

    zziv(zziy zziyVar, long j8) {
        this.zzb = zziyVar;
        this.zza = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
