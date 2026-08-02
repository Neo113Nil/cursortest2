package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners;

import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidChooseCaptureMethodBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ChooseCaptureMethodScreenRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ChooseCaptureMethodScreenRunner$Companion$2() {
        super(1, ChooseCaptureMethodScreenRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding = (Pi2GovernmentidChooseCaptureMethodBinding) obj;
        pi2GovernmentidChooseCaptureMethodBinding.getClass();
        return new ChooseCaptureMethodScreenRunner(pi2GovernmentidChooseCaptureMethodBinding);
    }
}
