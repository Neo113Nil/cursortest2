package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.media3.common.util.StuckPlayerDetector;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.uicore.elements.PhoneNumberController;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class LinkSignupHandlerForNetworking$performSignup$1 extends ContinuationImpl {
    public NetworkingLinkSignupState L$0;
    public List L$1;
    public FinancialConnectionsSessionManifest L$2;
    public PhoneNumberController L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StuckPlayerDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkSignupHandlerForNetworking$performSignup$1(StuckPlayerDetector stuckPlayerDetector, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stuckPlayerDetector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performSignup(null, this);
    }
}
