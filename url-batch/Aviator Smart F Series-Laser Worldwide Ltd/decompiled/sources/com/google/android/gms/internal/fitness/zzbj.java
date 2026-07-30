package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DailyTotalResult;

/* loaded from: classes3.dex */
public abstract class zzbj extends zzb implements zzbk {
    public zzbj() {
        super("com.google.android.gms.fitness.internal.IDailyTotalCallback");
    }

    public static zzbk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
        return queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        DailyTotalResult dailyTotalResult = (DailyTotalResult) zzc.zza(parcel, DailyTotalResult.CREATOR);
        zzc.zzb(parcel);
        zzd(dailyTotalResult);
        return true;
    }
}
