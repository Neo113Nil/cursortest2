package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewCapturesBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieReviewCapturesRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final SelfieReviewCapturesRunner$Companion$2 INSTANCE = new SelfieReviewCapturesRunner$Companion$2(1, SelfieReviewCapturesRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2SelfieReviewCapturesBinding pi2SelfieReviewCapturesBinding = (Pi2SelfieReviewCapturesBinding) obj;
        pi2SelfieReviewCapturesBinding.getClass();
        return new SelfieReviewCapturesRunner(pi2SelfieReviewCapturesBinding);
    }
}
