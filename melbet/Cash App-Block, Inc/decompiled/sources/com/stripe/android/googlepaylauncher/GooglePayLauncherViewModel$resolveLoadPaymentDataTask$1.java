package com.stripe.android.googlepaylauncher;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1(GooglePayLauncherViewModel googlePayLauncherViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4022access$resolveLoadPaymentDataTaskIoAF18A = GooglePayLauncherViewModel.m4022access$resolveLoadPaymentDataTaskIoAF18A(this.this$0, this);
        return m4022access$resolveLoadPaymentDataTaskIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4022access$resolveLoadPaymentDataTaskIoAF18A : new Result(m4022access$resolveLoadPaymentDataTaskIoAF18A);
    }
}
