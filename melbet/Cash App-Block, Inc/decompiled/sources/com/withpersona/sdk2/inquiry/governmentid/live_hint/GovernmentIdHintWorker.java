package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import android.content.Context;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "HintEvent", "com/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker_Factory_Impl", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GovernmentIdHintWorker implements Worker<Hint>, WorkflowWorker {
    public final Context context;
    public final GovernmentIdFeed governmentIdFeed;
    public final IdConfig.Side side;

    /* loaded from: classes8.dex */
    public final class HintEvent {
        public final Hint hint;

        public HintEvent(Hint hint) {
            this.hint = hint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HintEvent) && this.hint.equals(((HintEvent) obj).hint);
        }

        public final int hashCode() {
            return Long.hashCode(1000L) + (this.hint.hashCode() * 31);
        }

        public final String toString() {
            return "HintEvent(hint=" + this.hint + ", minDurationMs=1000)";
        }
    }

    public GovernmentIdHintWorker(Context context, GovernmentIdFeed governmentIdFeed, IdConfig.Side side) {
        context.getClass();
        governmentIdFeed.getClass();
        side.getClass();
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.side = side;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        return (worker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) worker).side == this.side;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdHintWorker)) {
            return false;
        }
        GovernmentIdHintWorker governmentIdHintWorker = (GovernmentIdHintWorker) obj;
        return Intrinsics.areEqual(this.context, governmentIdHintWorker.context) && Intrinsics.areEqual(this.governmentIdFeed, governmentIdHintWorker.governmentIdFeed) && this.side == governmentIdHintWorker.side;
    }

    public final int hashCode() {
        return this.side.hashCode() + ((this.governmentIdFeed.hashCode() + (this.context.hashCode() * 31)) * 31);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        Continuation continuation = null;
        return FlowKt.distinctUntilChanged(new SafeFlow(new TransitionWorker$run$1(new SafeFlow(new TransitionWorker$run$1(this, continuation, 3)), continuation, 2)));
    }

    public final String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return (workflowWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) workflowWorker).side == this.side;
    }
}
