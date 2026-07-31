package t2;

import e2.InterfaceC0426e;

/* renamed from: t2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041L extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8992h;

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1041L) o((V1.d) obj2, (EnumC1037H) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1041L c1041l = new C1041L(2, dVar);
        c1041l.f8992h = obj;
        return c1041l;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return Boolean.valueOf(((EnumC1037H) this.f8992h) != EnumC1037H.f8981d);
    }
}
