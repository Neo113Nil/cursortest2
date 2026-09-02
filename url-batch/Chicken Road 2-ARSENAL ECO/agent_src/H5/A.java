package H5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class A extends O implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: o, reason: collision with root package name */
    public static final A f1022o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f1023p;

    static {
        Long l7;
        A a7 = new A();
        f1022o = a7;
        a7.L(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f1023p = timeUnit.toNanos(l7.longValue());
    }

    @Override // H5.P
    public final Thread K() {
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
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // H5.P
    public final void O(long j4, M m4) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // H5.O
    public final void P(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.P(runnable);
    }

    public final synchronized void T() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            O.f1040l.set(this, null);
            O.f1041m.set(this, null);
            notifyAll();
        }
    }

    @Override // H5.O, H5.C
    public final H g(long j4, s0 s0Var, InterfaceC0569i interfaceC0569i) {
        long j7 = j4 > 0 ? j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4 : 0L;
        if (j7 >= 4611686018427387903L) {
            return j0.f1085f;
        }
        long nanoTime = System.nanoTime();
        L l7 = new L(j7 + nanoTime, s0Var);
        S(nanoTime, l7);
        return l7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean R6;
        p0.f1094a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    if (R6) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long M3 = M();
                    if (M3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f1023p + nanoTime;
                        }
                        long j7 = j4 - nanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            T();
                            if (R()) {
                                return;
                            }
                            K();
                            return;
                        }
                        if (M3 > j7) {
                            M3 = j7;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (M3 > 0) {
                        int i8 = debugStatus;
                        if (i8 == 2 || i8 == 3) {
                            _thread = null;
                            T();
                            if (R()) {
                                return;
                            }
                            K();
                            return;
                        }
                        LockSupport.parkNanos(this, M3);
                    }
                }
            }
        } finally {
            _thread = null;
            T();
            if (!R()) {
                K();
            }
        }
    }

    @Override // H5.O, H5.P
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
