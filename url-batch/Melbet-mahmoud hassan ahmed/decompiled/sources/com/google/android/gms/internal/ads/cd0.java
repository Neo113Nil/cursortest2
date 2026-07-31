package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class cd0 extends ae implements dd0 {
    public cd0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static dd0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof dd0 ? (dd0) queryLocalInterface : new bd0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface s7;
        boolean z6;
        if (i7 != 1) {
            if (i7 == 2) {
                z6 = z(parcel.readString());
            } else if (i7 == 3) {
                s7 = j0(parcel.readString());
            } else {
                if (i7 != 4) {
                    return false;
                }
                z6 = u(parcel.readString());
            }
            parcel2.writeNoException();
            be.c(parcel2, z6);
            return true;
        }
        s7 = s(parcel.readString());
        parcel2.writeNoException();
        be.f(parcel2, s7);
        return true;
    }
}
