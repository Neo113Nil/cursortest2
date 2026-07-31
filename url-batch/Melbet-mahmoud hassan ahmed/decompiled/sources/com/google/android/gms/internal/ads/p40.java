package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class p40 extends ae implements q40 {
    public p40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        k40 i40Var;
        switch (i7) {
            case 1:
                U1(parcel.readString(), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 2:
                x3.a s7 = s(parcel.readString());
                parcel2.writeNoException();
                be.f(parcel2, s7);
                return true;
            case 3:
                B1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 4:
                c();
                break;
            case 5:
                a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                parcel.readInt();
                break;
            case 6:
                k3(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case c4.w0.f2149o /* 7 */:
                L0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case c4.w0.f2150p /* 8 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    i40Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    i40Var = queryLocalInterface instanceof k40 ? (k40) queryLocalInterface : new i40(readStrongBinder);
                }
                e5(i40Var);
                break;
            case 9:
                T5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
