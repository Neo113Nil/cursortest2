package com.crrepa.band.my.device.watchface;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class t {
    private static final String[] PERMISSION_SHOWAGREECAMERA = {"android.permission.CAMERA"};
    private static final String[] PERMISSION_SHOWAGREEFORSTORAGE = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private static final int REQUEST_SHOWAGREECAMERA = 11;
    private static final int REQUEST_SHOWAGREEFORSTORAGE = 12;

    private static final class b implements q7.a {
        private final WeakReference<DressWatchFaceCameraActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            DressWatchFaceCameraActivity dressWatchFaceCameraActivity = this.weakTarget.get();
            if (dressWatchFaceCameraActivity == null) {
                return;
            }
            dressWatchFaceCameraActivity.showDeniedForStorage();
        }

        @Override // q7.a
        public void proceed() {
            DressWatchFaceCameraActivity dressWatchFaceCameraActivity = this.weakTarget.get();
            if (dressWatchFaceCameraActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(dressWatchFaceCameraActivity, t.PERMISSION_SHOWAGREEFORSTORAGE, 12);
        }

        private b(@NonNull DressWatchFaceCameraActivity dressWatchFaceCameraActivity) {
            this.weakTarget = new WeakReference<>(dressWatchFaceCameraActivity);
        }
    }

    private t() {
    }

    static void onRequestPermissionsResult(@NonNull DressWatchFaceCameraActivity dressWatchFaceCameraActivity, int i8, int[] iArr) {
        if (i8 == 11) {
            if (q7.b.verifyPermissions(iArr)) {
                dressWatchFaceCameraActivity.showAgreeCamera();
                return;
            } else if (q7.b.shouldShowRequestPermissionRationale(dressWatchFaceCameraActivity, PERMISSION_SHOWAGREECAMERA)) {
                dressWatchFaceCameraActivity.showDeniedForCamera();
                return;
            } else {
                dressWatchFaceCameraActivity.showNeverAskForCamera();
                return;
            }
        }
        if (i8 != 12) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            dressWatchFaceCameraActivity.showAgreeForStorage();
        } else if (q7.b.shouldShowRequestPermissionRationale(dressWatchFaceCameraActivity, PERMISSION_SHOWAGREEFORSTORAGE)) {
            dressWatchFaceCameraActivity.showDeniedForStorage();
        } else {
            dressWatchFaceCameraActivity.showNeverAskForStorage();
        }
    }

    static void showAgreeCameraWithPermissionCheck(@NonNull DressWatchFaceCameraActivity dressWatchFaceCameraActivity) {
        String[] strArr = PERMISSION_SHOWAGREECAMERA;
        if (q7.b.hasSelfPermissions(dressWatchFaceCameraActivity, strArr)) {
            dressWatchFaceCameraActivity.showAgreeCamera();
        } else {
            ActivityCompat.requestPermissions(dressWatchFaceCameraActivity, strArr, 11);
        }
    }

    static void showAgreeForStorageWithPermissionCheck(@NonNull DressWatchFaceCameraActivity dressWatchFaceCameraActivity) {
        String[] strArr = PERMISSION_SHOWAGREEFORSTORAGE;
        if (q7.b.hasSelfPermissions(dressWatchFaceCameraActivity, strArr)) {
            dressWatchFaceCameraActivity.showAgreeForStorage();
        } else if (q7.b.shouldShowRequestPermissionRationale(dressWatchFaceCameraActivity, strArr)) {
            dressWatchFaceCameraActivity.showRationaleForStorage(new b(dressWatchFaceCameraActivity));
        } else {
            ActivityCompat.requestPermissions(dressWatchFaceCameraActivity, strArr, 12);
        }
    }
}
