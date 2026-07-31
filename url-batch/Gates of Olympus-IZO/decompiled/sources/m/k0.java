package m;

import I.C0094f0;
import I.C0102j0;
import I.X0;

/* loaded from: classes.dex */
public final class k0 implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final o0 f5795d;

    /* renamed from: e, reason: collision with root package name */
    public Z1.j f5796e;

    /* renamed from: f, reason: collision with root package name */
    public Z1.j f5797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f5798g;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(l0 l0Var, o0 o0Var, Y1.c cVar, Y1.c cVar2) {
        this.f5798g = l0Var;
        this.f5795d = o0Var;
        this.f5796e = (Z1.j) cVar;
        this.f5797f = (Z1.j) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r1v16, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Y1.c, Z1.j] */
    public final void b(m0 m0Var) {
        Object j3 = this.f5797f.j(m0Var.c());
        boolean g3 = this.f5798g.f5801c.g();
        o0 o0Var = this.f5795d;
        if (g3) {
            o0Var.f(this.f5797f.j(m0Var.b()), j3, (InterfaceC0615z) this.f5796e.j(m0Var));
            return;
        }
        InterfaceC0615z interfaceC0615z = (InterfaceC0615z) this.f5796e.j(m0Var);
        if (o0Var.f5821l) {
            j0 j0Var = o0Var.f5818i;
            if (Z1.i.a(j3, j0Var != null ? j0Var.f5779c : null)) {
                return;
            }
        }
        C0102j0 c0102j0 = o0Var.f5814e;
        boolean a3 = Z1.i.a(c0102j0.getValue(), j3);
        C0094f0 c0094f0 = o0Var.f5820k;
        if (a3 && c0094f0.g() == -1.0f) {
            return;
        }
        c0102j0.setValue(j3);
        o0Var.f5815f.setValue(interfaceC0615z);
        Object value = c0094f0.g() == -3.0f ? j3 : o0Var.f5822m.getValue();
        C0102j0 c0102j02 = o0Var.f5819j;
        o0Var.e(value, !((Boolean) c0102j02.getValue()).booleanValue());
        c0102j02.setValue(Boolean.valueOf(c0094f0.g() == -3.0f));
        if (c0094f0.g() >= 0.0f) {
            o0Var.d(o0Var.b().b((long) (c0094f0.g() * o0Var.b().c())));
        } else if (c0094f0.g() == -3.0f) {
            o0Var.d(j3);
        }
        o0Var.f5821l = false;
        c0094f0.h(-1.0f);
    }

    @Override // I.X0
    public final Object getValue() {
        b(this.f5798g.f5801c.f());
        return this.f5795d.f5822m.getValue();
    }
}
