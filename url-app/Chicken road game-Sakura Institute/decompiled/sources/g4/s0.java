package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import d0.a4;
import d0.b3;
import d0.b4;
import d0.d3;
import d0.x3;
import g0.k1;
import g0.m2;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s0 implements q6.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4378g;

    public /* synthetic */ s0(int i7, Object obj) {
        this.f4377f = i7;
        this.f4378g = obj;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        g0.p pVar;
        boolean z8;
        int i7 = this.f4377f;
        s0.l lVar = s0.l.f8103a;
        g0.t0 t0Var = g0.l.f3784a;
        d6.z zVar = d6.z.f2639a;
        Object obj4 = this.f4378g;
        int i8 = 0;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar2 = (g0.p) obj2;
                int intValue = ((Number) obj3).intValue();
                r6.k.f((q.t) obj, "$this$Card");
                if ((intValue & 17) == 16 && pVar2.x()) {
                    pVar2.L();
                } else {
                    s0.o e9 = androidx.compose.foundation.layout.b.e(lVar, 16);
                    m2 m2Var = (m2) obj4;
                    q.s a3 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar2, 0);
                    int i9 = pVar2.P;
                    k1 m8 = pVar2.m();
                    s0.o c4 = s0.a.c(pVar2, e9);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar2.U();
                    if (pVar2.O) {
                        pVar2.l(nVar);
                    } else {
                        pVar2.d0();
                    }
                    g0.d.Q(pVar2, a3, r1.i.f7784e);
                    g0.d.Q(pVar2, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i9))) {
                        a0.m.q(i9, pVar2, i9, hVar);
                    }
                    g0.d.Q(pVar2, c4, r1.i.f7782c);
                    x3.b("By category", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, ((a4) pVar2.k(b4.f1865a)).f1838h, pVar2, 6, 0, 65534);
                    q.c.a(pVar2, androidx.compose.foundation.layout.c.c(8));
                    Iterator it = ((t0) m2Var.getValue()).f4392e.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    final int intValue2 = ((Number) ((d6.j) it.next()).f2619g).intValue();
                    while (it.hasNext()) {
                        int intValue3 = ((Number) ((d6.j) it.next()).f2619g).intValue();
                        if (intValue2 < intValue3) {
                            intValue2 = intValue3;
                        }
                    }
                    pVar2.Q(-1138228705);
                    for (d6.j jVar : ((t0) m2Var.getValue()).f4392e) {
                        String str = (String) jVar.f2618f;
                        final int intValue4 = ((Number) jVar.f2619g).intValue();
                        x3.b(str + " — " + intValue4, null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, ((a4) pVar2.k(b4.f1865a)).f1841k, pVar2, 0, 0, 65534);
                        pVar2.Q(1255847896);
                        boolean d8 = pVar2.d(intValue2) | pVar2.d(intValue4);
                        Object G = pVar2.G();
                        if (d8 || G == t0Var) {
                            G = new q6.a() { // from class: g4.r0
                                @Override // q6.a
                                public final Object a() {
                                    int i10 = intValue2;
                                    return Float.valueOf(i10 == 0 ? 0.0f : intValue4 / i10);
                                }
                            };
                            pVar2.a0(G);
                        }
                        pVar2.p(false);
                        b3.b((q6.a) G, androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.b(lVar, 1.0f), 0.0f, 4, 1), 0L, 0L, 0, 0.0f, null, pVar2, 48);
                    }
                    pVar2.p(false);
                    pVar2.p(true);
                }
                return zVar;
            case 1:
                q.h0 h0Var = (q.h0) obj;
                g0.p pVar3 = (g0.p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                r6.k.f(h0Var, "pad");
                if ((intValue5 & 6) == 0) {
                    intValue5 |= pVar3.f(h0Var) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18 && pVar3.x()) {
                    pVar3.L();
                } else {
                    s0.o e10 = androidx.compose.foundation.layout.b.e(a.a.P(androidx.compose.foundation.layout.b.d(lVar, h0Var).j(androidx.compose.foundation.layout.c.f640c), a.a.F(pVar3)), 16);
                    q.b bVar = q.j.f7291a;
                    float f9 = 12;
                    m2 m2Var2 = (m2) obj4;
                    q.s a9 = q.q.a(new q.g(f9), s0.b.f8089q, pVar3, 6);
                    int i10 = pVar3.P;
                    k1 m9 = pVar3.m();
                    s0.o c6 = s0.a.c(pVar3, e10);
                    r1.j.f7810d.getClass();
                    r1.n nVar2 = r1.i.f7781b;
                    pVar3.U();
                    if (pVar3.O) {
                        pVar3.l(nVar2);
                    } else {
                        pVar3.d0();
                    }
                    r1.h hVar2 = r1.i.f7784e;
                    g0.d.Q(pVar3, a9, hVar2);
                    r1.h hVar3 = r1.i.f7783d;
                    g0.d.Q(pVar3, m9, hVar3);
                    r1.h hVar4 = r1.i.f7785f;
                    if (pVar3.O || !r6.k.a(pVar3.G(), Integer.valueOf(i10))) {
                        a0.m.q(i10, pVar3, i10, hVar4);
                    }
                    r1.h hVar5 = r1.i.f7782c;
                    g0.d.Q(pVar3, c6, hVar5);
                    q.g gVar = new q.g(f9);
                    s0.f fVar = s0.b.f8087o;
                    q.m0 a10 = q.l0.a(gVar, fVar, pVar3, 6);
                    int i11 = pVar3.P;
                    k1 m10 = pVar3.m();
                    s0.o c9 = s0.a.c(pVar3, lVar);
                    pVar3.U();
                    if (pVar3.O) {
                        pVar3.l(nVar2);
                    } else {
                        pVar3.d0();
                    }
                    g0.d.Q(pVar3, a10, hVar2);
                    g0.d.Q(pVar3, m10, hVar3);
                    if (pVar3.O || !r6.k.a(pVar3.G(), Integer.valueOf(i11))) {
                        a0.m.q(i11, pVar3, i11, hVar4);
                    }
                    g0.d.Q(pVar3, c9, hVar5);
                    a8.d.i("Meals", String.valueOf(((t0) m2Var2.getValue()).f4388a), q.n0.a(), pVar3, 6);
                    a8.d.i("Planned", ((t0) m2Var2.getValue()).f4389b + "/" + ((t0) m2Var2.getValue()).f4390c, q.n0.a(), pVar3, 6);
                    pVar3.p(true);
                    q.m0 a11 = q.l0.a(new q.g(f9), fVar, pVar3, 6);
                    int i12 = pVar3.P;
                    k1 m11 = pVar3.m();
                    s0.o c10 = s0.a.c(pVar3, lVar);
                    pVar3.U();
                    if (pVar3.O) {
                        pVar3.l(nVar2);
                    } else {
                        pVar3.d0();
                    }
                    g0.d.Q(pVar3, a11, hVar2);
                    g0.d.Q(pVar3, m11, hVar3);
                    if (pVar3.O || !r6.k.a(pVar3.G(), Integer.valueOf(i12))) {
                        a0.m.q(i12, pVar3, i12, hVar4);
                    }
                    g0.d.Q(pVar3, c10, hVar5);
                    a8.d.i("To buy", String.valueOf(((t0) m2Var2.getValue()).f4391d), q.n0.a(), pVar3, 6);
                    String str2 = ((t0) m2Var2.getValue()).f4393f;
                    if (str2 == null) {
                        str2 = "—";
                    }
                    a8.d.i("Top meal", str2, q.n0.a(), pVar3, 6);
                    pVar3.p(true);
                    pVar3.Q(-843577831);
                    if (((t0) m2Var2.getValue()).f4392e.isEmpty()) {
                        pVar = pVar3;
                        z8 = false;
                    } else {
                        z8 = false;
                        d3.c(androidx.compose.foundation.layout.c.b(lVar, 1.0f), null, null, null, o0.f.b(2031397779, new s0(false ? 1 : 0, m2Var2), pVar3), pVar3, 196614);
                        pVar = pVar3;
                    }
                    pVar.p(z8);
                    pVar.p(true);
                }
                return zVar;
            default:
                g0.p pVar4 = (g0.p) obj2;
                int intValue6 = ((Number) obj3).intValue();
                j0 j0Var = (j0) obj4;
                r6.k.f((q.n0) obj, "$this$CenterAlignedTopAppBar");
                if ((intValue6 & 17) == 16 && pVar4.x()) {
                    pVar4.L();
                } else {
                    pVar4.Q(-1257832800);
                    boolean h3 = pVar4.h(j0Var);
                    Object G2 = pVar4.G();
                    Object obj5 = G2;
                    if (h3 || G2 == t0Var) {
                        c0 c0Var = new c0(j0Var, i8);
                        pVar4.a0(c0Var);
                        obj5 = c0Var;
                    }
                    pVar4.p(false);
                    d3.e((q6.a) obj5, null, false, null, null, null, w.f4426b, pVar4, 805306368, 510);
                }
                return zVar;
        }
    }
}
