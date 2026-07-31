package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zznq implements Runnable {
    final /* synthetic */ zzgl zza;
    final /* synthetic */ zznx zzb;

    zznq(zznx zznxVar, zzgl zzglVar) {
        this.zza = zzglVar;
        this.zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznx zznxVar = this.zzb;
        synchronized (zznxVar) {
            try {
                zznxVar.zzb = false;
                zzny zznyVar = zznxVar.zza;
                if (!zznyVar.zzaa()) {
                    zznyVar.zzu.zzaW().zzj().zza("Connected to service");
                    zznyVar.zzW(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
