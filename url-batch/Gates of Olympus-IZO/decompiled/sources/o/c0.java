package o;

/* loaded from: classes.dex */
public final class c0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j3, P1.d dVar) {
        super(2, dVar);
        this.f6496f = j3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        c0 c0Var = new c0(this.f6496f, dVar);
        c0Var.f6495e = obj;
        return c0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        c0 c0Var = (c0) create((l0) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        c0Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        o0 o0Var = ((l0) this.f6495e).f6573a;
        o0.a(o0Var, o0Var.f6599h, this.f6496f, 1);
        return L1.z.f2729a;
    }
}
