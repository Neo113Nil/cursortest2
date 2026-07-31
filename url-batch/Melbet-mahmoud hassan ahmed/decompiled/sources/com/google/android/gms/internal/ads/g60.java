package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g60 extends ae implements h60 {
    public g60() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String r7;
        List y6;
        IInterface j7;
        boolean Z2;
        e60 d60Var;
        switch (i7) {
            case 2:
                r7 = r();
                parcel2.writeNoException();
                parcel2.writeString(r7);
                return true;
            case 3:
                y6 = y();
                parcel2.writeNoException();
                parcel2.writeList(y6);
                return true;
            case 4:
                r7 = n();
                parcel2.writeNoException();
                parcel2.writeString(r7);
                return true;
            case 5:
                j7 = j();
                parcel2.writeNoException();
                be.f(parcel2, j7);
                return true;
            case 6:
                r7 = l();
                parcel2.writeNoException();
                parcel2.writeString(r7);
                return true;
            case c4.w0.f2149o /* 7 */:
                r7 = m();
                parcel2.writeNoException();
                parcel2.writeString(r7);
                return true;
            case c4.w0.f2150p /* 8 */:
                double b7 = b();
                parcel2.writeNoException();
                parcel2.writeDouble(b7);
                return true;
            case 9:
                r7 = q();
                parcel2.writeNoException();
                parcel2.writeString(r7);
                return true;
            case 10:
                r7 = p();
                parcel2.writeNoException();
                parcel2.writeString(r7);
                return true;
            case 11:
                j7 = f();
                parcel2.writeNoException();
                be.f(parcel2, j7);
                return true;
            case 12:
                r7 = t();
                parcel2.writeNoException();
                parcel2.writeString(r7);
                return true;
            case 13:
                N();
                parcel2.writeNoException();
                return true;
            case 14:
                j7 = h();
                parcel2.writeNoException();
                be.f(parcel2, j7);
                return true;
            case 15:
                Q5((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                Z2 = Z2((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                be.c(parcel2, Z2);
                return true;
            case 17:
                b5((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                j7 = o();
                parcel2.writeNoException();
                be.f(parcel2, j7);
                return true;
            case 19:
                j7 = k();
                parcel2.writeNoException();
                be.f(parcel2, j7);
                return true;
            case 20:
                Bundle d7 = d();
                parcel2.writeNoException();
                be.e(parcel2, d7);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    d60Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    d60Var = queryLocalInterface instanceof e60 ? (e60) queryLocalInterface : new d60(readStrongBinder);
                }
                F1(d60Var);
                parcel2.writeNoException();
                return true;
            case 22:
                a0();
                parcel2.writeNoException();
                return true;
            case 23:
                y6 = x();
                parcel2.writeNoException();
                parcel2.writeList(y6);
                return true;
            case 24:
                Z2 = c0();
                parcel2.writeNoException();
                be.c(parcel2, Z2);
                return true;
            case 25:
                M4(ly.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                i5(iy.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                u3();
                parcel2.writeNoException();
                return true;
            case 28:
                G();
                parcel2.writeNoException();
                return true;
            case 29:
                j7 = i();
                parcel2.writeNoException();
                be.f(parcel2, j7);
                return true;
            case 30:
                Z2 = J();
                parcel2.writeNoException();
                be.c(parcel2, Z2);
                return true;
            case 31:
                j7 = e();
                parcel2.writeNoException();
                be.f(parcel2, j7);
                return true;
            case 32:
                m2(vy.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
