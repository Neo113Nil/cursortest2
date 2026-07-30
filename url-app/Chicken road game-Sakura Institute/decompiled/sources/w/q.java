package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f9379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2.x f9381i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g2.w f9382j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g2.m f9383k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.q f9384l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9385m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c7.x f9386n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t.c f9387o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j0 j0Var, boolean z8, g2.x xVar, g2.w wVar, g2.m mVar, g2.q qVar, a0.x0 x0Var, c7.x xVar2, t.c cVar) {
        super(1);
        this.f9379g = j0Var;
        this.f9380h = z8;
        this.f9381i = xVar;
        this.f9382j = wVar;
        this.f9383k = mVar;
        this.f9384l = qVar;
        this.f9385m = x0Var;
        this.f9386n = xVar2;
        this.f9387o = cVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        z0 d8;
        x0.q qVar = (x0.q) obj;
        j0 j0Var = this.f9379g;
        if (j0Var.b() != qVar.a()) {
            j0Var.f9260f.setValue(Boolean.valueOf(qVar.a()));
            boolean b9 = j0Var.b();
            g2.q qVar2 = this.f9384l;
            g2.w wVar = this.f9382j;
            if (b9 && this.f9380h) {
                g0.j(this.f9381i, j0Var, wVar, this.f9383k, qVar2);
            } else {
                g0.g(j0Var);
            }
            if (qVar.a() && (d8 = j0Var.d()) != null) {
                c7.a0.p(this.f9386n, null, null, new androidx.room.d(this.f9387o, wVar, j0Var, d8, qVar2, null, 10), 3);
            }
            if (!qVar.a()) {
                this.f9385m.e(null);
            }
        }
        return d6.z.f2639a;
    }
}
