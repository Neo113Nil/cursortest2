package k2;

/* loaded from: classes.dex */
public final class u0 extends p2.r {

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f5392h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u0(P1.d dVar, P1.i iVar) {
        super(dVar, iVar.k(r0) == null ? iVar.o(r0) : iVar);
        v0 v0Var = v0.f5394d;
        this.f5392h = new ThreadLocal();
        if (dVar.getContext().k(P1.e.f3072d) instanceof AbstractC0546s) {
            return;
        }
        Object n3 = p2.a.n(iVar, null);
        p2.a.i(iVar, n3);
        i0(iVar, n3);
    }

    public final boolean h0() {
        boolean z3 = this.threadLocalIsSet && this.f5392h.get() == null;
        this.f5392h.remove();
        return !z3;
    }

    public final void i0(P1.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f5392h.set(new L1.j(iVar, obj));
    }

    @Override // p2.r, k2.f0
    public final void q(Object obj) {
        if (this.threadLocalIsSet) {
            L1.j jVar = (L1.j) this.f5392h.get();
            if (jVar != null) {
                p2.a.i((P1.i) jVar.f2708d, jVar.f2709e);
            }
            this.f5392h.remove();
        }
        Object r3 = AbstractC0552y.r(obj);
        P1.d dVar = this.f6804g;
        P1.i context = dVar.getContext();
        Object n3 = p2.a.n(context, null);
        u0 x3 = n3 != p2.a.f6764d ? AbstractC0552y.x(dVar, context, n3) : null;
        try {
            this.f6804g.resumeWith(r3);
        } finally {
            if (x3 == null || x3.h0()) {
                p2.a.i(context, n3);
            }
        }
    }
}
