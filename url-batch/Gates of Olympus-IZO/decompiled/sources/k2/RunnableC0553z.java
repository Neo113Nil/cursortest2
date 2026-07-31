package k2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: k2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0553z extends N implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m, reason: collision with root package name */
    public static final RunnableC0553z f5410m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f5411n;

    static {
        Long l3;
        RunnableC0553z runnableC0553z = new RunnableC0553z();
        f5410m = runnableC0553z;
        runnableC0553z.V(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f5411n = timeUnit.toNanos(l3.longValue());
    }

    @Override // k2.O
    public final Thread U() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f5410m.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // k2.O
    public final void Z(long j3, L l3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // k2.N, k2.O
    public final void a0() {
        debugStatus = 4;
        super.a0();
    }

    @Override // k2.N
    public final void b0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.b0(runnable);
    }

    public final synchronized void g0() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            N.f5323j.set(this, null);
            N.f5324k.set(this, null);
            notifyAll();
        }
    }

    @Override // k2.N, k2.B
    public final G i(long j3, r0 r0Var, P1.i iVar) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 >= 4611686018427387903L) {
            return j0.f5370d;
        }
        long nanoTime = System.nanoTime();
        K k3 = new K(j4 + nanoTime, r0Var);
        f0(nanoTime, k3);
        return k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e02;
        p0.f5379a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (e02) {
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
                    long X2 = X();
                    if (X2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f5411n + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            g0();
                            if (e0()) {
                                return;
                            }
                            U();
                            return;
                        }
                        if (X2 > j4) {
                            X2 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (X2 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            g0();
                            if (e0()) {
                                return;
                            }
                            U();
                            return;
                        }
                        LockSupport.parkNanos(this, X2);
                    }
                }
            }
        } finally {
            _thread = null;
            g0();
            if (!e0()) {
                U();
            }
        }
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        return "DefaultExecutor";
    }
}
