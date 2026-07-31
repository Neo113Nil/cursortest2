package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class se0 extends ae implements te0 {
    public se0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            e();
        } else if (i7 == 3) {
            u(parcel.readString());
        } else {
            if (i7 != 4) {
                return false;
            }
            w((cv) be.a(parcel, cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
