package com.squareup.cash.tax.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTaxEntryTileUserDataProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1(RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTaxEntryTileUserDataProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getEntryTileUserDataAndRefreshBadging(this);
    }
}
