package com.stripe.android.financialconnections.ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class HandleClickableUrl$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HandleClickableUrl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleClickableUrl$invoke$1(HandleClickableUrl handleClickableUrl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = handleClickableUrl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, null, null, null, this);
    }
}
