package e1;

/* renamed from: e1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371u extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f4744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371u(Y y3, P1.d dVar) {
        super(2, dVar);
        this.f4744f = y3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0371u c0371u = new C0371u(this.f4744f, dVar);
        c0371u.f4743e = obj;
        return c0371u;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0371u) create((Y) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        Y y3 = (Y) this.f4743e;
        return Boolean.valueOf((y3 instanceof C0354c) && y3.f4677a <= this.f4744f.f4677a);
    }
}
