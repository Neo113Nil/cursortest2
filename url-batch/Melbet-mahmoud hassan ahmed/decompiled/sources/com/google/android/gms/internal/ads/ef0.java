package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ef0 extends ae implements ff0 {
    public ef0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            u(parcel.readString());
        } else if (i7 == 2) {
            z(parcel.readString());
        } else {
            if (i7 != 3) {
                return false;
            }
            Y5((cv) be.a(parcel, cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
