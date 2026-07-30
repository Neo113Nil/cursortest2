package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class OnUndeliveredElementKt {
    public static final <E> f6.l bindCancellationFun(final f6.l lVar, final E e8, final CoroutineContext coroutineContext) {
        return new f6.l() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y5.w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                OnUndeliveredElementKt.callUndeliveredElement(f6.l.this, e8, coroutineContext);
            }
        };
    }

    public static final <E> void callUndeliveredElement(f6.l lVar, E e8, CoroutineContext coroutineContext) {
        UndeliveredElementException callUndeliveredElementCatchingException = callUndeliveredElementCatchingException(lVar, e8, null);
        if (callUndeliveredElementCatchingException != null) {
            kotlinx.coroutines.h0.handleCoroutineException(coroutineContext, callUndeliveredElementCatchingException);
        }
    }

    public static final <E> UndeliveredElementException callUndeliveredElementCatchingException(f6.l lVar, E e8, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e8);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e8, th);
            }
            y5.b.addSuppressed(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(f6.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(lVar, obj, undeliveredElementException);
    }
}
