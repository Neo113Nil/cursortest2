package com.squareup.workflow1;

import com.squareup.workflow1.StatefulWorkflow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KType;

/* loaded from: classes8.dex */
public final class WorkerWorkflow extends StatefulWorkflow {
    public final String key;
    public final WorkflowIdentifier realIdentifier;
    public final KType workerType;

    public WorkerWorkflow(KType kType, String str) {
        kType.getClass();
        str.getClass();
        this.workerType = kType;
        this.key = str;
        this.realIdentifier = new WorkflowIdentifier(kType, (WorkflowIdentifier) null, 6);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object initialState(Object obj, Snapshot snapshot) {
        ((Worker) obj).getClass();
        return 0;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object onPropsChanged(Object obj, Object obj2, Object obj3) {
        Worker worker = (Worker) obj;
        Worker worker2 = (Worker) obj2;
        int intValue = ((Number) obj3).intValue();
        worker.getClass();
        worker2.getClass();
        if (!worker.doesSameWorkAs(worker2)) {
            intValue++;
        }
        return Integer.valueOf(intValue);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object render(Object obj, Object obj2, StatefulWorkflow.RenderContext renderContext) {
        Worker worker = (Worker) obj;
        int intValue = ((Number) obj2).intValue();
        worker.getClass();
        renderContext.runningSideEffect(String.valueOf(intValue), new WorkerWorkflow$render$1(worker, this, renderContext, (Continuation) null, 0));
        return Unit.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final /* bridge */ /* synthetic */ Snapshot snapshotState(Object obj) {
        ((Number) obj).intValue();
        return null;
    }
}
