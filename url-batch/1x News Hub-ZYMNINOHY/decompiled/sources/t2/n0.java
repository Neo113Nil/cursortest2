package t2;

import b2.C0190d;
import d2.C0301d;
import d2.InterfaceC0300c;

/* loaded from: classes.dex */
public final class n0 extends y2.s {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f10432e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(d2.h hVar, f2.i iVar) {
        super(iVar, hVar.h(r0) == null ? hVar.i(r0) : hVar);
        o0 o0Var = o0.f10433a;
        this.f10432e = new ThreadLocal();
        d2.h hVar2 = iVar.f4981b;
        kotlin.jvm.internal.j.b(hVar2);
        if (hVar2.h(C0301d.f4950a) instanceof AbstractC1208s) {
            return;
        }
        Object l3 = y2.a.l(hVar, null);
        y2.a.f(hVar, l3);
        X(hVar, l3);
    }

    public final boolean W() {
        boolean z = this.threadLocalIsSet && this.f10432e.get() == null;
        this.f10432e.remove();
        return !z;
    }

    public final void X(d2.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f10432e.set(new C0190d(hVar, obj));
    }

    @Override // y2.s, t2.e0
    public final void p(Object obj) {
        if (this.threadLocalIsSet) {
            C0190d c0190d = (C0190d) this.f10432e.get();
            if (c0190d != null) {
                y2.a.f((d2.h) c0190d.f2547a, c0190d.f2548b);
            }
            this.f10432e.remove();
        }
        Object i3 = AbstractC1212w.i(obj);
        InterfaceC0300c interfaceC0300c = this.f10864d;
        d2.h context = interfaceC0300c.getContext();
        Object l3 = y2.a.l(context, null);
        n0 n3 = l3 != y2.a.f ? AbstractC1212w.n(interfaceC0300c, context, l3) : null;
        try {
            this.f10864d.f(i3);
            if (n3 == null || n3.W()) {
                y2.a.f(context, l3);
            }
        } catch (Throwable th) {
            if (n3 == null || n3.W()) {
                y2.a.f(context, l3);
            }
            throw th;
        }
    }
}
