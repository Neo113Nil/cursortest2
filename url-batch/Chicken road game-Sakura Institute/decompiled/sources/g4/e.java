package g4;

import androidx.compose.foundation.layout.FillElement;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.Meal;
import d0.g2;
import d0.x3;
import g0.k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4276g;

    public /* synthetic */ e(int i7, Object obj) {
        this.f4275f = i7;
        this.f4276g = obj;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4275f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f640c;
                    t3.b0 b0Var = (t3.b0) this.f4276g;
                    q.m0 a3 = q.l0.a(q.j.f7291a, s0.b.f8087o, pVar, 0);
                    int i7 = pVar.P;
                    k1 m8 = pVar.m();
                    s0.o c4 = s0.a.c(pVar, fillElement);
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
                    t3.h hVar2 = (t3.h) g0.d.u(b0Var.D, null, null, pVar, 48, 2).getValue();
                    g2.a(null, 0L, 0L, null, o0.f.b(1893411600, new d(hVar2 != null ? hVar2.f8792g : null, 0, b0Var), pVar), pVar, 196608);
                    String str = a0.f4238i.f4244f;
                    s0.o a9 = q.n0.a();
                    pVar.Q(1309253485);
                    Object G = pVar.G();
                    if (G == g0.l.f3784a) {
                        G = new c7.r(2);
                        pVar.a0(G);
                    }
                    pVar.p(false);
                    u3.z.a(b0Var, str, a9, null, null, null, null, null, (q6.c) G, pVar, 48);
                    pVar.p(true);
                }
                break;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    x3.b(((Meal) this.f4276g) == null ? "New meal" : "Edit meal", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar2, 0, 0, 131070);
                }
                break;
            default:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                } else {
                    d0.v.a(w.f4425a, null, null, o0.f.b(570901205, new s0(2, (j0) this.f4276g), pVar3), 0.0f, null, null, pVar3, 3078, 246);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
