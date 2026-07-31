package h1;

import e2.InterfaceC0426e;

/* renamed from: h1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502u extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6196h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f6197i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502u(X x3, V1.d dVar) {
        super(2, dVar);
        this.f6197i = x3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0502u) o((V1.d) obj2, (X) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0502u c0502u = new C0502u(this.f6197i, dVar);
        c0502u.f6196h = obj;
        return c0502u;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        X x3 = (X) this.f6196h;
        return Boolean.valueOf((x3 instanceof C0485c) && x3.f6130a <= this.f6197i.f6130a);
    }
}
