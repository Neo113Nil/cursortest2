package com.squareup.cash.threedsdataonly.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ThreeDsPresenter$getAuthenticationParams$1 extends ContinuationImpl {
    public int I$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ThreeDsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDsPresenter$getAuthenticationParams$1(ThreeDsPresenter threeDsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = threeDsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getAuthenticationParams(this);
    }
}
