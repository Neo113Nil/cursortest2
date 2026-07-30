package kotlinx.coroutines.flow.internal;

import f6.q;
import kotlinx.coroutines.j0;
import y5.w;

/* loaded from: classes5.dex */
public abstract class CombineKt {

    public static final class a implements kotlinx.coroutines.flow.e {
        final /* synthetic */ kotlinx.coroutines.flow.e $flow$inlined;
        final /* synthetic */ kotlinx.coroutines.flow.e $flow2$inlined;
        final /* synthetic */ q $transform$inlined;

        public a(kotlinx.coroutines.flow.e eVar, kotlinx.coroutines.flow.e eVar2, q qVar) {
            this.$flow2$inlined = eVar;
            this.$flow$inlined = eVar2;
            this.$transform$inlined = qVar;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object coroutineScope = j0.coroutineScope(new CombineKt$zipImpl$1$1(fVar, this.$flow2$inlined, this.$flow$inlined, this.$transform$inlined, null), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutineScope == coroutine_suspended ? coroutineScope : w.INSTANCE;
        }
    }

    public static final <R, T> Object combineInternal(kotlinx.coroutines.flow.f fVar, kotlinx.coroutines.flow.e[] eVarArr, f6.a aVar, q qVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object flowScope = FlowCoroutineKt.flowScope(new CombineKt$combineInternal$2(eVarArr, aVar, qVar, fVar, null), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return flowScope == coroutine_suspended ? flowScope : w.INSTANCE;
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.e zipImpl(kotlinx.coroutines.flow.e eVar, kotlinx.coroutines.flow.e eVar2, q qVar) {
        return new a(eVar2, eVar, qVar);
    }
}
