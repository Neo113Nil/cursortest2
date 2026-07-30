package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.h2;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.y0;

/* loaded from: classes5.dex */
public abstract class l {
    private static final g0 UNDEFINED = new g0("UNDEFINED");
    public static final g0 REUSABLE_CLAIMED = new g0("REUSABLE_CLAIMED");

    private static final boolean executeUnconfined(k kVar, Object obj, int i8, boolean z7, f6.a aVar) {
        y0 eventLoop$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z7 && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            kVar._state = obj;
            kVar.resumeMode = i8;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(kVar);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            aVar.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            kotlin.jvm.internal.r.finallyStart(1);
        } catch (Throwable th) {
            try {
                kVar.handleFatalException$kotlinx_coroutines_core(th, null);
                kotlin.jvm.internal.r.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.r.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th2;
            }
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        kotlin.jvm.internal.r.finallyEnd(1);
        return false;
    }

    static /* synthetic */ boolean executeUnconfined$default(k kVar, Object obj, int i8, boolean z7, f6.a aVar, int i9, Object obj2) {
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        y0 eventLoop$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (z7 && eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            kVar._state = obj;
            kVar.resumeMode = i8;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(kVar);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            aVar.invoke();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
            kotlin.jvm.internal.r.finallyStart(1);
        } catch (Throwable th) {
            try {
                kVar.handleFatalException$kotlinx_coroutines_core(th, null);
                kotlin.jvm.internal.r.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.r.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th2;
            }
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        kotlin.jvm.internal.r.finallyEnd(1);
        return false;
    }

    public static final <T> void resumeCancellableWith(kotlin.coroutines.c cVar, Object obj, f6.l lVar) {
        if (!(cVar instanceof k)) {
            cVar.resumeWith(obj);
            return;
        }
        k kVar = (k) cVar;
        Object state = kotlinx.coroutines.e0.toState(obj, lVar);
        if (kVar.dispatcher.isDispatchNeeded(kVar.getContext())) {
            kVar._state = state;
            kVar.resumeMode = 1;
            kVar.dispatcher.mo1293dispatch(kVar.getContext(), kVar);
            return;
        }
        y0 eventLoop$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            kVar._state = state;
            kVar.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(kVar);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            l1 l1Var = (l1) kVar.getContext().get(l1.Key);
            if (l1Var == null || l1Var.isActive()) {
                kotlin.coroutines.c cVar2 = kVar.continuation;
                Object obj2 = kVar.countOrElement;
                CoroutineContext context = cVar2.getContext();
                Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
                j2 updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(cVar2, context, updateThreadContext) : null;
                try {
                    kVar.continuation.resumeWith(obj);
                    y5.w wVar = y5.w.INSTANCE;
                } finally {
                    if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                    }
                }
            } else {
                CancellationException cancellationException = l1Var.getCancellationException();
                kVar.cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                Result.a aVar = Result.Companion;
                kVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(cancellationException)));
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void resumeCancellableWith$default(kotlin.coroutines.c cVar, Object obj, f6.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        resumeCancellableWith(cVar, obj, lVar);
    }

    public static final boolean yieldUndispatched(k kVar) {
        y5.w wVar = y5.w.INSTANCE;
        y0 eventLoop$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            kVar._state = wVar;
            kVar.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(kVar);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kVar.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
