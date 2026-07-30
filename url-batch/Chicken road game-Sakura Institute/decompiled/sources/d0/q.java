package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.s0 f2293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2294h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y3 f2295i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0.a f2296j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a2.k0 f2297k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q6.e f2298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o0.a f2299m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(q.s0 s0Var, float f9, y3 y3Var, o0.a aVar, a2.k0 k0Var, q6.e eVar, o0.a aVar2) {
        super(2);
        this.f2293g = s0Var;
        this.f2294h = f9;
        this.f2295i = y3Var;
        this.f2296j = aVar;
        this.f2297k = k0Var;
        this.f2298l = eVar;
        this.f2299m = aVar2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            q1.h hVar = q.w0.f7372a;
            s0.o e9 = androidx.compose.foundation.layout.c.e(v0.d.e(s0.a.a(s0.l.f8103a, new a0.e1(4, this.f2293g))), 0.0f, this.f2294h, 1);
            boolean f9 = pVar.f(null);
            Object G = pVar.G();
            if (f9 || G == g0.l.f3784a) {
                G = new p();
                pVar.a0(G);
            }
            p pVar2 = (p) G;
            y3 y3Var = this.f2295i;
            long j8 = y3Var.f2542c;
            long j9 = y3Var.f2543d;
            long j10 = y3Var.f2544e;
            q.e eVar = q.j.f7295e;
            v.c(e9, pVar2, j8, j9, j10, this.f2296j, this.f2297k, eVar, eVar, this.f2298l, this.f2299m, pVar, 113246208, 3126);
        }
        return d6.z.f2639a;
    }
}
