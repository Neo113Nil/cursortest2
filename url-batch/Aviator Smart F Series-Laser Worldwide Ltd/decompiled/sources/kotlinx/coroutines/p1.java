package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
abstract /* synthetic */ class p1 {
    public static final void cancelFutureOnCancellation(n nVar, Future<?> future) {
        nVar.invokeOnCancellation(new j(future));
    }

    public static final u0 cancelFutureOnCompletion(l1 l1Var, Future<?> future) {
        return l1Var.invokeOnCompletion(new k(future));
    }
}
