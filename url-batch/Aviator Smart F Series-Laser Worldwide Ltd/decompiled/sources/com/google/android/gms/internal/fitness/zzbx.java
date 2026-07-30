package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.StartBleScanRequest;

/* loaded from: classes3.dex */
public final class zzbx extends zza {
    zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzfVar);
        zzk(3, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzac zzacVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzacVar);
        zzk(5, zza);
    }

    public final void zzf(StartBleScanRequest startBleScanRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, startBleScanRequest);
        zzk(1, zza);
    }

    public final void zzg(com.google.android.gms.fitness.request.zzbb zzbbVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzbbVar);
        zzk(2, zza);
    }

    public final void zzh(com.google.android.gms.fitness.request.zzbf zzbfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzbfVar);
        zzk(4, zza);
    }
}
