package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class l90 extends ae implements m90 {
    public l90() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static m90 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof m90 ? (m90) queryLocalInterface : new k90(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        j3(parcel.createTypedArrayList(f90.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
