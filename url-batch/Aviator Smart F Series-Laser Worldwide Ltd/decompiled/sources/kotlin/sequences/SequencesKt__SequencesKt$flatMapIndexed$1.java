package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
/* loaded from: classes4.dex */
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ f6.l $iterator;
    final /* synthetic */ m $source;
    final /* synthetic */ f6.p $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$flatMapIndexed$1(m mVar, f6.p pVar, f6.l lVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$source = mVar;
        this.$transform = pVar;
        this.$iterator = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, cVar);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        o oVar;
        Iterator<Object> it;
        int i8;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            y5.g.throwOnFailure(obj);
            oVar = (o) this.L$0;
            it = this.$source.iterator();
            i8 = 0;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = this.I$0;
            it = (Iterator) this.L$1;
            oVar = (o) this.L$0;
            y5.g.throwOnFailure(obj);
            i8 = i10;
        }
        while (it.hasNext()) {
            Object next = it.next();
            f6.p pVar = this.$transform;
            int i11 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Iterator<Object> it2 = (Iterator) this.$iterator.invoke(pVar.invoke(kotlin.coroutines.jvm.internal.a.boxInt(i8), next));
            this.L$0 = oVar;
            this.L$1 = it;
            this.I$0 = i11;
            this.label = 1;
            if (oVar.yieldAll(it2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i8 = i11;
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
