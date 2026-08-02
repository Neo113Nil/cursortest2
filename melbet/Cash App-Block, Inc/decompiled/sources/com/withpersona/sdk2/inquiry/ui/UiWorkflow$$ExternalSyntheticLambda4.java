package com.withpersona.sdk2.inquiry.ui;

import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiWorkflow$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiState.Displaying f$0;

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda4(UiState.Displaying displaying, int i) {
        this.$r8$classId = i;
        this.f$0 = displaying;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                updater.state = UiState.Displaying.copy$default(this.f$0, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65503);
                break;
            case 1:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.state = UiState.Displaying.copy$default(this.f$0, null, null, null, null, null, null, false, null, null, null, false, null, 0, 49151);
                break;
            case 2:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.state = UiState.Displaying.copy$default(this.f$0, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65407);
                updater3.setOutput(new UiWorkflow.Output.FinishedWithTransition());
                break;
            default:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                updater4.state = UiState.Displaying.copy$default(this.f$0, null, null, null, null, null, null, false, null, null, null, true, null, 0, 57311);
                break;
        }
        return Unit.INSTANCE;
    }
}
