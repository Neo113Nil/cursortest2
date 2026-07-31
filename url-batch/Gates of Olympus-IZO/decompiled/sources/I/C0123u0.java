package I;

/* renamed from: I.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123u0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2384e;

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0123u0 c0123u0 = new C0123u0(2, dVar);
        c0123u0.f2384e = obj;
        return c0123u0;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0123u0) create((EnumC0121t0) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return Boolean.valueOf(((EnumC0121t0) this.f2384e) == EnumC0121t0.f2360d);
    }
}
