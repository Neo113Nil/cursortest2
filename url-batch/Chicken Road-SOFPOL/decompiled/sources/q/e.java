package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends q6.j implements p6.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0.p f5818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f5820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u0.c f5821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w0.p pVar, Object obj, p pVar2, u0.c cVar) {
        super(3);
        this.f5818e = pVar;
        this.f5819f = obj;
        this.f5820g = pVar2;
        this.f5821h = cVar;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        x xVar = (x) obj;
        m0.s sVar = (m0.s) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? sVar.f(xVar) : sVar.h(xVar) ? 4 : 2;
        }
        if (sVar.N(intValue & 1, (intValue & 19) != 18)) {
            w0.p pVar = this.f5818e;
            boolean f6 = sVar.f(pVar);
            Object obj4 = this.f5819f;
            boolean h8 = f6 | sVar.h(obj4);
            p pVar2 = this.f5820g;
            boolean h9 = h8 | sVar.h(pVar2);
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (h9 || K == v0Var) {
                K = new b1.f(pVar, obj4, pVar2, 2);
                sVar.f0(K);
            }
            m0.b.d(xVar, (p6.c) K, sVar);
            o.j0 j0Var = pVar2.f5889d;
            q6.i.c(xVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            j0Var.m(obj4, ((y) xVar).f5929a);
            Object K2 = sVar.K();
            if (K2 == v0Var) {
                K2 = new k();
                sVar.f0(K2);
            }
            this.f5821h.j((k) K2, obj4, sVar, 0);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
