package kotlinx.coroutines.flow.internal;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;

/* loaded from: classes3.dex */
public abstract class ChannelFlowOperator extends ChannelFlow {
    public final Flow flow;

    public ChannelFlowOperator(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = flow;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        if (this.capacity == -3) {
            CoroutineContext context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            SaversKt$$ExternalSyntheticLambda5 saversKt$$ExternalSyntheticLambda5 = new SaversKt$$ExternalSyntheticLambda5(11);
            CoroutineContext coroutineContext = this.context;
            CoroutineContext plus = !((Boolean) coroutineContext.fold(bool, saversKt$$ExternalSyntheticLambda5)).booleanValue() ? context.plus(coroutineContext) : CoroutineContextKt.foldCopies(context, coroutineContext, false);
            if (Intrinsics.areEqual(plus, context)) {
                Object flowCollect = flowCollect(flowCollector, continuation);
                return flowCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? flowCollect : Unit.INSTANCE;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(plus.get(key), context.get(key))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(flowCollector instanceof SendingCollector) && !(flowCollector instanceof NopCollector)) {
                    flowCollector = new BufferCountKt$bufferSkip$1.AnonymousClass1(flowCollector, context2);
                }
                Object withContextUndispatched = CombineKt.withContextUndispatched(plus, flowCollector, ThreadContextKt.threadContextElements(plus), new RxConvertKt$asFlow$1(this, null, 8), continuation);
                return withContextUndispatched == CoroutineSingletons.COROUTINE_SUSPENDED ? withContextUndispatched : Unit.INSTANCE;
            }
        }
        Object collect = super.collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(ProducerScope producerScope, Continuation continuation) {
        Object flowCollect = flowCollect(new SendingCollector(producerScope), continuation);
        return flowCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? flowCollect : Unit.INSTANCE;
    }

    public abstract Object flowCollect(FlowCollector flowCollector, Continuation continuation);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String toString() {
        return this.flow + " -> " + super.toString();
    }
}
