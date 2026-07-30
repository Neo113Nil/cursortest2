package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2308, 2312}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ R $initial;
    final /* synthetic */ f6.p $operation;
    final /* synthetic */ m $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$runningFold$1(R r8, m mVar, f6.p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$initial = r8;
        this.$this_runningFold = mVar;
        this.$operation = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, cVar);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        Object obj2;
        o oVar2;
        Iterator<Object> it;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            Object obj3 = this.$initial;
            this.L$0 = oVar;
            this.label = 1;
            if (oVar.yield(obj3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                Object obj4 = this.L$1;
                oVar2 = (o) this.L$0;
                y5.g.throwOnFailure(obj);
                obj2 = obj4;
                while (it.hasNext()) {
                    obj2 = this.$operation.invoke(obj2, it.next());
                    this.L$0 = oVar2;
                    this.L$1 = obj2;
                    this.L$2 = it;
                    this.label = 2;
                    if (oVar2.yield(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return y5.w.INSTANCE;
            }
            oVar = (o) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        obj2 = this.$initial;
        oVar2 = oVar;
        it = this.$this_runningFold.iterator();
        while (it.hasNext()) {
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
