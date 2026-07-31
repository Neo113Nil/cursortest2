package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class qi0 extends ae implements ri0 {
    public qi0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            U0((ParcelFileDescriptor) be.a(parcel, ParcelFileDescriptor.CREATOR));
        } else {
            if (i7 != 2) {
                return false;
            }
            z1((a3.f0) be.a(parcel, a3.f0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
