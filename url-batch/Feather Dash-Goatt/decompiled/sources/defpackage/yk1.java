package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yk1 extends ln {
    public static final /* synthetic */ int g = 0;

    static {
        new yk1();
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        rq1 rq1Var = (rq1) coroutineContext.d(rq1.g);
        if (rq1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        rq1Var.e = true;
    }

    @Override // defpackage.ln
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
