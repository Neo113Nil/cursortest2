package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class af0 extends zd implements cf0 {
    af0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void A2(String str, String str2, kv kvVar, x3.a aVar, te0 te0Var, jd0 jd0Var) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, kvVar);
        be.f(E, aVar);
        be.f(E, te0Var);
        be.f(E, jd0Var);
        O0(14, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean B0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        Parcel q02 = q0(17, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void H3(String str, String str2, kv kvVar, x3.a aVar, ze0 ze0Var, jd0 jd0Var) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, kvVar);
        be.f(E, aVar);
        be.f(E, ze0Var);
        be.f(E, jd0Var);
        O0(20, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean N0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        Parcel q02 = q0(15, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void P4(String str, String str2, kv kvVar, x3.a aVar, we0 we0Var, jd0 jd0Var, b40 b40Var) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, kvVar);
        be.f(E, aVar);
        be.f(E, we0Var);
        be.f(E, jd0Var);
        be.d(E, b40Var);
        O0(22, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void T2(x3.a aVar, String str, Bundle bundle, Bundle bundle2, pv pvVar, ff0 ff0Var) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        be.d(E, bundle);
        be.d(E, bundle2);
        be.d(E, pvVar);
        be.f(E, ff0Var);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final cz b() {
        Parcel q02 = q0(5, E());
        cz s62 = bz.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final qf0 d() {
        Parcel q02 = q0(2, E());
        qf0 qf0Var = (qf0) be.a(q02, qf0.CREATOR);
        q02.recycle();
        return qf0Var;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final qf0 e() {
        Parcel q02 = q0(3, E());
        qf0 qf0Var = (qf0) be.a(q02, qf0.CREATOR);
        q02.recycle();
        return qf0Var;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void h0(String str) {
        Parcel E = E();
        E.writeString(str);
        O0(19, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void k5(String str, String str2, kv kvVar, x3.a aVar, ze0 ze0Var, jd0 jd0Var) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, kvVar);
        be.f(E, aVar);
        be.f(E, ze0Var);
        be.f(E, jd0Var);
        O0(16, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void n2(String str, String str2, kv kvVar, x3.a aVar, we0 we0Var, jd0 jd0Var) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, kvVar);
        be.f(E, aVar);
        be.f(E, we0Var);
        be.f(E, jd0Var);
        O0(18, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void t3(String str, String str2, kv kvVar, x3.a aVar, qe0 qe0Var, jd0 jd0Var, pv pvVar) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, kvVar);
        be.f(E, aVar);
        be.f(E, qe0Var);
        be.f(E, jd0Var);
        be.d(E, pvVar);
        O0(13, E);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void y4(String str, String str2, kv kvVar, x3.a aVar, qe0 qe0Var, jd0 jd0Var, pv pvVar) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        be.d(E, kvVar);
        be.f(E, aVar);
        be.f(E, qe0Var);
        be.f(E, jd0Var);
        be.d(E, pvVar);
        O0(21, E);
    }
}
