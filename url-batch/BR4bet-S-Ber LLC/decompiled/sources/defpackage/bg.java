package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class bg extends sk implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final bg n;
    public static final long o;

    static {
        Long l;
        bg bgVar = new bg();
        n = bgVar;
        bgVar.h = 1 + bgVar.h;
        bgVar.i = true;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        o = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean w;
        a90.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (w) {
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
                    long x = x();
                    if (x == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = o + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            z();
                            if (w()) {
                                return;
                            }
                            v();
                            return;
                        }
                        if (x > j2) {
                            x = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (x > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            z();
                            if (w()) {
                                return;
                            }
                            v();
                            return;
                        }
                        LockSupport.parkNanos(this, x);
                    }
                }
            }
        } finally {
            _thread = null;
            z();
            if (!w()) {
                v();
            }
        }
    }

    @Override // defpackage.sk
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.bf
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.sk
    public final void u(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.u(runnable);
    }

    @Override // defpackage.sk
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
                thread.setContextClassLoader(n.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    public final synchronized void z() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            sk.k.set(this, null);
            sk.l.set(this, null);
            notifyAll();
        }
    }
}
