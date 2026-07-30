package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {193, 193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class FlowKt__MergeKt$flatMapLatest$1 extends SuspendLambda implements f6.q {
    final /* synthetic */ f6.p $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flatMapLatest$1(f6.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.$transform = pVar;
    }

    @Override // f6.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((f) obj, (f) obj2, (kotlin.coroutines.c) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        f fVar;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            fVar = (f) this.L$0;
            Object obj2 = this.L$1;
            f6.p pVar = this.$transform;
            this.L$0 = fVar;
            this.label = 1;
            obj = pVar.invoke(obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                return y5.w.INSTANCE;
            }
            fVar = (f) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (g.emitAll(fVar, (e) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return y5.w.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        f fVar = (f) this.L$0;
        e eVar = (e) this.$transform.invoke(this.L$1, this);
        kotlin.jvm.internal.r.mark(0);
        g.emitAll(fVar, eVar, this);
        kotlin.jvm.internal.r.mark(1);
        return y5.w.INSTANCE;
    }

    public final Object invoke(f fVar, T t7, kotlin.coroutines.c cVar) {
        FlowKt__MergeKt$flatMapLatest$1 flowKt__MergeKt$flatMapLatest$1 = new FlowKt__MergeKt$flatMapLatest$1(this.$transform, cVar);
        flowKt__MergeKt$flatMapLatest$1.L$0 = fVar;
        flowKt__MergeKt$flatMapLatest$1.L$1 = t7;
        return flowKt__MergeKt$flatMapLatest$1.invokeSuspend(y5.w.INSTANCE);
    }
}
