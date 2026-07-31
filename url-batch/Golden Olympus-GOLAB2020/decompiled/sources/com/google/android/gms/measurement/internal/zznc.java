package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zznc implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzny zzb;

    zznc(zzny zznyVar, zzr zzrVar, boolean z4) {
        this.zza = zzrVar;
        this.zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgl zzglVar;
        zzny zznyVar = this.zzb;
        zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzio zzioVar = zznyVar.zzu;
            zzam zzf = zzioVar.zzf();
            zzgg zzggVar = zzgi.zzbl;
            if (zzf.zzx(null, zzggVar)) {
                zznyVar.zzP(zzglVar, null, zzrVar);
            }
            zzglVar.zzn(zzrVar);
            zznyVar.zzu.zzi().zzm();
            zzioVar.zzf().zzx(null, zzggVar);
            zznyVar.zzP(zzglVar, null, zzrVar);
            zznyVar.zzag();
        } catch (RemoteException e4) {
            this.zzb.zzu.zzaW().zze().zzb("Failed to send app launch to the service", e4);
        }
    }
}
