package kotlinx.coroutines;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.compose.elements.MarkdownHeaderKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes3.dex */
public abstract class JobKt {
    public static final Symbol CLOSED_EMPTY;
    public static final Symbol COMPLETING_ALREADY;
    public static final Symbol COMPLETING_RETRY;
    public static final Symbol COMPLETING_WAITING_CHILDREN;
    public static final Symbol DISPOSED_TASK;
    public static final Symbol RESUME_TOKEN;
    public static final Symbol SEALED;
    public static final Symbol TOO_LATE_TO_CANCEL;
    public static final Empty EMPTY_NEW = new Empty(false);
    public static final Empty EMPTY_ACTIVE = new Empty(true);

    static {
        int i = 0;
        RESUME_TOKEN = new Symbol("RESUME_TOKEN", i);
        DISPOSED_TASK = new Symbol("REMOVED_TASK", i);
        CLOSED_EMPTY = new Symbol("CLOSED_EMPTY", i);
        COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY", i);
        COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN", i);
        COMPLETING_RETRY = new Symbol("COMPLETING_RETRY", i);
        TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL", i);
        SEALED = new Symbol("SEALED", i);
    }

    public static final CancellationException CancellationException(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final CompletableDeferredImpl CompletableDeferred(Object obj) {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(obj);
        return completableDeferredImpl;
    }

    public static final ContextScope CoroutineScope(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key.$$INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(Job$default());
        }
        return new ContextScope(coroutineContext);
    }

    public static JobImpl Job$default() {
        return new JobImpl(null);
    }

    public static final ContextScope MainScope() {
        SupervisorJobImpl SupervisorJob$default = SupervisorJob$default();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return new ContextScope(CoroutineContext.Element.DefaultImpls.plus(SupervisorJob$default, MainDispatcherLoader.dispatcher));
    }

    public static SupervisorJobImpl SupervisorJob$default() {
        return new SupervisorJobImpl(null);
    }

