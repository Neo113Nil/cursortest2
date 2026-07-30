package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes5.dex */
final class FlowKt__LimitKt$dropWhile$1$1 implements f {
    final /* synthetic */ Ref$BooleanRef $matched;
    final /* synthetic */ f6.p $predicate;
    final /* synthetic */ f $this_unsafeFlow;

    FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, f fVar, f6.p pVar) {
        this.$matched = ref$BooleanRef;
        this.$this_unsafeFlow = fVar;
        this.$predicate = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        Object coroutine_suspended;
        int i8;
        FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1;
        if (cVar instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) cVar;
            int i9 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i9 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    if (this.$matched.element) {
                        f fVar = this.$this_unsafeFlow;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                        if (fVar.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return y5.w.INSTANCE;
                    }
                    f6.p pVar = this.$predicate;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = obj;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
                    obj2 = pVar.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__LimitKt$dropWhile$1$1 = this;
                    if (!((Boolean) obj2).booleanValue()) {
                    }
                } else {
                    if (i8 == 1) {
                        y5.g.throwOnFailure(obj2);
                        return y5.w.INSTANCE;
                    }
                    if (i8 == 2) {
                        obj = flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                        flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                        y5.g.throwOnFailure(obj2);
                        if (!((Boolean) obj2).booleanValue()) {
                            return y5.w.INSTANCE;
                        }
                        flowKt__LimitKt$dropWhile$1$1.$matched.element = true;
                        f fVar2 = flowKt__LimitKt$dropWhile$1$1.$this_unsafeFlow;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                        if (fVar2.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.g.throwOnFailure(obj2);
                    }
                }
                return y5.w.INSTANCE;
            }
        }
        flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, cVar);
        Object obj22 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }
}
