package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;

/* loaded from: classes3.dex */
public final class zzby extends zza {
    zzby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    }

    public final void zzd(DataTypeCreateRequest dataTypeCreateRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, dataTypeCreateRequest);
        zzk(1, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzv zzvVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzvVar);
        zzk(22, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzp zzpVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzpVar);
        zzk(2, zza);
    }
}
