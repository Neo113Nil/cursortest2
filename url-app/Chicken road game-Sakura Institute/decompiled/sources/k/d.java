package k;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.t0;
import s1.f1;
import s1.r2;
import s1.s2;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5186g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5188i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5189j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5190k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(3);
        this.f5186g = i7;
        this.f5187h = obj;
        this.f5188i = obj2;
        this.f5189j = obj3;
        this.f5190k = obj4;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.f5186g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q qVar = (q) obj;
                g0.p pVar = (g0.p) obj2;
                int intValue = ((Number) obj3).intValue();
                q0.q qVar2 = (q0.q) this.f5187h;
                m mVar = (m) this.f5189j;
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? pVar.f(qVar) : pVar.h(qVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && pVar.x()) {
                    pVar.L();
                } else {
                    boolean f9 = pVar.f(qVar2);
                    Object obj5 = this.f5188i;
                    boolean h3 = f9 | pVar.h(obj5) | pVar.h(mVar);
                    Object G = pVar.G();
                    t0 t0Var = g0.l.f3784a;
                    if (h3 || G == t0Var) {
                        G = new c.h(qVar2, obj5, mVar, 1);
                        pVar.a0(G);
                    }
                    g0.d.d(qVar, (q6.c) G, pVar);
                    i.x xVar = mVar.f5242d;
                    r6.k.d(qVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                    xVar.i(obj5, ((r) qVar).f5261a);
                    Object G2 = pVar.G();
                    if (G2 == t0Var) {
                        G2 = new i();
                        pVar.a0(G2);
                    }
                    ((o0.a) this.f5190k).j((i) G2, obj5, pVar, 0);
                }
                return d6.z.f2639a;
            default:
                g2.q qVar3 = (g2.q) this.f5190k;
                s0.o oVar = (s0.o) obj;
                g0.p pVar2 = (g0.p) obj2;
                ((Number) obj3).intValue();
                w.j0 j0Var = (w.j0) this.f5188i;
                r0 r0Var = (r0) this.f5187h;
                g2.w wVar = (g2.w) this.f5189j;
                long j8 = wVar.f4066b;
                pVar2.Q(-84507373);
                Object G3 = pVar2.G();
                t0 t0Var2 = g0.l.f3784a;
                if (G3 == t0Var2) {
                    G3 = new y.j();
                    pVar2.a0(G3);
                }
                y.j jVar = (y.j) G3;
                boolean z8 = r0Var.f10045a != 16;
                if (((s2) ((r2) pVar2.k(f1.f8229r))).a() && j0Var.b() && a2.j0.b(j8) && z8) {
                    pVar2.Q(808320157);
                    a2.g gVar = wVar.f4065a;
                    a2.j0 j0Var2 = new a2.j0(j8);
                    boolean h8 = pVar2.h(jVar);
                    Object G4 = pVar2.G();
                    if (h8 || G4 == t0Var2) {
                        G4 = new f4.c(jVar, null, 8);
                        pVar2.a0(G4);
                    }
                    g0.d.f(gVar, j0Var2, (q6.e) G4, pVar2);
                    boolean h9 = pVar2.h(jVar) | pVar2.h(qVar3) | pVar2.f(wVar) | pVar2.h(j0Var) | pVar2.f(r0Var);
                    Object G5 = pVar2.G();
                    if (h9 || G5 == t0Var2) {
                        G5 = new p2.f(jVar, qVar3, wVar, j0Var, r0Var, 2);
                        pVar2.a0(G5);
                    }
                    obj4 = androidx.compose.ui.draw.a.c(oVar, (q6.c) G5);
                    pVar2.p(false);
                } else {
                    pVar2.Q(809534830);
                    pVar2.p(false);
                    obj4 = s0.l.f8103a;
                }
                pVar2.p(false);
                return obj4;
        }
    }
}
