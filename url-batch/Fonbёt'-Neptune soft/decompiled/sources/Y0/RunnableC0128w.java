package Y0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Y0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0128w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n, reason: collision with root package name */
    public static final RunnableC0128w f1240n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f1241o;

    static {
        Long l2;
        RunnableC0128w runnableC0128w = new RunnableC0128w();
        f1240n = runnableC0128w;
        runnableC0128w.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f1241o = timeUnit.toNanos(l2.longValue());
    }

    @Override // Y0.H
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

    @Override // Y0.G, Y0.H
    public final void n() {
        debugStatus = 4;
        super.n();
    }

    @Override // Y0.G
    public final void o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o(runnable);
    }

    public final synchronized void r() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            G.f1163k.set(this, null);
            G.f1164l.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean q2;
        h0.f1208a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (q2) {
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
                    long j3 = j();
                    if (j3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f1241o + nanoTime;
                        }
                        long j4 = j2 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            g();
                            return;
                        }
                        if (j3 > j4) {
                            j3 = j4;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (j3 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            g();
                            return;
                        }
                        LockSupport.parkNanos(this, j3);
                    }
                }
            }
        } finally {
            _thread = null;
            r();
            if (!q()) {
                g();
            }
        }
    }
}
