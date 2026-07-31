package t2;

import e2.InterfaceC0426e;

/* renamed from: t2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068u extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f9075h;

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1068u) o((V1.d) obj2, Integer.valueOf(((Number) obj).intValue()))).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1068u c1068u = new C1068u(2, dVar);
        c1068u.f9075h = ((Number) obj).intValue();
        return c1068u;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return Boolean.valueOf(this.f9075h > 0);
    }
}
