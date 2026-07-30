package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.d0 f9425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.w f9426h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f9427i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g2.m f9428j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f9429k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.q f9430l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.n f9432n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g2.d0 d0Var, g2.w wVar, boolean z8, g2.m mVar, j0 j0Var, g2.q qVar, a0.x0 x0Var, x0.n nVar) {
        super(1);
        this.f9425g = d0Var;
        this.f9426h = wVar;
        this.f9427i = z8;
        this.f9428j = mVar;
        this.f9429k = j0Var;
        this.f9430l = qVar;
        this.f9431m = x0Var;
        this.f9432n = nVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        y1.i iVar = (y1.i) obj;
        a2.g gVar = this.f9425g.f4010a;
        x6.e[] eVarArr = y1.r.f9886a;
        y1.s sVar = y1.p.f9882x;
        x6.e[] eVarArr2 = y1.r.f9886a;
        x6.e eVar = eVarArr2[16];
        sVar.a(iVar, gVar);
        g2.w wVar = this.f9426h;
        long j8 = wVar.f4066b;
        y1.s sVar2 = y1.p.f9883y;
        x6.e eVar2 = eVarArr2[17];
        sVar2.a(iVar, new a2.j0(j8));
        d6.z zVar = d6.z.f2639a;
        boolean z8 = this.f9427i;
        if (!z8) {
            iVar.m(y1.p.f9867i, zVar);
        }
        y1.s sVar3 = y1.p.F;
        x6.e eVar3 = eVarArr2[23];
        sVar3.a(iVar, Boolean.valueOf(z8));
        j0 j0Var = this.f9429k;
        y1.r.c(iVar, new p(j0Var, 2));
        if (z8) {
            iVar.m(y1.h.f9814i, new y1.a(null, new p(j0Var, iVar)));
            iVar.m(y1.h.f9818m, new y1.a(null, new u3.n(z8, j0Var, iVar, wVar)));
        }
        g2.q qVar = this.f9430l;
        boolean z9 = this.f9427i;
        a0.x0 x0Var = this.f9431m;
        iVar.m(y1.h.f9813h, new y1.a(null, new s(qVar, z9, wVar, x0Var, j0Var)));
        g2.m mVar = this.f9428j;
        int i7 = mVar.f4046e;
        a0.b1 b1Var = new a0.b1(j0Var, 13, mVar);
        iVar.m(y1.p.f9884z, new g2.l(i7));
        iVar.m(y1.h.f9819n, new y1.a(null, b1Var));
        iVar.m(y1.h.f9807b, new y1.a(null, new a0.b1(j0Var, 14, this.f9432n)));
        iVar.m(y1.h.f9808c, new y1.a(null, new a0.w0(x0Var, 5)));
        if (!a2.j0.b(j8)) {
            iVar.m(y1.h.f9820o, new y1.a(null, new a0.w0(x0Var, 6)));
            if (z8) {
                iVar.m(y1.h.f9821p, new y1.a(null, new a0.w0(x0Var, 7)));
            }
        }
        if (z8) {
            iVar.m(y1.h.f9822q, new y1.a(null, new a0.w0(x0Var, 4)));
        }
        return zVar;
    }
}
