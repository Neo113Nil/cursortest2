package q2;

/* renamed from: q2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827n extends f0 implements InterfaceC0826m {
    public final Object i0(X1.c cVar) {
        Object obj;
        do {
            obj = f0.f7895d.get(this);
            if (!(obj instanceof U)) {
                if (obj instanceof C0829p) {
                    throw ((C0829p) obj).f7917a;
                }
                return AbstractC0837y.x(obj);
            }
        } while (e0(obj) < 0);
        c0 c0Var = new c0(l0.c.B(cVar), this);
        c0Var.r();
        c0Var.w(new C0818e(2, AbstractC0837y.n(this, true, new H(2, c0Var))));
        return c0Var.q();
    }
}
