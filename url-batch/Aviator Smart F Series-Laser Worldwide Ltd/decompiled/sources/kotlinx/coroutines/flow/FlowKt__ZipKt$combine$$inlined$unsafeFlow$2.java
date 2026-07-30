package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 implements e {
    final /* synthetic */ e[] $flows$inlined;
    final /* synthetic */ f6.p $transform$inlined;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(e[] eVarArr, f6.p pVar) {
        this.$flows$inlined = eVarArr;
        this.$transform$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        e[] eVarArr = this.$flows$inlined;
        kotlin.jvm.internal.s.needClassReification();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        kotlin.jvm.internal.s.needClassReification();
        Object combineInternal = CombineKt.combineInternal(fVar, eVarArr, flowKt__ZipKt$combine$5$1, new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return combineInternal == coroutine_suspended ? combineInternal : y5.w.INSTANCE;
    }

    public Object collect$$forInline(f fVar, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.collect(null, this);
            }
        };
        kotlin.jvm.internal.r.mark(5);
        e[] eVarArr = this.$flows$inlined;
        kotlin.jvm.internal.s.needClassReification();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        kotlin.jvm.internal.s.needClassReification();
        FlowKt__ZipKt$combine$5$2 flowKt__ZipKt$combine$5$2 = new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null);
        kotlin.jvm.internal.r.mark(0);
        CombineKt.combineInternal(fVar, eVarArr, flowKt__ZipKt$combine$5$1, flowKt__ZipKt$combine$5$2, cVar);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }
}
