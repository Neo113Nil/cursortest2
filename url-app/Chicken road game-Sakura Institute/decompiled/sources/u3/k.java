package u3;

import d0.b0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t3.h f8997g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f8998h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p0.c f8999i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0.q f9000j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f9001k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t3.h hVar, p pVar, p0.g gVar, q0.q qVar, o oVar) {
        super(2);
        this.f8997g = hVar;
        this.f8998h = pVar;
        this.f8999i = gVar;
        this.f9000j = qVar;
        this.f9001k = oVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            t3.h hVar = this.f8997g;
            boolean h3 = pVar.h(hVar);
            p pVar2 = this.f8998h;
            boolean f9 = h3 | pVar.f(pVar2);
            Object G = pVar.G();
            if (f9 || G == g0.l.f3784a) {
                G = new c.h(this.f9000j, hVar, pVar2, 9);
                pVar.a0(G);
            }
            g0.d.d(hVar, (q6.c) G, pVar);
            q.a(hVar, this.f8999i, o0.f.b(-497631156, new b0(this.f9001k, 17, hVar), pVar), pVar, 384);
        }
        return d6.z.f2639a;
    }
}
