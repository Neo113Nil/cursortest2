package s0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class D extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2850i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G.d f2851j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ double f2852k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G.d dVar, double d2, w0.d dVar2) {
        super(2, dVar2);
        this.f2851j = dVar;
        this.f2852k = d2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        D d2 = new D(this.f2851j, this.f2852k, dVar);
        d2.f2850i = obj;
        return d2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        D d2 = (D) b((G.b) obj, (w0.d) obj2);
        C0247g c0247g = C0247g.f3005a;
        d2.l(c0247g);
        return c0247g;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        o.g.z(obj);
        ((G.b) this.f2850i).d(this.f2851j, new Double(this.f2852k));
        return C0247g.f3005a;
    }
}
