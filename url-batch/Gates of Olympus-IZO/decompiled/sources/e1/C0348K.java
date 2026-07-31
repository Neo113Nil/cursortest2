package e1;

/* renamed from: e1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348K extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4625e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0351N f4627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348K(C0351N c0351n, P1.d dVar) {
        super(2, dVar);
        this.f4627g = c0351n;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0348K c0348k = new C0348K(this.f4627g, dVar);
        c0348k.f4626f = obj;
        return c0348k;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0348K) create((P) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4625e;
        if (i3 == 0) {
            I2.l.Q(obj);
            P p = (P) this.f4626f;
            this.f4625e = 1;
            if (C0351N.a(this.f4627g, p, this) == aVar) {
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
