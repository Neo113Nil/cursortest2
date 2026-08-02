package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown extends MathUtils {
    public final Function0 onCaptureClicked;
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay;
    public final boolean showProgress;

    public SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown(Function0 function0, SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay, boolean z) {
        this.onCaptureClicked = function0;
        this.overlay = overlay;
        this.showProgress = z;
    }

    @Override // com.google.android.material.math.MathUtils
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
