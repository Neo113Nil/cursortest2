package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

/* loaded from: classes3.dex */
public abstract class zzcf extends zzb implements zzcg {
    public zzcf() {
        super("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
    }

    public static zzcg zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
        return queryLocalInterface instanceof zzcg ? (zzcg) queryLocalInterface : new zzce(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        ListSubscriptionsResult listSubscriptionsResult = (ListSubscriptionsResult) zzc.zza(parcel, ListSubscriptionsResult.CREATOR);
        zzc.zzb(parcel);
        zzd(listSubscriptionsResult);
        return true;
    }
}
