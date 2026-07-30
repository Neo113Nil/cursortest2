package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 implements h0, w0, z0.p0 {

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f6260g = new t0(0);

    /* renamed from: h, reason: collision with root package name */
    public static final t0 f6261h = new t0(1);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6262f;

    public /* synthetic */ t0(int i7) {
        this.f6262f = i7;
    }

    @Override // m.w0
    public long a(long j8, int i7, c1.a aVar) {
        aVar.getClass();
        o.f1 f1Var = (o.f1) aVar.f1524h;
        return new y0.c(o.f1.a(f1Var, f1Var.f6616h, j8, f1Var.f6615g)).f9778a;
    }

    @Override // m.w0
    public boolean b() {
        return false;
    }

    @Override // m.w0
    public Object c(long j8, o.e1 e1Var, h6.d dVar) {
        o.e1 e1Var2 = new o.e1(e1Var.f6606j, dVar);
        e1Var2.f6605i = j8;
        d6.z zVar = d6.z.f2639a;
        Object invokeSuspend = e1Var2.invokeSuspend(zVar);
        return invokeSuspend == i6.a.f4956f ? invokeSuspend : zVar;
    }

    @Override // m.w0
    public s0.o d() {
        return s0.l.f8103a;
    }

    @Override // m.h0
    public void e(r1.f0 f0Var) {
        f0Var.b();
    }

    @Override // z0.p0
    public z0.j0 g(long j8, m2.k kVar, m2.b bVar) {
        switch (this.f6262f) {
            case 3:
                float K = bVar.K(s.f6251a);
                return new z0.h0(new y0.d(0.0f, -K, y0.f.d(j8), y0.f.b(j8) + K));
            default:
                float K2 = bVar.K(s.f6251a);
                return new z0.h0(new y0.d(-K2, 0.0f, y0.f.d(j8) + K2, y0.f.b(j8)));
        }
    }
}
