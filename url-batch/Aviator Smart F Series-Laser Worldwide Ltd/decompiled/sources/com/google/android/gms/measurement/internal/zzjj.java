package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzjj implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjy zzd;

    zzjj(zzjy zzjyVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjyVar;
        this.zza = zzawVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzge zzgeVar;
        zzek zzekVar;
        byte[] bArr = null;
        try {
            try {
                zzjy zzjyVar = this.zzd;
                zzekVar = zzjyVar.zzb;
                if (zzekVar == null) {
                    zzjyVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzgeVar = this.zzd.zzt;
                } else {
                    bArr = zzekVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzgeVar = this.zzd.zzt;
                }
            } catch (RemoteException e8) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e8);
                zzgeVar = this.zzd.zzt;
            }
            zzgeVar.zzv().zzT(this.zzc, bArr);
        } catch (Throwable th) {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
            throw th;
        }
    }
}
