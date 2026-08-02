package com.withpersona.sdk2.inquiry.governmentid.capture;

import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class CaptureRenderer$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdState.WaitForAutocapture f$0;

    public /* synthetic */ CaptureRenderer$$ExternalSyntheticLambda3(GovernmentIdState.WaitForAutocapture waitForAutocapture, int i) {
        this.$r8$classId = i;
        this.f$0 = waitForAutocapture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = this.f$0;
                if (waitForAutocapture.manualCapture == Screen.CameraScreen.ManualCapture.Hidden) {
                    updater.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, Screen.CameraScreen.ManualCapture.Enabled, null, null, false, false, null, 32759);
                }
                return Unit.INSTANCE;
            case 1:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = this.f$0;
                if (waitForAutocapture2.manualCapture == Screen.CameraScreen.ManualCapture.Hidden) {
                    updater2.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, Screen.CameraScreen.ManualCapture.Enabled, null, null, false, false, null, 32759);
                }
                return Unit.INSTANCE;
            case 2:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.state = GovernmentIdState.WaitForAutocapture.copy$default(this.f$0, Screen.CameraScreen.ManualCapture.Disabled, null, null, false, false, null, 32759);
                return Unit.INSTANCE;
            default:
                ((Unit) obj).getClass();
                return Workflows.action$default(new CaptureRenderer$$ExternalSyntheticLambda3(this.f$0, 0));
        }
    }
}
