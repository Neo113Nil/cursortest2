package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class CompletableDeferredImpl extends JobSupport implements CompletableDeferred {
    public CompletableDeferredImpl() {
        super(true);
        initParentJob(null);
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation) {
        Object awaitInternal = awaitInternal(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean completeExceptionally(Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(th, false));
    }
}
