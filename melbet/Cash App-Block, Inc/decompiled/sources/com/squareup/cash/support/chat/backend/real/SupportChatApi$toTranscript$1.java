package com.squareup.cash.support.chat.backend.real;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.supportal.app.GetChatMessagesResponse;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SupportChatApi$toTranscript$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public GetChatMessagesResponse L$0;
    public Collection L$3;
    public Iterator L$5;
    public ChatMessage L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SupportChatApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatApi$toTranscript$1(SupportChatApi supportChatApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = supportChatApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.toTranscript(null, this);
    }
}
