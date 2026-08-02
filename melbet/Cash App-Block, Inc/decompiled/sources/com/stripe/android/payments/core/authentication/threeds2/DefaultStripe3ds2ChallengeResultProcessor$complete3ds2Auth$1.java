package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 extends ContinuationImpl {
    public int I$0;
    public ChallengeResult L$0;
    public ApiRequest.Options L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultStripe3ds2ChallengeResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1(DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultStripe3ds2ChallengeResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.complete3ds2Auth(null, null, 0, this);
    }
}
