package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 implements p6.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f1323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1325f;

    public g0(List list, m0.z0 z0Var, m0.z0 z0Var2) {
        this.f1323d = list;
        this.f1324e = z0Var;
        this.f1325f = z0Var2;
    }

    @Override // p6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        z.c cVar = (z.c) obj;
        int intValue = ((Number) obj2).intValue();
        m0.s sVar = (m0.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(cVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.N(i & 1, (i & 147) != 146)) {
            e2 e2Var = (e2) this.f1323d.get(intValue);
            sVar.V(1619051019);
            m0.z0 z0Var = this.f1324e;
            boolean a8 = q6.i.a((String) z0Var.getValue(), e2Var.f1309a);
            boolean h8 = sVar.h(e2Var);
            Object K = sVar.K();
            if (h8 || K == m0.n.f5019a) {
                K = new e0(e2Var, z0Var, this.f1325f);
                sVar.f0(K);
            }
            k.j(e2Var, a8, (p6.a) K, sVar, 0);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
