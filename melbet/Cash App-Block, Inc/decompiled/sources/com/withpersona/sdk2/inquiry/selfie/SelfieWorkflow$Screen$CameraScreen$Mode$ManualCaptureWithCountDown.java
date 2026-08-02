package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown extends zzpc {
    public final Function0 onCaptureClicked;
    public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;

    public SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, Function0 function0) {
        this.overlay = overlay;
        this.onCaptureClicked = function0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
    public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
