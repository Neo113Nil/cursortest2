package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;

/* loaded from: classes3.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 implements Flow {
    public final /* synthetic */ Flow $flow$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_combine$inlined;
    public final /* synthetic */ Function3 $transform$inlined;

    public /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(Flow flow, Flow flow2, Function3 function3, int i) {
        this.$r8$classId = i;
        this.$this_combine$inlined = flow;
        this.$flow$inlined = flow2;
        this.$transform$inlined = function3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Object combineInternal = CombineKt.combineInternal(continuation, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(this.$transform$inlined, (Continuation) null, 0), flowCollector, new Flow[]{this.$this_combine$inlined, this.$flow$inlined});
                if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object coroutineScope = JobKt.coroutineScope(new CombineKt$zipImpl$1$1(this.$this_combine$inlined, this.$flow$inlined, flowCollector, this.$transform$inlined, null), continuation);
                if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
