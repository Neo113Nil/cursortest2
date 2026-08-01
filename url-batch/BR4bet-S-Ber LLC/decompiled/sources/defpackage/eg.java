package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class eg extends xk implements Executor {
    public static final eg h = new eg();
    public static final bf i;

    static {
        wa0 wa0Var = wa0.h;
        int i2 = f80.a;
        if (64 >= i2) {
            i2 = 64;
        }
        i = wa0Var.s(kr.f0("kotlinx.coroutines.io.parallelism", i2, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        q(gk.f, runnable);
    }

    @Override // defpackage.bf
    public final void q(ye yeVar, Runnable runnable) {
        i.q(yeVar, runnable);
    }

    @Override // defpackage.bf
    public final String toString() {
        return "Dispatchers.IO";
    }
}
