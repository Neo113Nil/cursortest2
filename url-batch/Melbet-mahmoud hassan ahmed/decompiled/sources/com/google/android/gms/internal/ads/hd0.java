package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hd0 extends zd implements jd0 {
    hd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void A(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(3, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void C() {
        O0(13, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void M0(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(24, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void M2(e50 e50Var, String str) {
        Parcel E = E();
        be.f(E, e50Var);
        E.writeString(str);
        O0(10, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void N() {
        O0(20, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void O2(int i7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void T3(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(23, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void V1(int i7, String str) {
        Parcel E = E();
        E.writeInt(i7);
        E.writeString(str);
        O0(22, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void a0() {
        O0(15, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void b() {
        O0(1, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void d() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void l() {
        O0(5, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void l3(String str, String str2) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        O0(9, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void m() {
        O0(4, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void m0(String str) {
        Parcel E = E();
        E.writeString(str);
        O0(21, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void n() {
        O0(6, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void n3(ck0 ck0Var) {
        Parcel E = E();
        be.f(E, ck0Var);
        O0(16, E);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void o() {
        O0(8, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void x() {
        O0(11, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void y() {
        O0(18, E());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void z4(yj0 yj0Var) {
        throw null;
    }
}
