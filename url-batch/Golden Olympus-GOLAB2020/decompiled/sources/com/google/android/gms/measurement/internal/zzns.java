package com.google.android.gms.measurement.internal;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzns implements Runnable {
    final /* synthetic */ zzgl zza;
    final /* synthetic */ zznx zzb;

    zzns(zznx zznxVar, zzgl zzglVar) {
        this.zza = zzglVar;
        this.zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2;
        zznx zznxVar = this.zzb;
        synchronized (zznxVar) {
            try {
                zznxVar.zzb = false;
                zzny zznyVar = zznxVar.zza;
                if (!zznyVar.zzaa()) {
                    zznyVar.zzu.zzaW().zzd().zza("Connected to remote service");
                    zznyVar.zzW(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzny zznyVar2 = this.zzb.zza;
        if (zznyVar2.zzu.zzf().zzx(null, zzgi.zzbo)) {
            scheduledExecutorService = zznyVar2.zze;
            if (scheduledExecutorService != null) {
                scheduledExecutorService2 = zznyVar2.zze;
                scheduledExecutorService2.shutdownNow();
                zznyVar2.zze = null;
            }
        }
    }
}
