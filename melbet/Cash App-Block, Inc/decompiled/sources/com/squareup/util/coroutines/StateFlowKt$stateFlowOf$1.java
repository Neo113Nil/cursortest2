package com.squareup.util.coroutines;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class StateFlowKt$stateFlowOf$1 implements StateFlow {
    public final /* synthetic */ Object $value;
    public final List replayCache;
    public final Object value;

    public StateFlowKt$stateFlowOf$1(Object obj) {
        this.$value = obj;
        this.replayCache = CollectionsKt__CollectionsJVMKt.listOf(obj);
        this.value = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        StateFlowKt$stateFlowOf$1$collect$1 stateFlowKt$stateFlowOf$1$collect$1;
        int i;
        if (continuation instanceof StateFlowKt$stateFlowOf$1$collect$1) {
            stateFlowKt$stateFlowOf$1$collect$1 = (StateFlowKt$stateFlowOf$1$collect$1) continuation;
            int i2 = stateFlowKt$stateFlowOf$1$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stateFlowKt$stateFlowOf$1$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stateFlowKt$stateFlowOf$1$collect$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stateFlowKt$stateFlowOf$1$collect$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    stateFlowKt$stateFlowOf$1$collect$1.label = 1;
                    if (flowCollector.emit(this.$value, stateFlowKt$stateFlowOf$1$collect$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                stateFlowKt$stateFlowOf$1$collect$1.label = 2;
                JobKt.awaitCancellation(stateFlowKt$stateFlowOf$1$collect$1);
                return obj2;
            }
        }
        stateFlowKt$stateFlowOf$1$collect$1 = new StateFlowKt$stateFlowOf$1$collect$1(this, continuation);
        Object obj3 = stateFlowKt$stateFlowOf$1$collect$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stateFlowKt$stateFlowOf$1$collect$1.label;
        if (i != 0) {
        }
        stateFlowKt$stateFlowOf$1$collect$1.label = 2;
        JobKt.awaitCancellation(stateFlowKt$stateFlowOf$1$collect$1);
        return obj22;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.replayCache;
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.value;
    }
}
