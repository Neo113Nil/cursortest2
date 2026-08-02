package com.withpersona.sdk2.inquiry.selfie;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieV1UtilsKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SubtreeManager f$0;

    public /* synthetic */ SelfieV1UtilsKt$$ExternalSyntheticLambda2(SubtreeManager subtreeManager, int i) {
        this.$r8$classId = i;
        this.f$0 = subtreeManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WorkflowState copy$default;
        int i = this.$r8$classId;
        SubtreeManager subtreeManager = this.f$0;
        switch (i) {
            case 0:
                CameraProperties.FacingMode facingMode = (CameraProperties.FacingMode) obj;
                facingMode.getClass();
                subtreeManager.updateState(new SelfieState.RestartCamera(false, false, MaterialAttributes.createBackState(subtreeManager, false), facingMode));
                break;
            case 1:
                Option option = (Option) obj;
                option.getClass();
                WorkflowState state = subtreeManager.getState();
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = state instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) state : null;
                if (autoClassificationManualSelect != null) {
                    subtreeManager.updateState(GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect, option.value, null, 1535));
                    break;
                } else {
                    break;
                }
            case 2:
                Option option2 = (Option) obj;
                option2.getClass();
                WorkflowState state2 = subtreeManager.getState();
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect2 = state2 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) state2 : null;
                if (autoClassificationManualSelect2 != null) {
                    subtreeManager.updateState(GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect2, null, option2.value, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2));
                    break;
                } else {
                    break;
                }
            case 3:
                Hint hint = (Hint) obj;
                WorkflowState state3 = subtreeManager.getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = state3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state3 : null;
                if (waitForAutocapture != null) {
                    subtreeManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, false, false, hint, 24575));
                    break;
                } else {
                    break;
                }
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                WorkflowState state4 = subtreeManager.getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = state4 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state4 : null;
                if (waitForAutocapture2 != null) {
                    subtreeManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, Screen.CameraScreen.ManualCapture.Enabled, null, th, false, false, null, 32247));
                    break;
                } else {
                    break;
                }
            case 5:
                Hint hint2 = (Hint) obj;
                WorkflowState state5 = subtreeManager.getState();
                GovernmentIdState.CountdownToCapture countdownToCapture = state5 instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) state5 : null;
                if (countdownToCapture != null) {
                    subtreeManager.updateState(GovernmentIdState.CountdownToCapture.copy$default(countdownToCapture, hint2));
                    break;
                } else {
                    break;
                }
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SelfieState selfieState = (SelfieState) subtreeManager.getState();
                if (!(selfieState instanceof CameraState)) {
                    break;
                } else {
                    if (!(selfieState instanceof SelfieState.Capture)) {
                        if (!(selfieState instanceof SelfieState.CountdownToManualCapture)) {
                            if (!(selfieState instanceof SelfieState.StartCapture)) {
                                if (!(selfieState instanceof SelfieState.CountdownToCapture)) {
                                    if (!(selfieState instanceof SelfieState.ShowPoseHint)) {
                                        if (!(selfieState instanceof SelfieState.StartCaptureFaceDetected)) {
                                            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                                                if (!(selfieState instanceof SelfieState.WaitForWebRtcSetup)) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    copy$default = SelfieState.WaitForWebRtcSetup.copy$default((SelfieState.WaitForWebRtcSetup) selfieState, booleanValue);
                                                }
                                            } else {
                                                copy$default = SelfieState.WaitForCameraFeed.copy$default((SelfieState.WaitForCameraFeed) selfieState, false, false, booleanValue, 127);
                                            }
                                        } else {
                                            copy$default = SelfieState.StartCaptureFaceDetected.copy$default((SelfieState.StartCaptureFaceDetected) selfieState, booleanValue);
                                        }
                                    } else {
                                        copy$default = SelfieState.ShowPoseHint.copy$default((SelfieState.ShowPoseHint) selfieState, booleanValue);
                                    }
                                } else {
                                    copy$default = SelfieState.CountdownToCapture.copy$default((SelfieState.CountdownToCapture) selfieState, 0, null, booleanValue, 8191);
                                }
                            } else {
                                copy$default = SelfieState.StartCapture.copy$default((SelfieState.StartCapture) selfieState, null, RecyclerView.DECELERATION_RATE, null, booleanValue, 8191);
                            }
                        } else {
                            copy$default = SelfieState.CountdownToManualCapture.copy$default((SelfieState.CountdownToManualCapture) selfieState, 0, null, booleanValue, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                        }
                    } else {
                        copy$default = SelfieState.Capture.copy$default((SelfieState.Capture) selfieState, null, RecyclerView.DECELERATION_RATE, null, booleanValue, null, 12287);
                    }
                    subtreeManager.updateState(copy$default);
                    break;
                }
            default:
                File file = (File) obj;
                file.getClass();
                ArrayList arrayList = new ArrayList();
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.CaptureMethod.MANUAL));
                WorkflowState state6 = subtreeManager.getState();
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = state6 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) state6 : null;
                if (finalizeLocalVideoCapture != null) {
                    subtreeManager.updateState(SelfieState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture, CollectionsKt.plus((Iterable) arrayList, (Collection) finalizeLocalVideoCapture.selfies), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE));
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
