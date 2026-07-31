package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ve0 extends ae implements we0 {
    public ve0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            z3(rd0.s6(parcel.readStrongBinder()));
        } else if (i7 == 2) {
            u(parcel.readString());
        } else {
            if (i7 != 3) {
                return false;
            }
            w((cv) be.a(parcel, cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
