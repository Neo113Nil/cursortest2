package d3;

import W2.AbstractC0298u;
import W2.V;
import b3.u;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class d extends V implements Executor {

    /* renamed from: i, reason: collision with root package name */
    public static final d f6116i = new d();

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC0298u f6117j;

    static {
        l lVar = l.f6130i;
        int i2 = u.f5690a;
        if (64 >= i2) {
            i2 = 64;
        }
        f6117j = lVar.z(b3.a.k(i2, 0, 0, 12, "kotlinx.coroutines.io.parallelism"), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        t(kotlin.coroutines.i.f7498d, runnable);
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        f6117j.t(coroutineContext, runnable);
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        return "Dispatchers.IO";
    }
}