    public static final DeferredCoroutine async(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2) {
        CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineContext, coroutineScope);
        coroutineStart.getClass();
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart == CoroutineStart.LAZY ? new LazyDeferredCoroutine(newCoroutineContext, function2) : new DeferredCoroutine(newCoroutineContext, true);
        lazyDeferredCoroutine.start(coroutineStart, lazyDeferredCoroutine, function2);
        return lazyDeferredCoroutine;
    }

    public static /* synthetic */ DeferredCoroutine async$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return async(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void awaitCancellation(Continuation continuation) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        int i;
        if (continuation instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuation;
            int i2 = delayKt$awaitCancellation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                delayKt$awaitCancellation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = delayKt$awaitCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = delayKt$awaitCancellation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    delayKt$awaitCancellation$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(delayKt$awaitCancellation$1));
                    cancellableContinuationImpl.initCancellability();
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
        Object obj2 = delayKt$awaitCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = delayKt$awaitCancellation$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    public static final void cancel(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1(coroutineScope, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final Object cancelAndJoin(Job job, Continuation continuation) {
        job.cancel(null);
        Object join = job.join(continuation);
        return join == CoroutineSingletons.COROUTINE_SUSPENDED ? join : Unit.INSTANCE;
    }

    public static void cancelChildren$default(CoroutineContext coroutineContext) {
        Sequence children;
        Job job = (Job) coroutineContext.get(Job.Key.$$INSTANCE);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
    }

    public static final Object coroutineScope(Function2 function2, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, continuation.getContext());
        Object startUndispatched = DurationKt.startUndispatched(scopeCoroutine, true, scopeCoroutine, function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return startUndispatched;
    }

    public static final Object delay(long j, Continuation continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        if (j < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl.context).scheduleResumeAfterDelay(j, cancellableContinuationImpl);
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m4182delayVtjQ1oo(long j, Continuation continuation) {
        Object delay = delay(m4183toDelayMillisLRDsOJo(j), continuation);
        return delay == CoroutineSingletons.COROUTINE_SUSPENDED ? delay : Unit.INSTANCE;
    }

    public static final void ensureActive(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.$$INSTANCE);
        if (job != null && !job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final CoroutineDispatcher from(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        DispatcherExecutor dispatcherExecutor = executor instanceof DispatcherExecutor ? (DispatcherExecutor) executor : null;
        return (dispatcherExecutor == null || (coroutineDispatcher = dispatcherExecutor.dispatcher) == null) ? new ExecutorCoroutineDispatcherImpl(executor) : coroutineDispatcher;
    }

    public static final Delay getDelay(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key);
        Delay delay = element instanceof Delay ? (Delay) element : null;
        return delay == null ? DefaultExecutorKt.DefaultDelay : delay;
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Job getJob(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.$$INSTANCE);
        if (job != null) {
            return job;
        }
        Path$$ExternalSyntheticBUOutline0.m$1(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final CancellableContinuationImpl getOrCreateCancellableContinuation(Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl(1, continuation);
        }
        CancellableContinuationImpl claimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) continuation).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!claimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                claimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return claimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new CancellableContinuationImpl(2, continuation);
    }

    public static final void handleCoroutineException(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).cause;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.Key.$$INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                MarkdownHeaderKt.handleUncaughtCoroutineException(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ExceptionsKt__ExceptionsKt.addSuppressed(runtimeException, th);
                th = runtimeException;
            }
            MarkdownHeaderKt.handleUncaughtCoroutineException(coroutineContext, th);
        }
    }

    public static DisposableHandle invokeOnCompletion$default(Job job, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(true, jobNode) : job.invokeOnCompletion(jobNode.getOnCancelling(), true, new Radiography$renderScannableViewTree$1$2(jobNode));
    }

    public static final boolean isActive(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final StandaloneCoroutine launch(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2) {
        CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineContext, coroutineScope);
        coroutineStart.getClass();
        StandaloneCoroutine lazyStandaloneCoroutine = coroutineStart == CoroutineStart.LAZY ? new LazyStandaloneCoroutine(newCoroutineContext, function2) : new StandaloneCoroutine(newCoroutineContext, true);
        lazyStandaloneCoroutine.start(coroutineStart, lazyStandaloneCoroutine, function2);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ StandaloneCoroutine launch$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final ContextScope plus(CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        return new ContextScope(coroutineScope.getCoroutineContext().plus(coroutineContext));
    }

    public static final Object recoverResult(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            Result.Companion companion = Result.Companion;
            return SafeTrace.createFailure(((CompletedExceptionally) obj).cause);
        }
        Result.Companion companion2 = Result.Companion;
        return obj;
    }

    public static final void resume(CancellableContinuationImpl cancellableContinuationImpl, Continuation continuation, boolean z) {
        Object successfulResult$kotlinx_coroutines_core;
        Object state$kotlinx_coroutines_core = cancellableContinuationImpl.getState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = cancellableContinuationImpl.getExceptionalResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            Result.Companion companion = Result.Companion;
            successfulResult$kotlinx_coroutines_core = new Result.Failure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            Result.Companion companion2 = Result.Companion;
            successfulResult$kotlinx_coroutines_core = cancellableContinuationImpl.getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        if (!z) {
            continuation.resumeWith(successfulResult$kotlinx_coroutines_core);
            return;
        }
        continuation.getClass();
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        ContinuationImpl continuationImpl = dispatchedContinuation.continuation;
        Object obj = dispatchedContinuation.countOrElement;
        CoroutineContext context = continuationImpl.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(continuationImpl, context, updateThreadContext) : null;
        try {
            continuationImpl.resumeWith(successfulResult$kotlinx_coroutines_core);
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        } catch (Throwable th) {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
            throw th;
        }
    }

    public static final Object runBlockingK(CoroutineContext coroutineContext, Function2 function2) {
        EventLoop eventLoop;
        CoroutineContext foldCopies;
        long processNextEvent;
        CoroutineContext.Key key = ContinuationInterceptor.Key;
        if (((ContinuationInterceptor) coroutineContext.get(key)) == null) {
            eventLoop = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
            foldCopies = CoroutineContextKt.foldCopies(EmptyCoroutineContext.INSTANCE, coroutineContext.plus(eventLoop), true);
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            if (foldCopies != defaultScheduler && foldCopies.get(key) == null) {
                foldCopies = foldCopies.plus(defaultScheduler);
            }
        } else {
            eventLoop = (EventLoop) ThreadLocalEventLoop.ref.get();
            foldCopies = CoroutineContextKt.foldCopies(EmptyCoroutineContext.INSTANCE, coroutineContext, true);
            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
            if (foldCopies != defaultScheduler2 && foldCopies.get(key) == null) {
                foldCopies = foldCopies.plus(defaultScheduler2);
            }
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(foldCopies, Thread.currentThread(), eventLoop);
        blockingCoroutine.start(CoroutineStart.DEFAULT, blockingCoroutine, function2);
        EventLoop eventLoop2 = blockingCoroutine.eventLoop;
        if (eventLoop2 != null) {
            int i = EventLoop.$r8$clinit;
            eventLoop2.incrementUseCount(false);
        }
        while (true) {
            if (eventLoop2 != null) {
                try {
                    processNextEvent = eventLoop2.processNextEvent();
                } catch (Throwable th) {
                    if (eventLoop2 != null) {
                        int i2 = EventLoop.$r8$clinit;
                        eventLoop2.decrementUseCount(false);
                    }
                    throw th;
                }
            } else {
                processNextEvent = Long.MAX_VALUE;
            }
            if (blockingCoroutine.isCompleted()) {
                break;
            }
            LockSupport.parkNanos(blockingCoroutine, processNextEvent);
            if (Thread.interrupted()) {
                blockingCoroutine.cancelImpl$kotlinx_coroutines_core(new InterruptedException());
            }
        }
        if (eventLoop2 != null) {
            int i3 = EventLoop.$r8$clinit;
            eventLoop2.decrementUseCount(false);
        }
        Object unboxState = unboxState(blockingCoroutine.getState$kotlinx_coroutines_core());
        CompletedExceptionally completedExceptionally = unboxState instanceof CompletedExceptionally ? (CompletedExceptionally) unboxState : null;
        if (completedExceptionally == null) {
            return unboxState;
        }
        throw completedExceptionally.cause;
    }

    public static final Object setupTimeout(TimeoutCoroutine timeoutCoroutine, Function2 function2) {
        invokeOnCompletion$default(timeoutCoroutine, new DisposeOnCompletion(getDelay(timeoutCoroutine.uCont.getContext()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.context)));
        return DurationKt.startUndispatched(timeoutCoroutine, false, timeoutCoroutine, function2);
    }

    public static final Object supervisorScope(Function2 function2, ContinuationImpl continuationImpl) {
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(continuationImpl.getContext(), continuationImpl);
        Object startUndispatched = DurationKt.startUndispatched(supervisorCoroutine, true, supervisorCoroutine, function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return startUndispatched;
    }

    public static final String toDebugString(Continuation continuation) {
        Object failure;
        if (continuation instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) continuation).toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            failure = continuation + '@' + getHexAddress(continuation);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (Result.m4120exceptionOrNullimpl(failure) != null) {
            failure = continuation.getClass().getName() + '@' + getHexAddress(continuation);
        }
        return (String) failure;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m4183toDelayMillisLRDsOJo(long j) {
        Duration.Companion companion = Duration.Companion;
        boolean z = j > 0;
        if (z) {
            return Duration.m4167getInWholeMillisecondsimpl(Duration.m4173plusLRDsOJo(j, DurationKt.toDuration(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0L;
    }

    public static final Object unboxState(Object obj) {
        Incomplete incomplete;
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.state) == null) ? obj : incomplete;
    }

    public static final Object withContext(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object unboxState;
        CoroutineContext context = continuation.getContext();
        CoroutineContext plus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new SaversKt$$ExternalSyntheticLambda5(11))).booleanValue() ? context.plus(coroutineContext) : CoroutineContextKt.foldCopies(context, coroutineContext, false);
        ensureActive(plus);
        if (plus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, plus);
            unboxState = DurationKt.startUndispatched(scopeCoroutine, true, scopeCoroutine, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(plus.get(key), context.get(key))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(continuation, plus);
                CoroutineContext coroutineContext2 = undispatchedCoroutine.context;
                Object updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext2, null);
                try {
                    Object startUndispatched = DurationKt.startUndispatched(undispatchedCoroutine, true, undispatchedCoroutine, function2);
                    ThreadContextKt.restoreThreadContext(coroutineContext2, updateThreadContext);
                    unboxState = startUndispatched;
                } catch (Throwable th) {
                    ThreadContextKt.restoreThreadContext(coroutineContext2, updateThreadContext);
                    throw th;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(continuation, plus);
                UnsignedKt.startCoroutineCancellable(function2, dispatchedCoroutine, dispatchedCoroutine);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = DispatchedCoroutine._decision$volatile$FU;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(dispatchedCoroutine);
                    if (i != 0) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("Already suspended");
                            return null;
                        }
                        unboxState = unboxState(dispatchedCoroutine.getState$kotlinx_coroutines_core());
                        if (unboxState instanceof CompletedExceptionally) {
                            throw ((CompletedExceptionally) unboxState).cause;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(dispatchedCoroutine, 0, 1)) {
                        unboxState = CoroutineSingletons.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return unboxState;
    }

    public static final Object withTimeout(long j, Function2 function2, ContinuationImpl continuationImpl) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object obj = setupTimeout(new TimeoutCoroutine(j, continuationImpl), function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return obj;
    }

    /* renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final Object m4184withTimeoutKLykuaI(long j, Function2 function2, ContinuationImpl continuationImpl) {
        return withTimeout(m4183toDelayMillisLRDsOJo(j), function2, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object withTimeoutOrNull(long j, Function2 function2, Continuation continuation) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            int i2 = timeoutKt$withTimeoutOrNull$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = timeoutKt$withTimeoutOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = timeoutKt$withTimeoutOrNull$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (j > 0) {
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        try {
                            timeoutKt$withTimeoutOrNull$1.L$1 = ref$ObjectRef2;
                            timeoutKt$withTimeoutOrNull$1.label = 1;
                            TimeoutCoroutine timeoutCoroutine = new TimeoutCoroutine(j, timeoutKt$withTimeoutOrNull$1);
                            ref$ObjectRef2.element = timeoutCoroutine;
                            Object obj2 = setupTimeout(timeoutCoroutine, function2);
                            return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            ref$ObjectRef = ref$ObjectRef2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = timeoutKt$withTimeoutOrNull$1.L$1;
                try {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                }
                if (e.coroutine != ref$ObjectRef.element) {
                    throw e;
                }
                return null;
            }
        }
        timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        Object obj3 = timeoutKt$withTimeoutOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = timeoutKt$withTimeoutOrNull$1.label;
        if (i != 0) {
        }
        if (e.coroutine != ref$ObjectRef.element) {
        }
        return null;
    }

    /* renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final Object m4185withTimeoutOrNullKLykuaI(long j, Function2 function2, ContinuationImpl continuationImpl) {
        return withTimeoutOrNull(m4183toDelayMillisLRDsOJo(j), function2, continuationImpl);
    }

    public static final Object yield(ContinuationImpl continuationImpl) {
        Object obj;
        CoroutineContext context = continuationImpl.getContext();
        ensureActive(context);
        Continuation intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl);
        DispatchedContinuation dispatchedContinuation = intercepted instanceof DispatchedContinuation ? (DispatchedContinuation) intercepted : null;
        if (dispatchedContinuation == null) {
            obj = Unit.INSTANCE;
        } else {
            CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
            if (InlineList.safeIsDispatchNeeded(coroutineDispatcher, context)) {
                dispatchedContinuation._state = Unit.INSTANCE;
                dispatchedContinuation.resumeMode = 1;
                coroutineDispatcher.dispatchYield(context, dispatchedContinuation);
            } else {
                YieldContext yieldContext = new YieldContext(YieldContext.Key);
                CoroutineContext plus = context.plus(yieldContext);
                Unit unit = Unit.INSTANCE;
                dispatchedContinuation._state = unit;
                dispatchedContinuation.resumeMode = 1;
                coroutineDispatcher.dispatchYield(plus, dispatchedContinuation);
                if (yieldContext.dispatcherWasUnconfined) {
                    EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
                    ArrayDeque arrayDeque = eventLoop$kotlinx_coroutines_core.unconfinedQueue;
                    if (!(arrayDeque != null ? arrayDeque.isEmpty() : true)) {
                        if (eventLoop$kotlinx_coroutines_core.useCount >= 4294967296L) {
                            dispatchedContinuation._state = unit;
                            dispatchedContinuation.resumeMode = 1;
                            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
                            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                        } else {
                            eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
                            try {
                                dispatchedContinuation.run();
                                do {
                                } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.INSTANCE;
                }
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
    }

    public static final boolean isActive(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.$$INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final void ensureActive(CoroutineScope coroutineScope) {
        ensureActive(coroutineScope.getCoroutineContext());
    }

    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.get(Job.Key.$$INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }
}
