package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class o80 extends ae implements p80 {
    public o80() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            z(parcel.readString());
        } else {
            if (i7 != 2) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
