package o2;

import W1.AbstractC1233c;
import kotlin.coroutines.CoroutineContext;
import t2.AbstractC3438i;

/* renamed from: o2.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3315I {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            InterfaceC3314H interfaceC3314H = (InterfaceC3314H) coroutineContext.get(InterfaceC3314H.f42006M2);
            if (interfaceC3314H != null) {
                interfaceC3314H.handleException(coroutineContext, th);
            } else {
                AbstractC3438i.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            AbstractC3438i.a(coroutineContext, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC1233c.a(runtimeException, th);
        return runtimeException;
    }
}
