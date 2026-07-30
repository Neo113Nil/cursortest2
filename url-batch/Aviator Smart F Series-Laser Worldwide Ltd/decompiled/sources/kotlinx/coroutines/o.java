package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.l1;

/* loaded from: classes3.dex */
public class o extends r0 implements n, kotlin.coroutines.jvm.internal.c, l2 {
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    private final CoroutineContext context;
    private final kotlin.coroutines.c delegate;
    private static final AtomicIntegerFieldUpdater _decisionAndIndex$FU = AtomicIntegerFieldUpdater.newUpdater(o.class, "_decisionAndIndex");
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater _parentHandle$FU = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_parentHandle");

    public o(kotlin.coroutines.c cVar, int i8) {
        super(i8);
        this.delegate = cVar;
        this.context = cVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.INSTANCE;
    }

    private final Void alreadyResumedError(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void callCancelHandlerSafely(f6.a aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            h0.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void callSegmentOnCancellation(kotlinx.coroutines.internal.d0 d0Var, Throwable th) {
        int i8 = _decisionAndIndex$FU.get(this) & 536870911;
        if (i8 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            d0Var.onCancellation(i8, th, getContext());
        } catch (Throwable th2) {
            h0.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean cancelLater(Throwable th) {
        if (!isReusable()) {
            return false;
        }
        kotlin.coroutines.c cVar = this.delegate;
        kotlin.jvm.internal.s.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.k) cVar).postponeCancellation$kotlinx_coroutines_core(th);
    }

    private final void detachChildIfNonResuable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void dispatchResume(int i8) {
        if (tryResume()) {
            return;
        }
        s0.dispatch(this, i8);
    }

    private final u0 getParentHandle() {
        return (u0) _parentHandle$FU.get(this);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return state$kotlinx_coroutines_core instanceof y1 ? "Active" : state$kotlinx_coroutines_core instanceof r ? "Cancelled" : "Completed";
    }

    private final u0 installParentHandle() {
        l1 l1Var = (l1) getContext().get(l1.Key);
        if (l1Var == null) {
            return null;
        }
        u0 invokeOnCompletion$default = l1.a.invokeOnCompletion$default(l1Var, true, false, new s(this), 2, null);
        androidx.concurrent.futures.a.a(_parentHandle$FU, this, null, invokeOnCompletion$default);
        return invokeOnCompletion$default;
    }

    private final void invokeOnCancellationImpl(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.a.a(_state$FU, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof l) || (obj2 instanceof kotlinx.coroutines.internal.d0)) {
                multipleHandlersError(obj, obj2);
            } else {
                boolean z7 = obj2 instanceof b0;
                if (z7) {
                    b0 b0Var = (b0) obj2;
                    if (!b0Var.makeHandled()) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj2 instanceof r) {
                        if (!z7) {
                            b0Var = null;
                        }
                        Throwable th = b0Var != null ? b0Var.cause : null;
                        if (obj instanceof l) {
                            callCancelHandler((l) obj, th);
                            return;
                        } else {
                            kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            callSegmentOnCancellation((kotlinx.coroutines.internal.d0) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof a0) {
                    a0 a0Var = (a0) obj2;
                    if (a0Var.cancelHandler != null) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj instanceof kotlinx.coroutines.internal.d0) {
                        return;
                    }
                    kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    l lVar = (l) obj;
                    if (a0Var.getCancelled()) {
                        callCancelHandler(lVar, a0Var.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.a.a(_state$FU, this, obj2, a0.copy$default(a0Var, null, lVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof kotlinx.coroutines.internal.d0) {
                        return;
                    }
                    kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.a.a(_state$FU, this, obj2, new a0(obj2, (l) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean isReusable() {
        if (s0.isReusableMode(this.resumeMode)) {
            kotlin.coroutines.c cVar = this.delegate;
            kotlin.jvm.internal.s.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((kotlinx.coroutines.internal.k) cVar).isReusable$kotlinx_coroutines_core()) {
                return true;
            }
        }
        return false;
    }

    private final void loop$atomicfu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final l makeCancelHandler(f6.l lVar) {
        return lVar instanceof l ? (l) lVar : new i1(lVar);
    }

    private final void multipleHandlersError(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void resumeImpl(Object obj, int i8, f6.l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.makeResumed()) {
                        if (lVar != null) {
                            callOnCancellation(lVar, rVar.cause);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(obj);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.a.a(_state$FU, this, obj2, resumedState((y1) obj2, obj, i8, lVar, null)));
        detachChildIfNonResuable();
        dispatchResume(i8);
    }

    static /* synthetic */ void resumeImpl$default(o oVar, Object obj, int i8, f6.l lVar, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        oVar.resumeImpl(obj, i8, lVar);
    }

    private final Object resumedState(y1 y1Var, Object obj, int i8, f6.l lVar, Object obj2) {
        if (obj instanceof b0) {
            return obj;
        }
        if (!s0.isCancellableMode(i8) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(y1Var instanceof l) && obj2 == null) {
            return obj;
        }
        return new a0(obj, y1Var instanceof l ? (l) y1Var : null, lVar, obj2, null, 16, null);
    }

    private final boolean tryResume() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!_decisionAndIndex$FU.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    private final kotlinx.coroutines.internal.g0 tryResumeImpl(Object obj, Object obj2, f6.l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof y1)) {
                if ((obj3 instanceof a0) && obj2 != null && ((a0) obj3).idempotentResume == obj2) {
                    return p.RESUME_TOKEN;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.a.a(_state$FU, this, obj3, resumedState((y1) obj3, obj, this.resumeMode, lVar, obj2)));
        detachChildIfNonResuable();
        return p.RESUME_TOKEN;
    }

    private final boolean trySuspend() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!_decisionAndIndex$FU.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    private final void update$atomicfu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, f6.l lVar, Object obj) {
        int i8;
        do {
            i8 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i8, ((Number) lVar.invoke(Integer.valueOf(i8))).intValue()));
    }

    public final void callCancelHandler(l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void callOnCancellation(f6.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.n
    public boolean cancel(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y1)) {
                return false;
            }
        } while (!androidx.concurrent.futures.a.a(_state$FU, this, obj, new r(this, th, (obj instanceof l) || (obj instanceof kotlinx.coroutines.internal.d0))));
        y1 y1Var = (y1) obj;
        if (y1Var instanceof l) {
            callCancelHandler((l) obj, th);
        } else if (y1Var instanceof kotlinx.coroutines.internal.d0) {
            callSegmentOnCancellation((kotlinx.coroutines.internal.d0) obj, th);
        }
        detachChildIfNonResuable();
        dispatchResume(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.r0
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof b0) {
                return;
            }
            if (obj2 instanceof a0) {
                a0 a0Var = (a0) obj2;
                if (!(!a0Var.getCancelled())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.a.a(_state$FU, this, obj2, a0.copy$default(a0Var, null, null, null, null, th, 15, null))) {
                    a0Var.invokeHandlers(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.a.a(_state$FU, this, obj2, new a0(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.n
    public void completeResume(Object obj) {
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        u0 parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$FU.set(this, x1.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c cVar = this.delegate;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.n, kotlin.coroutines.c
    public CoroutineContext getContext() {
        return this.context;
    }

    public Throwable getContinuationCancellationCause(l1 l1Var) {
        return l1Var.getCancellationException();
    }

    @Override // kotlinx.coroutines.r0
    public final kotlin.coroutines.c getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.r0
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final Object getResult() {
        l1 l1Var;
        Object coroutine_suspended;
        boolean isReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (isReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        if (isReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof b0) {
            throw ((b0) state$kotlinx_coroutines_core).cause;
        }
        if (!s0.isCancellableMode(this.resumeMode) || (l1Var = (l1) getContext().get(l1.Key)) == null || l1Var.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = l1Var.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        throw cancellationException;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$FU.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.r0
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof a0 ? (T) ((a0) obj).result : obj;
    }

    @Override // kotlinx.coroutines.n
    public void initCancellability() {
        u0 installParentHandle = installParentHandle();
        if (installParentHandle != null && isCompleted()) {
            installParentHandle.dispose();
            _parentHandle$FU.set(this, x1.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.l2
    public void invokeOnCancellation(kotlinx.coroutines.internal.d0 d0Var, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        invokeOnCancellationImpl(d0Var);
    }

    @Override // kotlinx.coroutines.n
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof y1;
    }

    @Override // kotlinx.coroutines.n
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof r;
    }

    @Override // kotlinx.coroutines.n
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof y1);
    }

    protected String nameString() {
        return "CancellableContinuation";
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable th) {
        if (cancelLater(th)) {
            return;
        }
        cancel(th);
        detachChildIfNonResuable();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core;
        kotlin.coroutines.c cVar = this.delegate;
        kotlinx.coroutines.internal.k kVar = cVar instanceof kotlinx.coroutines.internal.k ? (kotlinx.coroutines.internal.k) cVar : null;
        if (kVar == null || (tryReleaseClaimedContinuation$kotlinx_coroutines_core = kVar.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(tryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final boolean resetStateReusable() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof a0) && ((a0) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$FU.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, d.INSTANCE);
        return true;
    }

    @Override // kotlinx.coroutines.n
    public void resume(Object obj, f6.l lVar) {
        resumeImpl(obj, this.resumeMode, lVar);
    }

    @Override // kotlinx.coroutines.n
    public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, Object obj) {
        kotlin.coroutines.c cVar = this.delegate;
        kotlinx.coroutines.internal.k kVar = cVar instanceof kotlinx.coroutines.internal.k ? (kotlinx.coroutines.internal.k) cVar : null;
        resumeImpl$default(this, obj, (kVar != null ? kVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.n
    public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th) {
        kotlin.coroutines.c cVar = this.delegate;
        kotlinx.coroutines.internal.k kVar = cVar instanceof kotlinx.coroutines.internal.k ? (kotlinx.coroutines.internal.k) cVar : null;
        resumeImpl$default(this, new b0(th, false, 2, null), (kVar != null ? kVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.n, kotlin.coroutines.c
    public void resumeWith(Object obj) {
        resumeImpl$default(this, e0.toState(obj, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.r0
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    public String toString() {
        return nameString() + '(' + k0.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + k0.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.n
    public Object tryResumeWithException(Throwable th) {
        return tryResumeImpl(new b0(th, false, 2, null), null, null);
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.n
    public void invokeOnCancellation(f6.l lVar) {
        invokeOnCancellationImpl(makeCancelHandler(lVar));
    }

    @Override // kotlinx.coroutines.n
    public Object tryResume(Object obj, Object obj2) {
        return tryResumeImpl(obj, obj2, null);
    }

    private final void callCancelHandler(f6.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.n
    public Object tryResume(Object obj, Object obj2, f6.l lVar) {
        return tryResumeImpl(obj, obj2, lVar);
    }
}
