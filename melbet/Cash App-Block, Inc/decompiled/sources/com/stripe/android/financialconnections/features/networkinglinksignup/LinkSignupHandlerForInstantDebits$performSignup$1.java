package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.uicore.elements.PhoneNumberController;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class LinkSignupHandlerForInstantDebits$performSignup$1 extends ContinuationImpl {
    public NetworkingLinkSignupState L$0;
    public PhoneNumberController L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SubtreeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkSignupHandlerForInstantDebits$performSignup$1(SubtreeManager subtreeManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = subtreeManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.performSignup(null, this);
    }
}
