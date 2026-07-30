package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__CountKt {

    static final class a implements f {
        final /* synthetic */ Ref$IntRef $i;

        a(Ref$IntRef ref$IntRef) {
            this.$i = ref$IntRef;
        }

        @Override // kotlinx.coroutines.flow.f
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.$i.element++;
            return y5.w.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object count(e eVar, kotlin.coroutines.c cVar) {
        FlowKt__CountKt$count$1 flowKt__CountKt$count$1;
        Object coroutine_suspended;
        int i8;
        Ref$IntRef ref$IntRef;
        if (cVar instanceof FlowKt__CountKt$count$1) {
            flowKt__CountKt$count$1 = (FlowKt__CountKt$count$1) cVar;
            int i9 = flowKt__CountKt$count$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__CountKt$count$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__CountKt$count$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    f aVar = new a(ref$IntRef2);
                    flowKt__CountKt$count$1.L$0 = ref$IntRef2;
                    flowKt__CountKt$count$1.label = 1;
                    if (eVar.collect(aVar, flowKt__CountKt$count$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$IntRef = ref$IntRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$IntRef = (Ref$IntRef) flowKt__CountKt$count$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.a.boxInt(ref$IntRef.element);
            }
        }
        flowKt__CountKt$count$1 = new FlowKt__CountKt$count$1(cVar);
        Object obj2 = flowKt__CountKt$count$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__CountKt$count$1.label;
        if (i8 != 0) {
        }
        return kotlin.coroutines.jvm.internal.a.boxInt(ref$IntRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object count(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        FlowKt__CountKt$count$3 flowKt__CountKt$count$3;
        Object coroutine_suspended;
        int i8;
        Ref$IntRef ref$IntRef;
        if (cVar instanceof FlowKt__CountKt$count$3) {
            flowKt__CountKt$count$3 = (FlowKt__CountKt$count$3) cVar;
            int i9 = flowKt__CountKt$count$3.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$3.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__CountKt$count$3.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__CountKt$count$3.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    f flowKt__CountKt$count$4 = new FlowKt__CountKt$count$4(pVar, ref$IntRef2);
                    flowKt__CountKt$count$3.L$0 = ref$IntRef2;
                    flowKt__CountKt$count$3.label = 1;
                    if (eVar.collect(flowKt__CountKt$count$4, flowKt__CountKt$count$3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$IntRef = ref$IntRef2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$IntRef = (Ref$IntRef) flowKt__CountKt$count$3.L$0;
                    y5.g.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.a.boxInt(ref$IntRef.element);
            }
        }
        flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3(cVar);
        Object obj2 = flowKt__CountKt$count$3.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__CountKt$count$3.label;
        if (i8 != 0) {
        }
        return kotlin.coroutines.jvm.internal.a.boxInt(ref$IntRef.element);
    }
}
