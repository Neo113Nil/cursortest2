package com.stripe.android.challenge.passive.warmer.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PassiveChallengeWarmerViewModel$warmUpPassiveChallenge$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PassiveChallengeWarmerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassiveChallengeWarmerViewModel$warmUpPassiveChallenge$1(PassiveChallengeWarmerViewModel passiveChallengeWarmerViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = passiveChallengeWarmerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.warmUpPassiveChallenge(null, this);
    }
}
