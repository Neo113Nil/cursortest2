package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* loaded from: classes9.dex */
public final class WebRtcRenderer {
    public final Context applicationContext;
    public final Camera2Controller_Factory_Impl camera2ControllerFactory;
    public final CameraXController_Factory_Impl cameraXControllerFactory;
    public final NavigationStateManager navigationStateManager;
    public final TrackingEventsLogger trackingEventsLogger;

    public WebRtcRenderer(Context context, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, NavigationStateManager navigationStateManager, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        navigationStateManager.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.cameraXControllerFactory = cameraXController_Factory_Impl;
        this.camera2ControllerFactory = camera2Controller_Factory_Impl;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }
}
