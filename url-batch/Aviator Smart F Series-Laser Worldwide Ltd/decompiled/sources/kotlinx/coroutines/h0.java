package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g0;

/* loaded from: classes3.dex */
public abstract class h0 {

    public static final class a extends kotlin.coroutines.a implements g0 {
        final /* synthetic */ f6.p $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f6.p pVar, g0.a aVar) {
            super(aVar);
            this.$handler = pVar;
        }

        @Override // kotlinx.coroutines.g0
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            this.$handler.invoke(coroutineContext, th);
        }
    }

    public static final g0 CoroutineExceptionHandler(f6.p pVar) {
        return new a(pVar, g0.Key);
    }

    public static final void handleCoroutineException(CoroutineContext coroutineContext, Throwable th) {
        try {
            g0 g0Var = (g0) coroutineContext.get(g0.Key);
            if (g0Var != null) {
                g0Var.handleException(coroutineContext, th);
            } else {
                kotlinx.coroutines.internal.i.handleUncaughtCoroutineException(coroutineContext, th);
            }
        } catch (Throwable th2) {
            kotlinx.coroutines.internal.i.handleUncaughtCoroutineException(coroutineContext, handlerException(th, th2));
        }
    }

    public static final Throwable handlerException(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        y5.b.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
