package kotlinx.coroutines.channels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class BufferedChannel$receiveCatching$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BufferedChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4186receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m4186receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return m4186receiveCatchingJP2dKIU$suspendImpl == CoroutineSingletons.COROUTINE_SUSPENDED ? m4186receiveCatchingJP2dKIU$suspendImpl : new ChannelResult(m4186receiveCatchingJP2dKIU$suspendImpl);
    }
}
