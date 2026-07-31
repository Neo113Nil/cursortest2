package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class ek0 extends ae implements fk0 {
    public ek0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static fk0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof fk0 ? (fk0) queryLocalInterface : new dk0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface g7;
        nk0 nk0Var = null;
        nk0 nk0Var2 = null;
        ok0 ok0Var = null;
        jk0 jk0Var = null;
        switch (i7) {
            case 1:
                kv kvVar = (kv) be.a(parcel, kv.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    nk0Var = queryLocalInterface instanceof nk0 ? (nk0) queryLocalInterface : new lk0(readStrongBinder);
                }
                a3(kvVar, nk0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    jk0Var = queryLocalInterface2 instanceof jk0 ? (jk0) queryLocalInterface2 : new hk0(readStrongBinder2);
                }
                n5(jk0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean n7 = n();
                parcel2.writeNoException();
                be.c(parcel2, n7);
                return true;
            case 4:
                String b7 = b();
                parcel2.writeNoException();
                parcel2.writeString(b7);
                return true;
            case 5:
                m6(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    ok0Var = queryLocalInterface3 instanceof ok0 ? (ok0) queryLocalInterface3 : new ok0(readStrongBinder3);
                }
                q4(ok0Var);
                parcel2.writeNoException();
                return true;
            case c4.w0.f2149o /* 7 */:
                X1((uk0) be.a(parcel, uk0.CREATOR));
                parcel2.writeNoException();
                return true;
            case c4.w0.f2150p /* 8 */:
                X3(sy.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle a7 = a();
                parcel2.writeNoException();
                be.e(parcel2, a7);
                return true;
            case 10:
                t1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), be.g(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                g7 = g();
                parcel2.writeNoException();
                be.f(parcel2, g7);
                return true;
            case 12:
                g7 = c();
                parcel2.writeNoException();
                be.f(parcel2, g7);
                return true;
            case 13:
                O5(vy.s6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                kv kvVar2 = (kv) be.a(parcel, kv.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    nk0Var2 = queryLocalInterface4 instanceof nk0 ? (nk0) queryLocalInterface4 : new lk0(readStrongBinder4);
                }
                G4(kvVar2, nk0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                k0(be.g(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
