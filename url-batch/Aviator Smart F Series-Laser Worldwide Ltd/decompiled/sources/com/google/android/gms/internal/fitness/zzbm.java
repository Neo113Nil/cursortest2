package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataReadResult;

/* loaded from: classes3.dex */
public abstract class zzbm extends zzb implements zzbn {
    public zzbm() {
        super("com.google.android.gms.fitness.internal.IDataReadCallback");
    }

    public static zzbn zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
        return queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        DataReadResult dataReadResult = (DataReadResult) zzc.zza(parcel, DataReadResult.CREATOR);
        zzc.zzb(parcel);
        zzd(dataReadResult);
        return true;
    }
}
