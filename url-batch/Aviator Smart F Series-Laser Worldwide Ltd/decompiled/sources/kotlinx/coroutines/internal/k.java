package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.h2;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.y0;

/* loaded from: classes5.dex */
public final class k extends r0 implements kotlin.coroutines.jvm.internal.c, kotlin.coroutines.c {
    private static final AtomicReferenceFieldUpdater _reusableCancellableContinuation$FU = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public Object _state;
    public final kotlin.coroutines.c continuation;
    public final Object countOrElement;
    public final CoroutineDispatcher dispatcher;

    public k(CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.c cVar) {
        super(-1);
        g0 g0Var;
        this.dispatcher = coroutineDispatcher;
        this.continuation = cVar;
        g0Var = l.UNDEFINED;
        this._state = g0Var;
        this.countOrElement = ThreadContextKt.threadContextElements(getContext());
    }

    private final kotlinx.coroutines.o getReusableCancellableContinuation() {
        Object obj = _reusableCancellableContinuation$FU.get(this);
        if (obj instanceof kotlinx.coroutines.o) {
            return (kotlinx.coroutines.o) obj;
        }
        return null;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (_reusableCancellableContinuation$FU.get(this) == l.REUSABLE_CLAIMED) {
        }
    }

    @Override // kotlinx.coroutines.r0
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        if (obj instanceof kotlinx.coroutines.c0) {
            ((kotlinx.coroutines.c0) obj).onCancellation.invoke(th);
        }
    }

    public final kotlinx.coroutines.o claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$FU.set(this, l.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.o) {
                if (androidx.concurrent.futures.a.a(_reusableCancellableContinuation$FU, this, obj, l.REUSABLE_CLAIMED)) {
                    return (kotlinx.coroutines.o) obj;
                }
            } else if (obj != l.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(CoroutineContext coroutineContext, Object obj) {
        this._state = obj;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(coroutineContext, this);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c cVar = this.continuation;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlinx.coroutines.r0
    public kotlin.coroutines.c getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$FU.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g0 g0Var = l.REUSABLE_CLAIMED;
            if (kotlin.jvm.internal.s.areEqual(obj, g0Var)) {
                if (androidx.concurrent.futures.a.a(_reusableCancellableContinuation$FU, this, g0Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(_reusableCancellableContinuation$FU, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        kotlinx.coroutines.o reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.detachChild$kotlinx_coroutines_core();
        }
    }

    public final void resumeCancellableWith$kotlinx_coroutines_core(Object obj, f6.l lVar) {
        Object state = kotlinx.coroutines.e0.toState(obj, lVar);
        if (this.dispatcher.isDispatchNeeded(getContext())) {
            this._state = state;
            this.resumeMode = 1;
            this.dispatcher.mo1293dispatch(getContext(), this);
            return;
        }
        y0 eventLoop$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            l1 l1Var = (l1) getContext().get(l1.Key);
            if (l1Var == null || l1Var.isActive()) {
                kotlin.coroutines.c cVar = this.continuation;
                Object obj2 = this.countOrElement;
                CoroutineContext context = cVar.getContext();
                Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
                j2 updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(cVar, context, updateThreadContext) : null;
                try {
                    this.continuation.resumeWith(obj);
                    y5.w wVar = y5.w.INSTANCE;
                } finally {
                    kotlin.jvm.internal.r.finallyStart(1);
                    if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                    }
                    kotlin.jvm.internal.r.finallyEnd(1);
                }
            } else {
                CancellationException cancellationException = l1Var.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                Result.a aVar = Result.Companion;
                resumeWith(Result.m348constructorimpl(y5.g.createFailure(cancellationException)));
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
            kotlin.jvm.internal.r.finallyStart(1);
        } catch (Throwable th) {
            try {
                handleFatalException$kotlinx_coroutines_core(th, null);
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
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object obj) {
        l1 l1Var = (l1) getContext().get(l1.Key);
        if (l1Var == null || l1Var.isActive()) {
            return false;
        }
        CancellationException cancellationException = l1Var.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
        Result.a aVar = Result.Companion;
        resumeWith(Result.m348constructorimpl(y5.g.createFailure(cancellationException)));
        return true;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(Object obj) {
        kotlin.coroutines.c cVar = this.continuation;
        Object obj2 = this.countOrElement;
        CoroutineContext context = cVar.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
        j2 updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(cVar, context, updateThreadContext) : null;
        try {
            this.continuation.resumeWith(obj);
            y5.w wVar = y5.w.INSTANCE;
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(Object obj) {
        CoroutineContext context = this.continuation.getContext();
        Object state$default = kotlinx.coroutines.e0.toState$default(obj, null, 1, null);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = state$default;
            this.resumeMode = 0;
            this.dispatcher.mo1293dispatch(context, this);
            return;
        }
        y0 eventLoop$kotlinx_coroutines_core = h2.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state$default;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            CoroutineContext context2 = getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(obj);
                y5.w wVar = y5.w.INSTANCE;
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

    @Override // kotlinx.coroutines.r0
    public Object takeState$kotlinx_coroutines_core() {
        g0 g0Var;
        Object obj = this._state;
        g0Var = l.UNDEFINED;
        this._state = g0Var;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + kotlinx.coroutines.k0.toDebugString(this.continuation) + ']';
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(kotlinx.coroutines.n nVar) {
        g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g0Var = l.REUSABLE_CLAIMED;
            if (obj != g0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(_reusableCancellableContinuation$FU, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(_reusableCancellableContinuation$FU, this, g0Var, nVar));
        return null;
    }
}
