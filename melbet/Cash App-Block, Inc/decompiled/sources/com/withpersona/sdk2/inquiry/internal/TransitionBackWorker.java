package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes9.dex */
public final class TransitionBackWorker implements WorkflowWorker {
    public final String fromStep;
    public final InquiryApiHelper inquiryApiHelper;
    public final String inquiryId;
    public final InquirySessionConfig inquirySessionConfig;
    public final String sessionToken;

    public TransitionBackWorker(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, InquiryApiHelper inquiryApiHelper) {
        inquirySessionConfig.getClass();
        inquiryApiHelper.getClass();
        this.sessionToken = str;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof TransitionBackWorker)) {
            return false;
        }
        TransitionBackWorker transitionBackWorker = (TransitionBackWorker) workflowWorker;
        return this.sessionToken.equals(transitionBackWorker.sessionToken) && this.inquiryId.equals(transitionBackWorker.inquiryId);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 14));
    }
}
