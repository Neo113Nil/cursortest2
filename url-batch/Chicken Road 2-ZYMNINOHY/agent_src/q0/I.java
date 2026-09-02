package q0;

import T.C0097o;
import java.util.List;
import r0.AbstractC1395f;

/* loaded from: classes.dex */
public final class I implements t0.t {

    /* renamed from: a, reason: collision with root package name */
    public final t0.t f14832a;

    /* renamed from: b, reason: collision with root package name */
    public final T.U f14833b;

    public I(t0.t tVar, T.U u4) {
        this.f14832a = tVar;
        this.f14833b = u4;
    }

    @Override // t0.t
    public final boolean a(int i4, long j4) {
        return this.f14832a.a(i4, j4);
    }

    @Override // t0.t
    public final int b(C0097o c0097o) {
        return this.f14832a.u(this.f14833b.a(c0097o));
    }

    @Override // t0.t
    public final T.U c() {
        return this.f14833b;
    }

    @Override // t0.t
    public final int d() {
        return this.f14832a.d();
    }

    @Override // t0.t
    public final void e(boolean z) {
        this.f14832a.e(z);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof I)) {
            return this.f14833b.equals(((I) obj).f14833b);
        }
        return false;
    }

    @Override // t0.t
    public final C0097o f(int i4) {
        return this.f14833b.f2708d[this.f14832a.h(i4)];
    }

    @Override // t0.t
    public final void g() {
        this.f14832a.g();
    }

    @Override // t0.t
    public final int h(int i4) {
        return this.f14832a.h(i4);
    }

    public final int hashCode() {
        return this.f14833b.hashCode() + (this.f14832a.hashCode() * 31);
    }

    @Override // t0.t
    public final void i() {
        this.f14832a.i();
    }

    @Override // t0.t
    public final void j(long j4, long j5, long j6, List list, r0.n[] nVarArr) {
        this.f14832a.j(j4, j5, j6, list, nVarArr);
    }

    @Override // t0.t
    public final int k() {
        return this.f14832a.k();
    }

    @Override // t0.t
    public final C0097o l() {
        return this.f14833b.f2708d[this.f14832a.k()];
    }

    @Override // t0.t
    public final int length() {
        return this.f14832a.length();
    }

    @Override // t0.t
    public final int m() {
        return this.f14832a.m();
    }

    @Override // t0.t
    public final boolean n(long j4, AbstractC1395f abstractC1395f, List list) {
        return this.f14832a.n(j4, abstractC1395f, list);
    }

    @Override // t0.t
    public final boolean o(int i4, long j4) {
        return this.f14832a.o(i4, j4);
    }

    @Override // t0.t
    public final void p(float f4) {
        this.f14832a.p(f4);
    }

    @Override // t0.t
    public final Object q() {
        return this.f14832a.q();
    }

    @Override // t0.t
    public final void r() {
        this.f14832a.r();
    }

    @Override // t0.t
    public final void s() {
        this.f14832a.s();
    }

    @Override // t0.t
    public final int t(List list, long j4) {
        return this.f14832a.t(list, j4);
    }

    @Override // t0.t
    public final int u(int i4) {
        return this.f14832a.u(i4);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.f14832a.equals(((I) obj).f14832a);
        }
        return false;
    }
}
