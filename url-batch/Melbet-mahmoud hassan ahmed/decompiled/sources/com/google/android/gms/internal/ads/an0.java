package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class an0 extends ae implements bn0 {
    public an0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static bn0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof bn0 ? (bn0) queryLocalInterface : new zm0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        ym0 ym0Var = null;
        switch (i7) {
            case 1:
                x3.a q02 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                fn0 fn0Var = (fn0) be.a(parcel, fn0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    ym0Var = queryLocalInterface instanceof ym0 ? (ym0) queryLocalInterface : new wm0(readStrongBinder);
                }
                b4(q02, fn0Var, ym0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                g0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
            case 4:
                a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                parcel2.writeNoException();
                be.f(parcel2, null);
                return true;
            case 5:
                I1(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), oh0.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                g3(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), oh0.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case c4.w0.f2149o /* 7 */:
                a2((sh0) be.a(parcel, sh0.CREATOR));
                parcel2.writeNoException();
                return true;
            case c4.w0.f2150p /* 8 */:
                i0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
