package com.stripe.android.stripe3ds2.transaction;

import com.google.android.gms.maps.zzai;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class DefaultInitChallengeRepository$startChallenge$1 extends ContinuationImpl {
    public InitChallengeArgs L$0;
    public zzai L$1;
    public StripeErrorRequestExecutor L$5;
    public ChallengeRequestExecutor$Config L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ zzai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultInitChallengeRepository$startChallenge$1(zzai zzaiVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zzaiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startChallenge(null, this);
    }
}
