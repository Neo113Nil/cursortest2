package k2;

/* renamed from: k2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542n extends f0 implements InterfaceC0541m {
    public final Object e0(R1.c cVar) {
        Object w3;
        int i3 = 2;
        while (true) {
            Object obj = f0.f5356d.get(this);
            if (obj instanceof U) {
                if (a0(obj) >= 0) {
                    c0 c0Var = new c0(M1.B.G(cVar), this);
                    c0Var.q();
                    c0Var.u(new C0533e(2, AbstractC0552y.m(this, true, new H(i3, c0Var))));
                    w3 = c0Var.p();
                    Q1.a aVar = Q1.a.f3113d;
                    break;
                }
            } else {
                if (obj instanceof C0544p) {
                    throw ((C0544p) obj).f5378a;
                }
                w3 = AbstractC0552y.w(obj);
            }
        }
        Q1.a aVar2 = Q1.a.f3113d;
        return w3;
    }
}
