package com.google.ads.mediation;

import c3.p;
import r2.n;
import u2.f;
import u2.h;

/* loaded from: classes.dex */
final class k extends r2.d implements h.a, f.b, f.a {

    /* renamed from: f, reason: collision with root package name */
    final AbstractAdViewAdapter f2214f;

    /* renamed from: g, reason: collision with root package name */
    final p f2215g;

    public k(AbstractAdViewAdapter abstractAdViewAdapter, p pVar) {
        this.f2214f = abstractAdViewAdapter;
        this.f2215g = pVar;
    }

    @Override // r2.d, com.google.android.gms.internal.ads.yu
    public final void M() {
        this.f2215g.j(this.f2214f);
    }

    @Override // u2.f.b
    public final void a(u2.f fVar) {
        this.f2215g.g(this.f2214f, fVar);
    }

    @Override // u2.h.a
    public final void b(u2.h hVar) {
        this.f2215g.r(this.f2214f, new g(hVar));
    }

    @Override // u2.f.a
    public final void c(u2.f fVar, String str) {
        this.f2215g.s(this.f2214f, fVar, str);
    }

    @Override // r2.d
    public final void e() {
        this.f2215g.h(this.f2214f);
    }

    @Override // r2.d
    public final void f(n nVar) {
        this.f2215g.n(this.f2214f, nVar);
    }

    @Override // r2.d
    public final void h() {
        this.f2215g.p(this.f2214f);
    }

    @Override // r2.d
    public final void m() {
    }

    @Override // r2.d
    public final void q() {
        this.f2215g.b(this.f2214f);
    }
}
