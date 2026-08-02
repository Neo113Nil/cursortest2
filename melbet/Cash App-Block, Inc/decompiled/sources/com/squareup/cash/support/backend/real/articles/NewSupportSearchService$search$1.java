package com.squareup.cash.support.backend.real.articles;

import com.squareup.scannerview.TextSetter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class NewSupportSearchService$search$1 extends ContinuationImpl {
    public String L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextSetter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewSupportSearchService$search$1(TextSetter textSetter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = textSetter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.search(null, null, this);
    }
}
