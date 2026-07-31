package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
import x3.a;

/* loaded from: classes.dex */
public abstract class wv0 extends ae implements xv0 {
    public wv0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String d7;
        switch (i7) {
            case 1:
                S((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle Z4 = Z4((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                be.e(parcel2, Z4);
                return true;
            case 3:
                J2(parcel.readString(), parcel.readString(), (Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                f3(parcel.readString(), parcel.readString(), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map K4 = K4(parcel.readString(), parcel.readString(), be.g(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(K4);
                return true;
            case 6:
                int s7 = s(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(s7);
                return true;
            case c4.w0.f2149o /* 7 */:
                L((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case c4.w0.f2150p /* 8 */:
                v5(parcel.readString(), parcel.readString(), (Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List M1 = M1(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(M1);
                return true;
            case 10:
                d7 = d();
                parcel2.writeNoException();
                parcel2.writeString(d7);
                return true;
            case 11:
                d7 = h();
                parcel2.writeNoException();
                parcel2.writeString(d7);
                return true;
            case 12:
                long c7 = c();
                parcel2.writeNoException();
                parcel2.writeLong(c7);
                return true;
            case 13:
                m0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                O4(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                L5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                d7 = f();
                parcel2.writeNoException();
                parcel2.writeString(d7);
                return true;
            case 17:
                d7 = e();
                parcel2.writeNoException();
                parcel2.writeString(d7);
                return true;
            case 18:
                d7 = b();
                parcel2.writeNoException();
                parcel2.writeString(d7);
                return true;
            case 19:
                y0((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
