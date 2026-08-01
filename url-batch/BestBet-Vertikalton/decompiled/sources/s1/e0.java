package s1;

import d1.AbstractC0095c;

/* loaded from: classes.dex */
public final class e0 extends w1.q {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f4042e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(b1.j jVar, AbstractC0095c abstractC0095c) {
        super(jVar.p(r0) == null ? jVar.j(r0) : jVar, abstractC0095c);
        f0 f0Var = f0.f4044a;
        this.f4042e = new ThreadLocal();
        b1.j jVar2 = abstractC0095c.f2474b;
        k1.e.b(jVar2);
        if (jVar2.p(b1.e.f2046a) instanceof AbstractC0332o) {
            return;
        }
        Object g2 = w1.a.g(jVar, null);
        w1.a.b(jVar, g2);
        L(jVar, g2);
    }

    public final boolean K() {
        boolean z2 = this.threadLocalIsSet && this.f4042e.get() == null;
        this.f4042e.remove();
        return !z2;
    }

    public final void L(b1.j jVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f4042e.set(new X0.c(jVar, obj));
    }

    @Override // w1.q, s1.U
    public final void i(Object obj) {
        if (this.threadLocalIsSet) {
            X0.c cVar = (X0.c) this.f4042e.get();
            if (cVar != null) {
                w1.a.b((b1.j) cVar.f1270a, cVar.f1271b);
            }
            this.f4042e.remove();
        }
        Object h = AbstractC0335s.h(obj);
        AbstractC0095c abstractC0095c = this.d;
        b1.j jVar = abstractC0095c.f2474b;
        k1.e.b(jVar);
        Object g2 = w1.a.g(jVar, null);
        e0 k2 = g2 != w1.a.f4491e ? AbstractC0335s.k(abstractC0095c, jVar, g2) : null;
        try {
            this.d.b(h);
        } finally {
            if (k2 == null || k2.K()) {
                w1.a.b(jVar, g2);
            }
        }
    }
}
