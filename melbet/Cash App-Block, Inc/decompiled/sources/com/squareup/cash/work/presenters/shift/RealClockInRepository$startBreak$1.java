package com.squareup.cash.work.presenters.shift;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealClockInRepository$startBreak$1 extends ContinuationImpl {
    public RealClockInRepository L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealClockInRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClockInRepository$startBreak$1(RealClockInRepository realClockInRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realClockInRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startBreak(null, null, null, 0L, this);
    }
}
