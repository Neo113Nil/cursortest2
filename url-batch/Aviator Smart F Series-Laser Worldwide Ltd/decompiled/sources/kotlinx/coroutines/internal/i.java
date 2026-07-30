package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class i {
    public static final void handleUncaughtCoroutineException(CoroutineContext coroutineContext, Throwable th) {
        Iterator<kotlinx.coroutines.g0> it = h.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                h.propagateExceptionFinalResort(kotlinx.coroutines.h0.handlerException(th, th2));
            }
        }
        try {
            y5.b.addSuppressed(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        h.propagateExceptionFinalResort(th);
    }
}
