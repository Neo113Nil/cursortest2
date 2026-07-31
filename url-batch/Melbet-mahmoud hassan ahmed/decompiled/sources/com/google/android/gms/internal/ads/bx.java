package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class bx extends ae implements dx {
    public bx() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            c();
        } else {
            if (i7 != 2) {
                return false;
            }
            o0((cv) be.a(parcel, cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
