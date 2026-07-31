package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzkx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzlw zzb;

    zzkx(zzlw zzlwVar, long j4) {
        this.zza = j4;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzio zzioVar = this.zzb.zzu;
        zzhp zzhpVar = zzioVar.zzm().zzf;
        long j4 = this.zza;
        zzhpVar.zzb(j4);
        zzioVar.zzaW().zzd().zzb("Session timeout duration set", Long.valueOf(j4));
    }
}
