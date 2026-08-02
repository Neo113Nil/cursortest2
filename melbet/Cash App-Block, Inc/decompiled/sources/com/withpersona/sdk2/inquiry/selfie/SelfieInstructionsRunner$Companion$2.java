package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieInstructionsBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieInstructionsRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final SelfieInstructionsRunner$Companion$2 INSTANCE = new SelfieInstructionsRunner$Companion$2(1, SelfieInstructionsRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2SelfieInstructionsBinding pi2SelfieInstructionsBinding = (Pi2SelfieInstructionsBinding) obj;
        pi2SelfieInstructionsBinding.getClass();
        return new SelfieInstructionsRunner(pi2SelfieInstructionsBinding);
    }
}
