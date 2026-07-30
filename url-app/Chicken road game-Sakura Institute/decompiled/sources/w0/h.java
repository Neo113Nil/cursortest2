package w0;

import e6.v;
import k.c0;
import p1.e0;
import p1.g0;
import p1.h0;
import p1.i0;
import p1.n0;
import p1.s0;
import r1.f0;
import r1.o;
import r1.o0;
import r1.w;
import s0.n;
import z0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends n implements w, o {

    /* renamed from: s, reason: collision with root package name */
    public e1.b f9483s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9484t;

    /* renamed from: u, reason: collision with root package name */
    public s0.c f9485u;

    /* renamed from: v, reason: collision with root package name */
    public i0 f9486v;

    /* renamed from: w, reason: collision with root package name */
    public float f9487w;

    /* renamed from: x, reason: collision with root package name */
    public m f9488x;

    public static boolean B0(long j8) {
        if (y0.f.a(j8, 9205357640488583168L)) {
            return false;
        }
        float b9 = y0.f.b(j8);
        return (Float.isInfinite(b9) || Float.isNaN(b9)) ? false : true;
    }

    public static boolean C0(long j8) {
        if (y0.f.a(j8, 9205357640488583168L)) {
            return false;
        }
        float d8 = y0.f.d(j8);
        return (Float.isInfinite(d8) || Float.isNaN(d8)) ? false : true;
    }

    public final boolean A0() {
        return this.f9484t && this.f9483s.d() != 9205357640488583168L;
    }

    public final long D0(long j8) {
        boolean z8 = false;
        boolean z9 = m2.a.d(j8) && m2.a.c(j8);
        if (m2.a.f(j8) && m2.a.e(j8)) {
            z8 = true;
        }
        if ((!A0() && z9) || z8) {
            return m2.a.a(j8, m2.a.h(j8), 0, m2.a.g(j8), 0, 10);
        }
        long d8 = this.f9483s.d();
        long a3 = v0.d.a(r4.a.w(j8, C0(d8) ? Math.round(y0.f.d(d8)) : m2.a.j(j8)), r4.a.v(j8, B0(d8) ? Math.round(y0.f.b(d8)) : m2.a.i(j8)));
        if (A0()) {
            long a9 = v0.d.a(!C0(this.f9483s.d()) ? y0.f.d(a3) : y0.f.d(this.f9483s.d()), !B0(this.f9483s.d()) ? y0.f.b(a3) : y0.f.b(this.f9483s.d()));
            a3 = (y0.f.d(a3) == 0.0f || y0.f.b(a3) == 0.0f) ? 0L : s0.h(a9, this.f9486v.b(a9, a3));
        }
        return m2.a.a(j8, r4.a.w(j8, Math.round(y0.f.d(a3))), 0, r4.a.v(j8, Math.round(y0.f.b(a3))), 0, 10);
    }

    @Override // r1.w
    public final int b(o0 o0Var, e0 e0Var, int i7) {
        if (!A0()) {
            return e0Var.d0(i7);
        }
        long D0 = D0(r4.a.c(0, i7, 7));
        return Math.max(m2.a.j(D0), e0Var.d0(i7));
    }

    @Override // r1.o
    public final void c(f0 f0Var) {
        b1.c cVar = f0Var.f7767f;
        long d8 = this.f9483s.d();
        long a3 = v0.d.a(C0(d8) ? y0.f.d(d8) : y0.f.d(cVar.d()), B0(d8) ? y0.f.b(d8) : y0.f.b(cVar.d()));
        long h3 = (y0.f.d(cVar.d()) == 0.0f || y0.f.b(cVar.d()) == 0.0f) ? 0L : s0.h(a3, this.f9486v.b(a3, cVar.d()));
        long a9 = this.f9485u.a(j1.c.G(Math.round(y0.f.d(h3)), Math.round(y0.f.b(h3))), j1.c.G(Math.round(y0.f.d(cVar.d())), Math.round(y0.f.b(cVar.d()))), f0Var.getLayoutDirection());
        float f9 = (int) (a9 >> 32);
        float f10 = (int) (a9 & 4294967295L);
        ((b6.c) cVar.f1234g.f1230g).B(f9, f10);
        try {
            this.f9483s.c(f0Var, h3, this.f9487w, this.f9488x);
            ((b6.c) cVar.f1234g.f1230g).B(-f9, -f10);
            f0Var.b();
        } catch (Throwable th) {
            ((b6.c) cVar.f1234g.f1230g).B(-f9, -f10);
            throw th;
        }
    }

    @Override // r1.w
    public final int e(o0 o0Var, e0 e0Var, int i7) {
        if (!A0()) {
            return e0Var.c(i7);
        }
        long D0 = D0(r4.a.c(i7, 0, 13));
        return Math.max(m2.a.i(D0), e0Var.c(i7));
    }

    @Override // r1.w
    public final g0 f(h0 h0Var, e0 e0Var, long j8) {
        n0 b9 = e0Var.b(D0(j8));
        return h0Var.C(b9.f7063f, b9.f7064g, v.f2827f, new c0(b9, 9));
    }

    @Override // r1.w
    public final int h(o0 o0Var, e0 e0Var, int i7) {
        if (!A0()) {
            return e0Var.a0(i7);
        }
        long D0 = D0(r4.a.c(0, i7, 7));
        return Math.max(m2.a.j(D0), e0Var.a0(i7));
    }

    @Override // r1.w
    public final int i(o0 o0Var, e0 e0Var, int i7) {
        if (!A0()) {
            return e0Var.e0(i7);
        }
        long D0 = D0(r4.a.c(i7, 0, 13));
        return Math.max(m2.a.i(D0), e0Var.e0(i7));
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f9483s + ", sizeToIntrinsics=" + this.f9484t + ", alignment=" + this.f9485u + ", alpha=" + this.f9487w + ", colorFilter=" + this.f9488x + ')';
    }
}
