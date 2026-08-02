package com.squareup.util.coroutines;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DerivedStateFlow implements StateFlow {
    public final /* synthetic */ int $r8$classId = 1;
    public final Flow flow;
    public final Object getValue;

    public DerivedStateFlow(Pair[] pairArr, Object obj) {
        this.getValue = MapsKt__MapsKt.mapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        validateKey(obj);
        this.flow = FlowKt.MutableStateFlow(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r9.collect(r10, r0) == r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
    
        if (r9.collect(r10, r0) == r11) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        DerivedStateFlow$collect$1 derivedStateFlow$collect$1;
        int i;
        com.squareup.cash.clientsync.util.coroutines.DerivedStateFlow$collect$1 derivedStateFlow$collect$12;
        int i2;
        SwitchedStateFlow$collect$1 switchedStateFlow$collect$1;
        int i3;
        int i4 = this.$r8$classId;
        Flow flow = this.flow;
        Continuation continuation2 = null;
        switch (i4) {
            case 0:
                if (continuation instanceof DerivedStateFlow$collect$1) {
                    derivedStateFlow$collect$1 = (DerivedStateFlow$collect$1) continuation;
                    int i5 = derivedStateFlow$collect$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        derivedStateFlow$collect$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj = derivedStateFlow$collect$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = derivedStateFlow$collect$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(flow);
                            derivedStateFlow$collect$1.label = 1;
                            break;
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
                        derivedStateFlow$collect$1.label = 2;
                        JobKt.awaitCancellation(derivedStateFlow$collect$1);
                        return coroutineSingletons;
                    }
                }
                derivedStateFlow$collect$1 = new DerivedStateFlow$collect$1(this, continuation);
                Object obj2 = derivedStateFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = derivedStateFlow$collect$1.label;
                if (i != 0) {
                }
                derivedStateFlow$collect$1.label = 2;
                JobKt.awaitCancellation(derivedStateFlow$collect$1);
                return coroutineSingletons2;
            case 1:
                if (continuation instanceof com.squareup.cash.clientsync.util.coroutines.DerivedStateFlow$collect$1) {
                    derivedStateFlow$collect$12 = (com.squareup.cash.clientsync.util.coroutines.DerivedStateFlow$collect$1) continuation;
                    int i6 = derivedStateFlow$collect$12.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        derivedStateFlow$collect$12.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = derivedStateFlow$collect$12.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = derivedStateFlow$collect$12.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Flow distinctUntilChanged2 = FlowKt.distinctUntilChanged((StateFlowKt$mapState$$inlined$map$1) flow);
                            derivedStateFlow$collect$12.label = 1;
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(obj3);
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        derivedStateFlow$collect$12.label = 2;
                        JobKt.awaitCancellation(derivedStateFlow$collect$12);
                        return coroutineSingletons3;
                    }
                }
                derivedStateFlow$collect$12 = new com.squareup.cash.clientsync.util.coroutines.DerivedStateFlow$collect$1(this, continuation);
                Object obj32 = derivedStateFlow$collect$12.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = derivedStateFlow$collect$12.label;
                if (i2 != 0) {
                }
                derivedStateFlow$collect$12.label = 2;
                JobKt.awaitCancellation(derivedStateFlow$collect$12);
                return coroutineSingletons32;
            default:
                if (continuation instanceof SwitchedStateFlow$collect$1) {
                    switchedStateFlow$collect$1 = (SwitchedStateFlow$collect$1) continuation;
                    int i7 = switchedStateFlow$collect$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        switchedStateFlow$collect$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj4 = switchedStateFlow$collect$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = switchedStateFlow$collect$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest((StateFlowImpl) flow, new Badger$collect$$inlined$combine$2$3(continuation2, this, 11));
                            switchedStateFlow$collect$1.label = 1;
                            if (transformLatest.collect(flowCollector, switchedStateFlow$collect$1) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj4);
                        }
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return null;
                    }
                }
                switchedStateFlow$collect$1 = new SwitchedStateFlow$collect$1(this, continuation);
                Object obj42 = switchedStateFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = switchedStateFlow$collect$1.label;
                if (i3 != 0) {
                }
                Path$$ExternalSyntheticBUOutline0.m$2();
                return null;
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        int i = this.$r8$classId;
        Object obj = this.getValue;
        switch (i) {
            case 0:
                return CollectionsKt__CollectionsJVMKt.listOf(((Function0) obj).invoke());
            case 1:
                return CollectionsKt__CollectionsJVMKt.listOf(((StateFlowKt$$ExternalSyntheticLambda1) obj).invoke());
            default:
                return CollectionsKt__CollectionsJVMKt.listOf(getValue());
        }
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        int i = this.$r8$classId;
        Object obj = this.getValue;
        switch (i) {
            case 0:
                return ((Function0) obj).invoke();
            case 1:
                return ((StateFlowKt$$ExternalSyntheticLambda1) obj).invoke();
            default:
                Object obj2 = ((Map) obj).get(((StateFlowImpl) this.flow).getValue());
                obj2.getClass();
                return ((StateFlow) obj2).getValue();
        }
    }

    public void validateKey(Object obj) {
        Map map = (Map) this.getValue;
        if (map.containsKey(obj)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m(obj, "' is not a valid key. Available keys are: ", map.keySet(), ".", "'");
    }

    public DerivedStateFlow(Function0 function0, Flow flow) {
        flow.getClass();
        this.getValue = function0;
        this.flow = flow;
    }

    public DerivedStateFlow(StateFlowKt$$ExternalSyntheticLambda1 stateFlowKt$$ExternalSyntheticLambda1, StateFlowKt$mapState$$inlined$map$1 stateFlowKt$mapState$$inlined$map$1) {
        this.getValue = stateFlowKt$$ExternalSyntheticLambda1;
        this.flow = stateFlowKt$mapState$$inlined$map$1;
    }
}
