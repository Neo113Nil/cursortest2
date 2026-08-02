package com.withpersona.sdk2.inquiry.internal;

import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeCodeResult;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ExchangeOneTimeCodeWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeCodeResult;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "com/withpersona/sdk2/inquiry/internal/ExchangeOneTimeCodeWorker_Factory_Impl", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExchangeOneTimeCodeWorker implements Worker<ExchangeOneTimeCodeResult>, WorkflowWorker {
    public final InquiryApiHelper inquiryApiHelper;
    public final String oneTimeLinkCode;

    public ExchangeOneTimeCodeWorker(String str, InquiryApiHelper inquiryApiHelper) {
        str.getClass();
        inquiryApiHelper.getClass();
        this.oneTimeLinkCode = str;
        this.inquiryApiHelper = inquiryApiHelper;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (worker instanceof ExchangeOneTimeCodeWorker) {
            return Intrinsics.areEqual(this.oneTimeLinkCode, ((ExchangeOneTimeCodeWorker) worker).oneTimeLinkCode);
        }
        return false;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 11));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
