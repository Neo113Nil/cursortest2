package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__LimitKt {

    public static final class a implements e {
        final /* synthetic */ int $count$inlined;
        final /* synthetic */ e $this_drop$inlined;

        public a(e eVar, int i8) {
            this.$this_drop$inlined = eVar;
            this.$count$inlined = i8;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object collect = this.$this_drop$inlined.collect(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), this.$count$inlined, fVar), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
        }
    }

    public static final class b implements e {
        final /* synthetic */ f6.p $predicate$inlined;
        final /* synthetic */ e $this_dropWhile$inlined;

        public b(e eVar, f6.p pVar) {
            this.$this_dropWhile$inlined = eVar;
            this.$predicate$inlined = pVar;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object collect = this.$this_dropWhile$inlined.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), fVar, this.$predicate$inlined), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object collectWhile(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        FlowKt__LimitKt$collectWhile$1 flowKt__LimitKt$collectWhile$1;
        Object coroutine_suspended;
        int i8;
        f fVar;
        if (cVar instanceof FlowKt__LimitKt$collectWhile$1) {
            flowKt__LimitKt$collectWhile$1 = (FlowKt__LimitKt$collectWhile$1) cVar;
            int i9 = flowKt__LimitKt$collectWhile$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__LimitKt$collectWhile$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__LimitKt$collectWhile$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    f flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
                    try {
                        flowKt__LimitKt$collectWhile$1.L$0 = flowKt__LimitKt$collectWhile$collector$1;
                        flowKt__LimitKt$collectWhile$1.label = 1;
                        if (eVar.collect(flowKt__LimitKt$collectWhile$collector$1, flowKt__LimitKt$collectWhile$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (AbortFlowException e8) {
                        e = e8;
                        fVar = flowKt__LimitKt$collectWhile$collector$1;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e, fVar);
                        return y5.w.INSTANCE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (AbortFlowException e9) {
                        e = e9;
                        kotlinx.coroutines.flow.internal.h.checkOwnership(e, fVar);
                        return y5.w.INSTANCE;
                    }
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1(cVar);
        Object obj2 = flowKt__LimitKt$collectWhile$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__LimitKt$collectWhile$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    private static final <T> Object collectWhile$$forInline(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            kotlin.jvm.internal.r.mark(0);
            eVar.collect(flowKt__LimitKt$collectWhile$collector$1, cVar);
            kotlin.jvm.internal.r.mark(1);
        } catch (AbortFlowException e8) {
            kotlinx.coroutines.flow.internal.h.checkOwnership(e8, flowKt__LimitKt$collectWhile$collector$1);
        }
        return y5.w.INSTANCE;
    }

    public static final <T> e drop(e eVar, int i8) {
        if (i8 >= 0) {
            return new a(eVar, i8);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i8).toString());
    }

    public static final <T> e dropWhile(e eVar, f6.p pVar) {
        return new b(eVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object emitAbort$FlowKt__LimitKt(f fVar, T t7, kotlin.coroutines.c cVar) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) cVar;
            int i9 = flowKt__LimitKt$emitAbort$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__LimitKt$emitAbort$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__LimitKt$emitAbort$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    flowKt__LimitKt$emitAbort$1.L$0 = fVar;
                    flowKt__LimitKt$emitAbort$1.label = 1;
                    if (fVar.emit(t7, flowKt__LimitKt$emitAbort$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (f) flowKt__LimitKt$emitAbort$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                throw new AbortFlowException(fVar);
            }
        }
        flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(cVar);
        Object obj2 = flowKt__LimitKt$emitAbort$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__LimitKt$emitAbort$1.label;
        if (i8 != 0) {
        }
        throw new AbortFlowException(fVar);
    }

    public static final <T> e take(e eVar, int i8) {
        if (i8 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(eVar, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " should be positive").toString());
    }

    public static final <T> e takeWhile(e eVar, f6.p pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(eVar, pVar);
    }

    public static final <T, R> e transformWhile(e eVar, f6.q qVar) {
        return g.flow(new FlowKt__LimitKt$transformWhile$1(eVar, qVar, null));
    }
}
