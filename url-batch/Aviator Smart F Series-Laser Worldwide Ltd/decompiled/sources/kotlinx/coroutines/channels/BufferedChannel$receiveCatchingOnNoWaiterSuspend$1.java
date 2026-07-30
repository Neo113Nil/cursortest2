package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes5.dex */
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel bufferedChannel, kotlin.coroutines.c cVar) {
        super(cVar);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m1231receiveCatchingOnNoWaiterSuspendGKJJFZk;
        Object coroutine_suspended;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1231receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m1231receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return m1231receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutine_suspended ? m1231receiveCatchingOnNoWaiterSuspendGKJJFZk : e.m1240boximpl(m1231receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
