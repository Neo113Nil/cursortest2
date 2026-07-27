package k;

import A.g0;
import G.C0208l;
import G.C0216p;
import G.X0;
import Z.C0323u;
import a0.AbstractC0348c;
import l.AbstractC0782h;
import l.u0;
import l.v0;
import l.w0;

/* loaded from: classes.dex */
public abstract class L {
    public static final X0 a(long j4, u0 u0Var, C0216p c0216p) {
        boolean f4 = c0216p.f(C0323u.f(j4));
        Object I3 = c0216p.I();
        if (f4 || I3 == C0208l.f2826a) {
            AbstractC0348c f5 = C0323u.f(j4);
            u uVar = u.f7326e;
            g0 g0Var = new g0(15, f5);
            v0 v0Var = w0.f7856a;
            v0 v0Var2 = new v0(uVar, g0Var);
            c0216p.c0(v0Var2);
            I3 = v0Var2;
        }
        return AbstractC0782h.b(new C0323u(j4), (v0) I3, u0Var, null, "ColorAnimation", null, c0216p, 384, 8);
    }
}
