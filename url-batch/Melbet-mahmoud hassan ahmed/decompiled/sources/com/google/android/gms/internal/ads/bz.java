package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class bz extends ae implements cz {
    public bz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static cz s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof cz ? (cz) queryLocalInterface : new az(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        boolean r7;
        float e7;
        gz ezVar;
        switch (i7) {
            case 1:
                k();
                parcel2.writeNoException();
                return true;
            case 2:
                j();
                parcel2.writeNoException();
                return true;
            case 3:
                x3(be.g(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                r7 = r();
                parcel2.writeNoException();
                be.c(parcel2, r7);
                return true;
            case 5:
                int f7 = f();
                parcel2.writeNoException();
                parcel2.writeInt(f7);
                return true;
            case 6:
                e7 = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e7);
                return true;
            case c4.w0.f2149o /* 7 */:
                e7 = d();
                parcel2.writeNoException();
                parcel2.writeFloat(e7);
                return true;
            case c4.w0.f2150p /* 8 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ezVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    ezVar = queryLocalInterface instanceof gz ? (gz) queryLocalInterface : new ez(readStrongBinder);
                }
                M5(ezVar);
                parcel2.writeNoException();
                return true;
            case 9:
                e7 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(e7);
                return true;
            case 10:
                r7 = l();
                parcel2.writeNoException();
                be.c(parcel2, r7);
                return true;
            case 11:
                gz h7 = h();
                parcel2.writeNoException();
                be.f(parcel2, h7);
                return true;
            case 12:
                r7 = n();
                parcel2.writeNoException();
                be.c(parcel2, r7);
                return true;
            case 13:
                m();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
