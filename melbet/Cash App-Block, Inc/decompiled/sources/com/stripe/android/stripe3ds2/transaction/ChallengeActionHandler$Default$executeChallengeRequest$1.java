package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ChallengeActionHandler$Default$executeChallengeRequest$1 extends ContinuationImpl {
    public ChallengeRequestData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChallengeActionHandler$Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActionHandler$Default$executeChallengeRequest$1(ChallengeActionHandler$Default challengeActionHandler$Default, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = challengeActionHandler$Default;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ChallengeActionHandler$Default.access$executeChallengeRequest(this.this$0, null, this);
    }
}
