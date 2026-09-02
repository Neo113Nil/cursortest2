package D0;

import D3.M;
import android.content.Context;
import j5.InterfaceC0438a;
import k.v0;
import q4.C0603d;
import u0.C0679i;
import u0.C0682l;
import u0.C0689s;
import y1.C0760d;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Context f345a;

    public C0603d a() {
        Context context = this.f345a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C0603d c0603d = new C0603d();
        c0603d.f5801g = F0.a.a(n.f348a);
        J1.c cVar = new J1.c(5, context);
        c0603d.f5802h = cVar;
        M m4 = new M(2, cVar);
        C0689s c0689s = new C0689s();
        c0689s.f6034f = cVar;
        c0689s.f6035g = m4;
        c0603d.f5803i = F0.a.a(c0689s);
        J1.c cVar2 = (J1.c) c0603d.f5802h;
        int i7 = 8;
        c0603d.f5804j = new M(i7, cVar2);
        InterfaceC0438a a7 = F0.a.a(new C0682l((M) c0603d.f5804j, F0.a.a(new J1.c(i7, cVar2))));
        c0603d.f5805k = a7;
        C0760d c0760d = new C0760d();
        J1.c cVar3 = (J1.c) c0603d.f5802h;
        B0.c cVar4 = new B0.c(cVar3, a7, c0760d, 7);
        InterfaceC0438a interfaceC0438a = (InterfaceC0438a) c0603d.f5801g;
        InterfaceC0438a interfaceC0438a2 = (InterfaceC0438a) c0603d.f5803i;
        A.e eVar = new A.e(interfaceC0438a, interfaceC0438a2, cVar4, a7, a7);
        v0 v0Var = new v0();
        v0Var.f5136f = cVar3;
        v0Var.f5137g = interfaceC0438a2;
        v0Var.f5138h = a7;
        v0Var.f5139i = cVar4;
        v0Var.f5140j = interfaceC0438a;
        v0Var.f5141k = a7;
        v0Var.f5142l = a7;
        C0679i c0679i = new C0679i();
        c0679i.f5981f = interfaceC0438a;
        c0679i.f5982g = a7;
        c0679i.f5983h = cVar4;
        c0679i.f5984i = a7;
        c0603d.f5806l = F0.a.a(new B0.c(eVar, v0Var, c0679i, 3));
        return c0603d;
    }
}
