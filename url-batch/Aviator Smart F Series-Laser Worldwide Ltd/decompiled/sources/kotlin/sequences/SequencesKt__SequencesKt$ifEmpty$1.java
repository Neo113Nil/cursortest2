package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ f6.a $defaultValue;
    final /* synthetic */ m $this_ifEmpty;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$ifEmpty$1(m mVar, f6.a aVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_ifEmpty = mVar;
        this.$defaultValue = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, cVar);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            o oVar = (o) this.L$0;
            Iterator<Object> it = this.$this_ifEmpty.iterator();
            if (it.hasNext()) {
                this.label = 1;
                if (oVar.yieldAll(it, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                m mVar = (m) this.$defaultValue.invoke();
                this.label = 2;
                if (oVar.yieldAll(mVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i8 != 1 && i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
