package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.squareup.workflow1.Sink;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdStepStateManager$renderScreen$12 implements Sink, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdStepStateManager $tmp0;

    public /* synthetic */ GovernmentIdStepStateManager$renderScreen$12(GovernmentIdStepStateManager governmentIdStepStateManager, int i) {
        this.$r8$classId = i;
        this.$tmp0 = governmentIdStepStateManager;
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof Sink) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof Sink) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.$r8$classId) {
        }
        return new FunctionReferenceImpl(1, 0, GovernmentIdStepStateManager.class, this.$tmp0, "setOutput", "setOutput(Ljava/lang/Object;)V");
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // com.squareup.workflow1.Sink
    public final void send(Object obj) {
        int i = this.$r8$classId;
        GovernmentIdStepStateManager governmentIdStepStateManager = this.$tmp0;
        switch (i) {
            case 0:
                governmentIdStepStateManager.setOutput((GovernmentIdWorkflow.Output) obj);
                break;
            default:
                governmentIdStepStateManager.setOutput((GovernmentIdWorkflow.Output) obj);
                break;
        }
    }
}
