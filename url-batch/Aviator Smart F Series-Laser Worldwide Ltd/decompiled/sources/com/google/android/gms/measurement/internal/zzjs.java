package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzjs implements Runnable {
    final /* synthetic */ zzek zza;
    final /* synthetic */ zzjx zzb;

    zzjs(zzjx zzjxVar, zzek zzekVar) {
        this.zzb = zzjxVar;
        this.zza = zzekVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            try {
                this.zzb.zzb = false;
                if (!this.zzb.zza.zzL()) {
                    this.zzb.zza.zzt.zzaA().zzj().zza("Connected to service");
                    this.zzb.zza.zzJ(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
