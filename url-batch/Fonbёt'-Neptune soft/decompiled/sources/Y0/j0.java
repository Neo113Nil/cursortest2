package Y0;

import d1.AbstractC0184a;

/* loaded from: classes.dex */
public final class j0 extends d1.u {

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f1211i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(H0.i iVar, J0.g gVar) {
        super(gVar, iVar.k(r0) == null ? iVar.i(r0) : iVar);
        k0 k0Var = k0.f1212e;
        this.f1211i = new ThreadLocal();
        H0.i iVar2 = gVar.f737f;
        Q0.h.b(iVar2);
        if (iVar2.k(H0.e.f502e) instanceof AbstractC0124s) {
            return;
        }
        Object m2 = AbstractC0184a.m(iVar, null);
        AbstractC0184a.g(iVar, m2);
        Y(iVar, m2);
    }

    public final boolean X() {
        boolean z2 = this.threadLocalIsSet && this.f1211i.get() == null;
        this.f1211i.remove();
        return !z2;
    }

    public final void Y(H0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1211i.set(new F0.c(iVar, obj));
    }

    @Override // d1.u, Y0.Z
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            F0.c cVar = (F0.c) this.f1211i.get();
            if (cVar != null) {
                AbstractC0184a.g((H0.i) cVar.f461e, cVar.f462f);
            }
            this.f1211i.remove();
        }
        Object h2 = AbstractC0127v.h(obj);
        H0.d dVar = this.f2105h;
        H0.i f2 = dVar.f();
        Object m2 = AbstractC0184a.m(f2, null);
        j0 m3 = m2 != AbstractC0184a.f2067f ? AbstractC0127v.m(dVar, f2, m2) : null;
        try {
            this.f2105h.j(h2);
        } finally {
            if (m3 == null || m3.X()) {
                AbstractC0184a.g(f2, m2);
            }
        }
    }
}
