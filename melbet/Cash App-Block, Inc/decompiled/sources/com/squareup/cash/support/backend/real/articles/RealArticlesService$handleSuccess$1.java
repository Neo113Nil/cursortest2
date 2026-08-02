package com.squareup.cash.support.backend.real.articles;

import com.squareup.cash.support.backend.api.articles.Article;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealArticlesService$handleSuccess$1 extends ContinuationImpl {
    public Article L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealArticlesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealArticlesService$handleSuccess$1(RealArticlesService realArticlesService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realArticlesService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleSuccess(null, null, null, this);
    }
}
