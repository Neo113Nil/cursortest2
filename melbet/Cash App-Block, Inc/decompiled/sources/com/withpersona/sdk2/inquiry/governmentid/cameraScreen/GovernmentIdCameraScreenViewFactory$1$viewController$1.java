package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import android.content.Context;
import android.view.ViewGroup;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.GovIdCaptureViewController;

/* loaded from: classes9.dex */
public final class GovernmentIdCameraScreenViewFactory$1$viewController$1 implements GovIdCaptureViewController.Factory {
    @Override // com.withpersona.sdk2.inquiry.governmentid.cameraScreen.GovIdCaptureViewController.Factory
    public final BasicGovIdCaptureViewController newViewController(GovernmentIdFeed governmentIdFeed, CameraPreview cameraPreview, FeatureFlagManager featureFlagManager, Screen.CameraScreen cameraScreen, Context context, ViewGroup viewGroup) {
        governmentIdFeed.getClass();
        cameraPreview.getClass();
        featureFlagManager.getClass();
        cameraScreen.getClass();
        context.getClass();
        return new BasicGovIdCaptureViewController(governmentIdFeed, cameraPreview, featureFlagManager, cameraScreen, context, viewGroup);
    }
}
