package com.withpersona.sdk2.inquiry.workflows;

import com.google.common.math.DoubleUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes9.dex */
public final class NamedWorkflowWorker implements WorkflowWorker {
    public final WorkflowWorker innerWorker;
    public final String name;

    public NamedWorkflowWorker(String str, WorkflowWorker workflowWorker) {
        str.getClass();
        this.name = str;
        this.innerWorker = workflowWorker;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!DoubleUtils.doesSameWorkAs(this, workflowWorker)) {
            return false;
        }
        NamedWorkflowWorker namedWorkflowWorker = (NamedWorkflowWorker) workflowWorker;
        return namedWorkflowWorker.innerWorker.doesSameWorkAs(this.innerWorker) && toString().equals(namedWorkflowWorker.toString());
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return this.innerWorker.run();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NamedWorkflowWorker(", this.name, ")");
    }
}
