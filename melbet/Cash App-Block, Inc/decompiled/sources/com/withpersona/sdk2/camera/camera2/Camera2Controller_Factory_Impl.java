package com.withpersona.sdk2.camera.camera2;

import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes9.dex */
public final class Camera2Controller_Factory_Impl {
    public final RealWebSocket$connect$1 delegateFactory;

    public Camera2Controller_Factory_Impl(RealWebSocket$connect$1 realWebSocket$connect$1) {
        this.delegateFactory = realWebSocket$connect$1;
    }

    public final Camera2Controller create(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, Camera2ImageAnalyzer camera2ImageAnalyzer, VideoCaptureMethod videoCaptureMethod, boolean z) {
        RealWebSocket$connect$1 realWebSocket$connect$1 = this.delegateFactory;
        return new Camera2Controller((Camera2ManagerFactory_Factory_Impl) ((InstanceFactory) realWebSocket$connect$1.this$0).instance, (CameraChoiceHelper) ((Provider) realWebSocket$connect$1.$request).get(), cameraChoices, camera2PreviewView, camera2ImageAnalyzer, videoCaptureMethod, z);
    }
}
