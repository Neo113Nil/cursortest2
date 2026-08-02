package x3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: x3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1563x extends AbstractC1533H implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC1563x f16072j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f16073k;

    static {
        Long l4;
        RunnableC1563x runnableC1563x = new RunnableC1563x();
        f16072j = runnableC1563x;
        runnableC1563x.w(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f16073k = timeUnit.toNanos(l4.longValue());
    }

    public final synchronized void B() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            AbstractC1533H.f15993g.set(this, null);
            AbstractC1533H.f15994h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A4;
        l0.f16040a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 == 2 || i4 == 3) {
                    if (A4) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long x4 = x();
                    if (x4 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f16073k + nanoTime;
                        }
                        long j5 = j4 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            B();
                            if (A()) {
                                return;
                            }
                            v();
                            return;
                        }
                        if (x4 > j5) {
                            x4 = j5;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (x4 > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            B();
                            if (A()) {
                                return;
                            }
                            v();
                            return;
                        }
                        LockSupport.parkNanos(this, x4);
                    }
                }
            }
        } finally {
            _thread = null;
            B();
            if (!A()) {
                v();
            }
        }
    }

    @Override // x3.AbstractC1533H, x3.AbstractC1534I
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // x3.AbstractC1534I
    public final Thread v() {
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
                thread.setContextClassLoader(RunnableC1563x.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // x3.AbstractC1533H
    public final void z(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.z(runnable);
    }
}
