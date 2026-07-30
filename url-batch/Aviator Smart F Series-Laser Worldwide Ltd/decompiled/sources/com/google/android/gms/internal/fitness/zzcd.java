package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;

/* loaded from: classes3.dex */
public final class zzcd extends zza {
    zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    }

    public final void zzd(SessionInsertRequest sessionInsertRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, sessionInsertRequest);
        zzk(3, zza);
    }

    public final void zze(SessionReadRequest sessionReadRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, sessionReadRequest);
        zzk(4, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzar zzarVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzarVar);
        zzk(5, zza);
    }

    public final void zzg(com.google.android.gms.fitness.request.zzat zzatVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzatVar);
        zzk(1, zza);
    }

    public final void zzh(com.google.android.gms.fitness.request.zzav zzavVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzavVar);
        zzk(2, zza);
    }

    public final void zzi(com.google.android.gms.fitness.request.zzax zzaxVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzaxVar);
        zzk(6, zza);
    }
}
