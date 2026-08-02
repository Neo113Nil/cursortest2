package com.squareup.wire.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import net.idrnd.face.iad.capture.internal.o0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealGrpcServerStreamingCall$executeIn$1 extends ContinuationImpl {
    public SendChannel L$0;
    public ReceiveChannel L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGrpcServerStreamingCall$executeIn$1(o0 o0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.executeIn(null, null, this);
    }
}
