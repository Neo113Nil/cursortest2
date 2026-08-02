package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvq extends kwk implements Runnable {
    private static volatile Thread _thread;
    public static final kvq a;
    private static volatile int debugStatus;
    private static final long g;

    static {
        Long l;
        kvq kvqVar = new kvq();
        a = kvqVar;
        kvqVar.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        g = timeUnit.toNanos(l.longValue());
    }

    private static final boolean A() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void B() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized Thread x() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void y() {
        if (A()) {
            debugStatus = 3;
            ((kwk) this).e.c(null);
            this.f.c(null);
            notifyAll();
        }
    }

    private final synchronized boolean z() {
        if (A()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // defpackage.kwf
    protected final Thread e() {
        Thread thread = _thread;
        return thread == null ? x() : thread;
    }

    @Override // defpackage.kwk, defpackage.kvu
    public final kwc h(long j, Runnable runnable, kqn kqnVar) {
        return t(j, runnable);
    }

    @Override // defpackage.kwk
    public final void i(Runnable runnable) {
        if (debugStatus == 4) {
            B();
        }
        super.i(runnable);
    }

    @Override // defpackage.kwf
    protected final void j(long j, kwi kwiVar) {
        B();
    }

    @Override // defpackage.kwk, defpackage.kwf
    public final void k() {
        debugStatus = 4;
        super.k();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = kxv.a;
        kxv.a.set(this);
        try {
            if (z()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long l = l();
                    if (l == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = g + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            break;
                        } else {
                            l = ksl.i(Long.MAX_VALUE, j2);
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (l > 0) {
                        if (A()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, l);
                        }
                    }
                }
            }
            _thread = null;
            y();
            if (w()) {
                return;
            }
            e();
        } catch (Throwable th) {
            _thread = null;
            y();
            if (!w()) {
                e();
            }
            throw th;
        }
    }

    @Override // defpackage.kvj
    public final String toString() {
        return "DefaultExecutor";
    }
}
