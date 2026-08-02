package com.squareup.workflow1.internal;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* loaded from: classes8.dex */
public abstract class ChainedWorkflowInterceptor$wrap$1 {
    public abstract void onActionSent(WorkflowAction workflowAction, Function1 function1);

    public abstract Object onRenderChild(StatefulWorkflow statefulWorkflow, String str, Function1 function1, Function4 function4);

    public abstract void onRunningSideEffect(String str, Function1 function1, Function2 function2);
}
