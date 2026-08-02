package com.stripe.android.payments.core.authentication;

import com.google.android.gms.internal.mlkit_genai_prompt.zzki;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class PaymentNextActionHandlerKt$awaitResumed$1 extends ContinuationImpl {
    public CompletableDeferredImpl L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzki.access$awaitResumed(null, this);
    }
}
