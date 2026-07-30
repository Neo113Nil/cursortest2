package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w13 extends t40 {
    public static final /* synthetic */ int o = 0;

    static {
        new w13();
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        n93 n93Var = (n93) coroutineContext.m(n93.o);
        if (n93Var != null) {
            n93Var.n = true;
        } else {
            ch2.h("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.t40
    public final t40 Q(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.t40
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
