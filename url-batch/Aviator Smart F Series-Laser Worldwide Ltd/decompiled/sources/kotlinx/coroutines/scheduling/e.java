package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* loaded from: classes5.dex */
public class e extends ExecutorCoroutineDispatcher {
    private final int corePoolSize;
    private CoroutineScheduler coroutineScheduler;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;
    private final String schedulerName;

    public e() {
        this(0, 0, 0L, null, 15, null);
    }

    private final CoroutineScheduler createScheduler() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1293dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, runnable, null, false, 6, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(Runnable runnable, h hVar, boolean z7) {
        this.coroutineScheduler.dispatch(runnable, hVar, z7);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final void restore$kotlinx_coroutines_core() {
        usePrivateScheduler$kotlinx_coroutines_core();
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long j8) {
        this.coroutineScheduler.shutdown(j8);
    }

    public final synchronized void usePrivateScheduler$kotlinx_coroutines_core() {
        this.coroutineScheduler.shutdown(1000L);
        this.coroutineScheduler = createScheduler();
    }

    public /* synthetic */ e(int i8, int i9, long j8, String str, int i10, o oVar) {
        this((i10 & 1) != 0 ? k.CORE_POOL_SIZE : i8, (i10 & 2) != 0 ? k.MAX_POOL_SIZE : i9, (i10 & 4) != 0 ? k.IDLE_WORKER_KEEP_ALIVE_NS : j8, (i10 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public e(int i8, int i9, long j8, String str) {
        this.corePoolSize = i8;
        this.maxPoolSize = i9;
        this.idleWorkerKeepAliveNs = j8;
        this.schedulerName = str;
        this.coroutineScheduler = createScheduler();
    }
}
