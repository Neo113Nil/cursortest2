package q2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: q2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0838z extends N implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m, reason: collision with root package name */
    public static final RunnableC0838z f7950m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f7951n;

    static {
        Long l3;
        RunnableC0838z runnableC0838z = new RunnableC0838z();
        f7950m = runnableC0838z;
        runnableC0838z.K(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f7951n = timeUnit.toNanos(l3.longValue());
    }

    @Override // q2.O
    public final Thread J() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f7950m.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // q2.O
    public final void O(long j3, L l3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // q2.N, q2.O
    public final void P() {
        debugStatus = 4;
        super.P();
    }

    @Override // q2.N
    public final void Q(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Q(runnable);
    }

    public final synchronized void V() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            N.f7862j.set(this, null);
            N.f7863k.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean T3;
        p0.f7918a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (T3) {
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
                    long M3 = M();
                    if (M3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f7951n + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            V();
                            if (T()) {
                                return;
                            }
                            J();
                            return;
                        }
                        if (M3 > j4) {
                            M3 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (M3 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            V();
                            if (T()) {
                                return;
                            }
                            J();
                            return;
                        }
                        LockSupport.parkNanos(this, M3);
                    }
                }
            }
        } finally {
            _thread = null;
            V();
            if (!T()) {
                J();
            }
        }
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // q2.N, q2.B
    public final G u(long j3, r0 r0Var, V1.i iVar) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 >= 4611686018427387903L) {
            return j0.f7909d;
        }
        long nanoTime = System.nanoTime();
        K k3 = new K(j4 + nanoTime, r0Var);
        U(nanoTime, k3);
        return k3;
    }
}
