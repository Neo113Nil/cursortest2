package H5;

import k5.C0477g;
import o5.C0565e;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class v0 extends M5.s {

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f1108j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v0(InterfaceC0569i interfaceC0569i, InterfaceC0564d interfaceC0564d) {
        super(interfaceC0569i.m(r0) == null ? interfaceC0569i.v(r0) : interfaceC0569i, interfaceC0564d);
        w0 w0Var = w0.f1111f;
        this.f1108j = new ThreadLocal();
        if (interfaceC0564d.getContext().m(C0565e.f5619f) instanceof AbstractC0161v) {
            return;
        }
        Object m4 = M5.a.m(interfaceC0569i, null);
        M5.a.g(interfaceC0569i, m4);
        X(interfaceC0569i, m4);
    }

    public final boolean W() {
        boolean z5 = this.threadLocalIsSet && this.f1108j.get() == null;
        this.f1108j.remove();
        return !z5;
    }

    public final void X(InterfaceC0569i interfaceC0569i, Object obj) {
        this.threadLocalIsSet = true;
        this.f1108j.set(new C0477g(interfaceC0569i, obj));
    }

    @Override // M5.s, H5.g0
    public final void l(Object obj) {
        if (this.threadLocalIsSet) {
            C0477g c0477g = (C0477g) this.f1108j.get();
            if (c0477g != null) {
                M5.a.g((InterfaceC0569i) c0477g.f5198f, c0477g.f5199g);
            }
            this.f1108j.remove();
        }
        Object m4 = AbstractC0165z.m(obj);
        InterfaceC0564d interfaceC0564d = this.f1620i;
        InterfaceC0569i context = interfaceC0564d.getContext();
        Object m7 = M5.a.m(context, null);
        v0 s6 = m7 != M5.a.f1587f ? AbstractC0165z.s(interfaceC0564d, context, m7) : null;
        try {
            this.f1620i.resumeWith(m4);
            if (s6 == null || s6.W()) {
                M5.a.g(context, m7);
            }
        } catch (Throwable th) {
            if (s6 == null || s6.W()) {
                M5.a.g(context, m7);
            }
            throw th;
        }
    }
}
