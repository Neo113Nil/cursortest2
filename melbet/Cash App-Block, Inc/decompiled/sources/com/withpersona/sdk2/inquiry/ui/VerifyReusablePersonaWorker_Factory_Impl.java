package com.withpersona.sdk2.inquiry.ui;

import androidx.activity.result.ActivityResultLauncher;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.camera.CameraXController_Factory;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import java.util.Map;

/* loaded from: classes9.dex */
public final class VerifyReusablePersonaWorker_Factory_Impl {
    public final CameraXController_Factory delegateFactory;

    public VerifyReusablePersonaWorker_Factory_Impl(CameraXController_Factory cameraXController_Factory) {
        this.delegateFactory = cameraXController_Factory;
    }

    public final VerifyReusablePersonaWorker create(String str, String str2, String str3, String str4, Map map) {
        CameraXController_Factory cameraXController_Factory = this.delegateFactory;
        return new VerifyReusablePersonaWorker((ActivityResultLauncher) cameraXController_Factory.contextProvider.get(), (UiService) cameraXController_Factory.cameraStatsManagerProvider.get(), (Moshi) cameraXController_Factory.sdkFilesManagerProvider.get(), str, str2, str3, str4, map);
    }
}
