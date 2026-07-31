package o;

/* renamed from: o.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725a0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0725a0(long j3, P1.d dVar) {
        super(2, dVar);
        this.f6488f = j3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0725a0 c0725a0 = new C0725a0(this.f6488f, dVar);
        c0725a0.f6487e = obj;
        return c0725a0;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0725a0 c0725a0 = (C0725a0) create((l0) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        c0725a0.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        o0 o0Var = ((l0) this.f6487e).f6573a;
        o0.a(o0Var, o0Var.f6599h, this.f6488f, 1);
        return L1.z.f2729a;
    }
}
