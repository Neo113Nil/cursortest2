package n6;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class t0 extends AbstractC0786t {

    /* renamed from: i, reason: collision with root package name */
    public static final t0 f7083i = new t0();

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        x0 x0Var = (x0) coroutineContext.g(x0.f7093i);
        if (x0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        x0Var.f7094e = true;
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
