package r1;

/* loaded from: classes.dex */
public final class f0 extends w1.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(a1.d dVar, a1.i iVar) {
        super(dVar, iVar.d(r0) == null ? iVar.B(r0) : iVar);
        g0 g0Var = g0.f4073a;
        this.e = new ThreadLocal();
        if (dVar.getContext().d(a1.e.f1672a) instanceof AbstractC0366p) {
            return;
        }
        Object m2 = w1.a.m(iVar, null);
        w1.a.h(iVar, m2);
        I(iVar, m2);
    }

    public final boolean H() {
        boolean z2 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z2;
    }

    public final void I(a1.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new W0.d(iVar, obj));
    }

    @Override // w1.s, r1.V
    public final void f(Object obj) {
        if (this.threadLocalIsSet) {
            W0.d dVar = (W0.d) this.e.get();
            if (dVar != null) {
                w1.a.h((a1.i) dVar.f1338a, dVar.f1339b);
            }
            this.e.remove();
        }
        Object i = AbstractC0369t.i(obj);
        a1.d dVar2 = this.f4498d;
        a1.i context = dVar2.getContext();
        Object m2 = w1.a.m(context, null);
        f0 l2 = m2 != w1.a.f4466f ? AbstractC0369t.l(dVar2, context, m2) : null;
        try {
            this.f4498d.resumeWith(i);
        } finally {
            if (l2 == null || l2.H()) {
                w1.a.h(context, m2);
            }
        }
    }
}
