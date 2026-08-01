package o1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: o1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0300t extends C implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0300t i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3365j;

    static {
        Long l2;
        RunnableC0300t runnableC0300t = new RunnableC0300t();
        i = runnableC0300t;
        runnableC0300t.C(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f3365j = timeUnit.toNanos(l2.longValue());
    }

    @Override // o1.D
    public final Thread B() {
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

    @Override // o1.C, o1.D
    public final void E() {
        debugStatus = 4;
        super.E();
    }

    @Override // o1.C
    public final void F(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.F(runnable);
    }

    public final synchronized void I() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            C.f3306f.set(this, null);
            C.f3307g.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G2;
        c0.f3333a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (G2) {
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
                    long H2 = H();
                    if (H2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f3365j + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            I();
                            if (G()) {
                                return;
                            }
                            B();
                            return;
                        }
                        if (H2 > j3) {
                            H2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (H2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            I();
                            if (G()) {
                                return;
                            }
                            B();
                            return;
                        }
                        LockSupport.parkNanos(this, H2);
                    }
                }
            }
        } finally {
            _thread = null;
            I();
            if (!G()) {
                B();
            }
        }
    }
}
