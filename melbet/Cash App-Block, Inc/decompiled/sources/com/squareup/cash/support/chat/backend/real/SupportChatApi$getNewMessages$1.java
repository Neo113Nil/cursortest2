package com.squareup.cash.support.chat.backend.real;

import app.cash.api.ApiResult;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SupportChatApi$getNewMessages$1 extends ContinuationImpl {
    public ApiResult L$2;
    public List L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SupportChatApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatApi$getNewMessages$1(SupportChatApi supportChatApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = supportChatApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getNewMessages(null, this);
    }
}
