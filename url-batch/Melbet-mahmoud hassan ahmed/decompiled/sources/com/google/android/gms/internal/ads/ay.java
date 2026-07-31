package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ay extends ae implements by {
    public ay() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            C0((cv) be.a(parcel, cv.CREATOR));
        } else if (i7 == 2) {
            d();
        } else if (i7 == 3) {
            c();
        } else if (i7 == 4) {
            b();
        } else {
            if (i7 != 5) {
                return false;
            }
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
