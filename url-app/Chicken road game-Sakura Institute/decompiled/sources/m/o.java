package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6219g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6220h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6222j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(w.i iVar, boolean z8, q6.a aVar) {
        super(3);
        this.f6221i = iVar;
        this.f6220h = z8;
        this.f6222j = (r6.l) aVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [q6.a, r6.l] */
    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        p.j jVar;
        switch (this.f6219g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj2;
                ((Number) obj3).intValue();
                pVar.Q(-756081143);
                g0 g0Var = (g0) pVar.k(androidx.compose.foundation.d.f604a);
                if (g0Var instanceof l0) {
                    pVar.Q(617140216);
                    pVar.p(false);
                    jVar = null;
                } else {
                    pVar.Q(617248189);
                    Object G = pVar.G();
                    if (G == g0.l.f3784a) {
                        G = new p.j();
                        pVar.a0(G);
                    }
                    jVar = (p.j) G;
                    pVar.p(false);
                }
                s0.o b9 = androidx.compose.foundation.a.b(s0.l.f8103a, jVar, g0Var, this.f6220h, (String) this.f6221i, null, (q6.a) this.f6222j);
                pVar.p(false);
                return b9;
            case 1:
                n.a aVar = (n.a) obj;
                g0.p pVar2 = (g0.p) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= pVar2.f(aVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && pVar2.x()) {
                    pVar2.L();
                } else {
                    String str = (String) ((w.i) this.f6221i).d(pVar2, 0);
                    if (z6.h.G(str)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    n.k.b(str, this.f6220h, aVar, (r6.l) this.f6222j, pVar2, (intValue << 6) & 896);
                }
                return d6.z.f2639a;
            default:
                g0.p pVar3 = (g0.p) obj2;
                ((Number) obj3).intValue();
                w.x0 x0Var = (w.x0) this.f6221i;
                pVar3.Q(805428266);
                boolean z8 = ((o.j0) x0Var.f9459e.getValue()) == o.j0.f6657f || !(pVar3.k(s1.f1.f8223l) == m2.k.f6323g);
                boolean f9 = pVar3.f(x0Var);
                Object G2 = pVar3.G();
                Object obj4 = g0.l.f3784a;
                if (f9 || G2 == obj4) {
                    G2 = new s1.l0(9, x0Var);
                    pVar3.a0(G2);
                }
                g0.z0 M = g0.d.M((q6.c) G2, pVar3);
                Object G3 = pVar3.G();
                if (G3 == obj4) {
                    Object mVar = new o.m(new o.z0(M, 0));
                    pVar3.a0(mVar);
                    G3 = mVar;
                }
                o.y0 y0Var = (o.y0) G3;
                boolean f10 = pVar3.f(y0Var) | pVar3.f(x0Var);
                Object G4 = pVar3.G();
                if (f10 || G4 == obj4) {
                    G4 = new w.v0(y0Var, x0Var);
                    pVar3.a0(G4);
                }
                s0.o b10 = androidx.compose.foundation.gestures.a.b(s0.l.f8103a, (w.v0) G4, (o.j0) x0Var.f9459e.getValue(), null, this.f6220h && x0Var.f9456b.e() != 0.0f, z8, null, (p.j) this.f6222j);
                pVar3.p(false);
                return b10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w.x0 x0Var, boolean z8, p.j jVar) {
        super(3);
        this.f6221i = x0Var;
        this.f6220h = z8;
        this.f6222j = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z8, String str, q6.a aVar) {
        super(3);
        this.f6220h = z8;
        this.f6221i = str;
        this.f6222j = aVar;
    }
}
