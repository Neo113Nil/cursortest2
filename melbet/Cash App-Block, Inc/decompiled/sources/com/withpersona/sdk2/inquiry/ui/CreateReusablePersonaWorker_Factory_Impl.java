package com.withpersona.sdk2.inquiry.ui;

import androidx.activity.result.ActivityResultLauncher;
import com.withpersona.sdk2.camera.CameraXController_Factory;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.ui.network.UiService;

/* loaded from: classes9.dex */
public final class CreateReusablePersonaWorker_Factory_Impl {
    public final CameraXController_Factory delegateFactory;

    public CreateReusablePersonaWorker_Factory_Impl(CameraXController_Factory cameraXController_Factory) {
        this.delegateFactory = cameraXController_Factory;
    }

    public final CreateReusablePersonaWorker create(String str, String str2, String str3, String str4) {
        CameraXController_Factory cameraXController_Factory = this.delegateFactory;
        return new CreateReusablePersonaWorker((UiService) cameraXController_Factory.contextProvider.get(), (RealDeviceIdProvider) cameraXController_Factory.cameraStatsManagerProvider.get(), (ActivityResultLauncher) cameraXController_Factory.sdkFilesManagerProvider.get(), str, str2, str3, str4);
    }
}
