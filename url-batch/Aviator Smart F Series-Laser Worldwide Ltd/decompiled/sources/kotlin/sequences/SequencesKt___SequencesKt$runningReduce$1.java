package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2366, 2369}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ f6.p $operation;
    final /* synthetic */ m $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$runningReduce$1(m mVar, f6.p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_runningReduce = mVar;
        this.$operation = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, cVar);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
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
            oVar = (o) this.L$0;
            Iterator<Object> it2 = this.$this_runningReduce.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.L$0 = oVar;
                this.L$1 = it2;
                this.L$2 = next;
                this.label = 1;
                if (oVar.yield(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = it2;
            }
            return y5.w.INSTANCE;
        }
        if (i8 != 1 && i8 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        next = this.L$2;
        it = (Iterator) this.L$1;
        oVar = (o) this.L$0;
        y5.g.throwOnFailure(obj);
        while (it.hasNext()) {
            next = this.$operation.invoke(next, it.next());
            this.L$0 = oVar;
            this.L$1 = it;
            this.L$2 = next;
            this.label = 2;
            if (oVar.yield(next, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
