package com.squareup.cash.support.chat.presenters;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ChatPresenter$updateLastReadMessageIfNecessary$1 extends ContinuationImpl {
    public String L$0;
    public List L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPresenter$updateLastReadMessageIfNecessary$1(ChatPresenter chatPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chatPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ChatPresenter.access$updateLastReadMessageIfNecessary(this.this$0, null, null, this);
    }
}
