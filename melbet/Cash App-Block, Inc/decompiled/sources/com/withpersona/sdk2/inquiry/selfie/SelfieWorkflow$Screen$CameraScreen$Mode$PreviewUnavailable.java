package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable extends zzpc {
    public final long maxRecordingLengthMs;
    public final Function1 onError;
    public final SelfieWorkflow.Screen.CameraScreen.Overlay overlay;
    public final Function1 previewReady;
    public final boolean recordLocalVideo;

    public SelfieWorkflow$Screen$CameraScreen$Mode$PreviewUnavailable(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, boolean z, long j, Function1 function1, Function1 function12) {
        this.overlay = overlay;
        this.recordLocalVideo = z;
        this.maxRecordingLengthMs = j;
        this.previewReady = function1;
        this.onError = function12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
    public final SelfieWorkflow.Screen.CameraScreen.Overlay getOverlay() {
        return this.overlay;
    }
}
