package o;

/* loaded from: classes.dex */
public final class n0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6584e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f6586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R1.i f6587h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(o0 o0Var, Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f6586g = o0Var;
        this.f6587h = (R1.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        n0 n0Var = new n0(this.f6586g, this.f6587h, dVar);
        n0Var.f6585f = obj;
        return n0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((n0) create((N) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6584e;
        if (i3 == 0) {
            I2.l.Q(obj);
            N n3 = (N) this.f6585f;
            o0 o0Var = this.f6586g;
            o0Var.f6599h = n3;
            this.f6584e = 1;
            if (this.f6587h.g(o0Var.f6600i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
