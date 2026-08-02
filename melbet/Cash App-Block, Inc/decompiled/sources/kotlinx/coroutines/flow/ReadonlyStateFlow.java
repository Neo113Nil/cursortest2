package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* loaded from: classes3.dex */
public final class ReadonlyStateFlow implements StateFlow, Flow, FusibleFlow {
    public final /* synthetic */ StateFlow $$delegate_0;
    private final Job job;

    public ReadonlyStateFlow(MutableStateFlow mutableStateFlow, StandaloneCoroutine standaloneCoroutine) {
        this.$$delegate_0 = mutableStateFlow;
        this.job = standaloneCoroutine;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.$$delegate_0.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? FlowKt.fuseSharedFlow(this, coroutineContext, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.$$delegate_0.getValue();
    }
}
