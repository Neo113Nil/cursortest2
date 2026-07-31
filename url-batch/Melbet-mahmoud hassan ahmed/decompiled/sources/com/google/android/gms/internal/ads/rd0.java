package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import x3.a;

/* loaded from: classes.dex */
public abstract class rd0 extends ae implements sd0 {
    public rd0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static sd0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof sd0 ? (sd0) queryLocalInterface : new qd0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String p7;
        IInterface k7;
        boolean H;
        float d7;
        switch (i7) {
            case 2:
                p7 = p();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case 3:
                List x6 = x();
                parcel2.writeNoException();
                parcel2.writeList(x6);
                return true;
            case 4:
                p7 = r();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case 5:
                k7 = k();
                parcel2.writeNoException();
                be.f(parcel2, k7);
                return true;
            case 6:
                p7 = t();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case c4.w0.f2149o /* 7 */:
                p7 = l();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case c4.w0.f2150p /* 8 */:
                double b7 = b();
                parcel2.writeNoException();
                parcel2.writeDouble(b7);
                return true;
            case 9:
                p7 = y();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case 10:
                p7 = q();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case 11:
                k7 = i();
                parcel2.writeNoException();
                be.f(parcel2, k7);
                return true;
            case 12:
                parcel2.writeNoException();
                k7 = null;
                be.f(parcel2, k7);
                return true;
            case 13:
                k7 = o();
                parcel2.writeNoException();
                be.f(parcel2, k7);
                return true;
            case 14:
                k7 = m();
                parcel2.writeNoException();
                be.f(parcel2, k7);
                return true;
            case 15:
                k7 = n();
                parcel2.writeNoException();
                be.f(parcel2, k7);
                return true;
            case 16:
                Bundle h7 = h();
                parcel2.writeNoException();
                be.e(parcel2, h7);
                return true;
            case 17:
                H = H();
                parcel2.writeNoException();
                be.c(parcel2, H);
                return true;
            case 18:
                H = G();
                parcel2.writeNoException();
                be.c(parcel2, H);
                return true;
            case 19:
                N();
                parcel2.writeNoException();
                return true;
            case 20:
                k2(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                K5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                P3(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                d7 = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d7);
                return true;
            case 24:
                d7 = f();
                parcel2.writeNoException();
                parcel2.writeFloat(d7);
                return true;
            case 25:
                d7 = e();
                parcel2.writeNoException();
                parcel2.writeFloat(d7);
                return true;
            default:
                return false;
        }
    }
}
