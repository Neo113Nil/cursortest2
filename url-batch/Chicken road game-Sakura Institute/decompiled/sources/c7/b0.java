package c7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends p0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: o, reason: collision with root package name */
    public static final b0 f1672o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f1673p;

    static {
        Long l8;
        b0 b0Var = new b0();
        f1672o = b0Var;
        b0Var.c0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f1673p = timeUnit.toNanos(l8.longValue());
    }

    @Override // c7.p0, c7.d0
    public final i0 U(long j8, r1 r1Var, h6.i iVar) {
        long j9 = j8 > 0 ? j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8 : 0L;
        if (j9 >= 4611686018427387903L) {
            return j1.f1710f;
        }
        long nanoTime = System.nanoTime();
        m0 m0Var = new m0(j9 + nanoTime, r1Var);
        k0(nanoTime, m0Var);
        return m0Var;
    }

    @Override // c7.q0
    public final Thread b0() {
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
                thread.setContextClassLoader(f1672o.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // c7.q0
    public final void f0(long j8, n0 n0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // c7.p0
    public final void g0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.g0(runnable);
    }

    public final synchronized void l0() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            p0.f1726l.set(this, null);
            p0.f1727m.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean j02;
        p1.f1729a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    if (j02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j8 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long d02 = d0();
                    if (d02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j8 == Long.MAX_VALUE) {
                            j8 = f1673p + nanoTime;
                        }
                        long j9 = j8 - nanoTime;
                        if (j9 <= 0) {
                            _thread = null;
                            l0();
                            if (j0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        if (d02 > j9) {
                            d02 = j9;
                        }
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (d02 > 0) {
                        int i8 = debugStatus;
                        if (i8 == 2 || i8 == 3) {
                            _thread = null;
                            l0();
                            if (j0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        LockSupport.parkNanos(this, d02);
                    }
                }
            }
        } finally {
            _thread = null;
            l0();
            if (!j0()) {
                b0();
            }
        }
    }

    @Override // c7.p0, c7.q0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // c7.t
    public final String toString() {
        return "DefaultExecutor";
    }
}
