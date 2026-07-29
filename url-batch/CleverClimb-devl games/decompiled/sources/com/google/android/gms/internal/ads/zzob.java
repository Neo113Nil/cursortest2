package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzob extends zzek implements zzoa {
    public zzob() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzjn;
        switch (i) {
            case 1:
                zzjn = zzjn();
                parcel2.writeNoException();
                parcel2.writeString(zzjn);
                return true;
            case 2:
                zzjn = getContent();
                parcel2.writeNoException();
                parcel2.writeString(zzjn);
                return true;
            case 3:
                zzg(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                recordClick();
                parcel2.writeNoException();
                return true;
            case 5:
                recordImpression();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
