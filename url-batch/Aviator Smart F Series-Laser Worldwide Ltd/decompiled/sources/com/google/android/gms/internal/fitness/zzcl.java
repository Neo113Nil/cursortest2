package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SessionStopResult;

/* loaded from: classes3.dex */
public abstract class zzcl extends zzb implements zzcm {
    public zzcl() {
        super("com.google.android.gms.fitness.internal.ISessionStopCallback");
    }

    public static zzcm zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
        return queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        SessionStopResult sessionStopResult = (SessionStopResult) zzc.zza(parcel, SessionStopResult.CREATOR);
        zzc.zzb(parcel);
        zzd(sessionStopResult);
        return true;
    }
}
