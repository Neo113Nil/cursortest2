package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzmj implements Runnable {
    final /* synthetic */ zzmh zza;
    final /* synthetic */ zzmh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzmo zze;

    zzmj(zzmo zzmoVar, zzmh zzmhVar, zzmh zzmhVar2, long j4, boolean z4) {
        this.zza = zzmhVar;
        this.zzb = zzmhVar2;
        this.zzc = j4;
        this.zzd = z4;
        this.zze = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
