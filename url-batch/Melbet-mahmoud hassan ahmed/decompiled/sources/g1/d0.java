package g1;

import g1.i0;
import java.util.List;
import r0.s1;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<s1> f16270a;

    /* renamed from: b, reason: collision with root package name */
    private final w0.e0[] f16271b;

    public d0(List<s1> list) {
        this.f16270a = list;
        this.f16271b = new w0.e0[list.size()];
    }

    public void a(long j7, o2.a0 a0Var) {
        w0.c.a(j7, a0Var, this.f16271b);
    }

    public void b(w0.n nVar, i0.d dVar) {
        for (int i7 = 0; i7 < this.f16271b.length; i7++) {
            dVar.a();
            w0.e0 d7 = nVar.d(dVar.c(), 3);
            s1 s1Var = this.f16270a.get(i7);
            String str = s1Var.f20956q;
            o2.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = s1Var.f20945f;
            if (str2 == null) {
                str2 = dVar.b();
            }
            d7.e(new s1.b().S(str2).e0(str).g0(s1Var.f20948i).V(s1Var.f20947h).F(s1Var.I).T(s1Var.f20958s).E());
            this.f16271b[i7] = d7;
        }
    }
}
