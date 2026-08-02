package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup extends MathUtils {
    public final long maxRecordingLengthMs;

    public SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup(long j) {
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR;
        this.maxRecordingLengthMs = j;
    }

    @Override // com.google.android.material.math.MathUtils
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay() {
        return SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR;
    }
}
