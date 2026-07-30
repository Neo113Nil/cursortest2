package com.crrepa.band.my.device.watchface;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class x0 {
    private static final String[] PERMISSION_UPDATEBANDCONFIG = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private static final int REQUEST_UPDATEBANDCONFIG = 25;

    private static final class b implements q7.a {
        private final WeakReference<WatchFaceEditActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            WatchFaceEditActivity watchFaceEditActivity = this.weakTarget.get();
            if (watchFaceEditActivity == null) {
                return;
            }
            watchFaceEditActivity.showDeniedForStorage();
        }

        @Override // q7.a
        public void proceed() {
            WatchFaceEditActivity watchFaceEditActivity = this.weakTarget.get();
            if (watchFaceEditActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(watchFaceEditActivity, x0.PERMISSION_UPDATEBANDCONFIG, 25);
        }

        private b(@NonNull WatchFaceEditActivity watchFaceEditActivity) {
            this.weakTarget = new WeakReference<>(watchFaceEditActivity);
        }
    }

    private x0() {
    }

    static void onRequestPermissionsResult(@NonNull WatchFaceEditActivity watchFaceEditActivity, int i8, int[] iArr) {
        if (i8 != 25) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            watchFaceEditActivity.updateBandConfig();
        } else if (q7.b.shouldShowRequestPermissionRationale(watchFaceEditActivity, PERMISSION_UPDATEBANDCONFIG)) {
            watchFaceEditActivity.showDeniedForStorage();
        } else {
            watchFaceEditActivity.showNeverAskForStorage();
        }
    }

    static void updateBandConfigWithPermissionCheck(@NonNull WatchFaceEditActivity watchFaceEditActivity) {
        String[] strArr = PERMISSION_UPDATEBANDCONFIG;
        if (q7.b.hasSelfPermissions(watchFaceEditActivity, strArr)) {
            watchFaceEditActivity.updateBandConfig();
        } else if (q7.b.shouldShowRequestPermissionRationale(watchFaceEditActivity, strArr)) {
            watchFaceEditActivity.showRationaleForStorage(new b(watchFaceEditActivity));
        } else {
            ActivityCompat.requestPermissions(watchFaceEditActivity, strArr, 25);
        }
    }
}
