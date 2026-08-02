package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture extends MathUtils {
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay;
    public final boolean showProgress;

    public SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay, boolean z) {
        this.overlay = overlay;
        this.showProgress = z;
    }

    @Override // com.google.android.material.math.MathUtils
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
