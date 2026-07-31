package q;

import m0.h1;
import r.g1;
import r.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f5825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p6.c f5827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f5828h;
    public final /* synthetic */ w0.p i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0.c f5829j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l1 l1Var, Object obj, p6.c cVar, p pVar, w0.p pVar2, u0.c cVar2) {
        super(2);
        this.f5825e = l1Var;
        this.f5826f = obj;
        this.f5827g = cVar;
        this.f5828h = pVar;
        this.i = pVar2;
        this.f5829j = cVar2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            Object K = sVar.K();
            p6.c cVar = this.f5827g;
            p pVar = this.f5828h;
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = (b0) cVar.i(pVar);
                sVar.f0(K);
            }
            b0 b0Var = (b0) K;
            l1 l1Var = this.f5825e;
            g1 f6 = l1Var.f();
            h1 h1Var = l1Var.f6349d;
            Object c8 = f6.c();
            Object obj3 = this.f5826f;
            boolean g3 = sVar.g(q6.i.a(c8, obj3));
            Object K2 = sVar.K();
            if (g3 || K2 == v0Var) {
                K2 = q6.i.a(l1Var.f().c(), obj3) ? n0.f5878b : ((b0) cVar.i(pVar)).f5802b;
                sVar.f0(K2);
            }
            n0 n0Var = (n0) K2;
            Object K3 = sVar.K();
            if (K3 == v0Var) {
                K3 = new l(q6.i.a(obj3, h1Var.getValue()));
                sVar.f0(K3);
            }
            l lVar = (l) K3;
            m0 m0Var = b0Var.f5801a;
            boolean h8 = sVar.h(b0Var);
            Object K4 = sVar.K();
            if (h8 || K4 == v0Var) {
                K4 = new c(b0Var);
                sVar.f0(K4);
            }
            y0.m b8 = androidx.compose.ui.layout.a.b((p6.f) K4);
            lVar.f5860a.setValue(Boolean.valueOf(q6.i.a(obj3, h1Var.getValue())));
            y0.m d8 = b8.d(lVar);
            boolean h9 = sVar.h(obj3);
            Object K5 = sVar.K();
            if (h9 || K5 == v0Var) {
                K5 = new b1.e(9, obj3);
                sVar.f0(K5);
            }
            p6.c cVar2 = (p6.c) K5;
            boolean f8 = sVar.f(n0Var);
            Object K6 = sVar.K();
            if (f8 || K6 == v0Var) {
                K6 = new d(0, n0Var);
                sVar.f0(K6);
            }
            androidx.compose.animation.b.a(this.f5825e, cVar2, d8, m0Var, n0Var, (p6.e) K6, u0.h.d(-143346359, new e(this.i, obj3, pVar, this.f5829j), sVar), sVar, 12582912);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
