package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzkg implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzko zzb;

    zzkg(zzko zzkoVar, long j8) {
        this.zzb = zzkoVar;
        this.zza = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzko.zzl(this.zzb, this.zza);
    }
}
