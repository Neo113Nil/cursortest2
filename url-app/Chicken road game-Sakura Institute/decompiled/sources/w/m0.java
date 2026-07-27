package w;

import A0.C0030a;
import G.C0192d;
import G.C0197f0;
import G.C0205j0;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final y.t f11251f;

    /* renamed from: a, reason: collision with root package name */
    public final C0197f0 f11252a;

    /* renamed from: b, reason: collision with root package name */
    public final C0197f0 f11253b = C0192d.I(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public Y.d f11254c = Y.d.f4373e;

    /* renamed from: d, reason: collision with root package name */
    public long f11255d = A0.K.f299b;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f11256e;

    static {
        l0 l0Var = l0.f11244d;
        C1265e c1265e = C1265e.f11173s;
        C0030a c0030a = new C0030a(l0Var);
        M2.J.d(1, c1265e);
        y.t tVar = P.o.f3675a;
        f11251f = new y.t(c0030a, 13, c1265e);
    }

    public m0(o.N n2, float f4) {
        this.f11252a = C0192d.I(f4);
        this.f11256e = C0192d.K(n2, G.W.f2779l);
    }

    public final void a(o.N n2, Y.d dVar, int i2, int i4) {
        float f4 = i4 - i2;
        this.f11253b.f(f4);
        Y.d dVar2 = this.f11254c;
        float f5 = dVar2.f4374a;
        float f6 = dVar.f4374a;
        C0197f0 c0197f0 = this.f11252a;
        float f7 = dVar.f4375b;
        if (f6 != f5 || f7 != dVar2.f4375b) {
            boolean z4 = n2 == o.N.f8665d;
            if (z4) {
                f6 = f7;
            }
            float f8 = z4 ? dVar.f4377d : dVar.f4376c;
            float d4 = c0197f0.d();
            float f9 = i2;
            float f10 = d4 + f9;
            c0197f0.f(c0197f0.d() + ((f8 <= f10 && (f6 >= d4 || f8 - f6 <= f9)) ? (f6 >= d4 || f8 - f6 > f9) ? 0.0f : f6 - d4 : f8 - f10));
            this.f11254c = dVar;
        }
        c0197f0.f(kotlin.ranges.b.d(c0197f0.d(), 0.0f, f4));
    }
}
