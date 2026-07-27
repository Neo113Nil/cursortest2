package E;

import G.C0216p;
import l.AbstractC0779e;
import l.AbstractC0798y;
import l.h0;
import l.u0;

/* loaded from: classes.dex */
public final class t extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public static final t f2249d = new t(3);

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        h0 h0Var = (h0) obj;
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(-1154662212);
        c cVar = c.f2177d;
        c cVar2 = c.f2178e;
        Object j4 = h0Var.a(cVar, cVar2) ? AbstractC0779e.j(67, 0, AbstractC0798y.f7866b, 2) : (h0Var.a(cVar2, cVar) || h0Var.a(c.f2179i, cVar2)) ? new u0(83, 67, AbstractC0798y.f7866b) : AbstractC0779e.i(0.0f, null, 7);
        c0216p.q(false);
        return j4;
    }
}
