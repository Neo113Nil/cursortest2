package n2;

/* renamed from: n2.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688M extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6309e;

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0688M c0688m = new C0688M(2, dVar);
        c0688m.f6309e = obj;
        return c0688m;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0688M) create((EnumC0684I) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return Boolean.valueOf(((EnumC0684I) this.f6309e) != EnumC0684I.f6298d);
    }
}
