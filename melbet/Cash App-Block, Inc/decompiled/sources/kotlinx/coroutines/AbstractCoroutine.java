package kotlinx.coroutines;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ThreadContextKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class AbstractCoroutine extends JobSupport implements Continuation, CoroutineScope {
    public final CoroutineContext context;

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(z);
        initParentJob((Job) coroutineContext.get(Job.Key.$$INSTANCE));
        this.context = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String cancellationExceptionMessage() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(CompletionHandlerException completionHandlerException) {
        JobKt.handleCoroutineException(this.context, completionHandlerException);
    }

    public void onCancelled(Throwable th, boolean z) {
    }

    public void onCompleted(Object obj) {
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void onCompletionInternal(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            onCompleted(obj);
        } else {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            onCancelled(completedExceptionally.cause, CompletedExceptionally._handled$volatile$FU.get(completedExceptionally) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(m4120exceptionOrNullimpl, false);
        }
        Object makeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(obj);
        if (makeCompletingOnce$kotlinx_coroutines_core == JobKt.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        afterResume(makeCompletingOnce$kotlinx_coroutines_core);
    }

    public final void start(CoroutineStart coroutineStart, AbstractCoroutine abstractCoroutine, Function2 function2) {
        Object invoke;
        int ordinal = coroutineStart.ordinal();
        if (ordinal == 0) {
            UnsignedKt.startCoroutineCancellable(function2, abstractCoroutine, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                function2.getClass();
                Continuation intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(abstractCoroutine, this, function2));
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.Companion;
                intercepted.resumeWith(unit);
                return;
            }
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.context;
                Object updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, null);
                try {
                    if (function2 instanceof BaseContinuationImpl) {
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
                        invoke = function2.invoke(abstractCoroutine, this);
                    } else {
                        invoke = IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(function2, abstractCoroutine, this);
                    }
                    ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
                    if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        Result.Companion companion2 = Result.Companion;
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).cause;
                }
                Result.Companion companion3 = Result.Companion;
                resumeWith(SafeTrace.createFailure(th));
            }
        }
    }
}
