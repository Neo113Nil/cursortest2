package W2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class C extends T implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: p, reason: collision with root package name */
    public static final C f4219p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f4220q;

    static {
        Long l4;
        C c4 = new C();
        f4219p = c4;
        c4.D(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f4220q = timeUnit.toNanos(l4.longValue());
    }

    @Override // W2.U
    public final Thread C() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f4219p.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // W2.U
    public final void H(long j4, Q q2) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // W2.T
    public final void I(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.I(runnable);
    }

    public final synchronized void N() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            T.f4236m.set(this, null);
            T.f4237n.set(this, null);
            notifyAll();
        }
    }

    @Override // W2.T, W2.E
    public final L p(long j4, w0 w0Var, CoroutineContext coroutineContext) {
        long j5 = j4 > 0 ? j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4 : 0L;
        if (j5 >= 4611686018427387903L) {
            return o0.f4289d;
        }
        long nanoTime = System.nanoTime();
        P p4 = new P(j5 + nanoTime, w0Var);
        M(nanoTime, p4);
        return p4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean L3;
        u0.f4294a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (L3) {
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
                    long F3 = F();
                    if (F3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f4220q + nanoTime;
                        }
                        long j5 = j4 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            N();
                            if (L()) {
                                return;
                            }
                            C();
                            return;
                        }
                        if (F3 > j5) {
                            F3 = j5;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (F3 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            N();
                            if (L()) {
                                return;
                            }
                            C();
                            return;
                        }
                        LockSupport.parkNanos(this, F3);
                    }
                }
            }
        } finally {
            _thread = null;
            N();
            if (!L()) {
                C();
            }
        }
    }

    @Override // W2.T, W2.U
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        return "DefaultExecutor";
    }
}
