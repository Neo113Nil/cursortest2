package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition extends MathUtils {
    public final boolean imageCaptured;
    public final Function0 onComplete;
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay;
    public final boolean showProgress;

    public SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition(Function0 function0, boolean z, SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay, boolean z2) {
        this.onComplete = function0;
        this.imageCaptured = z;
        this.overlay = overlay;
        this.showProgress = z2;
    }

    @Override // com.google.android.material.math.MathUtils
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
