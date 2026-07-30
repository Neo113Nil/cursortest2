package kotlinx.coroutines.flow;

import java.util.Iterator;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__BuildersKt {

    public static final class a implements e {
        final /* synthetic */ f6.a $this_asFlow$inlined;

        public a(f6.a aVar) {
            this.$this_asFlow$inlined = aVar;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object emit = fVar.emit(this.$this_asFlow$inlined.invoke(), cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended ? emit : y5.w.INSTANCE;
        }
    }

    public static final class b implements e {
        final /* synthetic */ Object $value$inlined;

        public b(Object obj) {
            this.$value$inlined = obj;
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            Object coroutine_suspended;
            Object emit = fVar.emit(this.$value$inlined, cVar);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended ? emit : y5.w.INSTANCE;
        }
    }

    public static final <T> e asFlow(f6.a aVar) {
        return new a(aVar);
    }

    public static final <T> e callbackFlow(f6.p pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    public static final <T> e channelFlow(f6.p pVar) {
        return new c(pVar, null, 0, null, 14, null);
    }

    public static final <T> e emptyFlow() {
        return d.INSTANCE;
    }

    public static final <T> e flow(f6.p pVar) {
        return new m(pVar);
    }

    public static final <T> e flowOf(T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }

    public static final <T> e asFlow(f6.l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    public static final <T> e flowOf(T t7) {
        return new b(t7);
    }

    public static final <T> e asFlow(Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final <T> e asFlow(Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    public static final <T> e asFlow(kotlin.sequences.m mVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(mVar);
    }

    public static final <T> e asFlow(T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    public static final e asFlow(int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    public static final e asFlow(long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    public static final e asFlow(j6.m mVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(mVar);
    }

    public static final e asFlow(j6.p pVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(pVar);
    }
}
