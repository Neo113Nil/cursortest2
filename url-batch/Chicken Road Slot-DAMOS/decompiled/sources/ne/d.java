package ne;

import ge.t;
import ge.v0;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import le.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends v0 implements Executor {

    /* renamed from: i, reason: collision with root package name */
    public static final d f7275i = new d();

    /* renamed from: r, reason: collision with root package name */
    public static final t f7276r;

    static {
        k kVar = k.f7289i;
        int i3 = u.f6001a;
        if (64 >= i3) {
            i3 = 64;
        }
        f7276r = kVar.O(le.b.k("kotlinx.coroutines.io.parallelism", i3, 12));
    }

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        f7276r.L(coroutineContext, runnable);
    }

    @Override // ge.t
    public final void M(CoroutineContext coroutineContext, Runnable runnable) {
        f7276r.M(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        L(kotlin.coroutines.g.f5592d, runnable);
    }

    @Override // ge.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
