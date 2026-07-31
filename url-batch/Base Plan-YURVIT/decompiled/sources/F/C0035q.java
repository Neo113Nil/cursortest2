package F;

import a.AbstractC0086a;

/* renamed from: F.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035q extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f421i;

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        C0035q c0035q = new C0035q(2, dVar);
        c0035q.f421i = obj;
        return c0035q;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((C0035q) b((G0.d) obj2, (l0) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        AbstractC0086a.I(obj);
        return Boolean.valueOf(!(((l0) this.f421i) instanceof b0));
    }
}
