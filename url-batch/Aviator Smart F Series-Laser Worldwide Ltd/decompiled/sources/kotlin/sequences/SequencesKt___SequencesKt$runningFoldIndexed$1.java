package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2336, 2341}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
/* loaded from: classes4.dex */
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ R $initial;
    final /* synthetic */ f6.q $operation;
    final /* synthetic */ m $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt___SequencesKt$runningFoldIndexed$1(R r8, m mVar, f6.q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$initial = r8;
        this.$this_runningFoldIndexed = mVar;
        this.$operation = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, cVar);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        Object obj2;
        Iterator<Object> it;
        int i8;
        o oVar2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            y5.g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            Object obj3 = this.$initial;
            this.L$0 = oVar;
            this.label = 1;
            if (oVar.yield(obj3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = this.I$0;
                it = (Iterator) this.L$2;
                Object obj4 = this.L$1;
                oVar2 = (o) this.L$0;
                y5.g.throwOnFailure(obj);
                obj2 = obj4;
                i8 = i10;
                while (it.hasNext()) {
                    Object next = it.next();
                    f6.q qVar = this.$operation;
                    int i11 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    Object invoke = qVar.invoke(kotlin.coroutines.jvm.internal.a.boxInt(i8), obj2, next);
                    this.L$0 = oVar2;
                    this.L$1 = invoke;
                    this.L$2 = it;
                    this.I$0 = i11;
                    this.label = 2;
                    if (oVar2.yield(invoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = invoke;
                    i8 = i11;
                }
                return y5.w.INSTANCE;
            }
            oVar = (o) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        obj2 = this.$initial;
        it = this.$this_runningFoldIndexed.iterator();
        i8 = 0;
        oVar2 = oVar;
        while (it.hasNext()) {
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
