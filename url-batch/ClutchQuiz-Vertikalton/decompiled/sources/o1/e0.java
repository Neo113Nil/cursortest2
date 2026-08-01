package o1;

/* loaded from: classes.dex */
public final class e0 extends s1.q {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f3339e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(X0.i iVar, X0.d dVar) {
        super(iVar.j(r0) == null ? iVar.k(r0) : iVar, dVar);
        f0 f0Var = f0.f3341a;
        this.f3339e = new ThreadLocal();
        if (dVar.h().j(X0.e.f1155a) instanceof AbstractC0296o) {
            return;
        }
        Object g2 = s1.a.g(iVar, null);
        s1.a.b(iVar, g2);
        K(iVar, g2);
    }

    public final boolean J() {
        boolean z2 = this.threadLocalIsSet && this.f3339e.get() == null;
        this.f3339e.remove();
        return !z2;
    }

    public final void K(X0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3339e.set(new U0.d(iVar, obj));
    }

    @Override // s1.q, o1.U
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            U0.d dVar = (U0.d) this.f3339e.get();
            if (dVar != null) {
                s1.a.b((X0.i) dVar.f857a, dVar.f858b);
            }
            this.f3339e.remove();
        }
        Object i = AbstractC0299s.i(obj);
        X0.d dVar2 = this.d;
        X0.i h = dVar2.h();
        Object g2 = s1.a.g(h, null);
        e0 l2 = g2 != s1.a.f3642e ? AbstractC0299s.l(dVar2, h, g2) : null;
        try {
            this.d.b(i);
        } finally {
            if (l2 == null || l2.J()) {
                s1.a.b(h, g2);
            }
        }
    }
}
