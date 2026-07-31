package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class oj0 extends ae implements pj0 {
    public oj0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        boolean p7;
        if (i7 == 1) {
            D4((tj0) be.a(parcel, tj0.CREATOR));
        } else if (i7 != 2) {
            sj0 sj0Var = null;
            nj0 nj0Var = null;
            if (i7 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    sj0Var = queryLocalInterface instanceof sj0 ? (sj0) queryLocalInterface : new qj0(readStrongBinder);
                }
                Z5(sj0Var);
            } else {
                if (i7 != 34) {
                    switch (i7) {
                        case 5:
                            p7 = p();
                            break;
                        case 6:
                            f();
                            break;
                        case c4.w0.f2149o /* 7 */:
                            i();
                            break;
                        case c4.w0.f2150p /* 8 */:
                            b();
                            break;
                        case 9:
                            Y(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                            break;
                        case 10:
                            x0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                            break;
                        case 11:
                            p0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                            break;
                        case 12:
                            String g7 = g();
                            parcel2.writeNoException();
                            parcel2.writeString(g7);
                            return true;
                        case 13:
                            h0(parcel.readString());
                            break;
                        case 14:
                            a6(qx.s6(parcel.readStrongBinder()));
                            break;
                        case 15:
                            Bundle a7 = a();
                            parcel2.writeNoException();
                            be.e(parcel2, a7);
                            return true;
                        case 16:
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                nj0Var = queryLocalInterface2 instanceof nj0 ? (nj0) queryLocalInterface2 : new nj0(readStrongBinder2);
                            }
                            N3(nj0Var);
                            break;
                        case 17:
                            parcel.readString();
                            break;
                        case 18:
                            B0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                            break;
                        case 19:
                            P0(parcel.readString());
                            break;
                        case 20:
                            p7 = q();
                            break;
                        case 21:
                            zy c7 = c();
                            parcel2.writeNoException();
                            be.f(parcel2, c7);
                            return true;
                        default:
                            return false;
                    }
                    parcel2.writeNoException();
                    be.c(parcel2, p7);
                    return true;
                }
                i3(be.g(parcel));
            }
        } else {
            r();
        }
        parcel2.writeNoException();
        return true;
    }
}
