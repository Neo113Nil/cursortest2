package kotlinx.coroutines.flow;

import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__CollectKt {
    public static final Object collect(e eVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = eVar.collect(kotlinx.coroutines.flow.internal.k.INSTANCE, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }

    private static final /* synthetic */ <T> Object collect$$forInline(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        FlowKt__CollectKt$collect$3 flowKt__CollectKt$collect$3 = new FlowKt__CollectKt$collect$3(pVar);
        kotlin.jvm.internal.r.mark(0);
        eVar.collect(flowKt__CollectKt$collect$3, cVar);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }

    public static final <T> Object collectIndexed(e eVar, f6.q qVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = eVar.collect(new FlowKt__CollectKt$collectIndexed$2(qVar), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }

    private static final <T> Object collectIndexed$$forInline(e eVar, f6.q qVar, kotlin.coroutines.c cVar) {
        FlowKt__CollectKt$collectIndexed$2 flowKt__CollectKt$collectIndexed$2 = new FlowKt__CollectKt$collectIndexed$2(qVar);
        kotlin.jvm.internal.r.mark(0);
        eVar.collect(flowKt__CollectKt$collectIndexed$2, cVar);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }

    public static final <T> Object collectLatest(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = g.collect(h.buffer$default(g.mapLatest(eVar, pVar), 0, null, 2, null), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }

    public static final <T> Object emitAll(f fVar, e eVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        g.ensureActive(fVar);
        Object collect = eVar.collect(fVar, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }

    public static final <T> l1 launchIn(e eVar, i0 i0Var) {
        l1 launch$default;
        launch$default = kotlinx.coroutines.i.launch$default(i0Var, null, null, new FlowKt__CollectKt$launchIn$1(eVar, null), 3, null);
        return launch$default;
    }

    public static final /* synthetic */ <T> Object collect(e eVar, f6.p pVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = eVar.collect(new FlowKt__CollectKt$collect$3(pVar), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }
}
