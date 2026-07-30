package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public abstract class c {
    private static b timeSource;

    private static final long currentTimeMillis() {
        b timeSource2 = getTimeSource();
        return timeSource2 != null ? timeSource2.currentTimeMillis() : System.currentTimeMillis();
    }

    public static final b getTimeSource() {
        return timeSource;
    }

    private static final long nanoTime() {
        b timeSource2 = getTimeSource();
        return timeSource2 != null ? timeSource2.nanoTime() : System.nanoTime();
    }

    private static final void parkNanos(Object obj, long j8) {
        y5.w wVar;
        b timeSource2 = getTimeSource();
        if (timeSource2 != null) {
            timeSource2.parkNanos(obj, j8);
            wVar = y5.w.INSTANCE;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            LockSupport.parkNanos(obj, j8);
        }
    }

    private static final void registerTimeLoopThread() {
        b timeSource2 = getTimeSource();
        if (timeSource2 != null) {
            timeSource2.registerTimeLoopThread();
        }
    }

    public static final void setTimeSource(b bVar) {
        timeSource = bVar;
    }

    private static final void trackTask() {
        b timeSource2 = getTimeSource();
        if (timeSource2 != null) {
            timeSource2.trackTask();
        }
    }

    private static final void unTrackTask() {
        b timeSource2 = getTimeSource();
        if (timeSource2 != null) {
            timeSource2.unTrackTask();
        }
    }

    private static final void unpark(Thread thread) {
        y5.w wVar;
        b timeSource2 = getTimeSource();
        if (timeSource2 != null) {
            timeSource2.unpark(thread);
            wVar = y5.w.INSTANCE;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            LockSupport.unpark(thread);
        }
    }

    private static final void unregisterTimeLoopThread() {
        b timeSource2 = getTimeSource();
        if (timeSource2 != null) {
            timeSource2.unregisterTimeLoopThread();
        }
    }

    private static final Runnable wrapTask(Runnable runnable) {
        Runnable wrapTask;
        b timeSource2 = getTimeSource();
        return (timeSource2 == null || (wrapTask = timeSource2.wrapTask(runnable)) == null) ? runnable : wrapTask;
    }
}
