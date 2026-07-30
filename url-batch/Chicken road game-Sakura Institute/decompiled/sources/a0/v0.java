package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 implements w.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f165b;

    public v0(x0 x0Var, boolean z8) {
        this.f164a = x0Var;
        this.f165b = z8;
    }

    @Override // w.n0
    public final void a() {
        x0 x0Var = this.f164a;
        x0Var.f189o.setValue(null);
        x0Var.f190p.setValue(null);
        x0Var.p(true);
    }

    @Override // w.n0
    public final void b() {
        x0 x0Var = this.f164a;
        x0Var.f189o.setValue(null);
        x0Var.f190p.setValue(null);
        x0Var.p(true);
    }

    @Override // w.n0
    public final void d() {
        w.z0 d8;
        boolean z8 = this.f165b;
        w.z zVar = z8 ? w.z.f9468g : w.z.f9469h;
        x0 x0Var = this.f164a;
        x0Var.f189o.setValue(zVar);
        long i7 = x0Var.i(z8);
        float f9 = g0.f70a;
        long a3 = u3.r.a(y0.c.d(i7), y0.c.e(i7) - 1.0f);
        w.j0 j0Var = x0Var.f178d;
        if (j0Var == null || (d8 = j0Var.d()) == null) {
            return;
        }
        long e9 = d8.e(a3);
        x0Var.f186l = e9;
        x0Var.f190p.setValue(new y0.c(e9));
        x0Var.f188n = 0L;
        x0Var.f191q = -1;
        w.j0 j0Var2 = x0Var.f178d;
        if (j0Var2 != null) {
            j0Var2.f9271q.setValue(Boolean.TRUE);
        }
        x0Var.p(false);
    }

    @Override // w.n0
    public final void e(long j8) {
        x0 x0Var = this.f164a;
        long h3 = y0.c.h(x0Var.f188n, j8);
        x0Var.f188n = h3;
        x0Var.f190p.setValue(new y0.c(y0.c.h(x0Var.f186l, h3)));
        g2.w j9 = x0Var.j();
        y0.c g9 = x0Var.g();
        r6.k.c(g9);
        x0.a(x0Var, j9, g9.f9778a, false, this.f165b, t.f144g, true);
        x0Var.p(false);
    }

    @Override // w.n0
    public final void onCancel() {
    }

    @Override // w.n0
    public final void c(long j8) {
    }
}
