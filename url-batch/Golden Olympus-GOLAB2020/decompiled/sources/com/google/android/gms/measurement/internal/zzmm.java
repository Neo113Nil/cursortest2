package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzmm implements Runnable {
    final /* synthetic */ zzmh zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzmo zzc;

    zzmm(zzmo zzmoVar, zzmh zzmhVar, long j4) {
        this.zza = zzmhVar;
        this.zzb = j4;
        this.zzc = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmo zzmoVar = this.zzc;
        zzmoVar.zzC(this.zza, false, this.zzb);
        zzmoVar.zza = null;
        zzmoVar.zzu.zzu().zzS(null);
    }
}
