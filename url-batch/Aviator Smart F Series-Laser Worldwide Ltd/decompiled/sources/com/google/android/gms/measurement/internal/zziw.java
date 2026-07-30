package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zziw implements Runnable {
    final /* synthetic */ zziq zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zziy zzc;

    zziw(zziy zziyVar, zziq zziqVar, long j8) {
        this.zzc = zziyVar;
        this.zza = zziqVar;
        this.zzb = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zziy zziyVar = this.zzc;
        zziyVar.zza = null;
        zziyVar.zzt.zzt().zzG(null);
    }
}
