package kotlin.coroutines.jvm.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(Continuation continuation) {
        super(continuation);
        if (continuation == null || continuation.getContext() == EmptyCoroutineContext.INSTANCE) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
