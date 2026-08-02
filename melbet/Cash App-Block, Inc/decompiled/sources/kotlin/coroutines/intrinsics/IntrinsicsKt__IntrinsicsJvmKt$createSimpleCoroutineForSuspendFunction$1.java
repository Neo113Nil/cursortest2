package kotlin.coroutines.intrinsics;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 extends RestrictedContinuationImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(Continuation continuation) {
        super(continuation);
        continuation.getClass();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SafeTrace.throwOnFailure(obj);
        return obj;
    }
}
