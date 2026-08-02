package kotlinx.coroutines.flow.internal;

import androidx.compose.animation.core.MutatorMutex$mutate$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CombineKt$zipImpl$1$1$2$1 implements FlowCollector {
    public final /* synthetic */ Object $cnt;
    public final /* synthetic */ JobImpl $collectJob;
    public final /* synthetic */ CoroutineContext $scopeContext;
    public final /* synthetic */ ProducerCoroutine $second;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ Function3 $transform;

    public CombineKt$zipImpl$1$1$2$1(CoroutineContext coroutineContext, Object obj, ProducerCoroutine producerCoroutine, FlowCollector flowCollector, Function3 function3, JobImpl jobImpl) {
        this.$scopeContext = coroutineContext;
        this.$cnt = obj;
        this.$second = producerCoroutine;
        this.$this_unsafeFlow = flowCollector;
        this.$transform = function3;
        this.$collectJob = jobImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
        int i;
        if (continuation instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
            combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) continuation;
            int i2 = combineKt$zipImpl$1$1$2$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                combineKt$zipImpl$1$1$2$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = combineKt$zipImpl$1$1$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combineKt$zipImpl$1$1$2$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Unit unit = Unit.INSTANCE;
                    MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$second, this.$this_unsafeFlow, this.$transform, obj, this.$collectJob, (Continuation) null);
                    combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                    if (CombineKt.withContextUndispatched(this.$scopeContext, unit, this.$cnt, mutatorMutex$mutate$2, combineKt$zipImpl$1$1$2$1$emit$1) == coroutineSingletons) {
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
        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
        Object obj22 = combineKt$zipImpl$1$1$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combineKt$zipImpl$1$1$2$1$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
