package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 implements Flow {
    public final /* synthetic */ int $count$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_drop$inlined;

    public /* synthetic */ FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(Flow flow, int i, int i2) {
        this.$r8$classId = i2;
        this.$this_drop$inlined = flow;
        this.$count$inlined = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1$1;
        int i;
        Object obj;
        AbortFlowException e;
        int i2 = this.$r8$classId;
        int i3 = this.$count$inlined;
        Flow flow = this.$this_drop$inlined;
        switch (i2) {
            case 0:
                Object collect = flow.collect(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), i3, flowCollector), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            default:
                if (continuation instanceof FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) {
                    flowKt__LimitKt$take$$inlined$unsafeFlow$1$1 = (FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) continuation;
                    int i4 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            Object obj3 = new Object();
                            try {
                                FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new FlowKt__LimitKt$take$2$1(new Ref$IntRef(), i3, flowCollector, obj3);
                                flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$3 = obj3;
                                flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label = 1;
                                if (flow.collect(flowKt__LimitKt$take$2$1, flowKt__LimitKt$take$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } catch (AbortFlowException e2) {
                                obj = obj3;
                                e = e2;
                                if (e.owner != obj) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.L$3;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                            } catch (AbortFlowException e3) {
                                e = e3;
                                if (e.owner != obj) {
                                    throw e;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__LimitKt$take$$inlined$unsafeFlow$1$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj22 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
        }
    }
}
