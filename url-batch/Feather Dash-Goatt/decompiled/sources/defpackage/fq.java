package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fq extends nw implements Executor {
    public static final fq g = new fq();
    public static final ln h;

    static {
        gl1 gl1Var = gl1.g;
        int i = hg1.a;
        if (64 >= i) {
            i = 64;
        }
        h = gl1Var.m(xa0.x("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(g.d, runnable);
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        h.f(coroutineContext, runnable);
    }

    @Override // defpackage.ln
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        h.g(coroutineContext, runnable);
    }

    @Override // defpackage.ln
    public final String toString() {
        return "Dispatchers.IO";
    }
}
