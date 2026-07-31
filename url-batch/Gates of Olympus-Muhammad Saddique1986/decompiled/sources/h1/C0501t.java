package h1;

import e2.InterfaceC0426e;

/* renamed from: h1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501t extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6195h;

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0501t) o((V1.d) obj2, (X) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0501t c0501t = new C0501t(2, dVar);
        c0501t.f6195h = obj;
        return c0501t;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return Boolean.valueOf(!(((X) this.f6195h) instanceof N));
    }
}
