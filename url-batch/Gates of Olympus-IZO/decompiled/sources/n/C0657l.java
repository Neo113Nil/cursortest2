package n;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657l extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6114e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0658m f6116g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0657l(C0658m c0658m, P1.d dVar) {
        super(2, dVar);
        this.f6116g = c0658m;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0657l c0657l = new C0657l(this.f6116g, dVar);
        c0657l.f6115f = obj;
        return c0657l;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0657l) create((n0.v) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6114e;
        if (i3 == 0) {
            I2.l.Q(obj);
            n0.v vVar = (n0.v) this.f6115f;
            C0656k c0656k = new C0656k(this.f6116g, null);
            this.f6114e = 1;
            if (g2.i.J(vVar, c0656k, this) == aVar) {
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
