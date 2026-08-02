package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable extends MathUtils {
    public final long maxRecordingLengthMs;
    public final Function1 onError;
    public final Function1 previewReady;
    public final boolean recordLocalVideo;
    public final boolean showProgress;

    public SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable(Function1 function1, boolean z, boolean z2, long j, Function1 function12) {
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR;
        this.previewReady = function1;
        this.showProgress = z;
        this.recordLocalVideo = z2;
        this.maxRecordingLengthMs = j;
        this.onError = function12;
    }

    @Override // com.google.android.material.math.MathUtils
    public final SelfieWorkflow.Screen.OldCameraScreen.Overlay getOverlay() {
        return SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR;
    }
}
