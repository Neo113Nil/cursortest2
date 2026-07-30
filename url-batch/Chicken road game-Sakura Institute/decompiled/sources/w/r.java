package w;

import g0.g1;
import s1.r2;
import s1.s2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f9400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9401h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r2 f9402i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9403j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g2.w f9404k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.q f9405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j0 j0Var, boolean z8, r2 r2Var, a0.x0 x0Var, g2.w wVar, g2.q qVar) {
        super(1);
        this.f9400g = j0Var;
        this.f9401h = z8;
        this.f9402i = r2Var;
        this.f9403j = x0Var;
        this.f9404k = wVar;
        this.f9405l = qVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        g2.c0 c0Var;
        p1.p pVar;
        p1.p pVar2;
        p1.p pVar3 = (p1.p) obj;
        j0 j0Var = this.f9400g;
        g1 g1Var = j0Var.f9269o;
        j0Var.f9262h = pVar3;
        z0 d8 = j0Var.d();
        if (d8 != null) {
            d8.f9472b = pVar3;
        }
        if (this.f9401h) {
            a0 a3 = j0Var.a();
            a0 a0Var = a0.f9184g;
            g2.w wVar = this.f9404k;
            a0.x0 x0Var = this.f9403j;
            if (a3 == a0Var) {
                if (((Boolean) j0Var.f9266l.getValue()).booleanValue() && ((s2) this.f9402i).a()) {
                    x0Var.o();
                } else {
                    x0Var.k();
                }
                j0Var.f9267m.setValue(Boolean.valueOf(a8.d.M(x0Var, true)));
                j0Var.f9268n.setValue(Boolean.valueOf(a8.d.M(x0Var, false)));
                g1Var.setValue(Boolean.valueOf(a2.j0.b(wVar.f4066b)));
            } else if (j0Var.a() == a0.f9185h) {
                g1Var.setValue(Boolean.valueOf(a8.d.M(x0Var, true)));
            }
            g2.q qVar = this.f9405l;
            g0.q(j0Var, wVar, qVar);
            z0 d9 = j0Var.d();
            if (d9 != null && (c0Var = j0Var.f9259e) != null && j0Var.b() && (pVar = d9.f9472b) != null && pVar.O() && (pVar2 = d9.f9473c) != null) {
                a2.h0 h0Var = d9.f9471a;
                s1.l0 l0Var = new s1.l0(8, pVar);
                y0.d T = t6.a.T(pVar);
                y0.d h3 = pVar.h(pVar2, false);
                if (r6.k.a((g2.c0) c0Var.f4001a.f4069b.get(), c0Var)) {
                    c0Var.f4002b.a(wVar, qVar, h0Var, l0Var, T, h3);
                }
            }
        }
        return d6.z.f2639a;
    }
}
