package com.stripe.android.challenge.passive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PassiveChallengeViewModel$startPassiveChallenge$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PassiveChallengeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassiveChallengeViewModel$startPassiveChallenge$1(PassiveChallengeViewModel passiveChallengeViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = passiveChallengeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.startPassiveChallenge(null, this);
    }
}
