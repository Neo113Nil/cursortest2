package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class yg0 extends ae implements zg0 {
    public yg0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zg0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zg0 ? (zg0) queryLocalInterface : new xg0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                P2((Bundle) be.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                break;
            case 3:
                t();
                break;
            case 4:
                l();
                break;
            case 5:
                m();
                break;
            case 6:
                Bundle bundle = (Bundle) be.a(parcel, Bundle.CREATOR);
                L(bundle);
                parcel2.writeNoException();
                be.e(parcel2, bundle);
                return true;
            case c4.w0.f2149o /* 7 */:
                p();
                break;
            case c4.w0.f2150p /* 8 */:
                k();
                break;
            case 9:
                x();
                break;
            case 10:
                f();
                break;
            case 11:
                boolean M = M();
                parcel2.writeNoException();
                be.c(parcel2, M);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                break;
            case 13:
                d0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 14:
                q();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
