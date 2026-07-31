package l1;

import a0.g1;
import m0.e1;
import m0.h1;
import w1.h0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public f1.m f4724a;

    /* renamed from: b, reason: collision with root package name */
    public float f4725b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public r2.l f4726c = r2.l.f6529d;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f4727d = m0.b.q(new e1.e(0));

    /* renamed from: e, reason: collision with root package name */
    public final h1 f4728e = m0.b.q(Boolean.FALSE);

    /* renamed from: f, reason: collision with root package name */
    public final v f4729f;

    /* renamed from: g, reason: collision with root package name */
    public final e1 f4730g;

    /* renamed from: h, reason: collision with root package name */
    public float f4731h;
    public f1.m i;

    /* renamed from: j, reason: collision with root package name */
    public int f4732j;

    public a0(b bVar) {
        v vVar = new v(bVar);
        vVar.f4816f = new d1.o(4, this);
        this.f4729f = vVar;
        this.f4730g = new e1(0);
        this.f4731h = 1.0f;
        this.f4732j = -1;
    }

    public final void a(h0 h0Var, long j7, float f6, f1.m mVar) {
        h1.b bVar = h0Var.f7680d;
        if (this.f4725b != f6) {
            this.f4731h = f6;
            this.f4725b = f6;
        }
        if (!q6.i.a(this.f4724a, mVar)) {
            this.i = mVar;
            this.f4724a = mVar;
        }
        r2.l layoutDirection = h0Var.getLayoutDirection();
        if (this.f4726c != layoutDirection) {
            this.f4726c = layoutDirection;
        }
        int i = (int) (j7 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (bVar.c() >> 32)) - Float.intBitsToFloat(i);
        int i8 = (int) (j7 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.c() & 4294967295L)) - Float.intBitsToFloat(i8);
        ((b1.b) bVar.f3075e.f84b).t(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f6 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i8) > 0.0f) {
                    c(h0Var);
                }
            } finally {
                ((b1.b) bVar.f3075e.f84b).t(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public final long b() {
        return ((e1.e) this.f4727d.getValue()).f2469a;
    }

    public final void c(h0 h0Var) {
        h1.b bVar = h0Var.f7680d;
        f1.m mVar = this.i;
        v vVar = this.f4729f;
        if (mVar == null) {
            mVar = (f1.m) vVar.f4817g.getValue();
        }
        if (((Boolean) this.f4728e.getValue()).booleanValue() && h0Var.getLayoutDirection() == r2.l.f6530e) {
            long M = bVar.M();
            g1 g1Var = bVar.f3075e;
            long u7 = g1Var.u();
            g1Var.m().h();
            try {
                ((b1.b) g1Var.f84b).w(-1.0f, 1.0f, M);
                vVar.e(h0Var, this.f4731h, mVar);
            } finally {
                g1Var.m().f();
                g1Var.M(u7);
            }
        } else {
            vVar.e(h0Var, this.f4731h, mVar);
        }
        this.f4732j = this.f4730g.g();
    }
}
