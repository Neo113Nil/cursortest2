package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.material.math.MathUtils;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public abstract class SelfieV1UtilsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Selfie.Pose.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Selfie.Pose pose = Selfie.Pose.Center;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Selfie.Pose pose2 = Selfie.Pose.Center;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DesignVersion.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DesignVersion designVersion = DesignVersion.V0;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DesignVersion designVersion2 = DesignVersion.V0;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static SelfieWorkflow.Screen createCameraScreen$default(SelfieWorkflow.Input input, SubtreeManager subtreeManager, Selfie.Pose pose, String str, String str2, String str3, boolean z, MathUtils mathUtils, SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides assetOverrides, boolean z2, NavigationState navigationState, Function0 function0, Function0 function02, BlurEffectKt$$ExternalSyntheticLambda1 blurEffectKt$$ExternalSyntheticLambda1, Function0 function03, VideoCaptureMethod videoCaptureMethod, boolean z3, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, float f, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.FacingMode facingMode, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        String poseTitle;
        int i2 = 0;
        boolean z8 = (i & 16777216) != 0 ? false : z5;
        boolean z9 = (i & 33554432) != 0 ? false : z6;
        boolean z10 = (i & 67108864) != 0 ? false : z7;
        boolean z11 = (i & 134217728) != 0;
        input.getClass();
        DesignVersion designVersion = input.designVersion;
        subtreeManager.getClass();
        navigationState.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        facingMode.getClass();
        SelfieWorkflow.Input.Strings strings = input.strings;
        int ordinal = designVersion.ordinal();
        if (ordinal == 0) {
            return new SelfieWorkflow.Screen.OldCameraScreen(str, str2, mathUtils, input.styles, assetOverrides, z2, navigationState, function0, function02, blurEffectKt$$ExternalSyntheticLambda1, function03, videoCaptureMethod, z3, cameraXController_Factory_Impl, camera2Controller_Factory_Impl, z10, input.flowWatermarkText);
        }
        if (ordinal != 1 && ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (!(mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable)) {
            poseTitle = mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup ? strings.cameraLoadingTitle : getPoseTitle(input, pose);
        } else if (designVersion == DesignVersion.K0000) {
            Selfie.Pose pose2 = (Selfie.Pose) CollectionsKt.firstOrNull(input.orderedPoses);
            int i3 = pose2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pose2.ordinal()];
            poseTitle = (i3 == 1 || i3 == 2) ? getPoseTitle(input, pose) : i3 != 3 ? strings.cameraLoadingTitle : getPoseDescription(input, pose);
        } else {
            poseTitle = strings.cameraLoadingTitle;
        }
        return new SelfieWorkflow.Screen.CameraScreen(str, poseTitle, getPoseDescription(input, pose), z ? strings.autoCaptureOn : null, strings.captureSuccess, str3, strings.selfieHintAutoCaptureTimeout, strings.selfieHintVerifying, z, to(mathUtils), input.styles, z2, navigationState, function0, function02, blurEffectKt$$ExternalSyntheticLambda1, function03, videoCaptureMethod, z3, cameraXController_Factory_Impl, camera2Controller_Factory_Impl, new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager, i2), f, selfieBrightnessInfo, facingMode, z4, z8, new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager, 6), pose, z9, z10, z11, input.designVersion, input.flowWatermarkText);
    }

    public static final String getPoseDescription(SelfieWorkflow.Input input, Selfie.Pose pose) {
        int i = pose == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return input.strings.selfieHintLookLeftDescription;
        }
        if (i == 2) {
            return input.strings.selfieHintLookRightDescription;
        }
        if (i == 3) {
            return input.strings.selfieHintCenterFaceDescription;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String getPoseTitle(SelfieWorkflow.Input input, Selfie.Pose pose) {
        int i = pose == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return input.strings.selfieHintLookLeft;
        }
        if (i == 2) {
            return input.strings.selfieHintLookRight;
        }
        if (i == 3) {
            return input.strings.selfieHintCenterFace;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static SelfieWorkflow.Screen oldCreateCameraScreen$default(SelfieWorkflow.Input input, StatefulWorkflow.RenderContext renderContext, Selfie.Pose pose, String str, String str2, String str3, boolean z, MathUtils mathUtils, SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides assetOverrides, boolean z2, NavigationState navigationState, Function0 function0, Function0 function02, SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda4, Function0 function03, VideoCaptureMethod videoCaptureMethod, boolean z3, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, float f, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.FacingMode facingMode, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        String poseTitle;
        int i2 = 0;
        boolean z8 = (i & 16777216) != 0 ? false : z5;
        boolean z9 = (i & 33554432) != 0 ? false : z6;
        boolean z10 = (i & 67108864) != 0 ? false : z7;
        boolean z11 = (i & 134217728) != 0;
        input.getClass();
        DesignVersion designVersion = input.designVersion;
        renderContext.getClass();
        navigationState.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        facingMode.getClass();
        SelfieWorkflow.Input.Strings strings = input.strings;
        int ordinal = designVersion.ordinal();
        if (ordinal == 0) {
            return new SelfieWorkflow.Screen.OldCameraScreen(str, str2, mathUtils, input.styles, assetOverrides, z2, navigationState, function0, function02, selfieV1UtilsKt$$ExternalSyntheticLambda4, function03, videoCaptureMethod, z3, cameraXController_Factory_Impl, camera2Controller_Factory_Impl, z10, input.flowWatermarkText);
        }
        if (ordinal != 1 && ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (!(mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable)) {
            poseTitle = mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup ? strings.cameraLoadingTitle : getPoseTitle(input, pose);
        } else if (designVersion == DesignVersion.K0000) {
            Selfie.Pose pose2 = (Selfie.Pose) CollectionsKt.firstOrNull(input.orderedPoses);
            int i3 = pose2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pose2.ordinal()];
            poseTitle = (i3 == 1 || i3 == 2) ? getPoseTitle(input, pose) : i3 != 3 ? strings.cameraLoadingTitle : getPoseDescription(input, pose);
        } else {
            poseTitle = strings.cameraLoadingTitle;
        }
        return new SelfieWorkflow.Screen.CameraScreen(str, poseTitle, getPoseDescription(input, pose), z ? strings.autoCaptureOn : null, strings.captureSuccess, str3, strings.selfieHintAutoCaptureTimeout, strings.selfieHintVerifying, z, to(mathUtils), input.styles, z2, navigationState, function0, function02, selfieV1UtilsKt$$ExternalSyntheticLambda4, function03, videoCaptureMethod, z3, cameraXController_Factory_Impl, camera2Controller_Factory_Impl, new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, i2), f, selfieBrightnessInfo, facingMode, z4, z8, new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 9), pose, z9, z10, z11, input.designVersion, input.flowWatermarkText);
    }

    public static final zzpc to(MathUtils mathUtils) {
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture) {
            final SelfieWorkflow.Screen.CameraScreen.Overlay overlay = SelfieWorkflowUtilsKt.to(((SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture) mathUtils).overlay);
            return new zzpc(overlay) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$AutoCapture
                public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;

                {
                    this.overlay = overlay;
                }

                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
                public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
                    return this.overlay;
                }
            };
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown) {
            SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown = (SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown) mathUtils;
            return new SelfieWorkflow$Screen$CameraScreen$Mode$CountDown(SelfieWorkflowUtilsKt.to(selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown.countDown);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture) {
            SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture = (SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture) mathUtils;
            return new SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture(SelfieWorkflowUtilsKt.to(selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture.finalizeVideo, selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture.onAnimationComplete, selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture.startFinalize);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture) {
            SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture = (SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture) mathUtils;
            return new SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture(SelfieWorkflowUtilsKt.to(selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture.processImage, selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture.onError, selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture.forceCapture);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown) {
            SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown = (SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown) mathUtils;
            return new SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown(SelfieWorkflowUtilsKt.to(selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown.onCaptureClicked);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint) {
            SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint = (SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint) mathUtils;
            return new SelfieWorkflow$Screen$CameraScreen$Mode$PlayPoseHint(SelfieWorkflowUtilsKt.to(selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint.poseHintComplete);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) {
            SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable = (SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) mathUtils;
            return new SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable(SelfieWorkflowUtilsKt.to(SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR), selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable.recordLocalVideo, selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable.maxRecordingLengthMs, selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable.previewReady, selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable.onError);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition) {
            SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition selfieWorkflow$Screen$OldCameraScreen$Mode$Transition = (SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition) mathUtils;
            return new SelfieWorkflow$Screen$CameraScreen$Mode$Transition(SelfieWorkflowUtilsKt.to(selfieWorkflow$Screen$OldCameraScreen$Mode$Transition.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$Transition.onComplete, selfieWorkflow$Screen$OldCameraScreen$Mode$Transition.imageCaptured);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup) {
            return new SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup(SelfieWorkflowUtilsKt.to(SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR), ((SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup) mathUtils).maxRecordingLengthMs);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
