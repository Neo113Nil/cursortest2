package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture extends zzpc {
    public final Function1 finalizeVideo;
    public final Function0 onAnimationComplete;
    public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;
    public final boolean startFinalize;

    public SelfieWorkflow$Screen$CameraScreen$Mode$FinalizeLocalVideoCapture(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, Function1 function1, Function0 function0, boolean z) {
        this.overlay = overlay;
        this.finalizeVideo = function1;
        this.onAnimationComplete = function0;
        this.startFinalize = z;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
    public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
