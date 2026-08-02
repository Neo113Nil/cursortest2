package com.squareup.cash.support.chat.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SupportChatApi$getMessageBody$1 extends ContinuationImpl {
    public String L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SupportChatApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatApi$getMessageBody$1(SupportChatApi supportChatApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = supportChatApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getMessageBody(null, null, this);
    }
}
