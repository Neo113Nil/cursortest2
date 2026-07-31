package j0;

import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l1 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f3758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r.u0 f3761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p6.e f3762h;
    public final /* synthetic */ boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0.c f3763j;

    public l1(f1 f1Var, boolean z3, boolean z7, r.u0 u0Var, p6.e eVar, boolean z8, u0.c cVar) {
        this.f3758d = f1Var;
        this.f3759e = z3;
        this.f3760f = z7;
        this.f3761g = u0Var;
        this.f3762h = eVar;
        this.i = z8;
        this.f3763j = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        y0.m mVar;
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            boolean z3 = this.f3760f;
            boolean z7 = this.f3759e;
            f1 f1Var = this.f3758d;
            t2 a8 = q.s0.a(!z3 ? f1Var.f3642f : z7 ? f1Var.f3637a : f1Var.f3640d, this.f3761g, sVar);
            if (this.f3762h == null || !(this.i || z7)) {
                sVar.V(-634793532);
                sVar.p(false);
                mVar = y0.j.f8705a;
            } else {
                sVar.V(-634794445);
                Object K = sVar.K();
                if (K == m0.n.f5019a) {
                    K = new l(2);
                    sVar.f0(K);
                }
                AtomicInteger atomicInteger = d2.l.f2154a;
                mVar = new ClearAndSetSemanticsElement((p6.c) K);
                sVar.p(false);
            }
            u1.e0 d8 = x.k.d(y0.b.f8681d, false);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, mVar);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(d8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            m0.b.a(g0.f3652a.a(new f1.s(((f1.s) a8.getValue()).f2705a)), this.f3763j, sVar, 8);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
