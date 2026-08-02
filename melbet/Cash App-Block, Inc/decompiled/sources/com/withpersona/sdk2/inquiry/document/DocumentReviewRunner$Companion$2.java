package com.withpersona.sdk2.inquiry.document;

import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class DocumentReviewRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final DocumentReviewRunner$Companion$2 INSTANCE = new DocumentReviewRunner$Companion$2(1, DocumentReviewRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2DocumentReviewBinding pi2DocumentReviewBinding = (Pi2DocumentReviewBinding) obj;
        pi2DocumentReviewBinding.getClass();
        return new DocumentReviewRunner(pi2DocumentReviewBinding);
    }
}
