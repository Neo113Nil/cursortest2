package o2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class X0 extends AbstractC3313G {

    /* renamed from: d, reason: collision with root package name */
    public static final X0 f42035d = new X0();

    private X0() {
    }

    @Override // o2.AbstractC3313G
    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        b1 b1Var = (b1) coroutineContext.get(b1.f42045d);
        if (b1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        b1Var.f42046c = true;
    }

    @Override // o2.AbstractC3313G
    public boolean i(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // o2.AbstractC3313G
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
