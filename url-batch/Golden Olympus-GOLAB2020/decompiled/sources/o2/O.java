package o2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3330g0;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class O extends AbstractC3330g0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final O f42018j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f42019k;

    static {
        Long l4;
        O o4 = new O();
        f42018j = o4;
        AbstractC3328f0.Y(o4, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f42019k = timeUnit.toNanos(l4.longValue());
    }

    private O() {
    }

    private final boolean A0() {
        int i4 = debugStatus;
        return i4 == 2 || i4 == 3;
    }

    private final synchronized boolean B0() {
        if (A0()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void C0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized void x0() {
        if (A0()) {
            debugStatus = 3;
            r0();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread y0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(O.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean z0() {
        return debugStatus == 4;
    }

    @Override // o2.AbstractC3332h0
    protected Thread e0() {
        Thread thread = _thread;
        return thread == null ? y0() : thread;
    }

    @Override // o2.AbstractC3330g0, o2.T
    public InterfaceC3320b0 f(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        return u0(j4, runnable);
    }

    @Override // o2.AbstractC3332h0
    protected void f0(long j4, AbstractC3330g0.c cVar) {
        C0();
    }

    @Override // o2.AbstractC3330g0
    public void k0(Runnable runnable) {
        if (z0()) {
            C0();
        }
        super.k0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean p02;
        T0.f42024a.d(this);
        AbstractC3321c.a();
        try {
            if (!B0()) {
                if (p02) {
                    return;
                } else {
                    return;
                }
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long b02 = b0();
                if (b02 == Long.MAX_VALUE) {
                    AbstractC3321c.a();
                    long nanoTime = System.nanoTime();
                    if (j4 == Long.MAX_VALUE) {
                        j4 = f42019k + nanoTime;
                    }
                    long j5 = j4 - nanoTime;
                    if (j5 <= 0) {
                        _thread = null;
                        x0();
                        AbstractC3321c.a();
                        if (p0()) {
                            return;
                        }
                        e0();
                        return;
                    }
                    b02 = kotlin.ranges.g.h(b02, j5);
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (b02 > 0) {
                    if (A0()) {
                        _thread = null;
                        x0();
                        AbstractC3321c.a();
                        if (p0()) {
                            return;
                        }
                        e0();
                        return;
                    }
                    AbstractC3321c.a();
                    LockSupport.parkNanos(this, b02);
                }
            }
        } finally {
            _thread = null;
            x0();
            AbstractC3321c.a();
            if (!p0()) {
                e0();
            }
        }
    }

    @Override // o2.AbstractC3330g0, o2.AbstractC3328f0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
