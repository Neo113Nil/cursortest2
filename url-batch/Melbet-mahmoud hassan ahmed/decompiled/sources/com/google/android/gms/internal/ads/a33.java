package com.google.android.gms.internal.ads;

import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class a33 extends ae implements b33 {
    public a33() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                parcel2.writeNoException();
                return true;
            case 6:
            case c4.w0.f2149o /* 7 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case c4.w0.f2150p /* 8 */:
                a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
