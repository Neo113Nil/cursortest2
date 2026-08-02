package com.squareup.cash.work.data.real;

import com.squareup.cash.work.identifiers.MerchantIdentifier;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealShiftDataLoader$getWeekStartDaySetting$1 extends ContinuationImpl {
    public MerchantIdentifier L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealShiftDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShiftDataLoader$getWeekStartDaySetting$1(RealShiftDataLoader realShiftDataLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realShiftDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealShiftDataLoader.access$getWeekStartDaySetting(this.this$0, null, this);
    }
}
