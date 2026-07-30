package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes3.dex */
final class zzkq extends zzap {
    final /* synthetic */ zzkr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzkq(zzkr zzkrVar, zzgz zzgzVar) {
        super(zzgzVar);
        this.zza = zzkrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        this.zza.zza();
        this.zza.zzt.zzaA().zzj().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzX();
    }
}
