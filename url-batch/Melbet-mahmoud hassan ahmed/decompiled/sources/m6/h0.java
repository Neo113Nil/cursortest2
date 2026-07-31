package m6;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class h0 {
    public static final void a(y5.g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f18312b);
            if (coroutineExceptionHandler == null) {
                g0.a(gVar, th);
            } else {
                coroutineExceptionHandler.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            g0.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        v5.b.a(runtimeException, th);
        return runtimeException;
    }
}
