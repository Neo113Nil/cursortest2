package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import android.content.Context;
import android.view.ViewGroup;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.governmentid.Screen;

/* loaded from: classes9.dex */
public interface GovIdCaptureViewController {

    public interface Factory {
        BasicGovIdCaptureViewController newViewController(GovernmentIdFeed governmentIdFeed, CameraPreview cameraPreview, FeatureFlagManager featureFlagManager, Screen.CameraScreen cameraScreen, Context context, ViewGroup viewGroup);
    }
}
