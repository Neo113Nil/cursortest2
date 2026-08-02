package kotlinx.coroutines.flow.internal;

import com.squareup.preferences.PreferenceFlow$flow$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.coroutines.sync.SemaphoreKt;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class ChannelFlowMerge extends ChannelFlow {
    public final int concurrency;
    public final Flow flow;

    public ChannelFlowMerge(int i, int i2, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        super(coroutineContext, i2, bufferOverflow);
        this.flow = flow;
        this.concurrency = i;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String additionalToStringProps() {
        return "concurrency=" + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(ProducerScope producerScope, Continuation continuation) {
        int i = SemaphoreKt.MAX_SPIN_CYCLES;
        Object collect = this.flow.collect(new ChannelFlowMerge$collectTo$2((Job) continuation.getContext().get(Job.Key.$$INSTANCE), new SemaphoreImpl(this.concurrency), producerScope, new SendingCollector(producerScope), 0), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.concurrency, i, coroutineContext, bufferOverflow, this.flow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ReceiveChannel produceImpl(CoroutineScope coroutineScope) {
        Function2 preferenceFlow$flow$1 = new PreferenceFlow$flow$1(this, (Continuation) null, 22);
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(this.context, coroutineScope), PapaEvent.Channel$default(this.capacity, bufferOverflow, null, 4));
        producerCoroutine.start(coroutineStart, producerCoroutine, preferenceFlow$flow$1);
        return producerCoroutine;
    }
}
