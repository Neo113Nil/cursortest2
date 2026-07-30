package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.selects.SelectImplementation;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {221, 426}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements f6.q {
    final /* synthetic */ e $this_debounceInternal;
    final /* synthetic */ f6.l $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$debounceInternal$1(f6.l lVar, e eVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.$timeoutMillisSelector = lVar;
        this.$this_debounceInternal = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f4 -> B:6:0x006a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        f fVar;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1;
        ReceiveChannel produce$default;
        Ref$ObjectRef ref$ObjectRef;
        Ref$LongRef ref$LongRef;
        Ref$ObjectRef ref$ObjectRef2;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$12;
        SelectImplementation selectImplementation;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.L$0;
            fVar = (f) this.L$1;
            flowKt__DelayKt$debounceInternal$1 = this;
            produce$default = ProduceKt.produce$default(i0Var, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3, null);
            ref$ObjectRef = new Ref$ObjectRef();
        } else if (i8 == 1) {
            Ref$LongRef ref$LongRef2 = (Ref$LongRef) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            produce$default = (ReceiveChannel) this.L$1;
            fVar = (f) this.L$0;
            y5.g.throwOnFailure(obj);
            ref$LongRef = ref$LongRef2;
            flowKt__DelayKt$debounceInternal$1 = this;
            ref$ObjectRef.element = null;
            ref$ObjectRef2 = ref$ObjectRef;
            flowKt__DelayKt$debounceInternal$12 = flowKt__DelayKt$debounceInternal$1;
            selectImplementation = new SelectImplementation(flowKt__DelayKt$debounceInternal$12.getContext());
            if (ref$ObjectRef2.element != 0) {
                kotlinx.coroutines.selects.a.onTimeout(selectImplementation, ref$LongRef.element, new FlowKt__DelayKt$debounceInternal$1$3$1(fVar, ref$ObjectRef2, null));
            }
            selectImplementation.invoke(produce$default.getOnReceiveCatching(), new FlowKt__DelayKt$debounceInternal$1$3$2(ref$ObjectRef2, fVar, null));
            flowKt__DelayKt$debounceInternal$12.L$0 = fVar;
            flowKt__DelayKt$debounceInternal$12.L$1 = produce$default;
            flowKt__DelayKt$debounceInternal$12.L$2 = ref$ObjectRef2;
            flowKt__DelayKt$debounceInternal$12.L$3 = null;
            flowKt__DelayKt$debounceInternal$12.label = 2;
            if (selectImplementation.doSelect(flowKt__DelayKt$debounceInternal$12) != coroutine_suspended) {
                return coroutine_suspended;
            }
            ref$ObjectRef = ref$ObjectRef2;
            flowKt__DelayKt$debounceInternal$1 = flowKt__DelayKt$debounceInternal$12;
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
            ReceiveChannel receiveChannel = (ReceiveChannel) this.L$1;
            f fVar2 = (f) this.L$0;
            y5.g.throwOnFailure(obj);
            fVar = fVar2;
            produce$default = receiveChannel;
            ref$ObjectRef = ref$ObjectRef3;
            flowKt__DelayKt$debounceInternal$1 = this;
        }
        if (ref$ObjectRef.element == kotlinx.coroutines.flow.internal.l.DONE) {
            return y5.w.INSTANCE;
        }
        ref$LongRef = new Ref$LongRef();
        Object obj2 = ref$ObjectRef.element;
        if (obj2 != null) {
            f6.l lVar = flowKt__DelayKt$debounceInternal$1.$timeoutMillisSelector;
            g0 g0Var = kotlinx.coroutines.flow.internal.l.NULL;
            if (obj2 == g0Var) {
                obj2 = null;
            }
            long longValue = ((Number) lVar.invoke(obj2)).longValue();
            ref$LongRef.element = longValue;
            if (longValue < 0) {
                throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
            }
            if (longValue == 0) {
                Object obj3 = ref$ObjectRef.element;
                if (obj3 == g0Var) {
                    obj3 = null;
                }
                flowKt__DelayKt$debounceInternal$1.L$0 = fVar;
                flowKt__DelayKt$debounceInternal$1.L$1 = produce$default;
                flowKt__DelayKt$debounceInternal$1.L$2 = ref$ObjectRef;
                flowKt__DelayKt$debounceInternal$1.L$3 = ref$LongRef;
                flowKt__DelayKt$debounceInternal$1.label = 1;
                if (fVar.emit(obj3, flowKt__DelayKt$debounceInternal$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ref$ObjectRef.element = null;
            }
        }
        ref$ObjectRef2 = ref$ObjectRef;
        flowKt__DelayKt$debounceInternal$12 = flowKt__DelayKt$debounceInternal$1;
        selectImplementation = new SelectImplementation(flowKt__DelayKt$debounceInternal$12.getContext());
        if (ref$ObjectRef2.element != 0) {
        }
        selectImplementation.invoke(produce$default.getOnReceiveCatching(), new FlowKt__DelayKt$debounceInternal$1$3$2(ref$ObjectRef2, fVar, null));
        flowKt__DelayKt$debounceInternal$12.L$0 = fVar;
        flowKt__DelayKt$debounceInternal$12.L$1 = produce$default;
        flowKt__DelayKt$debounceInternal$12.L$2 = ref$ObjectRef2;
        flowKt__DelayKt$debounceInternal$12.L$3 = null;
        flowKt__DelayKt$debounceInternal$12.label = 2;
        if (selectImplementation.doSelect(flowKt__DelayKt$debounceInternal$12) != coroutine_suspended) {
        }
    }

    @Override // f6.q
    public final Object invoke(i0 i0Var, f fVar, kotlin.coroutines.c cVar) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, cVar);
        flowKt__DelayKt$debounceInternal$1.L$0 = i0Var;
        flowKt__DelayKt$debounceInternal$1.L$1 = fVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(y5.w.INSTANCE);
    }
}
