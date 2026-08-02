package com.squareup.cash.support.backend.real.articles;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealArticlesService$getArticleForTransaction$1 extends ContinuationImpl {
    public String L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealArticlesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealArticlesService$getArticleForTransaction$1(RealArticlesService realArticlesService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realArticlesService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getArticleForTransaction(null, null, null, this);
    }
}
