package com.withpersona.sdk2.camera;

import android.content.Context;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;

/* loaded from: classes9.dex */
public final class CameraXController_Factory_Impl {
    public final CameraXController_Factory delegateFactory;

    public CameraXController_Factory_Impl(CameraXController_Factory cameraXController_Factory) {
        this.delegateFactory = cameraXController_Factory;
    }

    public final CameraXController create(CameraPreview cameraPreview, PreviewView previewView, CameraXBinder cameraXBinder, boolean z) {
        CameraXController_Factory cameraXController_Factory = this.delegateFactory;
        return new CameraXController((Context) cameraXController_Factory.contextProvider.get(), (RealCameraStatsManager) cameraXController_Factory.cameraStatsManagerProvider.get(), (SdkFilesManager) cameraXController_Factory.sdkFilesManagerProvider.get(), cameraPreview, previewView, cameraXBinder, z);
    }
}
