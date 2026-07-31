package androidx.compose.foundation;

import A0.f;
import U.n;
import U.q;
import b0.Q;
import e2.InterfaceC0422a;
import n.C0696w;
import n.U;
import n.Z;
import q.k;

/* loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, long j3, Q q3) {
        return qVar.i(new BackgroundElement(j3, q3));
    }

    public static final q b(q qVar, k kVar, U u3, boolean z3, String str, f fVar, InterfaceC0422a interfaceC0422a) {
        q i3;
        if (u3 instanceof Z) {
            i3 = new ClickableElement(kVar, (Z) u3, z3, str, fVar, interfaceC0422a);
        } else if (u3 == null) {
            i3 = new ClickableElement(kVar, null, z3, str, fVar, interfaceC0422a);
        } else {
            n nVar = n.f4488a;
            i3 = kVar != null ? d.a(nVar, kVar, u3).i(new ClickableElement(kVar, null, z3, str, fVar, interfaceC0422a)) : U.a.b(nVar, new b(u3, z3, str, fVar, interfaceC0422a));
        }
        return qVar.i(i3);
    }

    public static /* synthetic */ q c(q qVar, k kVar, U u3, boolean z3, f fVar, InterfaceC0422a interfaceC0422a, int i3) {
        if ((i3 & 16) != 0) {
            fVar = null;
        }
        return b(qVar, kVar, u3, z3, null, fVar, interfaceC0422a);
    }

    public static q d(q qVar, boolean z3, String str, InterfaceC0422a interfaceC0422a, int i3) {
        if ((i3 & 1) != 0) {
            z3 = true;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return U.a.b(qVar, new C0696w(z3, str, null, interfaceC0422a));
    }
}
