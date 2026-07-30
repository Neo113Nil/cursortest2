package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 implements e {
    final /* synthetic */ e[] $flows$inlined;
    final /* synthetic */ f6.p $transform$inlined;

    public FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(e[] eVarArr, f6.p pVar) {
        this.$flows$inlined = eVarArr;
        this.$transform$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        e[] eVarArr = this.$flows$inlined;
        f6.a nullArrayFactory$FlowKt__ZipKt = FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt();
        kotlin.jvm.internal.s.needClassReification();
        Object combineInternal = CombineKt.combineInternal(fVar, eVarArr, nullArrayFactory$FlowKt__ZipKt, new FlowKt__ZipKt$combineUnsafe$1$1(this.$transform$inlined, null), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return combineInternal == coroutine_suspended ? combineInternal : y5.w.INSTANCE;
    }

    public Object collect$$forInline(f fVar, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        kotlin.jvm.internal.r.mark(5);
        e[] eVarArr = this.$flows$inlined;
        f6.a nullArrayFactory$FlowKt__ZipKt = FlowKt__ZipKt.nullArrayFactory$FlowKt__ZipKt();
        kotlin.jvm.internal.s.needClassReification();
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.$transform$inlined, null);
        kotlin.jvm.internal.r.mark(0);
        CombineKt.combineInternal(fVar, eVarArr, nullArrayFactory$FlowKt__ZipKt, flowKt__ZipKt$combineUnsafe$1$1, cVar);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }
}
