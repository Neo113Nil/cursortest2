package com.crrepa.band.my.device.camera;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class f {
    private static final String[] PERMISSION_STARTCAMERA = {"android.permission.CAMERA"};
    private static final int REQUEST_STARTCAMERA = 13;

    private f() {
    }

    static void onRequestPermissionsResult(@NonNull GoogleCameraActivity googleCameraActivity, int i8, int[] iArr) {
        if (i8 != 13) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            googleCameraActivity.startCamera();
        } else if (q7.b.shouldShowRequestPermissionRationale(googleCameraActivity, PERMISSION_STARTCAMERA)) {
            googleCameraActivity.showDeniedForCamera();
        } else {
            googleCameraActivity.showNeverAskForCamera();
        }
    }

    static void startCameraWithPermissionCheck(@NonNull GoogleCameraActivity googleCameraActivity) {
        String[] strArr = PERMISSION_STARTCAMERA;
        if (q7.b.hasSelfPermissions(googleCameraActivity, strArr)) {
            googleCameraActivity.startCamera();
        } else {
            ActivityCompat.requestPermissions(googleCameraActivity, strArr, 13);
        }
    }
}
