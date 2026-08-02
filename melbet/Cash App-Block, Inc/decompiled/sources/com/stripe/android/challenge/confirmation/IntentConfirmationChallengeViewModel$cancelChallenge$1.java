package com.stripe.android.challenge.confirmation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class IntentConfirmationChallengeViewModel$cancelChallenge$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IntentConfirmationChallengeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentConfirmationChallengeViewModel$cancelChallenge$1(IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = intentConfirmationChallengeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return IntentConfirmationChallengeViewModel.access$cancelChallenge(this.this$0, this);
    }
}
