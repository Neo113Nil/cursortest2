package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdStateManagerUtilsKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SubtreeManager f$0;
    public final /* synthetic */ POPMatchingFactory f$1;

    public /* synthetic */ GovernmentIdStateManagerUtilsKt$$ExternalSyntheticLambda2(SubtreeManager subtreeManager, POPMatchingFactory pOPMatchingFactory, int i) {
        this.$r8$classId = i;
        this.f$0 = subtreeManager;
        this.f$1 = pOPMatchingFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        POPMatchingFactory pOPMatchingFactory = this.f$1;
        SubtreeManager subtreeManager = this.f$0;
        switch (i) {
            case 0:
                WorkflowState state = subtreeManager.getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
                if (waitForAutocapture != null) {
                    pOPMatchingFactory.getClass();
                    subtreeManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Disconnected, null, false, false, null, 32639));
                }
                break;
            case 1:
                WorkflowState state2 = subtreeManager.getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = state2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state2 : null;
                if (waitForAutocapture2 != null) {
                    pOPMatchingFactory.getClass();
                    subtreeManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Disconnected, null, false, false, null, 32639));
                }
                break;
            default:
                WorkflowState state3 = subtreeManager.getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture3 = state3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state3 : null;
                if (waitForAutocapture3 != null) {
                    pOPMatchingFactory.getClass();
                    subtreeManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture3, null, WebRtcState.Disconnected, null, false, false, null, 32639));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
