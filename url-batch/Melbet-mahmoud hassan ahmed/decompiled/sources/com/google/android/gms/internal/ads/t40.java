package com.google.android.gms.internal.ads;

import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class t40 extends ae implements u40 {
    public t40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            k1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
        } else if (i7 == 2) {
            g();
        } else {
            if (i7 != 3) {
                return false;
            }
            s0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
