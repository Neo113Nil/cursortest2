package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.selects.SelectImplementation;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {TypedValues.CycleType.TYPE_WAVE_PERIOD}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements f6.q {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ e $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2(long j8, e eVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.$periodMillis = j8;
        this.$this_sample = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ReceiveChannel fixedPeriodTicker$default;
        f fVar;
        ReceiveChannel receiveChannel;
        Ref$ObjectRef ref$ObjectRef;
        ReceiveChannel receiveChannel2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            f fVar2 = (f) this.L$1;
            ReceiveChannel produce$default = ProduceKt.produce$default(i0Var, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            fixedPeriodTicker$default = FlowKt__DelayKt.fixedPeriodTicker$default(i0Var, this.$periodMillis, 0L, 2, null);
            fVar = fVar2;
            receiveChannel = produce$default;
            ref$ObjectRef = ref$ObjectRef2;
            receiveChannel2 = fixedPeriodTicker$default;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            receiveChannel2 = (ReceiveChannel) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            fVar = (f) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        while (ref$ObjectRef.element != kotlinx.coroutines.flow.internal.l.DONE) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, receiveChannel2, null));
            selectImplementation.invoke(receiveChannel2.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, fVar, null));
            this.L$0 = fVar;
            this.L$1 = receiveChannel;
            this.L$2 = ref$ObjectRef;
            this.L$3 = receiveChannel2;
            this.label = 1;
            if (selectImplementation.doSelect(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.q
    public final Object invoke(i0 i0Var, f fVar, kotlin.coroutines.c cVar) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, cVar);
        flowKt__DelayKt$sample$2.L$0 = i0Var;
        flowKt__DelayKt$sample$2.L$1 = fVar;
        return flowKt__DelayKt$sample$2.invokeSuspend(y5.w.INSTANCE);
    }
}
