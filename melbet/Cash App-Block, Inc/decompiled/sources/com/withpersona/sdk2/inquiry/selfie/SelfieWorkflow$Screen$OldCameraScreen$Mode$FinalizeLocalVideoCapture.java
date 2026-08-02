package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture extends MathUtils {
    public final Function1 finalizeVideo;
    public final Function0 onAnimationComplete;
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay;
    public final boolean showProgress;
    public final boolean startFinalize;

    public SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture(Function1 function1, Function0 function0, boolean z, SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay, boolean z2) {
        this.finalizeVideo = function1;
        this.onAnimationComplete = function0;
        this.startFinalize = z;
        this.overlay = overlay;
        this.showProgress = z2;
    }

    @Override // com.google.android.material.math.MathUtils
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
