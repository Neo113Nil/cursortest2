package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class DispatchedTask extends Task {
    public int resumeMode;

    public DispatchedTask(int i) {
        super(0L, false);
        this.resumeMode = i;
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(CancellationException cancellationException) {
    }

    public abstract Continuation getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th) {
        JobKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r4 = (kotlinx.coroutines.Job) r5.get(kotlinx.coroutines.Job.Key.$$INSTANCE);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            Continuation delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            delegate$kotlinx_coroutines_core.getClass();
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
            ContinuationImpl continuationImpl = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            CoroutineContext context = continuationImpl.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            Job job = null;
            UndispatchedCoroutine updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(continuationImpl, context, updateThreadContext) : null;
            try {
                CoroutineContext context2 = continuationImpl.getContext();
                Object takeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
                if (exceptionalResult$kotlinx_coroutines_core == null) {
                    int i = this.resumeMode;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(cancellationException);
                    Result.Companion companion = Result.Companion;
                    continuationImpl.resumeWith(SafeTrace.createFailure(cancellationException));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    Result.Companion companion2 = Result.Companion;
                    continuationImpl.resumeWith(new Result.Failure(exceptionalResult$kotlinx_coroutines_core));
                } else {
                    Result.Companion companion3 = Result.Companion;
                    continuationImpl.resumeWith(getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core));
                }
                if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                }
            } catch (Throwable th) {
                if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                }
                throw th;
            }
        } catch (DispatchException e) {
            JobKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), e.cause);
        } catch (Throwable th2) {
            handleFatalException$kotlinx_coroutines_core(th2);
        }
    }

    public abstract Object takeState$kotlinx_coroutines_core();
}
