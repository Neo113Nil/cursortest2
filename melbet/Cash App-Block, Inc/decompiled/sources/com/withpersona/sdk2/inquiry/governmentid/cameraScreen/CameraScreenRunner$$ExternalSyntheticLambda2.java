package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class CameraScreenRunner$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraScreenRunner f$0;

    public /* synthetic */ CameraScreenRunner$$ExternalSyntheticLambda2(CameraScreenRunner cameraScreenRunner, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraScreenRunner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CameraScreenRunner cameraScreenRunner = this.f$0;
        switch (i) {
            case 0:
                cameraScreenRunner.cameraController.focus();
                break;
            default:
                CameraFeedKt.updateViewfinderRect(cameraScreenRunner.governmentIdFeed, cameraScreenRunner.cameraController, ((BasicGovIdCaptureViewController) cameraScreenRunner.viewController).binding.overlay);
                break;
        }
        return Unit.INSTANCE;
    }
}
