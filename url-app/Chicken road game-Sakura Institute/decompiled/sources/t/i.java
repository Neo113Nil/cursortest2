package t;

import S.n;
import W2.B;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m.C0842o;
import o.C0894k;
import p0.InterfaceC0980p;
import r0.AbstractC1065f;
import r0.InterfaceC1080v;
import r0.a0;
import r0.q0;

/* loaded from: classes.dex */
public final class i extends n implements InterfaceC1197a, InterfaceC1080v, q0 {

    /* renamed from: v, reason: collision with root package name */
    public static final E1.i f10633v = new E1.i(20);

    /* renamed from: t, reason: collision with root package name */
    public C0894k f10634t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10635u;

    public static final Y.d B0(i iVar, a0 a0Var, Function0 function0) {
        Y.d dVar;
        if (!iVar.f3990s || !iVar.f10635u) {
            return null;
        }
        a0 u4 = AbstractC1065f.u(iVar);
        if (!a0Var.O0().f3990s) {
            a0Var = null;
        }
        if (a0Var == null || (dVar = (Y.d) function0.invoke()) == null) {
            return null;
        }
        Y.d n2 = u4.n(a0Var, false);
        return dVar.h(AbstractC0345a.c(n2.f4374a, n2.f4375b));
    }

    @Override // t.InterfaceC1197a
    public final Object j(a0 a0Var, Function0 function0, E2.c cVar) {
        Object d4 = B.d(new h(this, a0Var, function0, new C0842o(this, a0Var, function0), null), cVar);
        return d4 == D2.a.f2163d ? d4 : Unit.f7487a;
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // r0.q0
    public final Object u() {
        return f10633v;
    }

    @Override // r0.InterfaceC1080v
    public final void x(InterfaceC0980p interfaceC0980p) {
        this.f10635u = true;
    }
}
