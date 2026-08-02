package com.squareup.workflow1;

import com.squareup.workflow1.WorkflowAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public final class EmitWorkerOutputAction extends WorkflowAction {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object output;
    public final Serializable renderKey;
    public final Object worker;

    public EmitWorkerOutputAction(Worker worker, String str, Object obj) {
        worker.getClass();
        str.getClass();
        this.worker = worker;
        this.renderKey = str;
        this.output = obj;
    }

    @Override // com.squareup.workflow1.WorkflowAction
    public final void apply(WorkflowAction.Updater updater) {
        switch (this.$r8$classId) {
            case 0:
                updater.setOutput(this.output);
                break;
            default:
                ((Function1) this.worker).invoke(updater);
                break;
        }
    }

    public final String toString() {
        int i = this.$r8$classId;
        Serializable serializable = this.renderKey;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((Object) Reflection.factory.getOrCreateKotlinClass(EmitWorkerOutputAction.class).getQualifiedName());
                sb.append("(worker=");
                sb.append((Worker) this.worker);
                sb.append(", key=\"");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, (String) serializable, "\")");
            default:
                return "action(" + ((String) ((Workflows__WorkflowActionKt$action$1) serializable).invoke()) + ")-" + ((StatefulWorkflow) this.output);
        }
    }

    public EmitWorkerOutputAction(Function1 function1, Workflows__WorkflowActionKt$action$1 workflows__WorkflowActionKt$action$1, StatefulWorkflow statefulWorkflow) {
        this.worker = function1;
        this.renderKey = workflows__WorkflowActionKt$action$1;
        this.output = statefulWorkflow;
    }
}
