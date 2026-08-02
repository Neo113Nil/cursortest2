package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes9.dex */
public final class UpdateInquirySessionWorker implements WorkflowWorker {
    public final InquiryApiHelper inquiryApiHelper;
    public final String inquiryId;
    public final InquirySessionConfig inquirySessionConfig;
    public final String sessionToken;

    public UpdateInquirySessionWorker(String str, String str2, InquirySessionConfig inquirySessionConfig, InquiryApiHelper inquiryApiHelper) {
        inquirySessionConfig.getClass();
        inquiryApiHelper.getClass();
        this.sessionToken = str;
        this.inquiryId = str2;
        this.inquirySessionConfig = inquirySessionConfig;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof UpdateInquirySessionWorker)) {
            return false;
        }
        UpdateInquirySessionWorker updateInquirySessionWorker = (UpdateInquirySessionWorker) workflowWorker;
        return this.sessionToken.equals(updateInquirySessionWorker.sessionToken) && this.inquiryId.equals(updateInquirySessionWorker.inquiryId);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 16));
    }
}
