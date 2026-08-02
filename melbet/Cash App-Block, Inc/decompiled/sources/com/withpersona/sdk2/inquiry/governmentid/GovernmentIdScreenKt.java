package com.withpersona.sdk2.inquiry.governmentid;

import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public abstract class GovernmentIdScreenKt {
    public static Screen.CameraScreen newCameraScreen$default(GovernmentIdWorkflow.Input input, String str, String str2, Screen.CameraScreen.ManualCapture manualCapture, Screen.Overlay overlay, IdClass idClass, IdConfig.Side side, NavigationState navigationState, Function2 function2, Function0 function0, Function0 function02, boolean z, List list, GovernmentIdState governmentIdState, int i, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, Function2 function22, Function1 function1, Function1 function12, VideoCaptureMethod videoCaptureMethod, boolean z2, Function2 function23, Function0 function03, Function0 function04, int i2, String str3, CaptureTipsViewModel captureTipsViewModel, ScreenTransition screenTransition, int i3, int i4) {
        Function2 equals$$ExternalSyntheticLambda0 = (i3 & 256) != 0 ? new Equals$$ExternalSyntheticLambda0(7) : function2;
        Function2 equals$$ExternalSyntheticLambda02 = (131072 & i3) != 0 ? new Equals$$ExternalSyntheticLambda0(8) : function22;
        Function1 documentWorkflow$$ExternalSyntheticLambda7 = (262144 & i3) != 0 ? new DocumentWorkflow$$ExternalSyntheticLambda7(5) : function1;
        boolean z3 = (2097152 & i3) != 0;
        boolean z4 = (4194304 & i3) == 0;
        boolean z5 = (8388608 & i3) != 0 ? false : z2;
        Function2 equals$$ExternalSyntheticLambda03 = (16777216 & i3) != 0 ? new Equals$$ExternalSyntheticLambda0(9) : function23;
        Function0 shimmerThemeKt$$ExternalSyntheticLambda0 = (33554432 & i3) != 0 ? new ShimmerThemeKt$$ExternalSyntheticLambda0(13) : function03;
        int i5 = (134217728 & i3) != 0 ? input.imageCaptureCount : i2;
        String str4 = (268435456 & i3) != 0 ? null : str3;
        CaptureTipsViewModel captureTipsViewModel2 = (536870912 & i3) != 0 ? null : captureTipsViewModel;
        boolean z6 = (i3 & PKIFailureInfo.systemUnavail) == 0;
        ScreenTransition screenTransition2 = (i4 & 1) != 0 ? ScreenTransition.SLIDE_IN : screenTransition;
        input.getClass();
        GovernmentIdWorkflow.Input.Strings strings = input.strings;
        str2.getClass();
        manualCapture.getClass();
        overlay.getClass();
        idClass.getClass();
        side.getClass();
        navigationState.getClass();
        list.getClass();
        governmentIdState.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        VideoCaptureConfig videoCaptureConfig = input.videoCaptureConfig;
        String text = strings.scanInstructions.getText(null, null, side);
        if (text == null) {
            text = "";
        }
        String str5 = text;
        String str6 = strings.captureDisclaimer;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = input.styles;
        long j = videoCaptureConfig.maxRecordingLengthMs;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = input.assetConfig.getCapturePage();
        boolean z7 = input.isEnabled;
        boolean z8 = videoCaptureConfig.recordAudio;
        DesignVersion designVersion = input.designVersion;
        return new Screen.CameraScreen(str, str2, str5, str6, manualCapture, overlay, idClass, side, navigationState, equals$$ExternalSyntheticLambda0, function0, function02, z, list, governmentIdState, i, governmentIdStepStyle, equals$$ExternalSyntheticLambda02, documentWorkflow$$ExternalSyntheticLambda7, function12, i5, shimmerThemeKt$$ExternalSyntheticLambda0, function04, videoCaptureMethod, z5, equals$$ExternalSyntheticLambda03, z3, j, z4, str4, captureTipsViewModel2, capturePage, z7, z8, cameraXController_Factory_Impl, camera2Controller_Factory_Impl, designVersion, videoCaptureMethod != VideoCaptureMethod.None || designVersion == DesignVersion.K0000, z6, input.flowWatermarkText, screenTransition2);
    }
}
