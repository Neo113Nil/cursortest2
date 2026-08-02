package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraXController_Factory;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;

/* loaded from: classes9.dex */
public final class GovernmentIdAnalyzeWorker_Factory_Impl {
    public final CameraXController_Factory delegateFactory;

    public GovernmentIdAnalyzeWorker_Factory_Impl(CameraXController_Factory cameraXController_Factory) {
        this.delegateFactory = cameraXController_Factory;
    }

    public final GovernmentIdAnalyzeWorker create(IdConfig.Side side, String str) {
        CameraXController_Factory cameraXController_Factory = this.delegateFactory;
        return new GovernmentIdAnalyzeWorker((Context) cameraXController_Factory.contextProvider.get(), (GovernmentIdFeed) cameraXController_Factory.cameraStatsManagerProvider.get(), (SdkFilesManager) cameraXController_Factory.sdkFilesManagerProvider.get(), side, str);
    }
}
