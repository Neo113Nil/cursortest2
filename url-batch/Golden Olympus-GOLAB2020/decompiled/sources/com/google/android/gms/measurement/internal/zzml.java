package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzml implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzmo zzb;

    zzml(zzmo zzmoVar, long j4) {
        this.zza = j4;
        this.zzb = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmo zzmoVar = this.zzb;
        zzmoVar.zzu.zzd().zzf(this.zza);
        zzmoVar.zza = null;
    }
}
