package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements f6.p {
    final /* synthetic */ f $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef<Object> ref$ObjectRef, f fVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            Object obj2 = ref$ObjectRef.element;
            if (obj2 == null) {
                return y5.w.INSTANCE;
            }
            ref$ObjectRef.element = null;
            f fVar = this.$downstream;
            if (obj2 == kotlinx.coroutines.flow.internal.l.NULL) {
                obj2 = null;
            }
            this.label = 1;
            if (fVar.emit(obj2, this) == coroutine_suspended) {
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
    public final Object invoke(y5.w wVar, kotlin.coroutines.c cVar) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(wVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
