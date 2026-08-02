package papa.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import papa.AppStart$AppStartData;

/* loaded from: classes9.dex */
public final /* synthetic */ class AppUpdateDetector$Companion$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Throwable f$0;

    public /* synthetic */ AppUpdateDetector$Companion$$ExternalSyntheticLambda5(Throwable th, int i) {
        this.$r8$classId = i;
        this.f$0 = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Throwable th = this.f$0;
        switch (i) {
            case 0:
                AppStart$AppStartData appStart$AppStartData = (AppStart$AppStartData) obj;
                appStart$AppStartData.getClass();
                break;
            case 1:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                ((GovernmentIdState) updater.state).deleteAllIds();
                if (!((RecordingInterrupted) th).isClosedDueToBadCameraConfiguration) {
                    updater.state = new GovernmentIdState.ShowInstructions(((GovernmentIdState) updater.state).getCountryCode$government_id_release());
                }
                break;
            case 2:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unexpected camera error with type ", th.getClass().getCanonicalName()))));
                break;
            case 3:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                Object obj2 = updater3.state;
                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj2 : null;
                if (waitForAutocapture != null) {
                    updater3.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, Screen.CameraScreen.ManualCapture.Enabled, null, this.f$0, false, false, null, 32247);
                    break;
                } else {
                    break;
                }
            default:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                updater4.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unexpected camera error with type ", th.getClass().getCanonicalName()))));
                break;
        }
        return Unit.INSTANCE;
    }
}
