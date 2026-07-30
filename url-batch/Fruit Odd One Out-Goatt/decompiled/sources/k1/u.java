package k1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class u extends c0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final u f726j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f727k;

    static {
        Long l2;
        u uVar = new u();
        f726j = uVar;
        uVar.g(false);
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f727k = TimeUnit.MILLISECONDS.toNanos(l2.longValue());
    }

    @Override // k1.c0
    public final void e(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.e(runnable);
    }

    @Override // k1.c0
    public final Thread f() {
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

    public final synchronized void n() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            c0.f665g.set(this, null);
            c0.f666h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean k2;
        v0.f729a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (k2) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long l2 = l();
                    if (l2 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f727k + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            n();
                            if (k()) {
                                return;
                            }
                            f();
                            return;
                        }
                        if (l2 > j3) {
                            l2 = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (l2 > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            n();
                            if (k()) {
                                return;
                            }
                            f();
                            return;
                        }
                        LockSupport.parkNanos(this, l2);
                    }
                }
            }
        } finally {
            _thread = null;
            n();
            if (!k()) {
                f();
            }
        }
    }

    @Override // k1.c0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
