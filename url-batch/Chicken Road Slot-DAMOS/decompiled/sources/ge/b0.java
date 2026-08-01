package ge;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 extends u0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: x, reason: collision with root package name */
    public static final b0 f4334x;

    /* renamed from: y, reason: collision with root package name */
    public static final long f4335y;

    static {
        Long l10;
        b0 b0Var = new b0();
        f4334x = b0Var;
        b0Var.R(false);
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f4335y = TimeUnit.MILLISECONDS.toNanos(l10.longValue());
    }

    @Override // ge.u0
    public final void U(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.U(runnable);
    }

    @Override // ge.u0
    public final Thread X() {
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
                thread.setContextClassLoader(f4334x.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // ge.u0
    public final void Z(long j, s0 s0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void b0() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            u0.f4404u.set(this, null);
            u0.f4405v.set(this, null);
            notifyAll();
        }
    }

    @Override // ge.f0
    public final m0 i(long j, w1 w1Var, CoroutineContext coroutineContext) {
        long j3 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j3 >= 4611686018427387903L) {
            return o1.f4383d;
        }
        long nanoTime = System.nanoTime();
        r0 r0Var = new r0(j3 + nanoTime, w1Var);
        a0(nanoTime, r0Var);
        return r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean Y;
        u1.f4407a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (Y) {
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
                    long S = S();
                    if (S == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f4335y + nanoTime;
                        }
                        long j3 = j - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            b0();
                            if (Y()) {
                                return;
                            }
                            X();
                            return;
                        }
                        if (S > j3) {
                            S = j3;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (S > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            b0();
                            if (Y()) {
                                return;
                            }
                            X();
                            return;
                        }
                        LockSupport.parkNanos(this, S);
                    }
                }
            }
        } finally {
            _thread = null;
            b0();
            if (!Y()) {
                X();
            }
        }
    }

    @Override // ge.u0, ge.p0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // ge.t
    public final String toString() {
        return "DefaultExecutor";
    }
}
