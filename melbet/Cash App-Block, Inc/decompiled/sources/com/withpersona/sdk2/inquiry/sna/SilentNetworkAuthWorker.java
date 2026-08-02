package com.withpersona.sdk2.inquiry.sna;

import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/sna/SnaClient$Response$Error;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "net/oneformapp/helper/matching/POPMatchingFactory", "sna_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SilentNetworkAuthWorker implements Worker<SnaClient$Response$Error>, WorkflowWorker {
    public final int timeoutSeconds;

    public SilentNetworkAuthWorker(int i) {
        this.timeoutSeconds = i;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        return worker instanceof SilentNetworkAuthWorker;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return FlowKt.flowOn(new SafeFlow(new TransitionWorker$run$1(this, null, 28)), Dispatchers.Default);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
