package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.GoalsReadRequest;

/* loaded from: classes3.dex */
public final class zzbz extends zza {
    zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
    }

    public final void zzd(GoalsReadRequest goalsReadRequest) {
        Parcel zza = zza();
        zzc.zzc(zza, goalsReadRequest);
        zzk(1, zza);
    }
}
