package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzkv implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzlw zzb;

    zzkv(zzlw zzlwVar, boolean z4) {
        this.zza = z4;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.zzb;
        zzio zzioVar = zzlwVar.zzu;
        boolean zzJ = zzioVar.zzJ();
        boolean zzI = zzioVar.zzI();
        boolean z4 = this.zza;
        zzioVar.zzF(z4);
        if (zzI == z4) {
            zzioVar.zzaW().zzj().zzb("Default data collection state already set to", Boolean.valueOf(z4));
        }
        if (zzioVar.zzJ() == zzJ || zzioVar.zzJ() != zzioVar.zzI()) {
            zzioVar.zzaW().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(z4), Boolean.valueOf(zzJ));
        }
        zzlwVar.zzat();
    }
}
