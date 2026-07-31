package F;

/* loaded from: classes.dex */
public final class Q0 extends R1.i implements Y1.e {
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new Q0(2, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        Q0 q0 = (Q0) create((n0.v) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        q0.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return L1.z.f2729a;
    }
}
