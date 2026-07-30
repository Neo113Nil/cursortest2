package n6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* renamed from: n6.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0763A extends O implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: r, reason: collision with root package name */
    public static final RunnableC0763A f7006r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f7007s;

    static {
        Long l7;
        RunnableC0763A runnableC0763A = new RunnableC0763A();
        f7006r = runnableC0763A;
        runnableC0763A.L(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f7007s = timeUnit.toNanos(l7.longValue());
    }

    @Override // n6.P
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
                thread.setContextClassLoader(f7006r.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // n6.P
    public final void O(long j, M m2) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // n6.O
    public final void P(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.P(runnable);
    }

    public final synchronized void U() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            O.f7023o.set(this, null);
            O.f7024p.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean S7;
        o0.f7069a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (S7) {
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
                    long M7 = M();
                    if (M7 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f7007s + nanoTime;
                        }
                        long j7 = j - nanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            U();
                            if (S()) {
                                return;
                            }
                            K();
                            return;
                        }
                        if (M7 > j7) {
                            M7 = j7;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (M7 > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            U();
                            if (S()) {
                                return;
                            }
                            K();
                            return;
                        }
                        LockSupport.parkNanos(this, M7);
                    }
                }
            }
        } finally {
            _thread = null;
            U();
            if (!S()) {
                K();
            }
        }
    }

    @Override // n6.O, n6.InterfaceC0765C
    public final H s(long j, r0 r0Var, CoroutineContext coroutineContext) {
        long j7 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j7 >= 4611686018427387903L) {
            return i0.f7065d;
        }
        long nanoTime = System.nanoTime();
        L l7 = new L(j7 + nanoTime, r0Var);
        T(nanoTime, l7);
        return l7;
    }

    @Override // n6.O, n6.P
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        return "DefaultExecutor";
    }
}
