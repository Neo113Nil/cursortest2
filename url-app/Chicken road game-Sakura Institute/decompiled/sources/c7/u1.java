package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u1 extends h7.p {

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f1749j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u1(h6.d dVar, h6.i iVar) {
        super(dVar, iVar.u(r0) == null ? iVar.z(r0) : iVar);
        v1 v1Var = v1.f1751f;
        this.f1749j = new ThreadLocal();
        if (dVar.getContext().u(h6.e.f4660f) instanceof t) {
            return;
        }
        Object l8 = h7.a.l(iVar, null);
        h7.a.g(iVar, l8);
        h0(iVar, l8);
    }

    public final boolean g0() {
        boolean z8 = this.threadLocalIsSet && this.f1749j.get() == null;
        this.f1749j.remove();
        return !z8;
    }

    public final void h0(h6.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1749j.set(new d6.j(iVar, obj));
    }

    @Override // h7.p, c7.f1
    public final void j(Object obj) {
        if (this.threadLocalIsSet) {
            d6.j jVar = (d6.j) this.f1749j.get();
            if (jVar != null) {
                h7.a.g((h6.i) jVar.f2618f, jVar.f2619g);
            }
            this.f1749j.remove();
        }
        Object q8 = a0.q(obj);
        h6.d dVar = this.f4702i;
        h6.i context = dVar.getContext();
        Object l8 = h7.a.l(context, null);
        u1 w4 = l8 != h7.a.f4667d ? a0.w(dVar, context, l8) : null;
        try {
            this.f4702i.resumeWith(q8);
            if (w4 == null || w4.g0()) {
                h7.a.g(context, l8);
            }
        } catch (Throwable th) {
            if (w4 == null || w4.g0()) {
                h7.a.g(context, l8);
            }
            throw th;
        }
    }
}
