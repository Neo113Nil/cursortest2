package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$CameraScreen$Mode$Transition extends zzpc {
    public final boolean imageCaptured;
    public final Function0 onComplete;
    public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;

    public SelfieWorkflow$Screen$CameraScreen$Mode$Transition(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, Function0 function0, boolean z) {
        this.overlay = overlay;
        this.onComplete = function0;
        this.imageCaptured = z;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
    public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
