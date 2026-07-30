package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements f6.p {
    int label;

    FlowKt__ErrorsKt$retry$1(kotlin.coroutines.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        return new FlowKt__ErrorsKt$retry$1(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y5.g.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.a.boxBoolean(true);
    }

    @Override // f6.p
    public final Object invoke(Throwable th, kotlin.coroutines.c cVar) {
        return ((FlowKt__ErrorsKt$retry$1) create(th, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
