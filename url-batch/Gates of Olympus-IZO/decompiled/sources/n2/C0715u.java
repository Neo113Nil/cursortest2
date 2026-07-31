package n2;

/* renamed from: n2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715u extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f6391e;

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0715u c0715u = new C0715u(2, dVar);
        c0715u.f6391e = ((Number) obj).intValue();
        return c0715u;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0715u) create(Integer.valueOf(((Number) obj).intValue()), (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return Boolean.valueOf(this.f6391e > 0);
    }
}
