package g1;

import g1.i0;
import java.util.List;
import r0.s1;

/* loaded from: classes.dex */
final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<s1> f16391a;

    /* renamed from: b, reason: collision with root package name */
    private final w0.e0[] f16392b;

    public k0(List<s1> list) {
        this.f16391a = list;
        this.f16392b = new w0.e0[list.size()];
    }

    public void a(long j7, o2.a0 a0Var) {
        if (a0Var.a() < 9) {
            return;
        }
        int m7 = a0Var.m();
        int m8 = a0Var.m();
        int C = a0Var.C();
        if (m7 == 434 && m8 == 1195456820 && C == 3) {
            w0.c.b(j7, a0Var, this.f16392b);
        }
    }

    public void b(w0.n nVar, i0.d dVar) {
        for (int i7 = 0; i7 < this.f16392b.length; i7++) {
            dVar.a();
            w0.e0 d7 = nVar.d(dVar.c(), 3);
            s1 s1Var = this.f16391a.get(i7);
            String str = s1Var.f20956q;
            o2.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            d7.e(new s1.b().S(dVar.b()).e0(str).g0(s1Var.f20948i).V(s1Var.f20947h).F(s1Var.I).T(s1Var.f20958s).E());
            this.f16392b[i7] = d7;
        }
    }
}
