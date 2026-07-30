package g4;

import d0.d3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q6.g f4324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4327i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4328j;

    public k(q6.g gVar, g0.z0 z0Var, g0.z0 z0Var2, g0.z0 z0Var3, g0.z0 z0Var4) {
        this.f4324f = gVar;
        this.f4325g = z0Var;
        this.f4326h = z0Var2;
        this.f4327i = z0Var3;
        this.f4328j = z0Var4;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            boolean z8 = !z6.h.G((String) this.f4325g.getValue());
            pVar.Q(1937218753);
            boolean f9 = pVar.f(this.f4324f);
            Object G = pVar.G();
            if (f9 || G == g0.l.f3784a) {
                final q6.g gVar = this.f4324f;
                final g0.z0 z0Var = this.f4325g;
                final g0.z0 z0Var2 = this.f4326h;
                final g0.z0 z0Var3 = this.f4327i;
                final g0.z0 z0Var4 = this.f4328j;
                q6.a aVar = new q6.a() { // from class: g4.j
                    @Override // q6.a
                    public final Object a() {
                        String obj3 = z6.h.W((String) z0Var.getValue()).toString();
                        String obj4 = z6.h.W((String) z0Var2.getValue()).toString();
                        if (z6.h.G(obj4)) {
                            obj4 = "Main";
                        }
                        q6.g.this.j(obj3, obj4, z6.h.W((String) z0Var3.getValue()).toString(), z6.h.W((String) z0Var4.getValue()).toString());
                        return d6.z.f2639a;
                    }
                };
                pVar.a0(aVar);
                G = aVar;
            }
            pVar.p(false);
            d3.e((q6.a) G, null, z8, null, null, null, v.f4416d, pVar, 805306368, 506);
        }
        return d6.z.f2639a;
    }
}
