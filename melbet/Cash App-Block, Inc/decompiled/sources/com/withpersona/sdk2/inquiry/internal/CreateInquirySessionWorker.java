package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes9.dex */
public final class CreateInquirySessionWorker implements WorkflowWorker {
    public final InquiryApiHelper inquiryApiHelper;
    public final String inquiryId;
    public final InquirySessionDataWrapper inquirySessionDataWrapper;

    public CreateInquirySessionWorker(String str, InquirySessionDataWrapper inquirySessionDataWrapper, InquiryApiHelper inquiryApiHelper) {
        str.getClass();
        inquiryApiHelper.getClass();
        this.inquiryId = str;
        this.inquirySessionDataWrapper = inquirySessionDataWrapper;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (workflowWorker instanceof CreateInquirySessionWorker) {
            return Intrinsics.areEqual(this.inquiryId, ((CreateInquirySessionWorker) workflowWorker).inquiryId);
        }
        return false;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 9));
    }
}
