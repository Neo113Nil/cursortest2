package com.squareup.cash.work.data.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealGetClockInEssentialsUseCase$fetchBreakDefinitions$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGetClockInEssentialsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGetClockInEssentialsUseCase$fetchBreakDefinitions$1(RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGetClockInEssentialsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchBreakDefinitions(null, null, this);
    }
}
