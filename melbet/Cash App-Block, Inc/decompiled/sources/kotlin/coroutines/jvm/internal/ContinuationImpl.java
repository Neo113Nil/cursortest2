package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient Continuation<Object> intercepted;

    public ContinuationImpl(Continuation continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null) {
            return continuation;
        }
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) getContext().get(ContinuationInterceptor.Key);
        Continuation<Object> dispatchedContinuation = continuationInterceptor != null ? new DispatchedContinuation((CoroutineDispatcher) continuationInterceptor, this) : this;
        this.intercepted = dispatchedContinuation;
        return dispatchedContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element element = getContext().get(ContinuationInterceptor.Key);
            element.getClass();
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            dispatchedContinuation.awaitReusability$kotlinx_coroutines_core();
            CancellableContinuationImpl reusableCancellableContinuation = dispatchedContinuation.getReusableCancellableContinuation();
            if (reusableCancellableContinuation != null) {
                reusableCancellableContinuation.detachChild$kotlinx_coroutines_core();
            }
        }
        this.intercepted = CompletedContinuation.INSTANCE;
    }

    public ContinuationImpl(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }
}
