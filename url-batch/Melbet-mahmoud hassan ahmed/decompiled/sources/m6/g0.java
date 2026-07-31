package m6;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<CoroutineExceptionHandler> f19286a;

    static {
        k6.b a7;
        List<CoroutineExceptionHandler> e7;
        a7 = k6.f.a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        e7 = k6.h.e(a7);
        f19286a = e7;
    }

    public static final void a(y5.g gVar, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = f19286a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, h0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
