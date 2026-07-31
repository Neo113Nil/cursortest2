package a7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y extends l0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m, reason: collision with root package name */
    public static final y f320m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f321n;

    static {
        Long l3;
        y yVar = new y();
        f320m = yVar;
        yVar.t(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f321n = timeUnit.toNanos(l3.longValue());
    }

    @Override // a7.l0
    public final void A(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A(runnable);
    }

    public final synchronized void F() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            l0.f271j.set(this, null);
            l0.f272k.set(this, null);
            notifyAll();
        }
    }

    @Override // a7.l0, a7.a0
    public final e0 e(long j7, n1 n1Var, g6.h hVar) {
        long j8 = j7 > 0 ? j7 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j7 : 0L;
        if (j8 >= 4611686018427387903L) {
            return e1.f253d;
        }
        long nanoTime = System.nanoTime();
        i0 i0Var = new i0(j8 + nanoTime, n1Var);
        E(nanoTime, i0Var);
        return i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean D;
        l1.f274a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (D) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j7 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long x7 = x();
                    if (x7 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j7 == Long.MAX_VALUE) {
                            j7 = f321n + nanoTime;
                        }
                        long j8 = j7 - nanoTime;
                        if (j8 <= 0) {
                            _thread = null;
                            F();
                            if (D()) {
                                return;
                            }
                            s();
                            return;
                        }
                        if (x7 > j8) {
                            x7 = j8;
                        }
                    } else {
                        j7 = Long.MAX_VALUE;
                    }
                    if (x7 > 0) {
                        int i8 = debugStatus;
                        if (i8 == 2 || i8 == 3) {
                            _thread = null;
                            F();
                            if (D()) {
                                return;
                            }
                            s();
                            return;
                        }
                        LockSupport.parkNanos(this, x7);
                    }
                }
            }
        } finally {
            _thread = null;
            F();
            if (!D()) {
                s();
            }
        }
    }

    @Override // a7.m0
    public final Thread s() {
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
                thread.setContextClassLoader(f320m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // a7.l0, a7.m0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // a7.q
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // a7.m0
    public final void z(long j7, j0 j0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
