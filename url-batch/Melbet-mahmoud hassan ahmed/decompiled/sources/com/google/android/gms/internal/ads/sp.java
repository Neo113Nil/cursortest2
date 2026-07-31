package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class sp extends ae implements tp {
    public sp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface b7;
        xp xpVar = null;
        cq cqVar = null;
        switch (i7) {
            case 2:
                b7 = b();
                parcel2.writeNoException();
                be.f(parcel2, b7);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    xpVar = queryLocalInterface instanceof xp ? (xp) queryLocalInterface : new xp(readStrongBinder);
                }
                d4(xpVar);
                parcel2.writeNoException();
                return true;
            case 4:
                x3.a q02 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    cqVar = queryLocalInterface2 instanceof cq ? (cq) queryLocalInterface2 : new yp(readStrongBinder2);
                }
                Z1(q02, cqVar);
                parcel2.writeNoException();
                return true;
            case 5:
                b7 = d();
                parcel2.writeNoException();
                be.f(parcel2, b7);
                return true;
            case 6:
                G5(be.g(parcel));
                parcel2.writeNoException();
                return true;
            case c4.w0.f2149o /* 7 */:
                h3(vy.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
