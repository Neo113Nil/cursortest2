package com.withpersona.sdk2.inquiry.launchers;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes9.dex */
public final class CustomTabsLauncherResult implements SharedFlow {
    public static final SharedFlowImpl flow = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);
    public final /* synthetic */ SharedFlowImpl $$delegate_0 = flow;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        this.$$delegate_0.collect(flowCollector, continuation);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }
}
