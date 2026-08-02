package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture extends MathUtils {
    public final boolean forceCapture;
    public final Function1 onError;
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay;
    public final Function1 processImage;
    public final boolean showProgress;

    public SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture(Function1 function1, Function1 function12, boolean z, SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay, boolean z2) {
        this.processImage = function1;
        this.onError = function12;
        this.forceCapture = z;
        this.overlay = overlay;
        this.showProgress = z2;
    }

    @Override // com.google.android.material.math.MathUtils
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
