package com.squareup.workflow1.internal;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WorkflowChildNode implements InlineLinkedList$InlineListNode {
    public Function1 handler;
    public WorkflowChildNode nextListNode;
    public final StatefulWorkflow workflow;
    public final WorkflowNode workflowNode;

    public WorkflowChildNode(StatefulWorkflow statefulWorkflow, Function1 function1, WorkflowNode workflowNode) {
        statefulWorkflow.getClass();
        function1.getClass();
        this.workflow = statefulWorkflow;
        this.handler = function1;
        this.workflowNode = workflowNode;
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList$InlineListNode
    public final InlineLinkedList$InlineListNode getNextListNode() {
        return this.nextListNode;
    }

    public final boolean matches(StatefulWorkflow statefulWorkflow, String str) {
        statefulWorkflow.getClass();
        str.getClass();
        WorkflowNodeId workflowNodeId = this.workflowNode.id;
        return workflowNodeId.identifier.equals(Workflows.getIdentifier(statefulWorkflow)) && Intrinsics.areEqual(workflowNodeId.name, str);
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList$InlineListNode
    public final void setNextListNode(InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode) {
        this.nextListNode = (WorkflowChildNode) inlineLinkedList$InlineListNode;
    }
}
