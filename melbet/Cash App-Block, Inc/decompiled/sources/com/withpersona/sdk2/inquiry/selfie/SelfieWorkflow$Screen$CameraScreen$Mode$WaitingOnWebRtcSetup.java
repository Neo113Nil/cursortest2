package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup extends zzpc {
    public final long maxRecordingLengthMs;
    public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;

    public SelfieWorkflow$Screen$CameraScreen$Mode$WaitingOnWebRtcSetup(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, long j) {
        this.overlay = overlay;
        this.maxRecordingLengthMs = j;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
    public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
