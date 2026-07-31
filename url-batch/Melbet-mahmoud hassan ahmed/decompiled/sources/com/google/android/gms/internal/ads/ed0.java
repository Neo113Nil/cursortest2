package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import x3.a;

/* loaded from: classes.dex */
public final class ed0 extends zd implements gd0 {
    ed0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void A5(x3.a aVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, kvVar);
        E.writeString(str);
        E.writeString(str2);
        be.f(E, jd0Var);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final boolean I() {
        Parcel q02 = q0(22, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void J() {
        O0(4, E());
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final boolean K() {
        Parcel q02 = q0(13, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void M() {
        O0(9, E());
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void N1(x3.a aVar, xj0 xj0Var, List<String> list) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, xj0Var);
        E.writeStringList(list);
        O0(23, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final pd0 P() {
        pd0 pd0Var;
        Parcel q02 = q0(16, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            pd0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            pd0Var = queryLocalInterface instanceof pd0 ? (pd0) queryLocalInterface : new pd0(readStrongBinder);
        }
        q02.recycle();
        return pd0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void V3(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(21, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void W0(x3.a aVar, pv pvVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, pvVar);
        be.d(E, kvVar);
        E.writeString(str);
        E.writeString(str2);
        be.f(E, jd0Var);
        O0(35, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void c4(x3.a aVar, j90 j90Var, List<p90> list) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, j90Var);
        E.writeTypedList(list);
        O0(31, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void d3(x3.a aVar, kv kvVar, String str, String str2, jd0 jd0Var, b40 b40Var, List<String> list) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, kvVar);
        E.writeString(str);
        E.writeString(str2);
        be.f(E, jd0Var);
        be.d(E, b40Var);
        E.writeStringList(list);
        O0(14, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e0() {
        O0(8, E());
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void e1(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(30, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final cz f() {
        Parcel q02 = q0(26, E());
        cz s62 = bz.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final od0 f0() {
        od0 od0Var;
        Parcel q02 = q0(15, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            od0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            od0Var = queryLocalInterface instanceof od0 ? (od0) queryLocalInterface : new od0(readStrongBinder);
        }
        q02.recycle();
        return od0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void h1(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, kvVar);
        E.writeString(str);
        be.f(E, jd0Var);
        O0(28, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void h6(x3.a aVar, kv kvVar, String str, jd0 jd0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, kvVar);
        E.writeString(str);
        be.f(E, jd0Var);
        O0(32, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final md0 i() {
        md0 kd0Var;
        Parcel q02 = q0(36, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            kd0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            kd0Var = queryLocalInterface instanceof md0 ? (md0) queryLocalInterface : new kd0(readStrongBinder);
        }
        q02.recycle();
        return kd0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final sd0 j() {
        sd0 qd0Var;
        Parcel q02 = q0(27, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            qd0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            qd0Var = queryLocalInterface instanceof sd0 ? (sd0) queryLocalInterface : new qd0(readStrongBinder);
        }
        q02.recycle();
        return qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final qf0 k() {
        Parcel q02 = q0(33, E());
        qf0 qf0Var = (qf0) be.a(q02, qf0.CREATOR);
        q02.recycle();
        return qf0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final x3.a m() {
        Parcel q02 = q0(2, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void n() {
        O0(5, E());
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final qf0 o() {
        Parcel q02 = q0(34, E());
        qf0 qf0Var = (qf0) be.a(q02, qf0.CREATOR);
        q02.recycle();
        return qf0Var;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void p2(kv kvVar, String str) {
        Parcel E = E();
        be.d(E, kvVar);
        E.writeString(str);
        O0(11, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void r1(boolean z6) {
        Parcel E = E();
        be.c(E, z6);
        O0(25, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void u2(x3.a aVar, pv pvVar, kv kvVar, String str, String str2, jd0 jd0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, pvVar);
        be.d(E, kvVar);
        E.writeString(str);
        E.writeString(str2);
        be.f(E, jd0Var);
        O0(6, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void u5(x3.a aVar, kv kvVar, String str, xj0 xj0Var, String str2) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, kvVar);
        E.writeString(null);
        be.f(E, xj0Var);
        E.writeString(str2);
        O0(10, E);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void v() {
        O0(12, E());
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void w2(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(37, E);
    }
}
