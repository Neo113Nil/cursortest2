package O7;

import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class v0 extends AbstractC0395u {

    /* renamed from: v, reason: collision with root package name */
    public static final v0 f2635v = new v0();

    @Override // O7.AbstractC0395u
    public final void p(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        z0 z0Var = (z0) interfaceC5138i.i(z0.f2654v);
        if (z0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        z0Var.f2655u = true;
    }

    @Override // O7.AbstractC0395u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
