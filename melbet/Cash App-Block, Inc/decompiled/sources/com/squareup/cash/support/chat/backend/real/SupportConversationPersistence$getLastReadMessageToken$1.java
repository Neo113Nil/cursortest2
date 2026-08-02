package com.squareup.cash.support.chat.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SupportConversationPersistence$getLastReadMessageToken$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SupportConversationPersistence this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportConversationPersistence$getLastReadMessageToken$1(SupportConversationPersistence supportConversationPersistence, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = supportConversationPersistence;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getLastReadMessageToken(this);
    }
}
