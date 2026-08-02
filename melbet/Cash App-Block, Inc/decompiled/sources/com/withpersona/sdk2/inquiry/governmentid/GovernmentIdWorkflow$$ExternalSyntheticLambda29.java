package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdWorkflow$$ExternalSyntheticLambda29 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdState f$0;

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda29(GovernmentIdState governmentIdState, int i) {
        this.$r8$classId = i;
        this.f$0 = governmentIdState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        GovernmentIdState governmentIdState = this.f$0;
        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
        switch (i) {
            case 0:
                updater.getClass();
                updater.state = GovernmentIdState.ReviewSelectedImage.copy$default((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, false, 3583);
                break;
            case 1:
                updater.getClass();
                updater.state = GovernmentIdState.ReviewCapturedImage.copy$default((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, false, 1791);
                break;
            case 2:
                updater.getClass();
                updater.state = GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState, false, null, 447);
                break;
            case 3:
                updater.getClass();
                updater.state = GovernmentIdState.ShowInstructions.copy$default((GovernmentIdState.ShowInstructions) governmentIdState, null);
                break;
            default:
                updater.getClass();
                updater.state = GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState, false, null, 255);
                break;
        }
        return Unit.INSTANCE;
    }
}
