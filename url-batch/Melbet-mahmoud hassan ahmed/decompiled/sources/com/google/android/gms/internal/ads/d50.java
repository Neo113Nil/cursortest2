package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import x3.a;

/* loaded from: classes.dex */
public abstract class d50 extends ae implements e50 {
    public d50() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static e50 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof e50 ? (e50) queryLocalInterface : new c50(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String U5;
        IInterface z6;
        boolean N0;
        switch (i7) {
            case 1:
                U5 = U5(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(U5);
                return true;
            case 2:
                z6 = z(parcel.readString());
                parcel2.writeNoException();
                be.f(parcel2, z6);
                return true;
            case 3:
                List<String> i9 = i();
                parcel2.writeNoException();
                parcel2.writeStringList(i9);
                return true;
            case 4:
                U5 = f();
                parcel2.writeNoException();
                parcel2.writeString(U5);
                return true;
            case 5:
                P0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                m();
                parcel2.writeNoException();
                return true;
            case c4.w0.f2149o /* 7 */:
                z6 = b();
                parcel2.writeNoException();
                be.f(parcel2, z6);
                return true;
            case c4.w0.f2150p /* 8 */:
                j();
                parcel2.writeNoException();
                return true;
            case 9:
                z6 = e();
                parcel2.writeNoException();
                be.f(parcel2, z6);
                return true;
            case 10:
                N0 = N0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                be.c(parcel2, N0);
                return true;
            case 11:
                parcel2.writeNoException();
                z6 = null;
                be.f(parcel2, z6);
                return true;
            case 12:
                N0 = l();
                parcel2.writeNoException();
                be.c(parcel2, N0);
                return true;
            case 13:
                N0 = t();
                parcel2.writeNoException();
                be.c(parcel2, N0);
                return true;
            case 14:
                u0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                k();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
