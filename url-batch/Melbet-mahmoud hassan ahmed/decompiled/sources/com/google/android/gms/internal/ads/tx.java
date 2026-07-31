package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class tx extends ae implements ux {
    public tx() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static ux s6(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof ux ? (ux) queryLocalInterface : new sx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        z0(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
