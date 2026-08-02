package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__LimitKt$drop$2$1 implements FlowCollector {
    public final /* synthetic */ int $count;
    public final /* synthetic */ Ref$IntRef $skipped;
    public final /* synthetic */ FlowCollector $this_flow;

    public FlowKt__LimitKt$drop$2$1(Ref$IntRef ref$IntRef, int i, FlowCollector flowCollector) {
        this.$skipped = ref$IntRef;
        this.$count = i;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$drop$2$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$drop$2$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Ref$IntRef ref$IntRef = this.$skipped;
                    int i3 = ref$IntRef.element;
                    if (i3 < this.$count) {
                        ref$IntRef.element = i3 + 1;
                        return Unit.INSTANCE;
                    }
                    flowKt__LimitKt$drop$2$1$emit$1.label = 1;
                    if (this.$this_flow.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$drop$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$drop$2$1$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
