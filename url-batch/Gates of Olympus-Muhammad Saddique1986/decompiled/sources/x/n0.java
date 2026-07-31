package x;

import C0.C0025a;
import I.C0143d;
import I.C0148f0;
import I.C0156j0;
import a0.C0239d;
import z.C1256t;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C1256t f10181f;

    /* renamed from: a, reason: collision with root package name */
    public final C0148f0 f10182a;

    /* renamed from: b, reason: collision with root package name */
    public final C0148f0 f10183b = C0143d.I(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public C0239d f10184c = C0239d.f4723e;

    /* renamed from: d, reason: collision with root package name */
    public long f10185d = C0.J.f567b;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f10186e;

    static {
        m0 m0Var = m0.f10171e;
        C1192e c1192e = C1192e.f10085q;
        C0025a c0025a = new C0025a(m0Var);
        f2.x.d(1, c1192e);
        C1256t c1256t = R.o.f4037a;
        f10181f = new C1256t(c0025a, 6, c1192e);
    }

    public n0(p.P p3, float f3) {
        this.f10182a = C0143d.I(f3);
        this.f10186e = C0143d.K(p3, I.W.f2783i);
    }

    public final void a(p.P p3, C0239d c0239d, int i3, int i4) {
        float f3 = i4 - i3;
        this.f10183b.h(f3);
        C0239d c0239d2 = this.f10184c;
        float f4 = c0239d2.f4724a;
        float f5 = c0239d.f4724a;
        C0148f0 c0148f0 = this.f10182a;
        float f6 = c0239d.f4725b;
        if (f5 != f4 || f6 != c0239d2.f4725b) {
            boolean z3 = p3 == p.P.f7567d;
            if (z3) {
                f5 = f6;
            }
            float f7 = z3 ? c0239d.f4727d : c0239d.f4726c;
            float g3 = c0148f0.g();
            float f8 = i3;
            float f9 = g3 + f8;
            c0148f0.h(c0148f0.g() + ((f7 <= f9 && (f5 >= g3 || f7 - f5 <= f8)) ? (f5 >= g3 || f7 - f5 > f8) ? 0.0f : f5 - g3 : f7 - f9));
            this.f10184c = c0239d;
        }
        c0148f0.h(O2.d.x(c0148f0.g(), 0.0f, f3));
    }
}
