package com.squareup.cash.support.chat.backend.real;

import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealRecordedMessagesStore$loadOldMessagesNow$1 extends ContinuationImpl {
    public int I$0;
    public RecordedMessage L$0;
    public StateFlowImpl L$1;
    public Object L$2;
    public RealRecordedMessagesStore.MessagesState L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealRecordedMessagesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecordedMessagesStore$loadOldMessagesNow$1(RealRecordedMessagesStore realRecordedMessagesStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realRecordedMessagesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealRecordedMessagesStore.access$loadOldMessagesNow(this.this$0, this);
    }
}
