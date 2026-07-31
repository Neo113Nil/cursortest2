package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import x3.a;

/* loaded from: classes.dex */
public abstract class bf0 extends ae implements cf0 {
    public bf0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static cf0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof cf0 ? (cf0) queryLocalInterface : new af0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        ff0 df0Var;
        qf0 d7;
        boolean N0;
        qe0 qe0Var = null;
        we0 ue0Var = null;
        qe0 oe0Var = null;
        ze0 xe0Var = null;
        we0 ue0Var2 = null;
        ze0 xe0Var2 = null;
        te0 re0Var = null;
        if (i7 != 1) {
            if (i7 == 2) {
                d7 = d();
            } else {
                if (i7 != 3) {
                    if (i7 == 5) {
                        cz b7 = b();
                        parcel2.writeNoException();
                        be.f(parcel2, b7);
                    } else if (i7 == 10) {
                        a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                    } else if (i7 != 11) {
                        switch (i7) {
                            case 13:
                                String readString = parcel.readString();
                                String readString2 = parcel.readString();
                                kv kvVar = (kv) be.a(parcel, kv.CREATOR);
                                x3.a q02 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    qe0Var = queryLocalInterface instanceof qe0 ? (qe0) queryLocalInterface : new oe0(readStrongBinder);
                                }
                                t3(readString, readString2, kvVar, q02, qe0Var, id0.s6(parcel.readStrongBinder()), (pv) be.a(parcel, pv.CREATOR));
                                break;
                            case 14:
                                String readString3 = parcel.readString();
                                String readString4 = parcel.readString();
                                kv kvVar2 = (kv) be.a(parcel, kv.CREATOR);
                                x3.a q03 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    re0Var = queryLocalInterface2 instanceof te0 ? (te0) queryLocalInterface2 : new re0(readStrongBinder2);
                                }
                                A2(readString3, readString4, kvVar2, q03, re0Var, id0.s6(parcel.readStrongBinder()));
                                break;
                            case 15:
                                N0 = N0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                                parcel2.writeNoException();
                                be.c(parcel2, N0);
                                break;
                            case 16:
                                String readString5 = parcel.readString();
                                String readString6 = parcel.readString();
                                kv kvVar3 = (kv) be.a(parcel, kv.CREATOR);
                                x3.a q04 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                                IBinder readStrongBinder3 = parcel.readStrongBinder();
                                if (readStrongBinder3 != null) {
                                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    xe0Var2 = queryLocalInterface3 instanceof ze0 ? (ze0) queryLocalInterface3 : new xe0(readStrongBinder3);
                                }
                                k5(readString5, readString6, kvVar3, q04, xe0Var2, id0.s6(parcel.readStrongBinder()));
                                break;
                            case 17:
                                N0 = B0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                                parcel2.writeNoException();
                                be.c(parcel2, N0);
                                break;
                            case 18:
                                String readString7 = parcel.readString();
                                String readString8 = parcel.readString();
                                kv kvVar4 = (kv) be.a(parcel, kv.CREATOR);
                                x3.a q05 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                                IBinder readStrongBinder4 = parcel.readStrongBinder();
                                if (readStrongBinder4 != null) {
                                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    ue0Var2 = queryLocalInterface4 instanceof we0 ? (we0) queryLocalInterface4 : new ue0(readStrongBinder4);
                                }
                                n2(readString7, readString8, kvVar4, q05, ue0Var2, id0.s6(parcel.readStrongBinder()));
                                break;
                            case 19:
                                h0(parcel.readString());
                                break;
                            case 20:
                                String readString9 = parcel.readString();
                                String readString10 = parcel.readString();
                                kv kvVar5 = (kv) be.a(parcel, kv.CREATOR);
                                x3.a q06 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                                IBinder readStrongBinder5 = parcel.readStrongBinder();
                                if (readStrongBinder5 != null) {
                                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    xe0Var = queryLocalInterface5 instanceof ze0 ? (ze0) queryLocalInterface5 : new xe0(readStrongBinder5);
                                }
                                H3(readString9, readString10, kvVar5, q06, xe0Var, id0.s6(parcel.readStrongBinder()));
                                break;
                            case 21:
                                String readString11 = parcel.readString();
                                String readString12 = parcel.readString();
                                kv kvVar6 = (kv) be.a(parcel, kv.CREATOR);
                                x3.a q07 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                                IBinder readStrongBinder6 = parcel.readStrongBinder();
                                if (readStrongBinder6 != null) {
                                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    oe0Var = queryLocalInterface6 instanceof qe0 ? (qe0) queryLocalInterface6 : new oe0(readStrongBinder6);
                                }
                                y4(readString11, readString12, kvVar6, q07, oe0Var, id0.s6(parcel.readStrongBinder()), (pv) be.a(parcel, pv.CREATOR));
                                break;
                            case 22:
                                String readString13 = parcel.readString();
                                String readString14 = parcel.readString();
                                kv kvVar7 = (kv) be.a(parcel, kv.CREATOR);
                                x3.a q08 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                                IBinder readStrongBinder7 = parcel.readStrongBinder();
                                if (readStrongBinder7 != null) {
                                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    ue0Var = queryLocalInterface7 instanceof we0 ? (we0) queryLocalInterface7 : new ue0(readStrongBinder7);
                                }
                                P4(readString13, readString14, kvVar7, q08, ue0Var, id0.s6(parcel.readStrongBinder()), (b40) be.a(parcel, b40.CREATOR));
                                break;
                            default:
                                return false;
                        }
                    } else {
                        parcel.createStringArray();
                    }
                    return true;
                }
                d7 = e();
            }
            parcel2.writeNoException();
            be.e(parcel2, d7);
            return true;
        }
        x3.a q09 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
        String readString15 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) be.a(parcel, creator);
        Bundle bundle2 = (Bundle) be.a(parcel, creator);
        pv pvVar = (pv) be.a(parcel, pv.CREATOR);
        IBinder readStrongBinder8 = parcel.readStrongBinder();
        if (readStrongBinder8 == null) {
            df0Var = null;
        } else {
            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            df0Var = queryLocalInterface8 instanceof ff0 ? (ff0) queryLocalInterface8 : new df0(readStrongBinder8);
        }
        T2(q09, readString15, bundle, bundle2, pvVar, df0Var);
        parcel2.writeNoException();
        return true;
    }
}
