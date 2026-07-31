package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class wx extends ae implements xx {
    public wx() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface G3;
        switch (i7) {
            case 1:
                G3 = G3(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), (pv) be.a(parcel, pv.CREATOR), parcel.readString(), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                G3 = g2(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), (pv) be.a(parcel, pv.CREATOR), parcel.readString(), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                G3 = P1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readString(), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
            case c4.w0.f2149o /* 7 */:
                a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                parcel2.writeNoException();
                be.f(parcel2, null);
                return true;
            case 5:
                G3 = H0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 6:
                G3 = A4(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case c4.w0.f2150p /* 8 */:
                G3 = U(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 9:
                G3 = G0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                G3 = c3(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), (pv) be.a(parcel, pv.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                G3 = E1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 12:
                G3 = Y4(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readString(), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 13:
                G3 = E5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), (pv) be.a(parcel, pv.CREATOR), parcel.readString(), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 14:
                G3 = x1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 15:
                G3 = T1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), cd0.s6(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 16:
                G3 = g5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), cd0.s6(parcel.readStrongBinder()), parcel.readInt(), m80.s6(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        be.f(parcel2, G3);
        return true;
    }
}
