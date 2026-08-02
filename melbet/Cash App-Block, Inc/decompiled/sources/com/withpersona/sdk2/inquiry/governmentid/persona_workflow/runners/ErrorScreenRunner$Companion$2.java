package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners;

import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2ErrorBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ErrorScreenRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ErrorScreenRunner$Companion$2() {
        super(1, ErrorScreenRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2ErrorBinding pi2ErrorBinding = (Pi2ErrorBinding) obj;
        pi2ErrorBinding.getClass();
        return new ErrorScreenRunner(pi2ErrorBinding);
    }
}
