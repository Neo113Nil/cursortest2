package g4;

import com.chicken.road.whale.store.Meal;
import d0.a4;
import d0.b4;
import d0.x3;
import g0.k1;
import g0.m2;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 implements q6.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m2 f4249h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4250i;

    public a1(String str, int i7, m2 m2Var, g0.z0 z0Var) {
        this.f4247f = str;
        this.f4248g = i7;
        this.f4249h = m2Var;
        this.f4250i = z0Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        g0.p pVar = (g0.p) obj2;
        int intValue = ((Number) obj3).intValue();
        r6.k.f((q.t) obj, "$this$Card");
        if ((intValue & 17) == 16 && pVar.x()) {
            pVar.L();
        } else {
            s0.o e9 = androidx.compose.foundation.layout.b.e(s0.l.f8103a, 14);
            q.s a3 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar, 0);
            int i7 = pVar.P;
            k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, e9);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, a3, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
                a0.m.q(i7, pVar, i7, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            x3.b(this.f4247f, null, ((d0.q0) pVar.k(d0.s0.f2378a)).f2300a, 0L, 0L, null, null, 0L, 0, false, 0, 0, ((a4) pVar.k(b4.f1865a)).f1838h, pVar, 0, 0, 65530);
            q.c.a(pVar, androidx.compose.foundation.layout.c.c(2));
            pVar.Q(-507594076);
            for (String str : i1.f4315a) {
                Map map = ((b1) this.f4249h.getValue()).f4256b;
                StringBuilder sb = new StringBuilder();
                int i8 = this.f4248g;
                sb.append(i8);
                sb.append("|");
                sb.append(str);
                Meal meal = (Meal) map.get(sb.toString());
                String name = meal != null ? meal.getName() : null;
                pVar.Q(1574904930);
                boolean d8 = pVar.d(i8) | pVar.f(str);
                Object G = pVar.G();
                if (d8 || G == g0.l.f3784a) {
                    G = new z0(i8, str, this.f4250i);
                    pVar.a0(G);
                }
                pVar.p(false);
                a8.d.h(str, name, (q6.a) G, pVar, 0);
            }
            pVar.p(false);
            pVar.p(true);
        }
        return d6.z.f2639a;
    }
}
