package g4;

import com.android.installreferrer.R;
import g0.m2;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o0 implements q6.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m2 f4352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0 f4353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4354h;

    public o0(g0.z0 z0Var, q0 q0Var, g0.z0 z0Var2) {
        this.f4352f = z0Var;
        this.f4353g = q0Var;
        this.f4354h = z0Var2;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        q.h0 h0Var = (q.h0) obj;
        g0.p pVar = (g0.p) obj2;
        int intValue = ((Number) obj3).intValue();
        r6.k.f(h0Var, "pad");
        if ((intValue & 6) == 0) {
            intValue |= pVar.f(h0Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            final m2 m2Var = this.f4352f;
            boolean isEmpty = ((List) m2Var.getValue()).isEmpty();
            s0.l lVar = s0.l.f8103a;
            if (isEmpty) {
                pVar.Q(1899793366);
                a8.d.b(u3.q.j(R.string.meals_empty, pVar), androidx.compose.foundation.layout.b.d(lVar, h0Var), pVar, 0, 0);
                pVar.p(false);
            } else {
                pVar.Q(1899941825);
                s0.o j8 = androidx.compose.foundation.layout.b.d(lVar, h0Var).j(androidx.compose.foundation.layout.c.f640c);
                float f9 = 16;
                q.h0 h0Var2 = new q.h0(f9, f9, f9, f9);
                q.b bVar = q.j.f7291a;
                q.g gVar = new q.g(10);
                pVar.Q(-908536255);
                boolean f10 = pVar.f(m2Var);
                final q0 q0Var = this.f4353g;
                boolean h3 = f10 | pVar.h(q0Var);
                Object G = pVar.G();
                if (h3 || G == g0.l.f3784a) {
                    final g0.z0 z0Var = this.f4354h;
                    G = new q6.c() { // from class: g4.m0
                        @Override // q6.c
                        public final Object f(Object obj4) {
                            r.e eVar = (r.e) obj4;
                            r6.k.f(eVar, "$this$LazyColumn");
                            List list = (List) m2.this.getValue();
                            eVar.a(list.size(), new a0.y(new c7.r(5), 14, list), new p(2, list), new o0.a(-632812321, new n0(list, z0Var, q0Var, 0), true));
                            return d6.z.f2639a;
                        }
                    };
                    pVar.a0(G);
                }
                pVar.p(false);
                r4.a.e(24960, 234, pVar, null, gVar, h0Var2, (q6.c) G, null, null, j8, false);
                pVar.p(false);
            }
        }
        return d6.z.f2639a;
    }
}
