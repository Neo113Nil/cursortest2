package l;

import I.C0159l;
import I.C0167p;
import I.W0;
import b0.C0352v;
import c0.AbstractC0357c;
import m.AbstractC0623h;
import m.InterfaceC0640z;
import m.u0;
import m.v0;

/* loaded from: classes.dex */
public abstract class M {
    public static final W0 a(long j3, InterfaceC0640z interfaceC0640z, C0167p c0167p) {
        boolean f3 = c0167p.f(C0352v.f(j3));
        Object G3 = c0167p.G();
        if (f3 || G3 == C0159l.f2829a) {
            AbstractC0357c f4 = C0352v.f(j3);
            q qVar = q.f6522g;
            A0.l lVar = new A0.l(21, f4);
            u0 u0Var = v0.f6899a;
            u0 u0Var2 = new u0(qVar, lVar);
            c0167p.a0(u0Var2);
            G3 = u0Var2;
        }
        return AbstractC0623h.a(new C0352v(j3), (u0) G3, interfaceC0640z, null, "ColorAnimation", null, c0167p, 384, 8);
    }
}
