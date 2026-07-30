package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhn implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzij zzb;

    zzhn(zzij zzijVar, long j8) {
        this.zzb = zzijVar;
        this.zza = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzm().zzf.zzb(this.zza);
        this.zzb.zzt.zzaA().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
