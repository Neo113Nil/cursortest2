package D;

import u0.C0247g;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f255i;

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        C0016q c0016q = new C0016q(2, dVar);
        c0016q.f255i = obj;
        return c0016q;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0016q) b((m0) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        o.g.z(obj);
        return Boolean.valueOf(!(((m0) this.f255i) instanceof d0));
    }
}
