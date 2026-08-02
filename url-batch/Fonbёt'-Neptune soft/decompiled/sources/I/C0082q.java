package I;

/* renamed from: I.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082q extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f700i;

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        C0082q c0082q = new C0082q(2, dVar);
        c0082q.f700i = obj;
        return c0082q;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0082q) b((H0.d) obj2, (k0) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        i1.a.G(obj);
        return Boolean.valueOf(!(((k0) this.f700i) instanceof b0));
    }
}
