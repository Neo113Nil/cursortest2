package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$CameraScreen$Mode$CountDown extends zzpc {
    public final int countDown;
    public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;

    public SelfieWorkflow$Screen$CameraScreen$Mode$CountDown(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, int i) {
        this.overlay = overlay;
        this.countDown = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
    public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
