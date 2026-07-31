package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class vy extends ae implements wy {
    public vy() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static wy s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof wy ? (wy) queryLocalInterface : new uy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        s5((rv) be.a(parcel, rv.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
