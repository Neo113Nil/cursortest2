package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class FlowKt__CollectKt$collectIndexed$2 implements f {
    final /* synthetic */ f6.q $action;
    private int index;

    public FlowKt__CollectKt$collectIndexed$2(f6.q qVar) {
        this.$action = qVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(T t7, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        f6.q qVar = this.$action;
        int i8 = this.index;
        this.index = i8 + 1;
        if (i8 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        Object invoke = qVar.invoke(kotlin.coroutines.jvm.internal.a.boxInt(i8), t7, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : y5.w.INSTANCE;
    }

    public Object emit$$forInline(T t7, final kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.r.mark(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collectIndexed$2.this.emit(null, this);
            }
        };
        kotlin.jvm.internal.r.mark(5);
        f6.q qVar = this.$action;
        int i8 = this.index;
        this.index = i8 + 1;
        if (i8 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        qVar.invoke(Integer.valueOf(i8), t7, cVar);
        return y5.w.INSTANCE;
    }
}
