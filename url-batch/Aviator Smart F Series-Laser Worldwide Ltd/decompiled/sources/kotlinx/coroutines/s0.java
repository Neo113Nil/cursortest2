package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes3.dex */
public abstract class s0 {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final <T> void dispatch(r0 r0Var, int i8) {
        kotlin.coroutines.c delegate$kotlinx_coroutines_core = r0Var.getDelegate$kotlinx_coroutines_core();
        boolean z7 = i8 == 4;
        if (z7 || !(delegate$kotlinx_coroutines_core instanceof kotlinx.coroutines.internal.k) || isCancellableMode(i8) != isCancellableMode(r0Var.resumeMode)) {
            resume(r0Var, delegate$kotlinx_coroutines_core, z7);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((kotlinx.coroutines.internal.k) delegate$kotlinx_coroutines_core).dispatcher;
        CoroutineContext context = delegate$kotlinx_coroutines_core.getContext();
        if (coroutineDispatcher.isDispatchNeeded(context)) {
            coroutineDispatcher.mo1293dispatch(context, r0Var);
        } else {
            resumeUnconfined(r0Var);
        }
    }

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }

    public static final boolean isCancellableMode(int i8) {
        return i8 == 1 || i8 == 2;
    }

    public static final boolean isReusableMode(int i8) {
        return i8 == 2;
    }

    public static final <T> void resume(r0 r0Var, kotlin.coroutines.c cVar, boolean z7) {
        Object successfulResult$kotlinx_coroutines_core;
        Object takeState$kotlinx_coroutines_core = r0Var.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = r0Var.getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            Result.a aVar = Result.Companion;
            successfulResult$kotlinx_coroutines_core = y5.g.createFailure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            Result.a aVar2 = Result.Companion;
            successfulResult$kotlinx_coroutines_core = r0Var.getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        }
        Object m348constructorimpl = Result.m348constructorimpl(successfulResult$kotlinx_coroutines_core);
        if (!z7) {
            cVar.resumeWith(m348constructorimpl);
            return;
        }
        kotlin.jvm.internal.s.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        kotlinx.coroutines.internal.k kVar = (kotlinx.coroutines.internal.k) cVar;
        kotlin.coroutines.c cVar2 = kVar.continuation;
        Object obj = kVar.countOrElement;
        CoroutineContext context = cVar2.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        j2 updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(cVar2, context, updateThreadContext) : null;
        try {
            kVar.continuation.resumeWith(m348constructorimpl);
            y5.w wVar = y5.w.INSTANCE;
        } finally {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        }
    }

    private static final void resumeUnconfined(r0 r0Var) {
        y0 eventLoop$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(r0Var);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(r0Var, r0Var.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void resumeWithStackTrace(kotlin.coroutines.c cVar, Throwable th) {
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(th)));
    }

    public static final void runUnconfinedEventLoop(r0 r0Var, y0 y0Var, f6.a aVar) {
        y0Var.incrementUseCount(true);
        try {
            aVar.invoke();
            do {
            } while (y0Var.processUnconfinedEvent());
            kotlin.jvm.internal.r.finallyStart(1);
        } catch (Throwable th) {
            try {
                r0Var.handleFatalException$kotlinx_coroutines_core(th, null);
                kotlin.jvm.internal.r.finallyStart(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.r.finallyStart(1);
                y0Var.decrementUseCount(true);
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th2;
            }
        }
        y0Var.decrementUseCount(true);
        kotlin.jvm.internal.r.finallyEnd(1);
    }
}
