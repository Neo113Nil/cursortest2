package com.google.android.gms.internal.ads;

import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class e20 extends ae implements f20 {
    public e20() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String a7;
        if (i7 == 1) {
            a7 = a();
        } else {
            if (i7 != 2) {
                if (i7 == 3) {
                    L0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                } else if (i7 == 4) {
                    b();
                } else {
                    if (i7 != 5) {
                        return false;
                    }
                    d();
                }
                parcel2.writeNoException();
                return true;
            }
            a7 = c();
        }
        parcel2.writeNoException();
        parcel2.writeString(a7);
        return true;
    }
}
