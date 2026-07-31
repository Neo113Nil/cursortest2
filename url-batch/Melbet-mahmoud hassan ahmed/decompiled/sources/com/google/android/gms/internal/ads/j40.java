package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class j40 extends ae implements k40 {
    public j40() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        float b7;
        IInterface h7;
        s50 s50Var;
        switch (i7) {
            case 2:
                b7 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b7);
                return true;
            case 3:
                d0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                h7 = h();
                parcel2.writeNoException();
                be.f(parcel2, h7);
                return true;
            case 5:
                b7 = e();
                parcel2.writeNoException();
                parcel2.writeFloat(b7);
                return true;
            case 6:
                b7 = d();
                parcel2.writeNoException();
                parcel2.writeFloat(b7);
                return true;
            case c4.w0.f2149o /* 7 */:
                h7 = f();
                parcel2.writeNoException();
                be.f(parcel2, h7);
                return true;
            case c4.w0.f2150p /* 8 */:
                boolean j7 = j();
                parcel2.writeNoException();
                be.c(parcel2, j7);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    s50Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    s50Var = queryLocalInterface instanceof s50 ? (s50) queryLocalInterface : new s50(readStrongBinder);
                }
                R1(s50Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
