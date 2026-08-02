package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieSubmittingScreenBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieSubmittingRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final SelfieSubmittingRunner$Companion$2 INSTANCE = new SelfieSubmittingRunner$Companion$2(1, SelfieSubmittingRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2SelfieSubmittingScreenBinding pi2SelfieSubmittingScreenBinding = (Pi2SelfieSubmittingScreenBinding) obj;
        pi2SelfieSubmittingScreenBinding.getClass();
        return new SelfieSubmittingRunner(pi2SelfieSubmittingScreenBinding);
    }
}
