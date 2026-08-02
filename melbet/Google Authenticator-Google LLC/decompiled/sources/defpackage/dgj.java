package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgj implements Runnable {
    public static final /* synthetic */ int a = 0;
    private static final hac b = hoq.v(new csm(2));
    private static final Logger c = Logger.getLogger("ErrorLoggingExecutor");
    private final Runnable d;
    private final koe e;

    public dgj(Runnable runnable, koe koeVar) {
        this.d = runnable;
        this.e = koeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.run();
        } catch (Throwable th) {
            if (((Boolean) ((gzp) ((jrx) this.e).a).d(false)).booleanValue()) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                return;
            }
            try {
                ((hkf) ((hkf) ((hkf) ((hkh) b.bB()).f()).h(th)).i("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", 95, "ExceptionHandlingExecutorFactory.java")).s("Uncaught exception from runnable");
            } catch (Throwable th2) {
                Logger logger = c;
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "GoogleLogger failed to log", th2);
                Log.e("ErrorLoggingExecutor", "GoogleLogger failed to log", th2);
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", th);
                Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
            }
        }
    }

    public final String toString() {
        return this.d.toString();
    }
}
