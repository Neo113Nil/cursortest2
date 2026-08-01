package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzbpr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzck extends zzavh implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzavi.zze(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            zzbpr adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzavi.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
