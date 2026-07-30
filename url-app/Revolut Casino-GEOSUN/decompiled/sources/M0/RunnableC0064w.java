package M0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: M0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0064w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n, reason: collision with root package name */
    public static final RunnableC0064w f697n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f698o;

    static {
        Long l2;
        RunnableC0064w runnableC0064w = new RunnableC0064w();
        f697n = runnableC0064w;
        runnableC0064w.j(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f698o = timeUnit.toNanos(l2.longValue());
    }

    @Override // M0.H
    public final Thread g() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // M0.G, M0.H
    public final void n() {
        debugStatus = 4;
        super.n();
    }

    @Override // M0.G
    public final void o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o(runnable);
    }

    public final synchronized void q() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            G.f620k.set(this, null);
            G.f621l.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p2;
        h0.f665a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (p2) {
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
                    long l2 = l();
                    if (l2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f698o + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            q();
                            if (p()) {
                                return;
                            }
                            g();
                            return;
                        }
                        if (l2 > j3) {
                            l2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (l2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            q();
                            if (p()) {
                                return;
                            }
                            g();
                            return;
                        }
                        LockSupport.parkNanos(this, l2);
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!p()) {
                g();
            }
        }
    }
}
