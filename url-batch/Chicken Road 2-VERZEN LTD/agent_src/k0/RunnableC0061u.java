package k0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: k0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0061u extends C implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0061u f893j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f894k;

    static {
        Long l2;
        RunnableC0061u runnableC0061u = new RunnableC0061u();
        f893j = runnableC0061u;
        runnableC0061u.j(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f894k = timeUnit.toNanos(l2.longValue());
    }

    @Override // k0.D
    public final Thread i() {
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

    @Override // k0.C, k0.D
    public final void m() {
        debugStatus = 4;
        super.m();
    }

    @Override // k0.C
    public final void n(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n(runnable);
    }

    public final synchronized void q() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            C.f824g.set(this, null);
            C.f825h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o2;
        a0.f854a.set(this);
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
                    long p2 = p();
                    if (p2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f894k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            q();
                            if (o()) {
                                return;
                            }
                            i();
                            return;
                        }
                        if (p2 > j3) {
                            p2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (p2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            q();
                            if (o()) {
                                return;
                            }
                            i();
                            return;
                        }
                        LockSupport.parkNanos(this, p2);
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!o()) {
                i();
            }
        }
    }
}
