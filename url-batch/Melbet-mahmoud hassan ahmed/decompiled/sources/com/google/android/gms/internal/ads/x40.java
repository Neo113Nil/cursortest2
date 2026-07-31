package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x40 extends ae implements y40 {
    public x40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface f7;
        String j7;
        switch (i7) {
            case 2:
                f7 = f();
                parcel2.writeNoException();
                be.f(parcel2, f7);
                return true;
            case 3:
                j7 = j();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 4:
                List n7 = n();
                parcel2.writeNoException();
                parcel2.writeList(n7);
                return true;
            case 5:
                j7 = h();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 6:
                f7 = d();
                parcel2.writeNoException();
                be.f(parcel2, f7);
                return true;
            case c4.w0.f2149o /* 7 */:
                j7 = i();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case c4.w0.f2150p /* 8 */:
                double a7 = a();
                parcel2.writeNoException();
                parcel2.writeDouble(a7);
                return true;
            case 9:
                j7 = m();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 10:
                j7 = o();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 11:
                Bundle c7 = c();
                parcel2.writeNoException();
                be.e(parcel2, c7);
                return true;
            case 12:
                l();
                parcel2.writeNoException();
                return true;
            case 13:
                f7 = g();
                parcel2.writeNoException();
                be.f(parcel2, f7);
                return true;
            case 14:
                L((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean r02 = r0((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                be.c(parcel2, r02);
                return true;
            case 16:
                y0((Bundle) be.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                f7 = b();
                parcel2.writeNoException();
                be.f(parcel2, f7);
                return true;
            case 18:
                f7 = e();
                parcel2.writeNoException();
                be.f(parcel2, f7);
                return true;
            case 19:
                j7 = k();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            default:
                return false;
        }
    }
}
