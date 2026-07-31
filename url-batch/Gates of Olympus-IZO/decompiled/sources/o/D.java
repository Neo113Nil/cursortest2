package o;

/* loaded from: classes.dex */
public final class D extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Z1.t f6424e;

    /* renamed from: f, reason: collision with root package name */
    public int f6425f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z1.t f6427h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0 f6428i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Z1.t tVar, g0 g0Var, P1.d dVar) {
        super(2, dVar);
        this.f6427h = tVar;
        this.f6428i = g0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        D d3 = new D(this.f6427h, this.f6428i, dVar);
        d3.f6426g = obj;
        return d3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((D) create((Y1.c) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Y1.c cVar;
        Object obj2;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6425f;
        if (i3 == 0) {
            I2.l.Q(obj);
            cVar = (Y1.c) this.f6426g;
            r1 = this.f6427h;
            obj2 = r1.f3480d;
            if (obj2 instanceof C0743t) {
            }
            return L1.z.f2729a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z1.t tVar = this.f6424e;
        cVar = (Y1.c) this.f6426g;
        I2.l.Q(obj);
        AbstractC0744u abstractC0744u = (AbstractC0744u) obj;
        tVar.f3480d = abstractC0744u;
        tVar = this.f6427h;
        obj2 = tVar.f3480d;
        if (!(obj2 instanceof C0743t) || (obj2 instanceof C0741q)) {
            return L1.z.f2729a;
        }
        abstractC0744u = null;
        r rVar = obj2 instanceof r ? (r) obj2 : null;
        if (rVar != null) {
            cVar.j(rVar);
        }
        m2.e eVar = this.f6428i.f6526w;
        if (eVar != null) {
            this.f6426g = cVar;
            this.f6424e = tVar;
            this.f6425f = 1;
            obj = eVar.c(this);
            if (obj == aVar) {
                return aVar;
            }
            AbstractC0744u abstractC0744u2 = (AbstractC0744u) obj;
        }
        tVar.f3480d = abstractC0744u2;
        tVar = this.f6427h;
        obj2 = tVar.f3480d;
        if (obj2 instanceof C0743t) {
        }
        return L1.z.f2729a;
    }
}
