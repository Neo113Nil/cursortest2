package M0;

import R0.AbstractC0068a;
import u0.C0242b;

/* loaded from: classes.dex */
public final class j0 extends R0.u {

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f668i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(w0.i iVar, y0.f fVar) {
        super(fVar, iVar.f(r0) == null ? iVar.k(r0) : iVar);
        k0 k0Var = k0.f669e;
        this.f668i = new ThreadLocal();
        w0.i iVar2 = fVar.f3098f;
        F0.i.b(iVar2);
        if (iVar2.f(w0.e.f3081e) instanceof AbstractC0060s) {
            return;
        }
        Object n2 = AbstractC0068a.n(iVar, null);
        AbstractC0068a.h(iVar, n2);
        W(iVar, n2);
    }

    public final boolean V() {
        boolean z2 = this.threadLocalIsSet && this.f668i.get() == null;
        this.f668i.remove();
        return !z2;
    }

    public final void W(w0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f668i.set(new C0242b(iVar, obj));
    }

    @Override // R0.u, M0.Z
    public final void p(Object obj) {
        if (this.threadLocalIsSet) {
            C0242b c0242b = (C0242b) this.f668i.get();
            if (c0242b != null) {
                AbstractC0068a.h((w0.i) c0242b.f2998e, c0242b.f2999f);
            }
            this.f668i.remove();
        }
        Object h2 = AbstractC0063v.h(obj);
        w0.d dVar = this.f936h;
        w0.i context = dVar.getContext();
        Object n2 = AbstractC0068a.n(context, null);
        j0 m2 = n2 != AbstractC0068a.f898f ? AbstractC0063v.m(dVar, context, n2) : null;
        try {
            this.f936h.resumeWith(h2);
        } finally {
            if (m2 == null || m2.V()) {
                AbstractC0068a.h(context, n2);
            }
        }
    }
}
