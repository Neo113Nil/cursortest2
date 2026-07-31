package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzmk implements Runnable {
    final /* synthetic */ zzmo zza;

    zzmk(zzmo zzmoVar) {
        this.zza = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmh zzmhVar;
        zzmo zzmoVar = this.zza;
        zzmhVar = zzmoVar.zzh;
        zzmoVar.zza = zzmhVar;
    }
}
