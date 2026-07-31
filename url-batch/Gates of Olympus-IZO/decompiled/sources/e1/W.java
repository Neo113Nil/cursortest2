package e1;

import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class W extends R1.i implements Y1.e {
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new W(2, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        W w3 = (W) create((InterfaceC0701g) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        w3.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return L1.z.f2729a;
    }
}
