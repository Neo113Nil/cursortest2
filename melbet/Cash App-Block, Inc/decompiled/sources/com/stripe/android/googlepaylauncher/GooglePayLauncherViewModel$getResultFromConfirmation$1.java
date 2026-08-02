package com.stripe.android.googlepaylauncher;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class GooglePayLauncherViewModel$getResultFromConfirmation$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$getResultFromConfirmation$1(GooglePayLauncherViewModel googlePayLauncherViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getResultFromConfirmation$payments_core_release(0, null, this);
    }
}
