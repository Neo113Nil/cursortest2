package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ix extends ae implements jx {
    public ix() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zw zwVar = null;
        yx yxVar = null;
        switch (i7) {
            case 1:
                gx b7 = b();
                parcel2.writeNoException();
                be.f(parcel2, b7);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zwVar = queryLocalInterface instanceof zw ? (zw) queryLocalInterface : new xw(readStrongBinder);
                }
                D5(zwVar);
                break;
            case 3:
                e6(h50.s6(parcel.readStrongBinder()));
                break;
            case 4:
                a5(k50.s6(parcel.readStrongBinder()));
                break;
            case 5:
                g4(parcel.readString(), q50.s6(parcel.readStrongBinder()), n50.s6(parcel.readStrongBinder()));
                break;
            case 6:
                u4((b40) be.a(parcel, b40.CREATOR));
                break;
            case c4.w0.f2149o /* 7 */:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    yxVar = queryLocalInterface2 instanceof yx ? (yx) queryLocalInterface2 : new yx(readStrongBinder2);
                }
                F5(yxVar);
                break;
            case c4.w0.f2150p /* 8 */:
                i1(u50.s6(parcel.readStrongBinder()), (pv) be.a(parcel, pv.CREATOR));
                break;
            case 9:
                X5((u2.g) be.a(parcel, u2.g.CREATOR));
                break;
            case 10:
                V4(x50.s6(parcel.readStrongBinder()));
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                d2((r90) be.a(parcel, r90.CREATOR));
                break;
            case 14:
                w3(aa0.s6(parcel.readStrongBinder()));
                break;
            case 15:
                C4((u2.a) be.a(parcel, u2.a.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
