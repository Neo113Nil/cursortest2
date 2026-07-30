package k;

import a0.e1;
import g0.g1;
import l.l1;
import l.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1 f5196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5197h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.c f5198i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f5199j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q0.q f5200k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o0.a f5201l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p1 p1Var, Object obj, q6.c cVar, m mVar, q0.q qVar, o0.a aVar) {
        super(2);
        this.f5196g = p1Var;
        this.f5197h = obj;
        this.f5198i = cVar;
        this.f5199j = mVar;
        this.f5200k = qVar;
        this.f5201l = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            Object G = pVar.G();
            q6.c cVar = this.f5198i;
            m mVar = this.f5199j;
            Object obj3 = g0.l.f3784a;
            if (G == obj3) {
                G = (v) cVar.f(mVar);
                pVar.a0(G);
            }
            v vVar = (v) G;
            p1 p1Var = this.f5196g;
            l1 f9 = p1Var.f();
            g1 g1Var = p1Var.f5613d;
            Object c4 = f9.c();
            Object obj4 = this.f5197h;
            boolean g9 = pVar.g(r6.k.a(c4, obj4));
            Object G2 = pVar.G();
            if (g9 || G2 == obj3) {
                G2 = r6.k.a(p1Var.f().c(), obj4) ? i0.f5223b : ((v) cVar.f(mVar)).f5275b;
                pVar.a0(G2);
            }
            i0 i0Var = (i0) G2;
            Object G3 = pVar.G();
            if (G3 == obj3) {
                G3 = new j(r6.k.a(obj4, g1Var.getValue()));
                pVar.a0(G3);
            }
            j jVar = (j) G3;
            h0 h0Var = vVar.f5274a;
            boolean h3 = pVar.h(vVar);
            Object G4 = pVar.G();
            if (h3 || G4 == obj3) {
                G4 = new e1(1, vVar);
                pVar.a0(G4);
            }
            s0.o b9 = androidx.compose.ui.layout.a.b((q6.f) G4);
            jVar.f5226a.setValue(Boolean.valueOf(r6.k.a(obj4, g1Var.getValue())));
            s0.o j8 = b9.j(jVar);
            boolean h8 = pVar.h(obj4);
            Object G5 = pVar.G();
            if (h8 || G5 == obj3) {
                G5 = new c1.a(12, obj4);
                pVar.a0(G5);
            }
            q6.c cVar2 = (q6.c) G5;
            boolean f10 = pVar.f(i0Var);
            Object G6 = pVar.G();
            if (f10 || G6 == obj3) {
                G6 = new a2.a(4, i0Var);
                pVar.a0(G6);
            }
            androidx.compose.animation.a.a(this.f5196g, cVar2, j8, h0Var, i0Var, (q6.e) G6, o0.f.b(-616195562, new d(this.f5200k, obj4, mVar, this.f5201l, 0), pVar), pVar, 12582912);
        }
        return d6.z.f2639a;
    }
}
