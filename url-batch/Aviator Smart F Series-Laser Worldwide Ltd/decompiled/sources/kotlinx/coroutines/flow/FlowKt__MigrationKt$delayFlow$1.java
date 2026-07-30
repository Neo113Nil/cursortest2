package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__MigrationKt$delayFlow$1 extends SuspendLambda implements f6.p {
    final /* synthetic */ long $timeMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$delayFlow$1(long j8, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$timeMillis = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        return new FlowKt__MigrationKt$delayFlow$1(this.$timeMillis, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            long j8 = this.$timeMillis;
            this.label = 1;
            if (DelayKt.delay(j8, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(f fVar, kotlin.coroutines.c cVar) {
        return ((FlowKt__MigrationKt$delayFlow$1) create(fVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
