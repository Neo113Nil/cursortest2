package com.stripe.android.uicore.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FlowToStateFlow implements StateFlow {
    public final Flow flow;
    public final Function0 produceValue;

    public FlowToStateFlow(Function0 function0, Flow flow) {
        this.flow = flow;
        this.produceValue = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FlowToStateFlow$collect$1 flowToStateFlow$collect$1;
        int i;
        Job job;
        if (continuation instanceof FlowToStateFlow$collect$1) {
            flowToStateFlow$collect$1 = (FlowToStateFlow$collect$1) continuation;
            int i2 = flowToStateFlow$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowToStateFlow$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flowToStateFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowToStateFlow$collect$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job2 = (Job) flowToStateFlow$collect$1.getContext().get(Job.Key.$$INSTANCE);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(this.flow);
                    flowToStateFlow$collect$1.L$1 = job2;
                    flowToStateFlow$collect$1.label = 1;
                    if (distinctUntilChanged.collect(flowCollector, flowToStateFlow$collect$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    job = job2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    job = flowToStateFlow$collect$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                while (true) {
                    if (job == null && !job.isActive()) {
                        throw job.getCancellationException();
                    }
                }
            }
        }
        flowToStateFlow$collect$1 = new FlowToStateFlow$collect$1(this, continuation);
        Object obj2 = flowToStateFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowToStateFlow$collect$1.label;
        if (i != 0) {
        }
        while (true) {
            if (job == null) {
            }
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return CollectionsKt__CollectionsJVMKt.listOf(this.produceValue.invoke());
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.produceValue.invoke();
    }
}
