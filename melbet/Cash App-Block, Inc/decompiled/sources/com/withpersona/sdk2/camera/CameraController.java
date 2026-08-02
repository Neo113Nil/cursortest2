package com.withpersona.sdk2.camera;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public interface CameraController {
    void destroy();

    void enableTorch(boolean z);

    void focus();

    CameraProperties getCameraProperties();

    StateFlowImpl getCameraState();

    View getPreviewView();

    boolean isRecordingLocally();

    void prepare();

    void setAnalyzerEnabled(boolean z);

    /* renamed from: startVideo-IoAF18A, reason: not valid java name */
    Object mo4083startVideoIoAF18A(Continuation continuation);

    /* renamed from: stopVideo-IoAF18A, reason: not valid java name */
    Object mo4084stopVideoIoAF18A(Continuation continuation);

    /* renamed from: takePicture-IoAF18A, reason: not valid java name */
    Object mo4085takePictureIoAF18A(Continuation continuation);
}
