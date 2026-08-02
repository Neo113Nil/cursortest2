package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdWorkflow$$ExternalSyntheticLambda5 implements Sink {
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ GovernmentIdWorkflow f$1;

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda5(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow) {
        this.f$0 = renderContext;
        this.f$1 = governmentIdWorkflow;
    }

    @Override // com.squareup.workflow1.Sink
    public final void send(Object obj) {
        GovernmentIdWorkflow.Output output = (GovernmentIdWorkflow.Output) obj;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        Sink actionSink = renderContext.$$delegate_0.getActionSink();
        GovernmentIdWorkflow governmentIdWorkflow = this.f$1;
        actionSink.send(Workflows.action$default(governmentIdWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda38(governmentIdWorkflow, renderContext, output, false, 11)));
    }
}
