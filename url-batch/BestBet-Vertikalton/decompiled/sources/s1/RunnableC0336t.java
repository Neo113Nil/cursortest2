package s1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: s1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0336t extends C implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0336t i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f4068j;

    static {
        Long l2;
        RunnableC0336t runnableC0336t = new RunnableC0336t();
        i = runnableC0336t;
        runnableC0336t.v(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f4068j = timeUnit.toNanos(l2.longValue());
    }

    public final synchronized void B() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            C.f4009f.set(this, null);
            C.f4010g.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        c0.f4036a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (z2) {
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
                    long A2 = A();
                    if (A2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f4068j + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            B();
                            if (z()) {
                                return;
                            }
                            u();
                            return;
                        }
                        if (A2 > j3) {
                            A2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (A2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            B();
                            if (z()) {
                                return;
                            }
                            u();
                            return;
                        }
                        LockSupport.parkNanos(this, A2);
                    }
                }
            }
        } finally {
            _thread = null;
            B();
            if (!z()) {
                u();
            }
        }
    }

    @Override // s1.D
    public final Thread u() {
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

    @Override // s1.C, s1.D
    public final void x() {
        debugStatus = 4;
        super.x();
    }

    @Override // s1.C
    public final void y(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.y(runnable);
    }
}
