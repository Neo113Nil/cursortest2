package com.squareup.cash.support.chat.backend.real;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealPendingMessagesStore$dispatchSendMessages$1 extends ContinuationImpl {
    public LinkedHashMap L$0;
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPendingMessagesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPendingMessagesStore$dispatchSendMessages$1(RealPendingMessagesStore realPendingMessagesStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPendingMessagesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealPendingMessagesStore.access$dispatchSendMessages(this.this$0, null, null, this);
    }
}
