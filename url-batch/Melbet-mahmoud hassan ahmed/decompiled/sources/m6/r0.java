package m6;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class r0 extends a1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: l, reason: collision with root package name */
    public static final r0 f19326l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f19327m;

    static {
        Long l7;
        r0 r0Var = new r0();
        f19326l = r0Var;
        z0.W(r0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f19327m = timeUnit.toNanos(l7.longValue());
    }

    private r0() {
    }

    private final synchronized void r0() {
        if (t0()) {
            debugStatus = 3;
            m0();
            notifyAll();
        }
    }

    private final synchronized Thread s0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean t0() {
        int i7 = debugStatus;
        return i7 == 2 || i7 == 3;
    }

    private final synchronized boolean u0() {
        if (t0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // m6.b1
    protected Thread a0() {
        Thread thread = _thread;
        return thread == null ? s0() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean j02;
        f2.f19284a.c(this);
        c.a();
        try {
            if (!u0()) {
                if (j02) {
                    return;
                } else {
                    return;
                }
            }
            long j7 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long k02 = k0();
                if (k02 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j7 == Long.MAX_VALUE) {
                        j7 = f19327m + nanoTime;
                    }
                    long j8 = j7 - nanoTime;
                    if (j8 <= 0) {
                        _thread = null;
                        r0();
                        c.a();
                        if (j0()) {
                            return;
                        }
                        a0();
                        return;
                    }
                    k02 = i6.f.d(k02, j8);
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (k02 > 0) {
                    if (t0()) {
                        _thread = null;
                        r0();
                        c.a();
                        if (j0()) {
                            return;
                        }
                        a0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, k02);
                }
            }
        } finally {
            _thread = null;
            r0();
            c.a();
            if (!j0()) {
                a0();
            }
        }
    }
}
