package h0;

import D1.C0014b;
import I.C0089d;
import I.C0096g0;
import I.C0102j0;
import I.X;
import b0.C0281n;
import d0.C0321b;
import g0.AbstractC0393b;

/* loaded from: classes.dex */
public final class I extends AbstractC0393b {

    /* renamed from: e, reason: collision with root package name */
    public final C0102j0 f4894e;

    /* renamed from: f, reason: collision with root package name */
    public final C0102j0 f4895f;

    /* renamed from: g, reason: collision with root package name */
    public final E f4896g;

    /* renamed from: h, reason: collision with root package name */
    public final C0096g0 f4897h;

    /* renamed from: i, reason: collision with root package name */
    public float f4898i;

    /* renamed from: j, reason: collision with root package name */
    public C0281n f4899j;

    /* renamed from: k, reason: collision with root package name */
    public int f4900k;

    public I(C0422c c0422c) {
        a0.f fVar = new a0.f(0L);
        X x3 = X.f2228i;
        this.f4894e = C0089d.J(fVar, x3);
        this.f4895f = C0089d.J(Boolean.FALSE, x3);
        E e3 = new E(c0422c);
        e3.f4875f = new A2.l(19, this);
        this.f4896g = e3;
        this.f4897h = C0089d.I(0);
        this.f4898i = 1.0f;
        this.f4900k = -1;
    }

    @Override // g0.AbstractC0393b
    public final void a(float f3) {
        this.f4898i = f3;
    }

    @Override // g0.AbstractC0393b
    public final void b(C0281n c0281n) {
        this.f4899j = c0281n;
    }

    @Override // g0.AbstractC0393b
    public final long d() {
        return ((a0.f) this.f4894e.getValue()).f3503a;
    }

    @Override // g0.AbstractC0393b
    public final void e(t0.F f3) {
        C0281n c0281n = this.f4899j;
        E e3 = this.f4896g;
        if (c0281n == null) {
            c0281n = (C0281n) e3.f4876g.getValue();
        }
        if (((Boolean) this.f4895f.getValue()).booleanValue() && f3.getLayoutDirection() == M0.j.f2776e) {
            C0321b c0321b = f3.f7748d;
            long w3 = c0321b.w();
            C0014b c0014b = c0321b.f4444e;
            long m3 = c0014b.m();
            c0014b.h().f();
            try {
                ((A2.g) c0014b.f536b).s(-1.0f, 1.0f, w3);
                e3.e(f3, this.f4898i, c0281n);
            } finally {
                c0014b.h().a();
                c0014b.y(m3);
            }
        } else {
            e3.e(f3, this.f4898i, c0281n);
        }
        this.f4900k = this.f4897h.g();
    }
}
