package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2395, 2399}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes4.dex */
final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ f6.q $operation;
    final /* synthetic */ m $this_runningReduceIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$runningReduceIndexed$1(m mVar, f6.q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_runningReduceIndexed = mVar;
        this.$operation = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, cVar);
        sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        Iterator<Object> it;
        Object next;
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        int i9 = 1;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            it = this.$this_runningReduceIndexed.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.L$0 = oVar;
                this.L$1 = it;
                this.L$2 = next;
                this.label = 1;
                if (oVar.yield(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return y5.w.INSTANCE;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = this.I$0;
            Object obj2 = this.L$2;
            it = (Iterator) this.L$1;
            oVar = (o) this.L$0;
            y5.g.throwOnFailure(obj);
            sequencesKt___SequencesKt$runningReduceIndexed$1 = this;
            i9 = i10;
            next = obj2;
            while (it.hasNext()) {
                f6.q qVar = sequencesKt___SequencesKt$runningReduceIndexed$1.$operation;
                int i11 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Object invoke = qVar.invoke(kotlin.coroutines.jvm.internal.a.boxInt(i9), next, it.next());
                sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = oVar;
                sequencesKt___SequencesKt$runningReduceIndexed$1.L$1 = it;
                sequencesKt___SequencesKt$runningReduceIndexed$1.L$2 = invoke;
                sequencesKt___SequencesKt$runningReduceIndexed$1.I$0 = i11;
                sequencesKt___SequencesKt$runningReduceIndexed$1.label = 2;
                if (oVar.yield(invoke, sequencesKt___SequencesKt$runningReduceIndexed$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = invoke;
                i9 = i11;
            }
            return y5.w.INSTANCE;
        }
        next = this.L$2;
        it = (Iterator) this.L$1;
        oVar = (o) this.L$0;
        y5.g.throwOnFailure(obj);
        sequencesKt___SequencesKt$runningReduceIndexed$1 = this;
        while (it.hasNext()) {
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
