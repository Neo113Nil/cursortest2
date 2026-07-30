package kotlinx.coroutines.scheduling;

import j6.v;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.internal.j0;

/* loaded from: classes5.dex */
public abstract class k {
    public static final h BlockingContext;
    public static final int CORE_POOL_SIZE;
    public static final String DEFAULT_SCHEDULER_NAME = h0.systemProp("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long IDLE_WORKER_KEEP_ALIVE_NS;
    public static final int MAX_POOL_SIZE;
    public static final h NonBlockingContext;
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS;
    public static f schedulerTimeSource;

    static {
        long systemProp$default;
        int coerceAtLeast;
        int systemProp$default2;
        int systemProp$default3;
        long systemProp$default4;
        systemProp$default = j0.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (Object) null);
        WORK_STEALING_TIME_RESOLUTION_NS = systemProp$default;
        coerceAtLeast = v.coerceAtLeast(h0.getAVAILABLE_PROCESSORS(), 2);
        systemProp$default2 = j0.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", coerceAtLeast, 1, 0, 8, (Object) null);
        CORE_POOL_SIZE = systemProp$default2;
        systemProp$default3 = j0.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 0, CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 4, (Object) null);
        MAX_POOL_SIZE = systemProp$default3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        systemProp$default4 = j0.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, (Object) null);
        IDLE_WORKER_KEEP_ALIVE_NS = timeUnit.toNanos(systemProp$default4);
        schedulerTimeSource = d.INSTANCE;
        NonBlockingContext = new i(0);
        BlockingContext = new i(1);
    }

    public static final boolean isBlocking(g gVar) {
        return gVar.taskContext.getTaskMode() == 1;
    }
}
