package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class GooglePayLauncherViewModel$createPaymentDataRequest$1 extends ContinuationImpl {
    public GooglePayLauncherContract.Args L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$createPaymentDataRequest$1(GooglePayLauncherViewModel googlePayLauncherViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4023createPaymentDataRequestgIAlus = this.this$0.m4023createPaymentDataRequestgIAlus(null, this);
        return m4023createPaymentDataRequestgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4023createPaymentDataRequestgIAlus : new Result(m4023createPaymentDataRequestgIAlus);
    }
}
