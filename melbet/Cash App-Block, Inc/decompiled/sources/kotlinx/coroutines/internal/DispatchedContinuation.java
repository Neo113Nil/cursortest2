package kotlinx.coroutines.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.ThreadLocalEventLoop;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class DispatchedContinuation extends DispatchedTask implements CoroutineStackFrame, Continuation {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long _reusableCancellableContinuation$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(DispatchedContinuation.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final ContinuationImpl continuation;
    public final Object countOrElement;
    public final CoroutineDispatcher dispatcher;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, ContinuationImpl continuationImpl) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = continuationImpl;
        this._state = InlineList.UNDEFINED;
        this.countOrElement = ThreadContextKt.threadContextElements(continuationImpl.getContext());
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        do {
            _reusableCancellableContinuation$volatile$FU.getClass();
        } while (ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _reusableCancellableContinuation$volatile$FU$offset) == InlineList.REUSABLE_CLAIMED);
    }

    public final CancellableContinuationImpl claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        DispatchedContinuation dispatchedContinuation;
        String obj;
        Symbol symbol = InlineList.REUSABLE_CLAIMED;
        while (true) {
            _reusableCancellableContinuation$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _reusableCancellableContinuation$volatile$FU$offset;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, symbol);
                return null;
            }
            if (objectVolatile instanceof CancellableContinuationImpl) {
                while (true) {
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    DispatchedContinuation dispatchedContinuation2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(dispatchedContinuation2, _reusableCancellableContinuation$volatile$FU$offset, objectVolatile, symbol);
                    dispatchedContinuation = dispatchedContinuation2;
                    if (compareAndSwapObject) {
                        return (CancellableContinuationImpl) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(dispatchedContinuation, j) != objectVolatile) {
                        break;
                    }
                    this = dispatchedContinuation;
                }
            } else {
                dispatchedContinuation = this;
                if (objectVolatile != symbol && !(objectVolatile instanceof Throwable)) {
                    obj = ("Inconsistent state " + objectVolatile).toString();
                    a$$ExternalSyntheticBUOutline0.m$1(obj);
                    return null;
                }
            }
            this = dispatchedContinuation;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return this.continuation;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    public final CancellableContinuationImpl getReusableCancellableContinuation() {
        _reusableCancellableContinuation$volatile$FU.getClass();
        Object objectVolatile = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _reusableCancellableContinuation$volatile$FU$offset);
        if (objectVolatile instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) objectVolatile;
        }
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        _reusableCancellableContinuation$volatile$FU.getClass();
        return ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _reusableCancellableContinuation$volatile$FU$offset) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable th) {
        DispatchedContinuation dispatchedContinuation;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            _reusableCancellableContinuation$volatile$FU.getClass();
            Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _reusableCancellableContinuation$volatile$FU$offset;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            Symbol symbol = InlineList.REUSABLE_CLAIMED;
            if (Intrinsics.areEqual(objectVolatile, symbol)) {
                while (true) {
                    Unsafe unsafe3 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    DispatchedContinuation dispatchedContinuation2 = this;
                    th2 = th;
                    dispatchedContinuation = dispatchedContinuation2;
                    if (unsafe3.compareAndSwapObject(dispatchedContinuation2, _reusableCancellableContinuation$volatile$FU$offset, symbol, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(dispatchedContinuation, j) != symbol) {
                        break;
                    }
                    this = dispatchedContinuation;
                    th = th2;
                }
            } else {
                dispatchedContinuation = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    if (unsafe.compareAndSwapObject(dispatchedContinuation, _reusableCancellableContinuation$volatile$FU$offset, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(dispatchedContinuation, j) == objectVolatile);
            }
            this = dispatchedContinuation;
            th = th2;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        Object completedExceptionally = m4120exceptionOrNullimpl == null ? obj : new CompletedExceptionally(m4120exceptionOrNullimpl, false);
        ContinuationImpl continuationImpl = this.continuation;
        CoroutineContext context = continuationImpl.getContext();
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        if (InlineList.safeIsDispatchNeeded(coroutineDispatcher, context)) {
            this._state = completedExceptionally;
            this.resumeMode = 0;
            InlineList.safeDispatch(coroutineDispatcher, continuationImpl.getContext(), this);
            return;
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.useCount >= 4294967296L) {
            this._state = completedExceptionally;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            CoroutineContext context2 = continuationImpl.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context2, this.countOrElement);
            try {
                continuationImpl.resumeWith(obj);
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = InlineList.UNDEFINED;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + JobKt.toDebugString(this.continuation) + ']';
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(CancellableContinuationImpl cancellableContinuationImpl) {
        String obj;
        Unsafe unsafe;
        DispatchedContinuation dispatchedContinuation;
        CancellableContinuationImpl cancellableContinuationImpl2;
        while (true) {
            _reusableCancellableContinuation$volatile$FU.getClass();
            Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _reusableCancellableContinuation$volatile$FU$offset;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            Symbol symbol = InlineList.REUSABLE_CLAIMED;
            if (objectVolatile != symbol) {
                DispatchedContinuation dispatchedContinuation2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    obj = ("Inconsistent state " + objectVolatile).toString();
                    a$$ExternalSyntheticBUOutline0.m$1(obj);
                    return null;
                }
                do {
                    unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    if (unsafe.compareAndSwapObject(dispatchedContinuation2, _reusableCancellableContinuation$volatile$FU$offset, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(dispatchedContinuation2, j) == objectVolatile);
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                dispatchedContinuation = this;
                cancellableContinuationImpl2 = cancellableContinuationImpl;
                if (unsafe3.compareAndSwapObject(dispatchedContinuation, _reusableCancellableContinuation$volatile$FU$offset, symbol, cancellableContinuationImpl2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(dispatchedContinuation, j) != symbol) {
                    break;
                }
                this = dispatchedContinuation;
                cancellableContinuationImpl = cancellableContinuationImpl2;
            }
            this = dispatchedContinuation;
            cancellableContinuationImpl = cancellableContinuationImpl2;
        }
    }
}
