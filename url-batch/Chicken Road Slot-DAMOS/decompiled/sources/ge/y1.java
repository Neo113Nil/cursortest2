package ge;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y1 extends t {

    /* renamed from: i, reason: collision with root package name */
    public static final y1 f4423i = new y1();

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        c2 c2Var = (c2) coroutineContext.m(c2.f4341i);
        if (c2Var != null) {
            c2Var.f4342e = true;
        } else {
            a2.r.r("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // ge.t
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
