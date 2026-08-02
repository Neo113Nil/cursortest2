package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfieWorkflow.Screen.OldCameraScreen f$0;

    public /* synthetic */ OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1$$ExternalSyntheticLambda0(SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen, int i) {
        this.$r8$classId = i;
        this.f$0 = oldCameraScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen = this.f$0;
        CameraError cameraError = (CameraError) obj;
        switch (i) {
            case 0:
                cameraError.getClass();
                oldCameraScreen.onCameraError.invoke(cameraError);
                break;
            default:
                cameraError.getClass();
                oldCameraScreen.onCameraError.invoke(cameraError);
                break;
        }
        return Unit.INSTANCE;
    }
}
