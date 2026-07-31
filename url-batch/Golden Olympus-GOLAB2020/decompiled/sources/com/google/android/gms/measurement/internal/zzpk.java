package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzpk implements Runnable {
    final /* synthetic */ zzpw zza;
    final /* synthetic */ zzpv zzb;

    zzpk(zzpv zzpvVar, zzpw zzpwVar) {
        this.zza = zzpwVar;
        this.zzb = zzpvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpv zzpvVar = this.zzb;
        zzpv.zzH(zzpvVar, this.zza);
        zzpvVar.zzam();
    }
}
