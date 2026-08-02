package kotlinx.coroutines.flow;

import android.widget.TextView;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.UnsupportedDevice;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class FlowKt__CollectionKt$toCollection$2 implements FlowCollector {
    public final /* synthetic */ Object $destination;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FlowKt__CollectionKt$toCollection$2(Object obj, int i) {
        this.$r8$classId = i;
        this.$destination = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Function1 function1;
        Function1 function12;
        int i = this.$r8$classId;
        Object obj2 = this.$destination;
        switch (i) {
            case 0:
                ((Collection) obj2).add(obj);
                break;
            case 1:
                PermissionRequestWorkflow.Props props = (PermissionRequestWorkflow.Props) obj;
                PermissionRequestStateManager permissionRequestStateManager = (PermissionRequestStateManager) obj2;
                PermissionRequestStateManager.PermissionRequestState permissionRequestState = (PermissionRequestStateManager.PermissionRequestState) ((SubtreeManager) permissionRequestStateManager.lastChild).getState();
                if (permissionRequestState != null) {
                    PermissionRequestStateManager.access$handleState(permissionRequestStateManager, props, permissionRequestState);
                    break;
                } else {
                    break;
                }
            case 2:
                CameraState cameraState = (CameraState) obj;
                OldCameraScreenRunner oldCameraScreenRunner = (OldCameraScreenRunner) obj2;
                if (Intrinsics.areEqual(cameraState, CameraState.Error.INSTANCE)) {
                    Function1 function13 = oldCameraScreenRunner.currentErrorHandler;
                    if (function13 != null) {
                        function13.invoke(new UnsupportedDevice());
                    }
                } else if (cameraState instanceof CameraState.Closed) {
                    CameraState.Closed closed = (CameraState.Closed) cameraState;
                    if (closed.wasRecordingInterrupted && (function1 = oldCameraScreenRunner.currentErrorHandler) != null) {
                        function1.invoke(new RecordingInterrupted(closed.isClosedDueToBadCameraConfiguration));
                    }
                }
                break;
            case 3:
                String str = (String) obj;
                TextView textView = ((BasicSelfieCaptureViewController) obj2).binding.realTimeHint;
                if (str == null || StringsKt.isBlank(str)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                    textView.setVisibility(0);
                }
                break;
            case 4:
                CameraState cameraState2 = (CameraState) obj;
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj2;
                if (Intrinsics.areEqual(cameraState2, CameraState.Error.INSTANCE)) {
                    Function1 function14 = cameraScreenRunner.currentErrorHandler;
                    if (function14 != null) {
                        function14.invoke(new UnsupportedDevice());
                    }
                } else if (cameraState2 instanceof CameraState.Closed) {
                    CameraState.Closed closed2 = (CameraState.Closed) cameraState2;
                    if (closed2.wasRecordingInterrupted && (function12 = cameraScreenRunner.currentErrorHandler) != null) {
                        function12.invoke(new RecordingInterrupted(closed2.isClosedDueToBadCameraConfiguration));
                    }
                }
                break;
            case 5:
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) obj;
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) obj2;
                SelfieState selfieState = (SelfieState) ((SubtreeManager) selfieStepStateManager.lastChild).getState();
                if (selfieState != null) {
                    selfieStepStateManager.handleState(input, selfieState);
                    break;
                } else {
                    break;
                }
            default:
                BaseWorkflowFragment baseWorkflowFragment = (BaseWorkflowFragment) obj2;
                if (obj != null) {
                    baseWorkflowFragment.render(obj);
                    baseWorkflowFragment.startPostponedEnterTransition();
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
