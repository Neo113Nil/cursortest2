package t2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: t2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1213x extends I implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC1213x f10453j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f10454k;

    static {
        Long l3;
        RunnableC1213x runnableC1213x = new RunnableC1213x();
        f10453j = runnableC1213x;
        runnableC1213x.g(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f10454k = timeUnit.toNanos(l3.longValue());
    }

    @Override // t2.J
    public final Thread f() {
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
                thread.setContextClassLoader(RunnableC1213x.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // t2.I
    public final void n(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n(runnable);
    }

    public final synchronized void p() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            I.f10381g.set(this, null);
            I.f10382h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o;
        l0.f10423a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (o) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long j4 = j();
                    if (j4 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f10454k + nanoTime;
                        }
                        long j5 = j3 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            p();
                            if (o()) {
                                return;
                            }
                            f();
                            return;
                        }
                        if (j4 > j5) {
                            j4 = j5;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (j4 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            p();
                            if (o()) {
                                return;
                            }
                            f();
                            return;
                        }
                        LockSupport.parkNanos(this, j4);
                    }
                }
            }
        } finally {
            _thread = null;
            p();
            if (!o()) {
                f();
            }
        }
    }

    @Override // t2.I, t2.J
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
