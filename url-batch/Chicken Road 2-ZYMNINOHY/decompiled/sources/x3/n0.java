package x3;

import c3.C0292d;
import f3.C0426d;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;

/* loaded from: classes.dex */
public final class n0 extends C3.s {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f16049e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(InterfaceC0425c interfaceC0425c, InterfaceC0430h interfaceC0430h) {
        super(interfaceC0425c, interfaceC0430h.n(r0) == null ? interfaceC0430h.f(r0) : interfaceC0430h);
        o0 o0Var = o0.f16050a;
        this.f16049e = new ThreadLocal();
        if (interfaceC0425c.getContext().n(C0426d.f8816a) instanceof AbstractC1558s) {
            return;
        }
        Object l4 = C3.a.l(interfaceC0430h, null);
        C3.a.f(interfaceC0430h, l4);
        U(interfaceC0430h, l4);
    }

    public final boolean T() {
        boolean z = this.threadLocalIsSet && this.f16049e.get() == null;
        this.f16049e.remove();
        return !z;
    }

    public final void U(InterfaceC0430h interfaceC0430h, Object obj) {
        this.threadLocalIsSet = true;
        this.f16049e.set(new C0292d(interfaceC0430h, obj));
    }

    @Override // C3.s, x3.d0
    public final void m(Object obj) {
        if (this.threadLocalIsSet) {
            C0292d c0292d = (C0292d) this.f16049e.get();
            if (c0292d != null) {
                C3.a.f((InterfaceC0430h) c0292d.f5724a, c0292d.f5725b);
            }
            this.f16049e.remove();
        }
        Object h2 = AbstractC1562w.h(obj);
        InterfaceC0425c interfaceC0425c = this.f316d;
        InterfaceC0430h context = interfaceC0425c.getContext();
        Object l4 = C3.a.l(context, null);
        n0 m4 = l4 != C3.a.f284f ? AbstractC1562w.m(interfaceC0425c, context, l4) : null;
        try {
            this.f316d.resumeWith(h2);
            if (m4 == null || m4.T()) {
                C3.a.f(context, l4);
            }
        } catch (Throwable th) {
            if (m4 == null || m4.T()) {
                C3.a.f(context, l4);
            }
            throw th;
        }
    }
}
