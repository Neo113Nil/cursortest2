package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.q;

/* loaded from: classes5.dex */
public final class b extends e {
    public static final b INSTANCE = new b();

    private b() {
        super(k.CORE_POOL_SIZE, k.MAX_POOL_SIZE, k.IDLE_WORKER_KEEP_ALIVE_NS, k.DEFAULT_SCHEDULER_NAME);
    }

    @Override // kotlinx.coroutines.scheduling.e, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i8) {
        q.checkParallelism(i8);
        return i8 >= k.CORE_POOL_SIZE ? this : super.limitedParallelism(i8);
    }

    public final void shutdown$kotlinx_coroutines_core() {
        super.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
