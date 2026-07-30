package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataSourcesRequest;

/* loaded from: classes3.dex */
public final class zzcc extends zza {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    }

    public final void zzd(DataSourcesRequest dataSourcesRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, dataSourcesRequest);
        zzk(1, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzak zzakVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzakVar);
        zzk(2, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzan zzanVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzanVar);
        zzk(3, zza);
    }
}
