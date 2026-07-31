package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class fx extends ae implements gx {
    public fx() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String b7;
        if (i7 != 1) {
            if (i7 == 2) {
                b7 = b();
            } else {
                if (i7 == 3) {
                    boolean h7 = h();
                    parcel2.writeNoException();
                    be.c(parcel2, h7);
                    return true;
                }
                if (i7 == 4) {
                    b7 = d();
                } else {
                    if (i7 != 5) {
                        return false;
                    }
                    q1((kv) be.a(parcel, kv.CREATOR), parcel.readInt());
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(b7);
            return true;
        }
        Y1((kv) be.a(parcel, kv.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
