package O7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import v7.InterfaceC5138i;

/* renamed from: O7.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0400z extends O implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final RunnableC0400z f2652C;

    /* renamed from: D, reason: collision with root package name */
    public static final long f2653D;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l9;
        RunnableC0400z runnableC0400z = new RunnableC0400z();
        f2652C = runnableC0400z;
        runnableC0400z.D(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        f2653D = timeUnit.toNanos(l9.longValue());
    }

    @Override // O7.P
    public final Thread C() {
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
                thread.setContextClassLoader(RunnableC0400z.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // O7.P
    public final void G(long j9, M m8) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // O7.O
    public final void H(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.H(runnable);
    }

    public final synchronized void V() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            O.f2566z.set(this, null);
            O.f2564A.set(this, null);
            notifyAll();
        }
    }

    @Override // O7.O, O7.C
    public final H b(long j9, t0 t0Var, InterfaceC5138i interfaceC5138i) {
        long j10 = j9 > 0 ? j9 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j9 : 0L;
        if (j10 >= 4611686018427387903L) {
            return l0.f2612n;
        }
        long nanoTime = System.nanoTime();
        L l9 = new L(j10 + nanoTime, t0Var);
        K(nanoTime, l9);
        return l9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean J;
        q0.f2620a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (J) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j9 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long E8 = E();
                    if (E8 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j9 == Long.MAX_VALUE) {
                            j9 = f2653D + nanoTime;
                        }
                        long j10 = j9 - nanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            V();
                            if (J()) {
                                return;
                            }
                            C();
                            return;
                        }
                        if (E8 > j10) {
                            E8 = j10;
                        }
                    } else {
                        j9 = Long.MAX_VALUE;
                    }
                    if (E8 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            V();
                            if (J()) {
                                return;
                            }
                            C();
                            return;
                        }
                        LockSupport.parkNanos(this, E8);
                    }
                }
            }
        } finally {
            _thread = null;
            V();
            if (!J()) {
                C();
            }
        }
    }

    @Override // O7.O, O7.P
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
