package D4;

import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class u0 extends AbstractC0020u {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f543c = new u0();

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        y0 y0Var = (y0) interfaceC1223i.o(y0.f558c);
        if (y0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        y0Var.f559b = true;
    }

    @Override // D4.AbstractC0020u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
