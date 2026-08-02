package com.squareup.cash.support.backend.real.articles;

import com.squareup.cash.support.backend.api.articles.Article;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealArticlesService$getArticle$1 extends ContinuationImpl {
    public String L$1;
    public Article L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealArticlesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealArticlesService$getArticle$1(RealArticlesService realArticlesService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realArticlesService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getArticle(null, null, this);
    }
}
