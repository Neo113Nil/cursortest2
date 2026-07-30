package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class zzdu implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzef zzk;

    zzdu(zzef zzefVar, boolean z7) {
        this.zzk = zzefVar;
        this.zzh = zzefVar.zza.currentTimeMillis();
        this.zzi = zzefVar.zza.elapsedRealtime();
        this.zzj = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        z7 = this.zzk.zzh;
        if (z7) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e8) {
            this.zzk.zzT(e8, false, this.zzj);
            zzb();
        }
    }

    abstract void zza();

    protected void zzb() {
    }
}
