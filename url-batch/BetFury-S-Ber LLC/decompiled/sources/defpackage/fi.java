package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fi extends pn implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final fi o;
    public static final long p;

    static {
        Long l;
        fi fiVar = new fi();
        o = fiVar;
        fiVar.S(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        p = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.pn
    public final void V(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.V(runnable);
    }

    @Override // defpackage.pn
    public final Thread Y() {
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
                thread.setContextClassLoader(o.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.pn
    public final void a0(long j, nn nnVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void c0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            pn.l.set(this, null);
            pn.m.set(this, null);
            notifyAll();
        }
    }

    @Override // defpackage.pn, defpackage.fj
    public final nk i(long j, ii0 ii0Var, qg qgVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return v30.f;
        }
        long nanoTime = System.nanoTime();
        mn mnVar = new mn(j2 + nanoTime, ii0Var);
        b0(nanoTime, mnVar);
        return mnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean Z;
        ai0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (Z) {
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
                    long T = T();
                    if (T == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = p + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            c0();
                            if (Z()) {
                                return;
                            }
                            Y();
                            return;
                        }
                        if (T > j2) {
                            T = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (T > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            c0();
                            if (Z()) {
                                return;
                            }
                            Y();
                            return;
                        }
                        LockSupport.parkNanos(this, T);
                    }
                }
            }
        } finally {
            _thread = null;
            c0();
            if (!Z()) {
                Y();
            }
        }
    }

    @Override // defpackage.pn, defpackage.ln
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.tg
    public final String toString() {
        return "DefaultExecutor";
    }
}
