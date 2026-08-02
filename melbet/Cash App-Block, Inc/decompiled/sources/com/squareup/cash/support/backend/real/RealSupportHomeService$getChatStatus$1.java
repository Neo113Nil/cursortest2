package com.squareup.cash.support.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealSupportHomeService$getChatStatus$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSupportHomeService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSupportHomeService$getChatStatus$1(RealSupportHomeService realSupportHomeService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSupportHomeService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getChatStatus(null, this);
    }
}
