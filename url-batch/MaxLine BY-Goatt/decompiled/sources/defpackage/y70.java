package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y70 extends ui0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final y70 x;
    public static final long y;

    static {
        Long l;
        y70 y70Var = new y70();
        x = y70Var;
        y70Var.T(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        y = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.ui0, defpackage.m90
    public final ec0 A(long j, tx2 tx2Var, CoroutineContext coroutineContext) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return rs1.m;
        }
        long nanoTime = System.nanoTime();
        ri0 ri0Var = new ri0(j2 + nanoTime, tx2Var);
        h0(nanoTime, ri0Var);
        return ri0Var;
    }

    @Override // defpackage.ui0
    public final void Y(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Y(runnable);
    }

    @Override // defpackage.ui0
    public final Thread c0() {
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
                thread.setContextClassLoader(x.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.ui0
    public final void e0(long j, si0 si0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void k0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            g0();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d0;
        bx2.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (d0) {
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
                    long U = U();
                    if (U == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = y + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            k0();
                            if (d0()) {
                                return;
                            }
                            c0();
                            return;
                        }
                        if (U > j2) {
                            U = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (U > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            k0();
                            if (d0()) {
                                return;
                            }
                            c0();
                            return;
                        }
                        LockSupport.parkNanos(this, U);
                    }
                }
            }
        } finally {
            _thread = null;
            k0();
            if (!d0()) {
                c0();
            }
        }
    }

    @Override // defpackage.ui0, defpackage.pi0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.t40
    public final String toString() {
        return "DefaultExecutor";
    }
}
