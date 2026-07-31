package com.google.android.gms.internal.ads;

import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class pe0 extends ae implements qe0 {
    public pe0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            i0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
        } else if (i7 == 2) {
            u(parcel.readString());
        } else if (i7 == 3) {
            w((cv) be.a(parcel, cv.CREATOR));
        } else {
            if (i7 != 4) {
                return false;
            }
            d6(ld0.s6(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
