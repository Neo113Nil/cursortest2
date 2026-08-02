package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdStepStateManager$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdStepStateManager f$0;
    public final /* synthetic */ GovernmentIdState f$1;

    public /* synthetic */ GovernmentIdStepStateManager$$ExternalSyntheticLambda5(GovernmentIdStepStateManager governmentIdStepStateManager, GovernmentIdState governmentIdState, int i) {
        this.$r8$classId = i;
        this.f$0 = governmentIdStepStateManager;
        this.f$1 = governmentIdState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GovernmentIdState governmentIdState = this.f$1;
        GovernmentIdStepStateManager governmentIdStepStateManager = this.f$0;
        switch (i) {
            case 0:
                governmentIdStepStateManager.updateState(GovernmentIdState.ReviewCapturedImage.copy$default((GovernmentIdState.ReviewCapturedImage) governmentIdState, null, false, 1791));
                break;
            case 1:
                governmentIdStepStateManager.updateState(GovernmentIdState.ReviewSelectedImage.copy$default((GovernmentIdState.ReviewSelectedImage) governmentIdState, null, false, 3583));
                break;
            case 2:
                governmentIdStepStateManager.updateState(GovernmentIdState.ShowInstructions.copy$default((GovernmentIdState.ShowInstructions) governmentIdState, null));
                break;
            case 3:
                governmentIdStepStateManager.documentSelectWorker.openDocumentLauncher.launch(new String[]{"image/*", "application/pdf"});
                governmentIdStepStateManager.updateState(GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState, true, null, 447));
                break;
            default:
                governmentIdStepStateManager.updateState(GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState, false, null, 255));
                break;
        }
        return Unit.INSTANCE;
    }
}
