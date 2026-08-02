package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners;

import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewSelectedImageBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ReviewSelectedImageScreenRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ReviewSelectedImageScreenRunner$Companion$2() {
        super(1, ReviewSelectedImageScreenRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding = (Pi2GovernmentidReviewSelectedImageBinding) obj;
        pi2GovernmentidReviewSelectedImageBinding.getClass();
        return new ReviewSelectedImageScreenRunner(pi2GovernmentidReviewSelectedImageBinding);
    }
}
