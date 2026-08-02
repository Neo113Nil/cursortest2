package kotlinx.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public class CancellableContinuationImpl extends DispatchedTask implements CancellableContinuation, CoroutineStackFrame, Waiter {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU;
    public static final /* synthetic */ long _parentHandle$volatile$FU$offset;
    public static final /* synthetic */ long _state$volatile$FU$offset;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final CoroutineContext context;
    public final Continuation delegate;
    public static final /* synthetic */ AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");

    static {
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        _state$volatile$FU$offset = unsafe.objectFieldOffset(CancellableContinuationImpl.class.getDeclaredField("_state$volatile"));
        _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");
        _parentHandle$volatile$FU$offset = unsafe.objectFieldOffset(CancellableContinuationImpl.class.getDeclaredField("_parentHandle$volatile"));
    }

    public CancellableContinuationImpl(int i, Continuation continuation) {
        super(i);
        this.delegate = continuation;
        this.context = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.INSTANCE;
    }

    public static void multipleHandlersError(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object resumedState(NotCompleted notCompleted, Object obj, int i, Function3 function3) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (function3 != null || (notCompleted instanceof CancelHandler)) {
            return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function3, (Throwable) null, 16);
        }
        return obj;
    }

    public final void callCancelHandler(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.invoke(th);
        } catch (Throwable th2) {
            JobKt.handleCoroutineException(this.context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void callOnCancellation(Function3 function3, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.context;
        try {
            function3.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            JobKt.handleCoroutineException(coroutineContext, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void callSegmentOnCancellation(Segment segment, Throwable th) {
        CoroutineContext coroutineContext = this.context;
        int i = _decisionAndIndex$volatile$FU.get(this) & 536870911;
        if (i == 536870911) {
            a$$ExternalSyntheticBUOutline0.m$1("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            segment.onCancellation(i, coroutineContext);
        } catch (Throwable th2) {
            JobKt.handleCoroutineException(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean cancel(Throwable th) {
        Throwable th2;
        CancellableContinuationImpl cancellableContinuationImpl;
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof NotCompleted)) {
                return false;
            }
            boolean z = (objectVolatile instanceof CancelHandler) || (objectVolatile instanceof Segment);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(th2, z);
            while (true) {
                Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                cancellableContinuationImpl = this;
                if (unsafe2.compareAndSwapObject(cancellableContinuationImpl, _state$volatile$FU$offset, objectVolatile, cancelledContinuation)) {
                    NotCompleted notCompleted = (NotCompleted) objectVolatile;
                    if (notCompleted instanceof CancelHandler) {
                        cancellableContinuationImpl.callCancelHandler((CancelHandler) objectVolatile, th);
                    } else if (notCompleted instanceof Segment) {
                        cancellableContinuationImpl.callSegmentOnCancellation((Segment) objectVolatile, th);
                    }
                    if (!cancellableContinuationImpl.isReusable()) {
                        cancellableContinuationImpl.detachChild$kotlinx_coroutines_core();
                    }
                    cancellableContinuationImpl.dispatchResume(cancellableContinuationImpl.resumeMode);
                    return true;
                }
                if (unsafe2.getObjectVolatile(cancellableContinuationImpl, j) != objectVolatile) {
                    break;
                }
                this = cancellableContinuationImpl;
            }
            this = cancellableContinuationImpl;
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final void cancelCompletedResult$kotlinx_coroutines_core(CancellationException cancellationException) {
        CancellationException cancellationException2;
        CancellableContinuationImpl cancellableContinuationImpl;
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof NotCompleted) {
                a$$ExternalSyntheticBUOutline0.m$1("Not completed");
                return;
            }
            if (objectVolatile instanceof CompletedExceptionally) {
                return;
            }
            if (objectVolatile instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) objectVolatile;
                if (completedContinuation.cancelCause != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Must be called at most once");
                    return;
                }
                CompletedContinuation copy$default = CompletedContinuation.copy$default(completedContinuation, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    CancellableContinuationImpl cancellableContinuationImpl2 = this;
                    if (unsafe2.compareAndSwapObject(cancellableContinuationImpl2, _state$volatile$FU$offset, objectVolatile, copy$default)) {
                        CancelHandler cancelHandler = completedContinuation.cancelHandler;
                        if (cancelHandler != null) {
                            cancellableContinuationImpl2.callCancelHandler(cancelHandler, cancellationException);
                        }
                        Function3 function3 = completedContinuation.onCancellation;
                        if (function3 != null) {
                            cancellableContinuationImpl2.callOnCancellation(function3, cancellationException, completedContinuation.result);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(cancellableContinuationImpl2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                        break;
                    }
                    this = cancellableContinuationImpl2;
                }
            } else {
                CancellableContinuationImpl cancellableContinuationImpl3 = this;
                CancellationException cancellationException3 = cancellationException;
                CompletedContinuation completedContinuation2 = new CompletedContinuation(objectVolatile, (CancelHandler) null, (Function3) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    CompletedContinuation completedContinuation3 = completedContinuation2;
                    Unsafe unsafe3 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    cancellableContinuationImpl = cancellableContinuationImpl3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(cancellableContinuationImpl, _state$volatile$FU$offset, objectVolatile, completedContinuation3);
                    completedContinuation2 = completedContinuation3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(cancellableContinuationImpl, j) != objectVolatile) {
                        break;
                    } else {
                        cancellableContinuationImpl3 = cancellableContinuationImpl;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = cancellableContinuationImpl;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void completeResume(Object obj) {
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$volatile$FU.getClass();
        ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, _parentHandle$volatile$FU$offset, NonDisposableHandle.INSTANCE);
    }

    public final void dispatchResume(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("Already resumed");
                    return;
                }
                boolean z = i == 4;
                Continuation continuation = this.delegate;
                if (!z && (continuation instanceof DispatchedContinuation)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.resumeMode;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
                        CoroutineContext context = dispatchedContinuation.continuation.getContext();
                        if (InlineList.safeIsDispatchNeeded(coroutineDispatcher, context)) {
                            InlineList.safeDispatch(coroutineDispatcher, context, this);
                            return;
                        }
                        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
                        if (eventLoop$kotlinx_coroutines_core.useCount >= 4294967296L) {
                            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
                            return;
                        }
                        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
                        try {
                            JobKt.resume(this, continuation, true);
                            do {
                            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                JobKt.resume(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.context;
    }

    public Throwable getContinuationCancellationCause(JobSupport jobSupport) {
        return jobSupport.getCancellationException();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final DisposableHandle getParentHandle() {
        _parentHandle$volatile$FU.getClass();
        return (DisposableHandle) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _parentHandle$volatile$FU$offset);
    }

    public final Object getResult() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        Job job;
        boolean isReusable = isReusable();
        do {
            atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Already suspended");
                    return null;
                }
                if (isReusable) {
                    releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                }
                Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
                if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                }
                int i3 = this.resumeMode;
                if ((i3 != 1 && i3 != 2) || (job = (Job) this.context.get(Job.Key.$$INSTANCE)) == null || job.isActive()) {
                    return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
                }
                CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, PKIFailureInfo.duplicateCertReq + (536870911 & i)));
        if (getParentHandle() == null) {
            installParentHandle();
        }
        if (isReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final Object getState$kotlinx_coroutines_core() {
        _state$volatile$FU.getClass();
        return ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _state$volatile$FU$offset);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof CompletedContinuation ? ((CompletedContinuation) obj).result : obj;
    }

    public final void initCancellability() {
        DisposableHandle installParentHandle = installParentHandle();
        if (installParentHandle != null && isCompleted()) {
            installParentHandle.dispose();
            _parentHandle$volatile$FU.getClass();
            ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, _parentHandle$volatile$FU$offset, NonDisposableHandle.INSTANCE);
        }
    }

    public final DisposableHandle installParentHandle() {
        Job job = (Job) this.context.get(Job.Key.$$INSTANCE);
        if (job == null) {
            return null;
        }
        DisposableHandle invokeOnCompletion$default = JobKt.invokeOnCompletion$default(job, new ChildContinuation(this));
        while (true) {
            _parentHandle$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _parentHandle$volatile$FU$offset;
            CancellableContinuationImpl cancellableContinuationImpl = this;
            if (!unsafe.compareAndSwapObject(cancellableContinuationImpl, j, (Object) null, invokeOnCompletion$default) && unsafe.getObjectVolatile(cancellableContinuationImpl, j) == null) {
                this = cancellableContinuationImpl;
            }
        }
        return invokeOnCompletion$default;
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                a$$ExternalSyntheticBUOutline0.m$1("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        invokeOnCancellationImpl(segment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        multipleHandlersError(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invokeOnCancellationImpl(NotCompleted notCompleted) {
        CancellableContinuationImpl cancellableContinuationImpl;
        Unsafe unsafe;
        CancellableContinuationImpl cancellableContinuationImpl2;
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof Active) {
                while (true) {
                    Unsafe unsafe3 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    cancellableContinuationImpl = this;
                    if (unsafe3.compareAndSwapObject(cancellableContinuationImpl, _state$volatile$FU$offset, objectVolatile, notCompleted)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(cancellableContinuationImpl, j) != objectVolatile) {
                        break;
                    } else {
                        this = cancellableContinuationImpl;
                    }
                }
            } else {
                cancellableContinuationImpl = this;
                if ((objectVolatile instanceof CancelHandler) || (objectVolatile instanceof Segment)) {
                    break;
                }
                if (objectVolatile instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) objectVolatile;
                    if (!CompletedExceptionally._handled$volatile$FU.compareAndSet(completedExceptionally, 0, 1)) {
                        multipleHandlersError(notCompleted, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof CancelledContinuation) {
                        Throwable th = completedExceptionally.cause;
                        if (notCompleted instanceof CancelHandler) {
                            cancellableContinuationImpl.callCancelHandler((CancelHandler) notCompleted, th);
                            return;
                        } else {
                            notCompleted.getClass();
                            cancellableContinuationImpl.callSegmentOnCancellation((Segment) notCompleted, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) objectVolatile;
                    if (completedContinuation.cancelHandler != null) {
                        multipleHandlersError(notCompleted, objectVolatile);
                        throw null;
                    }
                    if (notCompleted instanceof Segment) {
                        return;
                    }
                    notCompleted.getClass();
                    CancelHandler cancelHandler = (CancelHandler) notCompleted;
                    Throwable th2 = completedContinuation.cancelCause;
                    if (th2 != null) {
                        cancellableContinuationImpl.callCancelHandler(cancelHandler, th2);
                        return;
                    }
                    CompletedContinuation copy$default = CompletedContinuation.copy$default(completedContinuation, cancelHandler, null, 29);
                    do {
                        unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        cancellableContinuationImpl2 = cancellableContinuationImpl;
                        if (unsafe.compareAndSwapObject(cancellableContinuationImpl, _state$volatile$FU$offset, objectVolatile, copy$default)) {
                            return;
                        } else {
                            cancellableContinuationImpl = cancellableContinuationImpl2;
                        }
                    } while (unsafe.getObjectVolatile(cancellableContinuationImpl2, j) == objectVolatile);
                } else {
                    CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl;
                    if (notCompleted instanceof Segment) {
                        return;
                    }
                    notCompleted.getClass();
                    CompletedContinuation completedContinuation2 = new CompletedContinuation(objectVolatile, (CancelHandler) notCompleted, (Function3) null, (Throwable) null, 28);
                    while (true) {
                        CompletedContinuation completedContinuation3 = completedContinuation2;
                        Unsafe unsafe4 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        cancellableContinuationImpl = cancellableContinuationImpl3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(cancellableContinuationImpl, _state$volatile$FU$offset, objectVolatile, completedContinuation3);
                        completedContinuation2 = completedContinuation3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(cancellableContinuationImpl, j) != objectVolatile) {
                            break;
                        } else {
                            cancellableContinuationImpl3 = cancellableContinuationImpl;
                        }
                    }
                }
            }
            this = cancellableContinuationImpl;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    public final boolean isReusable() {
        if (this.resumeMode != 2) {
            return false;
        }
        Continuation continuation = this.delegate;
        continuation.getClass();
        return ((DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core();
    }

    public String nameString() {
        return "CancellableContinuation";
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (tryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(tryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final boolean resetStateReusable() {
        _state$volatile$FU.getClass();
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        long j = _state$volatile$FU$offset;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof CompletedContinuation) && ((CompletedContinuation) objectVolatile).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$volatile$FU.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, Active.INSTANCE);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resume(Object obj, Function3 function3) {
        resumeImpl$kotlinx_coroutines_core(obj, this.resumeMode, function3);
    }

    public final void resumeImpl$kotlinx_coroutines_core(Object obj, int i, Function3 function3) {
        String obj2;
        CancellableContinuationImpl cancellableContinuationImpl;
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof NotCompleted)) {
                CancellableContinuationImpl cancellableContinuationImpl2 = this;
                if (objectVolatile instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) objectVolatile;
                    if (CancelledContinuation._resumed$volatile$FU.compareAndSet(cancelledContinuation, 0, 1)) {
                        if (function3 != null) {
                            cancellableContinuationImpl2.callOnCancellation(function3, cancelledContinuation.cause, obj);
                            return;
                        }
                        return;
                    }
                }
                obj2 = ("Already resumed, but proposed with update " + obj).toString();
                a$$ExternalSyntheticBUOutline0.m$1(obj2);
                return;
            }
            Object resumedState = resumedState((NotCompleted) objectVolatile, obj, i, function3);
            while (true) {
                Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                cancellableContinuationImpl = this;
                if (unsafe2.compareAndSwapObject(cancellableContinuationImpl, _state$volatile$FU$offset, objectVolatile, resumedState)) {
                    if (!cancellableContinuationImpl.isReusable()) {
                        cancellableContinuationImpl.detachChild$kotlinx_coroutines_core();
                    }
                    cancellableContinuationImpl.dispatchResume(i);
                    return;
                } else if (unsafe2.getObjectVolatile(cancellableContinuationImpl, j) != objectVolatile) {
                    break;
                } else {
                    this = cancellableContinuationImpl;
                }
            }
            this = cancellableContinuationImpl;
        }
    }

    public final void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Object obj) {
        Continuation continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core(obj, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(m4120exceptionOrNullimpl, false);
        }
        resumeImpl$kotlinx_coroutines_core(obj, this.resumeMode, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nameString());
        sb.append('(');
        sb.append(JobKt.toDebugString(this.delegate));
        sb.append("){");
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        sb.append(state$kotlinx_coroutines_core instanceof NotCompleted ? "Active" : state$kotlinx_coroutines_core instanceof CancelledContinuation ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(JobKt.getHexAddress(this));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Symbol tryResume(Object obj, Function3 function3) {
        return tryResumeImpl(obj, function3);
    }

    public final Symbol tryResumeImpl(Object obj, Function3 function3) {
        CancellableContinuationImpl cancellableContinuationImpl;
        Symbol symbol = JobKt.RESUME_TOKEN;
        while (true) {
            _state$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _state$volatile$FU$offset;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof NotCompleted)) {
                return null;
            }
            Object resumedState = resumedState((NotCompleted) objectVolatile, obj, this.resumeMode, function3);
            while (true) {
                Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                cancellableContinuationImpl = this;
                if (unsafe2.compareAndSwapObject(cancellableContinuationImpl, _state$volatile$FU$offset, objectVolatile, resumedState)) {
                    if (!cancellableContinuationImpl.isReusable()) {
                        cancellableContinuationImpl.detachChild$kotlinx_coroutines_core();
                    }
                    return symbol;
                }
                if (unsafe2.getObjectVolatile(cancellableContinuationImpl, j) != objectVolatile) {
                    break;
                }
                this = cancellableContinuationImpl;
            }
            this = cancellableContinuationImpl;
        }
    }

    public final void invokeOnCancellation(Function1 function1) {
        invokeOnCancellationImpl(new DisposeOnCancel(function1, 1));
    }
}
