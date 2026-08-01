package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ii extends vn implements Executor {
    public static final ii h = new ii();
    public static final tg i;

    static {
        tk0 tk0Var = tk0.h;
        int i2 = bh0.a;
        if (64 >= i2) {
            i2 = 64;
        }
        i = tk0Var.Q(xc0.h("kotlinx.coroutines.io.parallelism", i2, 12));
    }

    @Override // defpackage.tg
    public final void O(qg qgVar, Runnable runnable) {
        i.O(qgVar, runnable);
    }

    @Override // defpackage.tg
    public final tg Q(int i2) {
        return tk0.h.Q(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        O(um.f, runnable);
    }

    @Override // defpackage.tg
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.vn
    public final Executor R() {
        return this;
    }
}
