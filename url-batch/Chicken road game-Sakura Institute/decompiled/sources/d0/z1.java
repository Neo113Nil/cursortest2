package d0;

import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z1 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f2551g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2552h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2553i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q6.e f2554j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2555k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o0.a f2556l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(v1 v1Var, boolean z8, boolean z9, q6.e eVar, boolean z10, o0.a aVar) {
        super(2);
        this.f2551g = v1Var;
        this.f2552h = z8;
        this.f2553i = z9;
        this.f2554j = eVar;
        this.f2555k = z10;
        this.f2556l = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        s0.o oVar;
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            boolean z8 = this.f2553i;
            boolean z9 = this.f2552h;
            v1 v1Var = this.f2551g;
            g0.m2 a3 = k.n0.a(!z8 ? v1Var.f2471f : z9 ? v1Var.f2466a : v1Var.f2469d, l.e.l(150, 6, null), pVar, 48);
            if (this.f2554j == null || !(this.f2555k || z9)) {
                oVar = s0.l.f8103a;
            } else {
                a0 a0Var = a0.f1813j;
                AtomicInteger atomicInteger = y1.k.f9835a;
                oVar = new ClearAndSetSemanticsElement(a0Var);
            }
            p1.f0 e9 = q.n.e(s0.b.f8078f, false);
            int i7 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, oVar);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, e9, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
                a0.m.q(i7, pVar, i7, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            g0.d.a(y0.f2529a.a(new z0.u(((z0.u) a3.getValue()).f10059a)), this.f2556l, pVar, 8);
            pVar.p(true);
        }
        return d6.z.f2639a;
    }
}
