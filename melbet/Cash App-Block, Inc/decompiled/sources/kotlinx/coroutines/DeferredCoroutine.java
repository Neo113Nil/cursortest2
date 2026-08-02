package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public class DeferredCoroutine extends AbstractCoroutine implements Deferred {
    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation) {
        Object awaitInternal = awaitInternal(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return awaitInternal;
    }
}
