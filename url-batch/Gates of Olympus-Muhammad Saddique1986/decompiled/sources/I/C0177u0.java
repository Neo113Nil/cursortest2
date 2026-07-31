package I;

import e2.InterfaceC0426e;

/* renamed from: I.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177u0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2944h;

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0177u0) o((V1.d) obj2, (EnumC0175t0) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0177u0 c0177u0 = new C0177u0(2, dVar);
        c0177u0.f2944h = obj;
        return c0177u0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return Boolean.valueOf(((EnumC0175t0) this.f2944h) == EnumC0175t0.f2919d);
    }
}
