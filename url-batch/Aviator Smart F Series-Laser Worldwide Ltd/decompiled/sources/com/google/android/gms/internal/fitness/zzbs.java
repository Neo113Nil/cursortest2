package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataTypeResult;

/* loaded from: classes3.dex */
public abstract class zzbs extends zzb implements zzbt {
    public zzbs() {
        super("com.google.android.gms.fitness.internal.IDataTypeCallback");
    }

    public static zzbt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
        return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        DataTypeResult dataTypeResult = (DataTypeResult) zzc.zza(parcel, DataTypeResult.CREATOR);
        zzc.zzb(parcel);
        zzd(dataTypeResult);
        return true;
    }
}
