package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzcb extends zza {
    zzcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.zzae zzaeVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzaeVar);
        zzk(3, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzbd zzbdVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzbdVar);
        zzk(1, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzbh zzbhVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzbhVar);
        zzk(2, zza);
    }
}
