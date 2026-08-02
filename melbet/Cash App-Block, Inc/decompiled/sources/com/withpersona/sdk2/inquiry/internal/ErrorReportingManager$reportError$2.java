package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class ErrorReportingManager$reportError$2 extends ContinuationImpl {
    public String L$0;
    public ErrorRequest.ErrorType L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ErrorReportingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorReportingManager$reportError$2(ErrorReportingManager errorReportingManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = errorReportingManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.reportError(null, null, null, null, this);
    }
}
