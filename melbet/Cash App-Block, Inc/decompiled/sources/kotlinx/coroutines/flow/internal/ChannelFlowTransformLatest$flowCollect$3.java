package kotlinx.coroutines.flow.internal;

import androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FlowCollector $collector;
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChannelFlowTransformLatest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = flowCollector;
        this.L$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FlowCollector flowCollector = this.$collector;
        ChannelFlowTransformLatest channelFlowTransformLatest = this.this$0;
        switch (i) {
            case 0:
                ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(channelFlowTransformLatest, flowCollector, continuation);
                channelFlowTransformLatest$flowCollect$3.L$0 = obj;
                return channelFlowTransformLatest$flowCollect$3;
            default:
                return new ChannelFlowTransformLatest$flowCollect$3(channelFlowTransformLatest, flowCollector, this.L$0, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ChannelFlowTransformLatest$flowCollect$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        FlowCollector flowCollector = this.$collector;
        ChannelFlowTransformLatest channelFlowTransformLatest = this.this$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    Flow flow = channelFlowTransformLatest.flow;
                    TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$2 = new TriggerBasedInvalidationTracker$createFlow$1$2(m, coroutineScope, channelFlowTransformLatest, flowCollector);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(triggerBasedInvalidationTracker$createFlow$1$2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function3 function3 = channelFlowTransformLatest.transform;
                    Object obj2 = this.L$0;
                    this.label = 1;
                    if (function3.invoke(flowCollector, obj2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = flowCollector;
    }
}
