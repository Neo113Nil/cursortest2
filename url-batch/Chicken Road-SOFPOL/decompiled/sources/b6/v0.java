package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 implements p6.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f1475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f1476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a7.u f1477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f1478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1479h;
    public final /* synthetic */ m0.z0 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1480j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1481k;

    public v0(List list, x0 x0Var, a7.u uVar, w wVar, m0.z0 z0Var, m0.z0 z0Var2, m0.z0 z0Var3, m0.z0 z0Var4) {
        this.f1475d = list;
        this.f1476e = x0Var;
        this.f1477f = uVar;
        this.f1478g = wVar;
        this.f1479h = z0Var;
        this.i = z0Var2;
        this.f1480j = z0Var3;
        this.f1481k = z0Var4;
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
            h0 h0Var = (h0) this.f1475d.get(intValue);
            sVar.V(-1045142730);
            x0 x0Var = this.f1476e;
            boolean h8 = sVar.h(x0Var) | sVar.h(this.f1477f);
            w wVar = this.f1478g;
            boolean h9 = h8 | sVar.h(wVar) | sVar.f(h0Var);
            Object K = sVar.K();
            if (h9 || K == m0.n.f5019a) {
                u0 u0Var = new u0(h0Var, x0Var, this.f1477f, this.f1479h, this.i, this.f1480j, wVar, this.f1481k);
                sVar.f0(u0Var);
                K = u0Var;
            }
            k.C(h0Var, (p6.c) K, null, sVar, 0);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
