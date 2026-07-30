package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzjf implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjy zzb;

    zzjf(zzjy zzjyVar, zzq zzqVar) {
        this.zzb = zzjyVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzek zzekVar;
        zzjy zzjyVar = this.zzb;
        zzekVar = zzjyVar.zzb;
        if (zzekVar == null) {
            zzjyVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzekVar.zzj(this.zza);
            this.zzb.zzt.zzi().zzm();
            this.zzb.zzD(zzekVar, null, this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e8) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send app launch to the service", e8);
        }
    }
}
