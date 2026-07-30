package g4;

import d0.d3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f4295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4296g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4297h;

    public g0(j0 j0Var, g0.z0 z0Var, g0.z0 z0Var2) {
        this.f4295f = j0Var;
        this.f4296g = z0Var;
        this.f4297h = z0Var2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            final g0.z0 z0Var = this.f4296g;
            boolean z8 = !z6.h.G((String) z0Var.getValue());
            pVar.Q(251258738);
            final j0 j0Var = this.f4295f;
            boolean h3 = pVar.h(j0Var);
            Object G = pVar.G();
            if (h3 || G == g0.l.f3784a) {
                final g0.z0 z0Var2 = this.f4297h;
                G = new q6.a() { // from class: g4.f0
                    @Override // q6.a
                    public final Object a() {
                        String obj3 = z6.h.W((String) z0Var.getValue()).toString();
                        r6.k.f(obj3, "name");
                        j0 j0Var2 = j0.this;
                        c7.a0.p(androidx.lifecycle.q0.j(j0Var2), null, null, new a0.e0(j0Var2, obj3, null, 11), 3);
                        z0Var2.setValue(Boolean.FALSE);
                        return d6.z.f2639a;
                    }
                };
                pVar.a0(G);
            }
            pVar.p(false);
            d3.e((q6.a) G, null, z8, null, null, null, w.f4430f, pVar, 805306368, 506);
        }
        return d6.z.f2639a;
    }
}
