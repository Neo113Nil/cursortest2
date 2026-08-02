package com.withpersona.sdk2.inquiry.document;

import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentLoadingBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class DocumentPendingRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final DocumentPendingRunner$Companion$2 INSTANCE = new DocumentPendingRunner$Companion$2(1, DocumentPendingRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pi2DocumentLoadingBinding pi2DocumentLoadingBinding = (Pi2DocumentLoadingBinding) obj;
        pi2DocumentLoadingBinding.getClass();
        return new DocumentPendingRunner(pi2DocumentLoadingBinding);
    }
}
