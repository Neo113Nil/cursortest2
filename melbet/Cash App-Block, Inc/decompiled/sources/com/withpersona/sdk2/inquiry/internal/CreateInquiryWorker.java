package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes9.dex */
public final class CreateInquiryWorker implements WorkflowWorker {
    public final InquiryAttributes attributes;
    public final InquiryApiHelper inquiryApiHelper;

    public CreateInquiryWorker(InquiryAttributes inquiryAttributes, InquiryApiHelper inquiryApiHelper) {
        inquiryApiHelper.getClass();
        this.attributes = inquiryAttributes;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof CreateInquiryWorker)) {
            return false;
        }
        InquiryAttributes inquiryAttributes = this.attributes;
        String str = inquiryAttributes.templateId;
        InquiryAttributes inquiryAttributes2 = ((CreateInquiryWorker) workflowWorker).attributes;
        return Intrinsics.areEqual(str, inquiryAttributes2.templateId) && Intrinsics.areEqual(inquiryAttributes.templateVersion, inquiryAttributes2.templateVersion) && inquiryAttributes.environment == inquiryAttributes2.environment;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 10));
    }
}
