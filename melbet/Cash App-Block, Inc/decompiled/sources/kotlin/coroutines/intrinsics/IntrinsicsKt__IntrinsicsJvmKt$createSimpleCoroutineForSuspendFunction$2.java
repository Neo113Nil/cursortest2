package kotlin.coroutines.intrinsics;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2 extends ContinuationImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation, coroutineContext);
        continuation.getClass();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SafeTrace.throwOnFailure(obj);
        return obj;
    }
}
