package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.a f90g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f91h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q6.a aVar, boolean z8) {
        super(3);
        this.f90g = aVar;
        this.f91h = z8;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        s0.o oVar = (s0.o) obj;
        g0.p pVar = (g0.p) obj2;
        ((Number) obj3).intValue();
        pVar.Q(-196777734);
        long j8 = ((g1) pVar.k(h1.f83a)).f73a;
        boolean e9 = pVar.e(j8);
        q6.a aVar = this.f90g;
        boolean f9 = e9 | pVar.f(aVar);
        boolean z8 = this.f91h;
        boolean g9 = f9 | pVar.g(z8);
        Object G = pVar.G();
        if (g9 || G == g0.l.f3784a) {
            G = new i(j8, aVar, z8);
            pVar.a0(G);
        }
        s0.o b9 = androidx.compose.ui.draw.a.b(oVar, (q6.c) G);
        pVar.p(false);
        return b9;
    }
}
