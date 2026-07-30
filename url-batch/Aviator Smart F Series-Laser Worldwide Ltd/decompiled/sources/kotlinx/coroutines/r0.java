package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes3.dex */
public abstract class r0 extends kotlinx.coroutines.scheduling.g {
    public int resumeMode;

    public r0(int i8) {
        this.resumeMode = i8;
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
    }

    public abstract kotlin.coroutines.c getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null) {
            return b0Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            y5.b.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.s.checkNotNull(th);
        h0.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object m348constructorimpl;
        Object m348constructorimpl2;
        kotlinx.coroutines.scheduling.h hVar = this.taskContext;
        try {
            kotlin.coroutines.c delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            kotlin.jvm.internal.s.checkNotNull(delegate$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            kotlinx.coroutines.internal.k kVar = (kotlinx.coroutines.internal.k) delegate$kotlinx_coroutines_core;
            kotlin.coroutines.c cVar = kVar.continuation;
            Object obj = kVar.countOrElement;
            CoroutineContext context = cVar.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            j2 updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(cVar, context, updateThreadContext) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object takeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
                l1 l1Var = (exceptionalResult$kotlinx_coroutines_core == null && s0.isCancellableMode(this.resumeMode)) ? (l1) context2.get(l1.Key) : null;
                if (l1Var != null && !l1Var.isActive()) {
                    CancellationException cancellationException = l1Var.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core, cancellationException);
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(cancellationException)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    Result.a aVar2 = Result.Companion;
                    cVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    Result.a aVar3 = Result.Companion;
                    cVar.resumeWith(Result.m348constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core)));
                }
                y5.w wVar = y5.w.INSTANCE;
                if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                }
                try {
                    hVar.afterTask();
                    m348constructorimpl2 = Result.m348constructorimpl(y5.w.INSTANCE);
                } catch (Throwable th) {
                    Result.a aVar4 = Result.Companion;
                    m348constructorimpl2 = Result.m348constructorimpl(y5.g.createFailure(th));
                }
                handleFatalException$kotlinx_coroutines_core(null, Result.m351exceptionOrNullimpl(m348constructorimpl2));
            } catch (Throwable th2) {
                if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.a aVar5 = Result.Companion;
                hVar.afterTask();
                m348constructorimpl = Result.m348constructorimpl(y5.w.INSTANCE);
            } catch (Throwable th4) {
                Result.a aVar6 = Result.Companion;
                m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th4));
            }
            handleFatalException$kotlinx_coroutines_core(th3, Result.m351exceptionOrNullimpl(m348constructorimpl));
        }
    }

    public abstract Object takeState$kotlinx_coroutines_core();
}
