package com.squareup.workflow1.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.NoopWorkflowInterceptor;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.SendChannel;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final class RealRenderContext implements BaseRenderContext, Sink {
    public final SendChannel eventActionsChannel;
    public boolean frozen;
    public final SubtreeManager renderer;
    public final WorkflowNode sideEffectRunner;

    public RealRenderContext(SubtreeManager subtreeManager, WorkflowNode workflowNode, BufferedChannel bufferedChannel) {
        subtreeManager.getClass();
        bufferedChannel.getClass();
        this.renderer = subtreeManager;
        this.sideEffectRunner = workflowNode;
        this.eventActionsChannel = bufferedChannel;
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public final Sink getActionSink() {
        return this;
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public final Object renderChild(StatefulWorkflow statefulWorkflow, Object obj, String str, Function1 function1) {
        statefulWorkflow.getClass();
        str.getClass();
        function1.getClass();
        if (this.frozen) {
            a$$ExternalSyntheticBUOutline0.m$1("RenderContext cannot be used after render method returns.");
            return null;
        }
        SubtreeManager subtreeManager = this.renderer;
        subtreeManager.getClass();
        ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) subtreeManager.children;
        for (InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode = (InlineLinkedList$InlineListNode) ((Lazy) toolbarTuckTargets.endCornerCenterX$delegate).initializer; inlineLinkedList$InlineListNode != null; inlineLinkedList$InlineListNode = inlineLinkedList$InlineListNode.getNextListNode()) {
            if (((WorkflowChildNode) inlineLinkedList$InlineListNode).matches(statefulWorkflow, str)) {
                Path$$ExternalSyntheticBUOutline0.m(34, Workflows.getIdentifier(statefulWorkflow), ": key=\"", str, "Expected keys to be unique for ");
                return null;
            }
        }
        Lazy lazy = (Lazy) toolbarTuckTargets.startCornerCenterX$delegate;
        InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode2 = (InlineLinkedList$InlineListNode) lazy.initializer;
        InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode3 = null;
        while (true) {
            if (inlineLinkedList$InlineListNode2 == null) {
                inlineLinkedList$InlineListNode2 = null;
                break;
            }
            if (((WorkflowChildNode) inlineLinkedList$InlineListNode2).matches(statefulWorkflow, str)) {
                if (inlineLinkedList$InlineListNode3 == null) {
                    lazy.initializer = inlineLinkedList$InlineListNode2.getNextListNode();
                } else {
                    inlineLinkedList$InlineListNode3.setNextListNode(inlineLinkedList$InlineListNode2.getNextListNode());
                }
                if (Intrinsics.areEqual((InlineLinkedList$InlineListNode) lazy.value, inlineLinkedList$InlineListNode2)) {
                    lazy.value = inlineLinkedList$InlineListNode3;
                }
                inlineLinkedList$InlineListNode2.setNextListNode(null);
            } else {
                inlineLinkedList$InlineListNode3 = inlineLinkedList$InlineListNode2;
                inlineLinkedList$InlineListNode2 = inlineLinkedList$InlineListNode2.getNextListNode();
            }
        }
        if (inlineLinkedList$InlineListNode2 == null) {
            WorkflowNodeId workflowNodeId = new WorkflowNodeId(Workflows.getIdentifier(statefulWorkflow), str);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Map map = (Map) subtreeManager.snapshotCache;
            inlineLinkedList$InlineListNode2 = new WorkflowChildNode(statefulWorkflow, function1, new WorkflowNode(workflowNodeId, statefulWorkflow, obj, map != null ? (TreeSnapshot) map.get(workflowNodeId) : null, (CoroutineContext) subtreeManager.contextForChildren, new SubtreeManager$createChildNode$workflowNode$1(ref$ObjectRef, subtreeManager), (WorkflowNode) subtreeManager.workflowSession, (NoopWorkflowInterceptor) subtreeManager.interceptor, (IadFrame) subtreeManager.idCounter));
            ref$ObjectRef.element = inlineLinkedList$InlineListNode2;
        }
        ((Lazy) toolbarTuckTargets.endCornerCenterX$delegate).plusAssign(inlineLinkedList$InlineListNode2);
        WorkflowChildNode workflowChildNode = (WorkflowChildNode) inlineLinkedList$InlineListNode2;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function1);
        workflowChildNode.handler = function1;
        return workflowChildNode.workflowNode.render(statefulWorkflow, obj);
    }

    @Override // com.squareup.workflow1.BaseRenderContext
    public final void runningSideEffect(String str, Function2 function2) {
        str.getClass();
        if (this.frozen) {
            a$$ExternalSyntheticBUOutline0.m$1("RenderContext cannot be used after render method returns.");
            return;
        }
        WorkflowNode workflowNode = this.sideEffectRunner;
        ToolbarTuckTargets toolbarTuckTargets = workflowNode.sideEffects;
        for (InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode = (InlineLinkedList$InlineListNode) ((Lazy) toolbarTuckTargets.endCornerCenterX$delegate).initializer; inlineLinkedList$InlineListNode != null; inlineLinkedList$InlineListNode = inlineLinkedList$InlineListNode.getNextListNode()) {
            if (str.equals(((SideEffectNode) inlineLinkedList$InlineListNode).key)) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\"', "Expected side effect keys to be unique: \"", str));
                return;
            }
        }
        Lazy lazy = (Lazy) toolbarTuckTargets.startCornerCenterX$delegate;
        InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode2 = (InlineLinkedList$InlineListNode) lazy.initializer;
        InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode3 = null;
        while (true) {
            if (inlineLinkedList$InlineListNode2 == null) {
                inlineLinkedList$InlineListNode2 = null;
                break;
            }
            if (str.equals(((SideEffectNode) inlineLinkedList$InlineListNode2).key)) {
                if (inlineLinkedList$InlineListNode3 == null) {
                    lazy.initializer = inlineLinkedList$InlineListNode2.getNextListNode();
                } else {
                    inlineLinkedList$InlineListNode3.setNextListNode(inlineLinkedList$InlineListNode2.getNextListNode());
                }
                if (Intrinsics.areEqual((InlineLinkedList$InlineListNode) lazy.value, inlineLinkedList$InlineListNode2)) {
                    lazy.value = inlineLinkedList$InlineListNode3;
                }
                inlineLinkedList$InlineListNode2.setNextListNode(null);
            } else {
                inlineLinkedList$InlineListNode3 = inlineLinkedList$InlineListNode2;
                inlineLinkedList$InlineListNode2 = inlineLinkedList$InlineListNode2.getNextListNode();
            }
        }
        if (inlineLinkedList$InlineListNode2 == null) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("sideEffect[", str, "] for ");
            m3m.append(workflowNode.id);
            inlineLinkedList$InlineListNode2 = new SideEffectNode(str, JobKt.launch$default(JobKt.plus(new CoroutineName(m3m.toString()), workflowNode), null, CoroutineStart.LAZY, function2, 1));
        }
        ((Lazy) toolbarTuckTargets.endCornerCenterX$delegate).plusAssign(inlineLinkedList$InlineListNode2);
    }

    @Override // com.squareup.workflow1.Sink
    public final void send(Object obj) {
        WorkflowAction workflowAction = (WorkflowAction) obj;
        if (this.frozen) {
            this.eventActionsChannel.offer(workflowAction);
        } else {
            a$$ExternalSyntheticBUOutline0.m(Intrinsics.stringPlus(workflowAction, "Expected sink to not be sent to until after the render pass. Received action: "));
        }
    }
}
