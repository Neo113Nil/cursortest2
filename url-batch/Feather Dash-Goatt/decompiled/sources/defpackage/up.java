package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class up extends jw implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final up p;
    public static final long q;

    static {
        Long l;
        up upVar = new up();
        p = upVar;
        upVar.r(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        q = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.jw
    public final void C(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.C(runnable);
    }

    @Override // defpackage.jw
    public final Thread G() {
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
                thread.setContextClassLoader(p.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.jw
    public final void I(long j, hw hwVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void O() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            K();
            notifyAll();
        }
    }

    @Override // defpackage.jw, defpackage.xq
    public final rs e(long j, ni1 ni1Var, CoroutineContext coroutineContext) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return vp0.d;
        }
        long nanoTime = System.nanoTime();
        gw gwVar = new gw(j2 + nanoTime, ni1Var);
        L(nanoTime, gwVar);
        return gwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean H;
        ci1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (H) {
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
                    long s = s();
                    if (s == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = q + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            O();
                            if (H()) {
                                return;
                            }
                            G();
                            return;
                        }
                        if (s > j2) {
                            s = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (s > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            O();
                            if (H()) {
                                return;
                            }
                            G();
                            return;
                        }
                        LockSupport.parkNanos(this, s);
                    }
                }
            }
        } finally {
            _thread = null;
            O();
            if (!H()) {
                G();
            }
        }
    }

    @Override // defpackage.jw, defpackage.ew
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.ln
    public final String toString() {
        return "DefaultExecutor";
    }
}
