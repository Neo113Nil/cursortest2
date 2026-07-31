package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class id0 extends ae implements jd0 {
    public id0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static jd0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof jd0 ? (jd0) queryLocalInterface : new hd0(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                b();
                parcel2.writeNoException();
                return true;
            case 2:
                d();
                parcel2.writeNoException();
                return true;
            case 3:
                A(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                m();
                parcel2.writeNoException();
                return true;
            case 5:
                l();
                parcel2.writeNoException();
                return true;
            case 6:
                n();
                parcel2.writeNoException();
                return true;
            case c4.w0.f2149o /* 7 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof nd0) {
                    }
                }
                parcel2.writeNoException();
                return true;
            case c4.w0.f2150p /* 8 */:
                o();
                parcel2.writeNoException();
                return true;
            case 9:
                l3(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 10:
                d50.s6(parcel.readStrongBinder());
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 11:
                x();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 13:
                C();
                parcel2.writeNoException();
                return true;
            case 14:
                z4((yj0) be.a(parcel, yj0.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                a0();
                parcel2.writeNoException();
                return true;
            case 16:
                n3(bk0.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                O2(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 18:
                y();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel2.writeNoException();
                return true;
            case 20:
                N();
                parcel2.writeNoException();
                return true;
            case 21:
                m0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 22:
                V1(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 23:
                T3((cv) be.a(parcel, cv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 24:
                M0((cv) be.a(parcel, cv.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
