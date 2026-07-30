package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j80 extends ej0 implements Executor {
    public static final j80 o = new j80();
    public static final t40 p;

    static {
        f23 f23Var = f23.o;
        int i = hs2.a;
        if (64 >= i) {
            i = 64;
        }
        p = f23Var.Q(mh2.q("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        p.N(coroutineContext, runnable);
    }

    @Override // defpackage.t40
    public final void O(CoroutineContext coroutineContext, Runnable runnable) {
        p.O(coroutineContext, runnable);
    }

    @Override // defpackage.t40
    public final t40 Q(int i) {
        return f23.o.Q(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        N(h.m, runnable);
    }

    @Override // defpackage.t40
    public final String toString() {
        return "Dispatchers.IO";
    }
}
