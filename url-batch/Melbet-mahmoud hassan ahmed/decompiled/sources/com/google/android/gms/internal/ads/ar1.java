package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ar1 extends g60 {

    /* renamed from: f, reason: collision with root package name */
    private final String f2926f;

    /* renamed from: g, reason: collision with root package name */
    private final mm1 f2927g;

    /* renamed from: h, reason: collision with root package name */
    private final rm1 f2928h;

    public ar1(String str, mm1 mm1Var, rm1 rm1Var) {
        this.f2926f = str;
        this.f2927g = mm1Var;
        this.f2928h = rm1Var;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void F1(e60 e60Var) {
        this.f2927g.q(e60Var);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void G() {
        this.f2927g.h();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final boolean J() {
        return this.f2927g.u();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void M4(my myVar) {
        this.f2927g.P(myVar);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void N() {
        this.f2927g.a();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void Q5(Bundle bundle) {
        this.f2927g.S(bundle);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final boolean Z2(Bundle bundle) {
        return this.f2927g.x(bundle);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void a0() {
        this.f2927g.I();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final double b() {
        return this.f2928h.A();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void b5(Bundle bundle) {
        this.f2927g.l(bundle);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final boolean c0() {
        return (this.f2928h.f().isEmpty() || this.f2928h.S() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final Bundle d() {
        return this.f2928h.L();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final zy e() {
        if (((Boolean) sw.c().b(m10.f8222i5)).booleanValue()) {
            return this.f2927g.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final cz f() {
        return this.f2928h.R();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final g40 h() {
        return this.f2928h.T();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final k40 i() {
        return this.f2927g.A().a();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void i5(jy jyVar) {
        this.f2927g.o(jyVar);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final n40 j() {
        return this.f2928h.V();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final x3.a k() {
        return this.f2928h.b0();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String l() {
        return this.f2928h.f0();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String m() {
        return this.f2928h.d0();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void m2(wy wyVar) {
        this.f2927g.p(wyVar);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String n() {
        return this.f2928h.e0();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final x3.a o() {
        return x3.b.B3(this.f2927g);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String p() {
        return this.f2928h.b();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String q() {
        return this.f2928h.c();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String r() {
        return this.f2928h.h0();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String t() {
        return this.f2926f;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void u3() {
        this.f2927g.n();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final List<?> x() {
        return c0() ? this.f2928h.f() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final List<?> y() {
        return this.f2928h.e();
    }
}
