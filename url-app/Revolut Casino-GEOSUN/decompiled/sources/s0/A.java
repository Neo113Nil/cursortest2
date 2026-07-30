package s0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class A extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2839i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G.d f2840j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2841k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(G.d dVar, boolean z2, w0.d dVar2) {
        super(2, dVar2);
        this.f2840j = dVar;
        this.f2841k = z2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        A a2 = new A(this.f2840j, this.f2841k, dVar);
        a2.f2839i = obj;
        return a2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        A a2 = (A) b((G.b) obj, (w0.d) obj2);
        C0247g c0247g = C0247g.f3005a;
        a2.l(c0247g);
        return c0247g;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        o.g.z(obj);
        ((G.b) this.f2839i).d(this.f2840j, Boolean.valueOf(this.f2841k));
        return C0247g.f3005a;
    }
}
