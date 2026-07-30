package kotlin.sequences;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;

@kotlin.coroutines.jvm.internal.d(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {GattError.GATT_ALREADY_OPEN}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ Random $random;
    final /* synthetic */ m $this_shuffled;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$shuffled$1(m mVar, Random random, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_shuffled = mVar;
        this.$random = random;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, cVar);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        List mutableList;
        o oVar;
        Object removeLast;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            o oVar2 = (o) this.L$0;
            mutableList = SequencesKt___SequencesKt.toMutableList(this.$this_shuffled);
            oVar = oVar2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableList = (List) this.L$1;
            oVar = (o) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        while (!mutableList.isEmpty()) {
            int nextInt = this.$random.nextInt(mutableList.size());
            removeLast = kotlin.collections.v.removeLast(mutableList);
            if (nextInt < mutableList.size()) {
                removeLast = mutableList.set(nextInt, removeLast);
            }
            this.L$0 = oVar;
            this.L$1 = mutableList;
            this.label = 1;
            if (oVar.yield(removeLast, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(o oVar, kotlin.coroutines.c cVar) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
