package W0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: W0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0082w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n, reason: collision with root package name */
    public static final RunnableC0082w f984n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f985o;

    static {
        Long l2;
        RunnableC0082w runnableC0082w = new RunnableC0082w();
        f984n = runnableC0082w;
        runnableC0082w.g(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f985o = timeUnit.toNanos(l2.longValue());
    }

    @Override // W0.H
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
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // W0.G
    public final void n(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n(runnable);
    }

    public final synchronized void p() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            G.f909k.set(this, null);
            G.f910l.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o2;
        h0.f954a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (o2) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long k2 = k();
                    if (k2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f985o + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            p();
                            if (o()) {
                                return;
                            }
                            f();
                            return;
                        }
                        if (k2 > j3) {
                            k2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (k2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            p();
                            if (o()) {
                                return;
                            }
                            f();
                            return;
                        }
                        LockSupport.parkNanos(this, k2);
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

    @Override // W0.G, W0.H
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
