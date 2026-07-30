package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzit implements Runnable {
    final /* synthetic */ zziq zza;
    final /* synthetic */ zziq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zziy zze;

    zzit(zziy zziyVar, zziq zziqVar, zziq zziqVar2, long j, boolean z) {
        this.zze = zziyVar;
        this.zza = zziqVar;
        this.zzb = zziqVar2;
        this.zzc = j;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
