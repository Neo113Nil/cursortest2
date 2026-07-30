package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;

/* loaded from: classes3.dex */
public final class zzca extends zza {
    zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    }

    public final void zzd(DataDeleteRequest dataDeleteRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, dataDeleteRequest);
        zzk(3, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzk zzkVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzkVar);
        zzk(2, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzh zzhVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzhVar);
        zzk(7, zza);
    }

    public final void zzg(DataReadRequest dataReadRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, dataReadRequest);
        zzk(1, zza);
    }

    public final void zzh(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, dataUpdateListenerRegistrationRequest);
        zzk(10, zza);
    }

    public final void zzi(com.google.android.gms.fitness.request.zzs zzsVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzsVar);
        zzk(11, zza);
    }

    public final void zzj(DataUpdateRequest dataUpdateRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, dataUpdateRequest);
        zzk(9, zza);
    }
}
