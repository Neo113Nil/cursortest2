package com.squareup.cash.work.data.real;

import com.squareup.cash.work.identifiers.MerchantIdentifier;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.ClosedRange;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealShiftDataFetcher$fetchSchedules$1 extends ContinuationImpl {
    public ClosedRange L$0;
    public MerchantIdentifier L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AssetPublicSuffixList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftDataFetcher$fetchSchedules$1(AssetPublicSuffixList assetPublicSuffixList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = assetPublicSuffixList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchSchedules(null, this);
    }
}
