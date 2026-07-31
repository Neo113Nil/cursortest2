package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class zzeu implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzff zzk;

    zzeu(zzff zzffVar, boolean z4) {
        this.zzk = zzffVar;
        this.zzh = zzffVar.zza.currentTimeMillis();
        this.zzi = zzffVar.zza.elapsedRealtime();
        this.zzj = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        z4 = this.zzk.zzh;
        if (z4) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e4) {
            this.zzk.zzU(e4, false, this.zzj);
            zzb();
        }
    }

    abstract void zza();

    protected void zzb() {
    }
}
