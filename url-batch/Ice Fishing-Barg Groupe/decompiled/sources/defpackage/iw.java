package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class iw extends y60 implements Runnable {
    public static final long EcgxDIVH5in8;
    public static final iw RfyTYNmI9Srp;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        iw iwVar = new iw();
        RfyTYNmI9Srp = iwVar;
        iwVar.xbgXKYA2cIfu(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        EcgxDIVH5in8 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.y60
    public final void PsecLrZVVK61(long j, w60 w60Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.y60, defpackage.rx
    public final s00 cpQdD2nAriOS(long j, ak2 ak2Var, hu huVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return wd1.rtx2ld2ELZv4;
        }
        long nanoTime = System.nanoTime();
        v60 v60Var = new v60(j2 + nanoTime, ak2Var);
        rxipThha848g(nanoTime, v60Var);
        return v60Var;
    }

    public final synchronized void fRTaYY6FBZcX() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            VzNxmvWisHL1();
            notifyAll();
        }
    }

    @Override // defpackage.y60
    public final Thread jJwa0q7P5wHq() {
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
                thread.setContextClassLoader(RfyTYNmI9Srp.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.y60
    public final void ngxnMNrpiKat(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.ngxnMNrpiKat(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean D0aTLcX6Uhyo;
        nj2.PxuCJdSBwIXG.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (D0aTLcX6Uhyo) {
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
                    long nxJAScVArhE9 = nxJAScVArhE9();
                    if (nxJAScVArhE9 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = EcgxDIVH5in8 + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            fRTaYY6FBZcX();
                            if (D0aTLcX6Uhyo()) {
                                return;
                            }
                            jJwa0q7P5wHq();
                            return;
                        }
                        if (nxJAScVArhE9 > j2) {
                            nxJAScVArhE9 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (nxJAScVArhE9 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            fRTaYY6FBZcX();
                            if (D0aTLcX6Uhyo()) {
                                return;
                            }
                            jJwa0q7P5wHq();
                            return;
                        }
                        LockSupport.parkNanos(this, nxJAScVArhE9);
                    }
                }
            }
        } finally {
            _thread = null;
            fRTaYY6FBZcX();
            if (!D0aTLcX6Uhyo()) {
                jJwa0q7P5wHq();
            }
        }
    }

    @Override // defpackage.y60, defpackage.t60
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.ju
    public final String toString() {
        return "DefaultExecutor";
    }
}
