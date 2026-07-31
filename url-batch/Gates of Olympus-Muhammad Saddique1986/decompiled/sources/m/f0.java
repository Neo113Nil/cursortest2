package m;

import I.C0143d;
import I.C0156j0;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f6793a;

    /* renamed from: b, reason: collision with root package name */
    public final C0156j0 f6794b = C0143d.K(null, I.W.f2783i);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f6795c;

    public f0(l0 l0Var, u0 u0Var, String str) {
        this.f6795c = l0Var;
        this.f6793a = u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e0 a(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        C0156j0 c0156j0 = this.f6794b;
        e0 e0Var = (e0) c0156j0.getValue();
        l0 l0Var = this.f6795c;
        if (e0Var == null) {
            Object n3 = interfaceC0424c2.n(l0Var.f6836a.a());
            Object n4 = interfaceC0424c2.n(l0Var.f6836a.a());
            u0 u0Var = this.f6793a;
            r rVar = (r) u0Var.f6889a.n(n4);
            rVar.d();
            i0 i0Var = new i0(l0Var, n3, rVar, u0Var);
            e0Var = new e0(this, i0Var, interfaceC0424c, interfaceC0424c2);
            c0156j0.setValue(e0Var);
            l0Var.f6844i.add(i0Var);
        }
        e0Var.f6786f = (f2.k) interfaceC0424c2;
        e0Var.f6785e = (f2.k) interfaceC0424c;
        e0Var.b(l0Var.f());
        return e0Var;
    }
}
