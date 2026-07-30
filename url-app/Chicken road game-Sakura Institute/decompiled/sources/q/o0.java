package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o0 extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public float f7320s;

    /* renamed from: t, reason: collision with root package name */
    public float f7321t;

    /* renamed from: u, reason: collision with root package name */
    public float f7322u;

    /* renamed from: v, reason: collision with root package name */
    public float f7323v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7324w;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A0(p1.h0 h0Var) {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (m2.e.a(this.f7322u, Float.NaN)) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = h0Var.K(this.f7322u);
            if (i7 < 0) {
                i7 = 0;
            }
        }
        if (m2.e.a(this.f7323v, Float.NaN)) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = h0Var.K(this.f7323v);
            if (i8 < 0) {
                i8 = 0;
            }
        }
        if (!m2.e.a(this.f7320s, Float.NaN)) {
            i9 = h0Var.K(this.f7320s);
            if (i9 > i7) {
                i9 = i7;
            }
            if (i9 < 0) {
                i9 = 0;
            }
        }
        i9 = 0;
        if (!m2.e.a(this.f7321t, Float.NaN)) {
            int K = h0Var.K(this.f7321t);
            if (K > i8) {
                K = i8;
            }
            if (K < 0) {
                K = 0;
            }
            if (K != Integer.MAX_VALUE) {
                i10 = K;
            }
        }
        return r4.a.b(i9, i7, i10, i8);
    }

    @Override // r1.w
    public final int b(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        long A0 = A0(o0Var);
        return m2.a.f(A0) ? m2.a.h(A0) : r4.a.w(A0, e0Var.d0(i7));
    }

    @Override // r1.w
    public final int e(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        long A0 = A0(o0Var);
        return m2.a.e(A0) ? m2.a.g(A0) : r4.a.v(A0, e0Var.c(i7));
    }

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        int j9;
        int h3;
        int i7;
        int g9;
        long b9;
        long A0 = A0(h0Var);
        if (this.f7324w) {
            b9 = r4.a.u(j8, A0);
        } else {
            if (m2.e.a(this.f7320s, Float.NaN)) {
                j9 = m2.a.j(j8);
                int h8 = m2.a.h(A0);
                if (j9 > h8) {
                    j9 = h8;
                }
            } else {
                j9 = m2.a.j(A0);
            }
            if (m2.e.a(this.f7322u, Float.NaN)) {
                h3 = m2.a.h(j8);
                int j10 = m2.a.j(A0);
                if (h3 < j10) {
                    h3 = j10;
                }
            } else {
                h3 = m2.a.h(A0);
            }
            if (m2.e.a(this.f7321t, Float.NaN)) {
                i7 = m2.a.i(j8);
                int g10 = m2.a.g(A0);
                if (i7 > g10) {
                    i7 = g10;
                }
            } else {
                i7 = m2.a.i(A0);
            }
            if (m2.e.a(this.f7323v, Float.NaN)) {
                g9 = m2.a.g(j8);
                int i8 = m2.a.i(A0);
                if (g9 < i8) {
                    g9 = i8;
                }
            } else {
                g9 = m2.a.g(A0);
            }
            b9 = r4.a.b(j9, h3, i7, g9);
        }
        p1.n0 b10 = e0Var.b(b9);
        return h0Var.C(b10.f7063f, b10.f7064g, e6.v.f2827f, new k.c0(b10, 6));
    }

    @Override // r1.w
    public final int h(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        long A0 = A0(o0Var);
        return m2.a.f(A0) ? m2.a.h(A0) : r4.a.w(A0, e0Var.a0(i7));
    }

    @Override // r1.w
    public final int i(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        long A0 = A0(o0Var);
        return m2.a.e(A0) ? m2.a.g(A0) : r4.a.v(A0, e0Var.e0(i7));
    }
}
