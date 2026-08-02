package com.withpersona.sdk2.inquiry.internal.state;

import com.squareup.workflow1.StatefulWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public interface WorkflowStepModel extends IntermediateStepModel {
    StatefulWorkflow getChild();

    Function1 getHandler();

    Object getProps();
}
