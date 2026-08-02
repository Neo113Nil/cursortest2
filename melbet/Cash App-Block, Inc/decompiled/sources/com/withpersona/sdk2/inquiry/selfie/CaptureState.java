package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraProperties;

/* loaded from: classes9.dex */
public interface CaptureState extends CameraState {
    CameraProperties getCameraProperties();

    boolean getManualCaptureEnabled();

    long getStartCaptureTimestamp();

    long getStartSelfieTimestamp();
}
