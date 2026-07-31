package m;

import I.W0;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class e0 implements W0 {

    /* renamed from: d, reason: collision with root package name */
    public final i0 f6784d;

    /* renamed from: e, reason: collision with root package name */
    public f2.k f6785e;

    /* renamed from: f, reason: collision with root package name */
    public f2.k f6786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f6787g;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(f0 f0Var, i0 i0Var, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        this.f6787g = f0Var;
        this.f6784d = i0Var;
        this.f6785e = (f2.k) interfaceC0424c;
        this.f6786f = (f2.k) interfaceC0424c2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r1v4, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r1v5, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [e2.c, f2.k] */
    public final void b(g0 g0Var) {
        Object n3 = this.f6786f.n(g0Var.c());
        boolean g3 = this.f6787g.f6795c.g();
        i0 i0Var = this.f6784d;
        if (g3) {
            i0Var.f(this.f6786f.n(g0Var.b()), n3, (InterfaceC0640z) this.f6785e.n(g0Var));
        } else {
            i0Var.g(n3, (InterfaceC0640z) this.f6785e.n(g0Var));
        }
    }

    @Override // I.W0
    public final Object getValue() {
        b(this.f6787g.f6795c.f());
        return this.f6784d.f6815m.getValue();
    }
}
