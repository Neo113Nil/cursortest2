package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbgf extends zzaya implements zzbgg {
    public zzbgf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbgg zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzbgg ? (zzbgg) queryLocalInterface : new zzbge(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zzb(asInterface);
        } else if (i == 2) {
            zzc();
        } else {
            if (i != 3) {
                return false;
            }
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zzd(asInterface2);
        }
        parcel2.writeNoException();
        return true;
    }
}
