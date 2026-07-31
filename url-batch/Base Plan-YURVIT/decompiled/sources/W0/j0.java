package W0;

import b1.AbstractC0115a;

/* loaded from: classes.dex */
public final class j0 extends b1.u {

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f957i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(G0.i iVar, I0.g gVar) {
        super(gVar, iVar.m(r0) == null ? iVar.j(r0) : iVar);
        k0 k0Var = k0.f958e;
        this.f957i = new ThreadLocal();
        G0.i iVar2 = gVar.f527f;
        P0.h.b(iVar2);
        if (iVar2.m(G0.e.f499e) instanceof AbstractC0078s) {
            return;
        }
        Object l2 = AbstractC0115a.l(iVar, null);
        AbstractC0115a.f(iVar, l2);
        X(iVar, l2);
    }

    public final boolean W() {
        boolean z2 = this.threadLocalIsSet && this.f957i.get() == null;
        this.f957i.remove();
        return !z2;
    }

    public final void X(G0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f957i.set(new D0.c(iVar, obj));
    }

    @Override // b1.u, W0.Z
    public final void q(Object obj) {
        if (this.threadLocalIsSet) {
            D0.c cVar = (D0.c) this.f957i.get();
            if (cVar != null) {
                AbstractC0115a.f((G0.i) cVar.f199e, cVar.f200f);
            }
            this.f957i.remove();
        }
        Object g2 = AbstractC0081v.g(obj);
        G0.d dVar = this.f1775h;
        G0.i e2 = dVar.e();
        Object l2 = AbstractC0115a.l(e2, null);
        j0 l3 = l2 != AbstractC0115a.f1740f ? AbstractC0081v.l(dVar, e2, l2) : null;
        try {
            this.f1775h.g(g2);
            if (l3 == null || l3.W()) {
                AbstractC0115a.f(e2, l2);
            }
        } catch (Throwable th) {
            if (l3 == null || l3.W()) {
                AbstractC0115a.f(e2, l2);
            }
            throw th;
        }
    }
}
