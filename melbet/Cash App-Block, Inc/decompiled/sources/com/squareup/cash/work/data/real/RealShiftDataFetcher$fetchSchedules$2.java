package com.squareup.cash.work.data.real;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealShiftDataFetcher$fetchSchedules$2 extends ContinuationImpl {
    public String L$1;
    public String L$2;
    public String L$3;
    public String L$4;
    public List L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AssetPublicSuffixList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftDataFetcher$fetchSchedules$2(AssetPublicSuffixList assetPublicSuffixList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = assetPublicSuffixList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchSchedules(null, null, null, this);
    }
}
