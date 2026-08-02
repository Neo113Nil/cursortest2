package com.squareup.wire.internal;

import java.io.Closeable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class GrpcKt$writeToRequestBody$1 extends ContinuationImpl {
    public ReceiveChannel L$0;
    public GrpcMessageSink L$1;
    public Closeable L$2;
    public Ref$BooleanRef L$3;
    public ReceiveChannel L$4;
    public BufferedChannel.BufferedChannelIterator L$5;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GrpcKt.writeToRequestBody(null, null, 0L, null, null, this);
    }
}
