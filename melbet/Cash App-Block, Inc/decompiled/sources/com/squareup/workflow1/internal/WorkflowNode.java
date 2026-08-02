package com.squareup.workflow1.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.scannerview.ScannerView;
import com.squareup.workflow1.NoopWorkflowInterceptor;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowInterceptorKt;
import com.squareup.workflow1.WorkflowOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectBuilderImpl;
import net.idrnd.face.iad.capture.internal.e3;
import net.idrnd.misnap.iad.IadFrame;
import papa.PapaEvent;

/* loaded from: classes8.dex */
public final class WorkflowNode implements CoroutineScope {
    public final CoroutineContext coroutineContext;
    public final Function1 emitOutputToParent;
    public final BufferedChannel eventActionsChannel;
    public final WorkflowNodeId id;
    public final NoopWorkflowInterceptor interceptor;
    public Object lastProps;
    public final WorkflowNode parent;
    public final long sessionId;
    public final ToolbarTuckTargets sideEffects;
    public Object state;
    public final SubtreeManager subtreeManager;

    /* renamed from: com.squareup.workflow1.internal.WorkflowNode$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return new WorkflowOutput(obj);
        }
    }

    public WorkflowNode(WorkflowNodeId workflowNodeId, StatefulWorkflow statefulWorkflow, Object obj, TreeSnapshot treeSnapshot, CoroutineContext coroutineContext, Function1 function1, WorkflowNode workflowNode, NoopWorkflowInterceptor noopWorkflowInterceptor, IadFrame iadFrame) {
        statefulWorkflow.getClass();
        coroutineContext.getClass();
        function1.getClass();
        noopWorkflowInterceptor.getClass();
        this.id = workflowNodeId;
        this.emitOutputToParent = function1;
        this.parent = workflowNode;
        this.interceptor = noopWorkflowInterceptor;
        CoroutineContext plus = coroutineContext.plus(new JobImpl((Job) coroutineContext.get(Job.Key.$$INSTANCE))).plus(new CoroutineName(workflowNodeId.toString()));
        this.coroutineContext = plus;
        long j = iadFrame.b;
        iadFrame.b = 1 + j;
        this.sessionId = j;
        Map map = treeSnapshot == null ? null : (Map) treeSnapshot.childTreeSnapshots$delegate.getValue();
        ScannerView.AnonymousClass3 anonymousClass3 = new ScannerView.AnonymousClass3(1, this, WorkflowNode.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0, 26);
        plus.getClass();
        noopWorkflowInterceptor.getClass();
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.snapshotCache = map;
        subtreeManager.contextForChildren = plus;
        subtreeManager.emitActionToParent = anonymousClass3;
        subtreeManager.workflowSession = this;
        subtreeManager.interceptor = noopWorkflowInterceptor;
        subtreeManager.idCounter = iadFrame;
        subtreeManager.children = new ToolbarTuckTargets(21);
        this.subtreeManager = subtreeManager;
        this.sideEffects = new ToolbarTuckTargets(21);
        this.lastProps = obj;
        this.eventActionsChannel = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
        this.state = WorkflowInterceptorKt.intercept(noopWorkflowInterceptor, statefulWorkflow, this).initialState(obj, treeSnapshot != null ? (Snapshot) treeSnapshot.workflowSnapshot$delegate.getValue() : null);
    }

    public static final Object access$applyAction(WorkflowNode workflowNode, WorkflowAction workflowAction) {
        Object obj = workflowNode.lastProps;
        Object obj2 = workflowNode.state;
        workflowAction.getClass();
        WorkflowAction.Updater updater = new WorkflowAction.Updater(workflowAction, obj, obj2);
        workflowAction.apply(updater);
        Object obj3 = updater.state;
        WorkflowOutput workflowOutput = updater.maybeOutput;
        workflowNode.state = obj3;
        if (workflowOutput == null) {
            return null;
        }
        return workflowNode.emitOutputToParent.invoke(workflowOutput.value);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final Object render(StatefulWorkflow statefulWorkflow, Object obj) {
        statefulWorkflow.getClass();
        boolean areEqual = Intrinsics.areEqual(obj, this.lastProps);
        NoopWorkflowInterceptor noopWorkflowInterceptor = this.interceptor;
        if (!areEqual) {
            this.state = WorkflowInterceptorKt.intercept(noopWorkflowInterceptor, statefulWorkflow, this).onPropsChanged(this.lastProps, obj, this.state);
        }
        this.lastProps = obj;
        BufferedChannel bufferedChannel = this.eventActionsChannel;
        SubtreeManager subtreeManager = this.subtreeManager;
        RealRenderContext realRenderContext = new RealRenderContext(subtreeManager, this, bufferedChannel);
        Object render = WorkflowInterceptorKt.intercept(noopWorkflowInterceptor, statefulWorkflow, this).render(obj, this.state, new StatefulWorkflow.RenderContext(statefulWorkflow, realRenderContext));
        if (realRenderContext.frozen) {
            a$$ExternalSyntheticBUOutline0.m$1("RenderContext cannot be used after render method returns.");
            return null;
        }
        realRenderContext.frozen = true;
        ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) subtreeManager.children;
        for (InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode = (InlineLinkedList$InlineListNode) ((Lazy) toolbarTuckTargets.startCornerCenterX$delegate).initializer; inlineLinkedList$InlineListNode != null; inlineLinkedList$InlineListNode = inlineLinkedList$InlineListNode.getNextListNode()) {
            JobKt.cancel(((WorkflowChildNode) inlineLinkedList$InlineListNode).workflowNode.coroutineContext, (CancellationException) null);
        }
        Lazy lazy = (Lazy) toolbarTuckTargets.startCornerCenterX$delegate;
        toolbarTuckTargets.startCornerCenterX$delegate = (Lazy) toolbarTuckTargets.endCornerCenterX$delegate;
        toolbarTuckTargets.endCornerCenterX$delegate = lazy;
        lazy.initializer = null;
        lazy.value = null;
        subtreeManager.snapshotCache = null;
        ToolbarTuckTargets toolbarTuckTargets2 = this.sideEffects;
        for (InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode2 = (InlineLinkedList$InlineListNode) ((Lazy) toolbarTuckTargets2.endCornerCenterX$delegate).initializer; inlineLinkedList$InlineListNode2 != null; inlineLinkedList$InlineListNode2 = inlineLinkedList$InlineListNode2.getNextListNode()) {
            ((SideEffectNode) inlineLinkedList$InlineListNode2).job.start();
        }
        for (InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode3 = (InlineLinkedList$InlineListNode) ((Lazy) toolbarTuckTargets2.startCornerCenterX$delegate).initializer; inlineLinkedList$InlineListNode3 != null; inlineLinkedList$InlineListNode3 = inlineLinkedList$InlineListNode3.getNextListNode()) {
            ((SideEffectNode) inlineLinkedList$InlineListNode3).job.cancel(null);
        }
        Lazy lazy2 = (Lazy) toolbarTuckTargets2.startCornerCenterX$delegate;
        toolbarTuckTargets2.startCornerCenterX$delegate = (Lazy) toolbarTuckTargets2.endCornerCenterX$delegate;
        toolbarTuckTargets2.endCornerCenterX$delegate = lazy2;
        lazy2.initializer = null;
        lazy2.value = null;
        return render;
    }

    public final TreeSnapshot snapshot(StatefulWorkflow statefulWorkflow) {
        statefulWorkflow.getClass();
        SubtreeManager subtreeManager = this.subtreeManager;
        subtreeManager.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode = (InlineLinkedList$InlineListNode) ((Lazy) ((ToolbarTuckTargets) subtreeManager.children).startCornerCenterX$delegate).initializer; inlineLinkedList$InlineListNode != null; inlineLinkedList$InlineListNode = inlineLinkedList$InlineListNode.getNextListNode()) {
            WorkflowChildNode workflowChildNode = (WorkflowChildNode) inlineLinkedList$InlineListNode;
            StatefulWorkflow statefulWorkflow2 = workflowChildNode.workflow;
            statefulWorkflow2.getClass();
            WorkflowNode workflowNode = workflowChildNode.workflowNode;
            linkedHashMap.put(workflowNode.id, workflowNode.snapshot(statefulWorkflow2));
        }
        return new TreeSnapshot(WorkflowInterceptorKt.intercept(this.interceptor, statefulWorkflow, this).snapshotState(this.state), new e3(linkedHashMap, 7));
    }

    public final void tick(SelectBuilderImpl selectBuilderImpl) {
        SubtreeManager subtreeManager = this.subtreeManager;
        subtreeManager.getClass();
        for (InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode = (InlineLinkedList$InlineListNode) ((Lazy) ((ToolbarTuckTargets) subtreeManager.children).startCornerCenterX$delegate).initializer; inlineLinkedList$InlineListNode != null; inlineLinkedList$InlineListNode = inlineLinkedList$InlineListNode.getNextListNode()) {
            ((WorkflowChildNode) inlineLinkedList$InlineListNode).workflowNode.tick(selectBuilderImpl);
        }
        selectBuilderImpl.invoke(this.eventActionsChannel.getOnReceive(), new WorkflowNode$tick$1$1(this, (Continuation) null, 0));
    }

    public final String toString() {
        String str = this.parent == null ? null : "WorkflowInstance(…)";
        StringBuilder sb = new StringBuilder("WorkflowInstance(identifier=");
        WorkflowNodeId workflowNodeId = this.id;
        sb.append(workflowNodeId.identifier);
        sb.append(", renderKey=");
        sb.append(workflowNodeId.name);
        sb.append(", instanceId=");
        sb.append(this.sessionId);
        sb.append(", parent=");
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
