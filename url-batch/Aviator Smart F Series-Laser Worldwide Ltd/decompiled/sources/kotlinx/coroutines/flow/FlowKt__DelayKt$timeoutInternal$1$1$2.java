package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements f6.l {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$timeoutInternal$1$1$2(long j8, kotlin.coroutines.c cVar) {
        super(1, cVar);
        this.$timeout = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(kotlin.coroutines.c cVar) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y5.g.throwOnFailure(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) k6.a.m268toStringimpl(this.$timeout)));
    }

    @Override // f6.l
    public final Object invoke(kotlin.coroutines.c cVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
