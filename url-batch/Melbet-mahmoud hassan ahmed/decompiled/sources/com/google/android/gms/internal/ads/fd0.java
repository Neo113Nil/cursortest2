package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import x3.a;

/* loaded from: classes.dex */
public abstract class fd0 extends ae implements gd0 {
    public fd0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface m7;
        Parcelable b7;
        jd0 jd0Var = null;
        switch (i7) {
            case 1:
                x3.a q02 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                pv pvVar = (pv) be.a(parcel, pv.CREATOR);
                kv kvVar = (kv) be.a(parcel, kv.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface instanceof jd0 ? (jd0) queryLocalInterface : new hd0(readStrongBinder);
                }
                i4(q02, pvVar, kvVar, readString, jd0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                m7 = m();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 3:
                x3.a q03 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                kv kvVar2 = (kv) be.a(parcel, kv.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface2 instanceof jd0 ? (jd0) queryLocalInterface2 : new hd0(readStrongBinder2);
                }
                o2(q03, kvVar2, readString2, jd0Var);
                parcel2.writeNoException();
                return true;
            case 4:
                J();
                parcel2.writeNoException();
                return true;
            case 5:
                n();
                parcel2.writeNoException();
                return true;
            case 6:
                x3.a q04 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                pv pvVar2 = (pv) be.a(parcel, pv.CREATOR);
                kv kvVar3 = (kv) be.a(parcel, kv.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface3 instanceof jd0 ? (jd0) queryLocalInterface3 : new hd0(readStrongBinder3);
                }
                u2(q04, pvVar2, kvVar3, readString3, readString4, jd0Var);
                parcel2.writeNoException();
                return true;
            case c4.w0.f2149o /* 7 */:
                x3.a q05 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                kv kvVar4 = (kv) be.a(parcel, kv.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface4 instanceof jd0 ? (jd0) queryLocalInterface4 : new hd0(readStrongBinder4);
                }
                A5(q05, kvVar4, readString5, readString6, jd0Var);
                parcel2.writeNoException();
                return true;
            case c4.w0.f2150p /* 8 */:
                e0();
                parcel2.writeNoException();
                return true;
            case 9:
                M();
                parcel2.writeNoException();
                return true;
            case 10:
                u5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), (kv) be.a(parcel, kv.CREATOR), parcel.readString(), wj0.s6(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                p2((kv) be.a(parcel, kv.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                v();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean K = K();
                parcel2.writeNoException();
                be.c(parcel2, K);
                return true;
            case 14:
                x3.a q06 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                kv kvVar5 = (kv) be.a(parcel, kv.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface5 instanceof jd0 ? (jd0) queryLocalInterface5 : new hd0(readStrongBinder5);
                }
                d3(q06, kvVar5, readString7, readString8, jd0Var, (b40) be.a(parcel, b40.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
            case 16:
                parcel2.writeNoException();
                be.f(parcel2, null);
                return true;
            case 17:
                b7 = b();
                parcel2.writeNoException();
                be.e(parcel2, b7);
                return true;
            case 18:
                b7 = d();
                parcel2.writeNoException();
                be.e(parcel2, b7);
                return true;
            case 19:
                b7 = e();
                parcel2.writeNoException();
                be.e(parcel2, b7);
                return true;
            case 20:
                Y2((kv) be.a(parcel, kv.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                V3(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                be.c(parcel2, false);
                return true;
            case 23:
                N1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), wj0.s6(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                m7 = h();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 25:
                r1(be.g(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                m7 = f();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 27:
                m7 = j();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 28:
                x3.a q07 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                kv kvVar6 = (kv) be.a(parcel, kv.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface6 instanceof jd0 ? (jd0) queryLocalInterface6 : new hd0(readStrongBinder6);
                }
                h1(q07, kvVar6, readString9, jd0Var);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                e1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                c4(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), i90.s6(parcel.readStrongBinder()), parcel.createTypedArrayList(p90.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                x3.a q08 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                kv kvVar7 = (kv) be.a(parcel, kv.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface7 instanceof jd0 ? (jd0) queryLocalInterface7 : new hd0(readStrongBinder7);
                }
                h6(q08, kvVar7, readString10, jd0Var);
                parcel2.writeNoException();
                return true;
            case 33:
                b7 = k();
                parcel2.writeNoException();
                be.e(parcel2, b7);
                return true;
            case 34:
                b7 = o();
                parcel2.writeNoException();
                be.e(parcel2, b7);
                return true;
            case 35:
                x3.a q09 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                pv pvVar3 = (pv) be.a(parcel, pv.CREATOR);
                kv kvVar8 = (kv) be.a(parcel, kv.CREATOR);
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    jd0Var = queryLocalInterface8 instanceof jd0 ? (jd0) queryLocalInterface8 : new hd0(readStrongBinder8);
                }
                W0(q09, pvVar3, kvVar8, readString11, readString12, jd0Var);
                parcel2.writeNoException();
                return true;
            case 36:
                m7 = i();
                parcel2.writeNoException();
                be.f(parcel2, m7);
                return true;
            case 37:
                w2(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
