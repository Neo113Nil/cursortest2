package com.squareup.cash.work.webview.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class OtkRedirectUseCase$refreshCookie$1 extends ContinuationImpl {
    public OtkRedirectUseCase L$0;
    public String L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ OtkRedirectUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtkRedirectUseCase$refreshCookie$1(OtkRedirectUseCase otkRedirectUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = otkRedirectUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return OtkRedirectUseCase.refreshCookie$suspendImpl(this.this$0, null, false, this);
    }
}
