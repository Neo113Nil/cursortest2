package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BufferedChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4188receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m4188receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return m4188receiveCatchingOnNoWaiterSuspendGKJJFZk == CoroutineSingletons.COROUTINE_SUSPENDED ? m4188receiveCatchingOnNoWaiterSuspendGKJJFZk : new ChannelResult(m4188receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
