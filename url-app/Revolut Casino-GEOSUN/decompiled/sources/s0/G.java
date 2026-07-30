package s0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class G extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2861i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G.d f2862j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2863k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(G.d dVar, long j2, w0.d dVar2) {
        super(2, dVar2);
        this.f2862j = dVar;
        this.f2863k = j2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        G g2 = new G(this.f2862j, this.f2863k, dVar);
        g2.f2861i = obj;
        return g2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        G g2 = (G) b((G.b) obj, (w0.d) obj2);
        C0247g c0247g = C0247g.f3005a;
        g2.l(c0247g);
        return c0247g;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        o.g.z(obj);
        ((G.b) this.f2861i).d(this.f2862j, new Long(this.f2863k));
        return C0247g.f3005a;
    }
}
