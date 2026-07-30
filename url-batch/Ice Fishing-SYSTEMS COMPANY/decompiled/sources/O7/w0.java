package O7;

import q7.C4938g;
import v7.C5134e;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class w0 extends T7.s {
    private volatile boolean threadLocalIsSet;

    /* renamed from: x, reason: collision with root package name */
    public final ThreadLocal f2636x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0(InterfaceC5133d interfaceC5133d, InterfaceC5138i interfaceC5138i) {
        super(interfaceC5133d, interfaceC5138i.i(r0) == null ? interfaceC5138i.n(r0) : interfaceC5138i);
        x0 x0Var = x0.f2642n;
        this.f2636x = new ThreadLocal();
        if (interfaceC5133d.getContext().i(C5134e.f41371n) instanceof AbstractC0395u) {
            return;
        }
        Object m8 = T7.a.m(interfaceC5138i, null);
        T7.a.g(interfaceC5138i, m8);
        Y(interfaceC5138i, m8);
    }

    public final boolean X() {
        boolean z8 = this.threadLocalIsSet && this.f2636x.get() == null;
        this.f2636x.remove();
        return !z8;
    }

    public final void Y(InterfaceC5138i interfaceC5138i, Object obj) {
        this.threadLocalIsSet = true;
        this.f2636x.set(new C4938g(interfaceC5138i, obj));
    }

    @Override // T7.s, O7.h0
    public final void l(Object obj) {
        if (this.threadLocalIsSet) {
            C4938g c4938g = (C4938g) this.f2636x.get();
            if (c4938g != null) {
                T7.a.g((InterfaceC5138i) c4938g.f40162n, c4938g.f40163u);
            }
            this.f2636x.remove();
        }
        Object q6 = AbstractC0399y.q(obj);
        InterfaceC5133d interfaceC5133d = this.f3164w;
        InterfaceC5138i context = interfaceC5133d.getContext();
        Object m8 = T7.a.m(context, null);
        w0 x3 = m8 != T7.a.f3131f ? AbstractC0399y.x(interfaceC5133d, context, m8) : null;
        try {
            this.f3164w.resumeWith(q6);
            if (x3 == null || x3.X()) {
                T7.a.g(context, m8);
            }
        } catch (Throwable th) {
            if (x3 == null || x3.X()) {
                T7.a.g(context, m8);
            }
            throw th;
        }
    }
}
