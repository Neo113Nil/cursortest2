package kotlinx.coroutines.flow.internal;

import f6.p;
import f6.q;
import y5.w;

/* loaded from: classes5.dex */
public abstract class FlowCoroutineKt {

    public static final class a implements kotlinx.coroutines.flow.e {
        final /* synthetic */ q $block$inlined;

        public a(q qVar) {
            this.$block$inlined = qVar;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object flowScope = FlowCoroutineKt.flowScope(new FlowCoroutineKt$scopedFlow$1$1(this.$block$inlined, fVar, null), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return flowScope == coroutine_suspended ? flowScope : w.INSTANCE;
        }
    }

    public static final <R> Object flowScope(p pVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        g gVar = new g(cVar.getContext(), cVar);
        Object startUndispatchedOrReturn = l6.b.startUndispatchedOrReturn(gVar, gVar, pVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (startUndispatchedOrReturn == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        return startUndispatchedOrReturn;
    }

    public static final <R> kotlinx.coroutines.flow.e scopedFlow(q qVar) {
        return new a(qVar);
    }
}
