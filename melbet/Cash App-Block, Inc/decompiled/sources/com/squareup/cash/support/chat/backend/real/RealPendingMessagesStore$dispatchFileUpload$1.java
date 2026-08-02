package com.squareup.cash.support.chat.backend.real;

import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import java.time.Instant;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealPendingMessagesStore$dispatchFileUpload$1 extends ContinuationImpl {
    public String L$0;
    public PendingMessage L$1;
    public String L$2;
    public MessageBody.FileBody L$3;
    public Instant L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPendingMessagesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPendingMessagesStore$dispatchFileUpload$1(RealPendingMessagesStore realPendingMessagesStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPendingMessagesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealPendingMessagesStore.access$dispatchFileUpload(this.this$0, null, null, null, this);
    }
}
