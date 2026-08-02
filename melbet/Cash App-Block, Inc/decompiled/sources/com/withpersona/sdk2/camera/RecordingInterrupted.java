package com.withpersona.sdk2.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/camera/RecordingInterrupted;", "Lcom/withpersona/sdk2/camera/CameraError;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecordingInterrupted extends CameraError {
    public final boolean isClosedDueToBadCameraConfiguration;

    public RecordingInterrupted(boolean z) {
        this.isClosedDueToBadCameraConfiguration = z;
    }
}
