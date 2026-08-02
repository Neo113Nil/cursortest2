package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt;

/* loaded from: classes3.dex */
public abstract class TasksKt {
    public static final int CORE_POOL_SIZE;
    public static final String DEFAULT_SCHEDULER_NAME;
    public static final long IDLE_WORKER_KEEP_ALIVE_NS;
    public static final int MAX_POOL_SIZE;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS;
    public static final NanoTimeSource schedulerTimeSource;

    static {
        String str;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        DEFAULT_SCHEDULER_NAME = str;
        WORK_STEALING_TIME_RESOLUTION_NS = InlineList.systemProp(100000L, "kotlinx.coroutines.scheduler.resolution.ns", 1L, Long.MAX_VALUE);
        int i2 = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        if (i2 < 2) {
            i2 = 2;
        }
        CORE_POOL_SIZE = InlineList.systemProp$default(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        MAX_POOL_SIZE = InlineList.systemProp$default(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        IDLE_WORKER_KEEP_ALIVE_NS = TimeUnit.SECONDS.toNanos(InlineList.systemProp(60L, "kotlinx.coroutines.scheduler.keep.alive.sec", 1L, Long.MAX_VALUE));
        schedulerTimeSource = NanoTimeSource.INSTANCE;
    }
}
