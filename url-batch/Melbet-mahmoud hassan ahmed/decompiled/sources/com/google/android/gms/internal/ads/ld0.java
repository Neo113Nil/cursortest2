package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ld0 extends ae implements md0 {
    public ld0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static md0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof md0 ? (md0) queryLocalInterface : new kd0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            x3.a b7 = b();
            parcel2.writeNoException();
            be.f(parcel2, b7);
        } else {
            if (i7 != 2) {
                return false;
            }
            boolean d7 = d();
            parcel2.writeNoException();
            be.c(parcel2, d7);
        }
        return true;
    }
}
