package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class xm0 extends ae implements ym0 {
    public xm0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            parcel.readString();
            parcel.readString();
        } else if (i7 == 2) {
            s(parcel.readString());
        } else {
            if (i7 != 3) {
                return false;
            }
            b3(parcel.readString(), parcel.readString(), (Bundle) be.a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
