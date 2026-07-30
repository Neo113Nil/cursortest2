package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2873}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ m $this_zipWithNext;
    final /* synthetic */ f6.p $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$zipWithNext$2(m mVar, f6.p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_zipWithNext = mVar;
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, cVar);
        sequencesKt___SequencesKt$zipWithNext$2.L$0 = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        Object next;
        Iterator<Object> it;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            o oVar2 = (o) this.L$0;
            Iterator<Object> it2 = this.$this_zipWithNext.iterator();
            if (!it2.hasNext()) {
                return y5.w.INSTANCE;
            }
            oVar = oVar2;
            next = it2.next();
            it = it2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = this.L$2;
            it = (Iterator) this.L$1;
            oVar = (o) this.L$0;
            y5.g.throwOnFailure(obj);
            next = obj2;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            Object invoke = this.$transform.invoke(next, next2);
            this.L$0 = oVar;
            this.L$1 = it;
            this.L$2 = next2;
            this.label = 1;
            if (oVar.yield(invoke, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            next = next2;
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
