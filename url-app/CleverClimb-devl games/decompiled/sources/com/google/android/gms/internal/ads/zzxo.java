package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzxo extends zzek implements zzxn {
    public zzxo() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzxn zzr(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzxn ? (zzxn) queryLocalInterface : new zzxp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzbm;
        switch (i) {
            case 1:
                zzbm = zzbm(parcel.readString());
                break;
            case 2:
                boolean zzbn = zzbn(parcel.readString());
                parcel2.writeNoException();
                zzel.zza(parcel2, zzbn);
                return true;
            case 3:
                zzbm = zzbq(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzel.zza(parcel2, zzbm);
        return true;
    }
}
