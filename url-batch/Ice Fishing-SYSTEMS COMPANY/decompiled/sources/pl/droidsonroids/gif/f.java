package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final c f39877n;

    public f(c cVar) {
        this.f39877n = cVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        try {
            GifInfoHandle gifInfoHandle = this.f39877n.f39875z;
            synchronized (gifInfoHandle) {
                z8 = gifInfoHandle.f39855a == 0;
            }
            if (z8) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
