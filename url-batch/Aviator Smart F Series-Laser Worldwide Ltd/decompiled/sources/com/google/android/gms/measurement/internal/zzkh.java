package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzkh implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzko zzb;

    zzkh(zzko zzkoVar, long j8) {
        this.zzb = zzkoVar;
        this.zza = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzko.zzj(this.zzb, this.zza);
    }
}
