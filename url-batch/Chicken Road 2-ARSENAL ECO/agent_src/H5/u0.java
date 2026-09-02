package H5;

import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class u0 extends AbstractC0161v {

    /* renamed from: h, reason: collision with root package name */
    public static final u0 f1106h = new u0();

    @Override // H5.AbstractC0161v
    public final void F(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        y0 y0Var = (y0) interfaceC0569i.m(y0.f1112h);
        if (y0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        y0Var.f1113g = true;
    }

    @Override // H5.AbstractC0161v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
