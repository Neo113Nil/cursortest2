package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.selects.SelectImplementation;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements f6.q {
    final /* synthetic */ e $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$timeoutInternal$1(long j8, e eVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.$timeout = j8;
        this.$this_timeoutInternal = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007d -> B:5:0x0084). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        long j8;
        f fVar;
        ReceiveChannel receiveChannel;
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1;
        Object doSelect;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            f fVar2 = (f) this.L$1;
            if (k6.a.m218compareToLRDsOJo(this.$timeout, k6.a.Companion.m322getZEROUwyO8pc()) <= 0) {
                throw new TimeoutCancellationException("Timed out immediately");
            }
            ReceiveChannel produceIn = g.produceIn(h.buffer$default(this.$this_timeoutInternal, 0, null, 2, null), i0Var);
            j8 = this.$timeout;
            fVar = fVar2;
            receiveChannel = produceIn;
            flowKt__DelayKt$timeoutInternal$1 = this;
            SelectImplementation selectImplementation = new SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
            selectImplementation.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$timeoutInternal$1$1$1(fVar, null));
            kotlinx.coroutines.selects.a.m1299onTimeout8Mi8wO0(selectImplementation, j8, new FlowKt__DelayKt$timeoutInternal$1$1$2(j8, null));
            flowKt__DelayKt$timeoutInternal$1.L$0 = fVar;
            flowKt__DelayKt$timeoutInternal$1.L$1 = receiveChannel;
            flowKt__DelayKt$timeoutInternal$1.J$0 = j8;
            flowKt__DelayKt$timeoutInternal$1.label = 1;
            doSelect = selectImplementation.doSelect(flowKt__DelayKt$timeoutInternal$1);
            if (doSelect != coroutine_suspended) {
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j9 = this.J$0;
            ReceiveChannel receiveChannel2 = (ReceiveChannel) this.L$1;
            f fVar3 = (f) this.L$0;
            y5.g.throwOnFailure(obj);
            f fVar4 = fVar3;
            long j10 = j9;
            ReceiveChannel receiveChannel3 = receiveChannel2;
            Object obj2 = coroutine_suspended;
            FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$12 = this;
            if (((Boolean) obj).booleanValue()) {
                return y5.w.INSTANCE;
            }
            flowKt__DelayKt$timeoutInternal$1 = flowKt__DelayKt$timeoutInternal$12;
            coroutine_suspended = obj2;
            receiveChannel = receiveChannel3;
            j8 = j10;
            fVar = fVar4;
            SelectImplementation selectImplementation2 = new SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
            selectImplementation2.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$timeoutInternal$1$1$1(fVar, null));
            kotlinx.coroutines.selects.a.m1299onTimeout8Mi8wO0(selectImplementation2, j8, new FlowKt__DelayKt$timeoutInternal$1$1$2(j8, null));
            flowKt__DelayKt$timeoutInternal$1.L$0 = fVar;
            flowKt__DelayKt$timeoutInternal$1.L$1 = receiveChannel;
            flowKt__DelayKt$timeoutInternal$1.J$0 = j8;
            flowKt__DelayKt$timeoutInternal$1.label = 1;
            doSelect = selectImplementation2.doSelect(flowKt__DelayKt$timeoutInternal$1);
            if (doSelect != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj3 = coroutine_suspended;
            flowKt__DelayKt$timeoutInternal$12 = flowKt__DelayKt$timeoutInternal$1;
            obj = doSelect;
            fVar4 = fVar;
            j10 = j8;
            receiveChannel3 = receiveChannel;
            obj2 = obj3;
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Override // f6.q
    public final Object invoke(i0 i0Var, f fVar, kotlin.coroutines.c cVar) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, cVar);
        flowKt__DelayKt$timeoutInternal$1.L$0 = i0Var;
        flowKt__DelayKt$timeoutInternal$1.L$1 = fVar;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(y5.w.INSTANCE);
    }
}
