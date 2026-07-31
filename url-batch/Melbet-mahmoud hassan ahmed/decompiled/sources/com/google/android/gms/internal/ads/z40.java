package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z40 extends ae implements a50 {
    public z40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface e7;
        String j7;
        switch (i7) {
            case 2:
                e7 = e();
                parcel2.writeNoException();
                be.f(parcel2, e7);
                return true;
            case 3:
                j7 = j();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 4:
                List o7 = o();
                parcel2.writeNoException();
                parcel2.writeList(o7);
                return true;
            case 5:
                j7 = h();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 6:
                e7 = b();
                parcel2.writeNoException();
                be.f(parcel2, e7);
                return true;
            case c4.w0.f2149o /* 7 */:
                j7 = i();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case c4.w0.f2150p /* 8 */:
                j7 = f();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 9:
                Bundle a7 = a();
                parcel2.writeNoException();
                be.e(parcel2, a7);
                return true;
            case 10:
                m();
                parcel2.writeNoException();
                return true;
            case 11:
                e7 = c();
                parcel2.writeNoException();
                be.f(parcel2, e7);
                return true;
            case 12:
                m3((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean L = L((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                be.c(parcel2, L);
                return true;
            case 14:
                S((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                e7 = g();
                parcel2.writeNoException();
                be.f(parcel2, e7);
                return true;
            case 16:
                e7 = d();
                parcel2.writeNoException();
                be.f(parcel2, e7);
                return true;
            case 17:
                j7 = k();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            default:
                return false;
        }
    }
}
