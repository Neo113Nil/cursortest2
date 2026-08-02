package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.Selfie;
import java.util.List;

/* loaded from: classes9.dex */
public interface CameraState {
    boolean getAutoCaptureSupported();

    Selfie.Pose getCurrentPose();

    PoseConfig getCurrentPoseConfig();

    Selfie.Pose getCurrentPoseOrNull();

    PoseConfigs getPoseConfigs();

    List getPosesNeeded();

    boolean isFlashEnabled();
}
