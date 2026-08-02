package com.squareup.workflow1;

import com.squareup.workflow1.Worker;
import kotlin.Metadata;
import kotlin.reflect.KType;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/workflow1/TypedWorker;", "OutputT", "Lcom/squareup/workflow1/Worker;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypedWorker<OutputT> implements Worker<OutputT> {
    public final KType outputType;
    public final Flow work;

    public TypedWorker(KType kType, Flow flow) {
        kType.getClass();
        flow.getClass();
        this.outputType = kType;
        this.work = flow;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run, reason: from getter */
    public final Flow getWork() {
        return this.work;
    }

    public final String toString() {
        return "TypedWorker(" + this.outputType + ')';
    }
}
