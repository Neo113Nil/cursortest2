package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.r;
import y5.w;

/* loaded from: classes5.dex */
public final class SafeCollector_commonKt$unsafeFlow$1 implements kotlinx.coroutines.flow.e {
    final /* synthetic */ p $block;

    public SafeCollector_commonKt$unsafeFlow$1(p pVar) {
        this.$block = pVar;
    }

    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object invoke = this.$block.invoke(fVar, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : w.INSTANCE;
    }

    public Object collect$$forInline(kotlinx.coroutines.flow.f fVar, final kotlin.coroutines.c cVar) {
        r.mark(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return SafeCollector_commonKt$unsafeFlow$1.this.collect(null, this);
            }
        };
        r.mark(5);
        this.$block.invoke(fVar, cVar);
        return w.INSTANCE;
    }
}
