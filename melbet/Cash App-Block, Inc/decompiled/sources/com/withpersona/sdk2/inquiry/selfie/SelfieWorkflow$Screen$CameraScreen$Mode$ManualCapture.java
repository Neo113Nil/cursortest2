package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture extends zzpc {
    public final boolean forceCapture;
    public final Function1 onError;
    public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;
    public final Function1 processImage;

    public SelfieWorkflow$Screen$CameraScreen$Mode$ManualCapture(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, Function1 function1, Function1 function12, boolean z) {
        function1.getClass();
        function12.getClass();
        this.overlay = overlay;
        this.processImage = function1;
        this.onError = function12;
        this.forceCapture = z;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
    public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
