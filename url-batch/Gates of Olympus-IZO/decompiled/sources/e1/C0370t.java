package e1;

/* renamed from: e1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370t extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4742e;

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0370t c0370t = new C0370t(2, dVar);
        c0370t.f4742e = obj;
        return c0370t;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0370t) create((Y) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return Boolean.valueOf(!(((Y) this.f4742e) instanceof O));
    }
}
