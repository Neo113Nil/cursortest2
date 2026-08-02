package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.EventLoopImplBase;

/* loaded from: classes3.dex */
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    public static final DefaultExecutor INSTANCE;
    public static final long KEEP_ALIVE_NANOS;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        INSTANCE = defaultExecutor;
        defaultExecutor.incrementUseCount(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        KEEP_ALIVE_NANOS = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    public final synchronized void acknowledgeShutdownIfNeeded() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            resetAll();
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final void enqueue(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.enqueue(runnable);
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final Thread getThread() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(INSTANCE.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return NonDisposableHandle.INSTANCE;
        }
        long nanoTime = System.nanoTime();
        EventLoopImplBase.DelayedRunnableTask delayedRunnableTask = new EventLoopImplBase.DelayedRunnableTask(runnable, j2 + nanoTime);
        schedule(nanoTime, delayedRunnableTask);
        return delayedRunnableTask;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final void reschedule(long j, EventLoopImplBase.DelayedTask delayedTask) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        ThreadLocalEventLoop.ref.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (isEmpty) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long processNextEvent = processNextEvent();
                    if (processNextEvent == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = KEEP_ALIVE_NANOS + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            acknowledgeShutdownIfNeeded();
                            if (isEmpty()) {
                                return;
                            }
                            getThread();
                            return;
                        }
                        if (processNextEvent > j2) {
                            processNextEvent = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (processNextEvent > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            acknowledgeShutdownIfNeeded();
                            if (isEmpty()) {
                                return;
                            }
                            getThread();
                            return;
                        }
                        LockSupport.parkNanos(this, processNextEvent);
                    }
                }
            }
        } finally {
            _thread = null;
            acknowledgeShutdownIfNeeded();
            if (!isEmpty()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DefaultExecutor";
    }
}
