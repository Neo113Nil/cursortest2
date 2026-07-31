package q2;

/* loaded from: classes.dex */
public final class u0 extends v2.q {

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f7931h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u0(V1.d dVar, V1.i iVar) {
        super(dVar, iVar.v(r0) == null ? iVar.d(r0) : iVar);
        v0 v0Var = v0.f7933d;
        this.f7931h = new ThreadLocal();
        if (dVar.t().v(V1.e.f4557d) instanceof AbstractC0831s) {
            return;
        }
        Object n3 = v2.a.n(iVar, null);
        v2.a.i(iVar, n3);
        m0(iVar, n3);
    }

    @Override // v2.q, q2.f0
    public final void D(Object obj) {
        if (this.threadLocalIsSet) {
            R1.i iVar = (R1.i) this.f7931h.get();
            if (iVar != null) {
                v2.a.i((V1.i) iVar.f4150d, iVar.f4151e);
            }
            this.f7931h.remove();
        }
        Object s3 = AbstractC0837y.s(obj);
        V1.d dVar = this.f9824g;
        V1.i t3 = dVar.t();
        Object n3 = v2.a.n(t3, null);
        u0 y3 = n3 != v2.a.f9785d ? AbstractC0837y.y(dVar, t3, n3) : null;
        try {
            this.f9824g.u(s3);
        } finally {
            if (y3 == null || y3.l0()) {
                v2.a.i(t3, n3);
            }
        }
    }

    public final boolean l0() {
        boolean z3 = this.threadLocalIsSet && this.f7931h.get() == null;
        this.f7931h.remove();
        return !z3;
    }

    public final void m0(V1.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f7931h.set(new R1.i(iVar, obj));
    }
}
