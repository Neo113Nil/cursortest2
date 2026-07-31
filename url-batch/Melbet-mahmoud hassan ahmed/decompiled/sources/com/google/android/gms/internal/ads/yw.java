package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class yw extends ae implements zw {
    public yw() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                g();
                break;
            case 2:
                D(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                h();
                break;
            case 5:
                i();
                break;
            case 6:
                c();
                break;
            case c4.w0.f2149o /* 7 */:
                e();
                break;
            case c4.w0.f2150p /* 8 */:
                w((cv) be.a(parcel, cv.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
