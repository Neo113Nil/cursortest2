package D4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import k4.InterfaceC1223i;

/* renamed from: D4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0025z extends N implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0025z f560j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f561k;

    static {
        Long l2;
        RunnableC0025z runnableC0025z = new RunnableC0025z();
        f560j = runnableC0025z;
        runnableC0025z.I(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f561k = timeUnit.toNanos(l2.longValue());
    }

    @Override // D4.O
    public final Thread H() {
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

    @Override // D4.O
    public final void M(long j2, L l2) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // D4.N
    public final void N(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.N(runnable);
    }

    public final synchronized void R() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            N.f472g.set(this, null);
            N.f473h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean P5;
        p0.f527a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (P5) {
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
                    long K5 = K();
                    if (K5 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f561k + nanoTime;
                        }
                        long j6 = j2 - nanoTime;
                        if (j6 <= 0) {
                            _thread = null;
                            R();
                            if (P()) {
                                return;
                            }
                            H();
                            return;
                        }
                        if (K5 > j6) {
                            K5 = j6;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (K5 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            R();
                            if (P()) {
                                return;
                            }
                            H();
                            return;
                        }
                        LockSupport.parkNanos(this, K5);
                    }
                }
            }
        } finally {
            _thread = null;
            R();
            if (!P()) {
                H();
            }
        }
    }

    @Override // D4.N, D4.O
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // D4.N, D4.B
    public final G y(long j2, s0 s0Var, InterfaceC1223i interfaceC1223i) {
        long j6 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j6 >= 4611686018427387903L) {
            return j0.f518a;
        }
        long nanoTime = System.nanoTime();
        K k3 = new K(j6 + nanoTime, s0Var);
        Q(nanoTime, k3);
        return k3;
    }
}
