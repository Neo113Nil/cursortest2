package com.squareup.cash.support.chat.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealRecordedMessagesStore$loadNewMessagesNow$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealRecordedMessagesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecordedMessagesStore$loadNewMessagesNow$1(RealRecordedMessagesStore realRecordedMessagesStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realRecordedMessagesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealRecordedMessagesStore.access$loadNewMessagesNow(this.this$0, this);
    }
}
