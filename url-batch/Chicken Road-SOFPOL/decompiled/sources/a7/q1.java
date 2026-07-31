package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q1 extends f7.q {

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f295h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q1(g6.c cVar, g6.h hVar) {
        super(cVar, hVar.l(r0) == null ? hVar.c(r0) : hVar);
        r1 r1Var = r1.f299d;
        this.f295h = new ThreadLocal();
        if (cVar.f().l(g6.d.f3045d) instanceof q) {
            return;
        }
        Object l3 = f7.a.l(hVar, null);
        f7.a.g(hVar, l3);
        j0(hVar, l3);
    }

    public final boolean i0() {
        boolean z3 = this.threadLocalIsSet && this.f295h.get() == null;
        this.f295h.remove();
        return !z3;
    }

    public final void j0(g6.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f295h.set(new c6.f(hVar, obj));
    }

    @Override // f7.q, a7.a1
    public final void z(Object obj) {
        if (this.threadLocalIsSet) {
            c6.f fVar = (c6.f) this.f295h.get();
            if (fVar != null) {
                f7.a.g((g6.h) fVar.f1747d, fVar.f1748e);
            }
            this.f295h.remove();
        }
        Object o2 = x.o(obj);
        g6.c cVar = this.f2797g;
        g6.h f6 = cVar.f();
        Object l3 = f7.a.l(f6, null);
        q1 t3 = l3 != f7.a.f2763d ? x.t(cVar, f6, l3) : null;
        try {
            this.f2797g.k(o2);
            if (t3 == null || t3.i0()) {
                f7.a.g(f6, l3);
            }
        } catch (Throwable th) {
            if (t3 == null || t3.i0()) {
                f7.a.g(f6, l3);
            }
            throw th;
        }
    }
}
