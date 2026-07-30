package com.crrepa.band.my.training;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class m {
    private static final String[] PERMISSION_REQUESTLOCATION = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private static final int REQUEST_REQUESTLOCATION = 14;

    private static final class b implements q7.a {
        private final WeakReference<GpsTrainingActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            GpsTrainingActivity gpsTrainingActivity = this.weakTarget.get();
            if (gpsTrainingActivity == null) {
                return;
            }
            gpsTrainingActivity.showDeniedForLocation();
        }

        @Override // q7.a
        public void proceed() {
            GpsTrainingActivity gpsTrainingActivity = this.weakTarget.get();
            if (gpsTrainingActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(gpsTrainingActivity, m.PERMISSION_REQUESTLOCATION, 14);
        }

        private b(@NonNull GpsTrainingActivity gpsTrainingActivity) {
            this.weakTarget = new WeakReference<>(gpsTrainingActivity);
        }
    }

    private m() {
    }

    static void onRequestPermissionsResult(@NonNull GpsTrainingActivity gpsTrainingActivity, int i8, int[] iArr) {
        if (i8 != 14) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            gpsTrainingActivity.requestLocation();
        } else if (q7.b.shouldShowRequestPermissionRationale(gpsTrainingActivity, PERMISSION_REQUESTLOCATION)) {
            gpsTrainingActivity.showDeniedForLocation();
        } else {
            gpsTrainingActivity.showNeverAskForLocation();
        }
    }

    static void requestLocationWithPermissionCheck(@NonNull GpsTrainingActivity gpsTrainingActivity) {
        String[] strArr = PERMISSION_REQUESTLOCATION;
        if (q7.b.hasSelfPermissions(gpsTrainingActivity, strArr)) {
            gpsTrainingActivity.requestLocation();
        } else if (q7.b.shouldShowRequestPermissionRationale(gpsTrainingActivity, strArr)) {
            gpsTrainingActivity.showRationaleForLocation(new b(gpsTrainingActivity));
        } else {
            ActivityCompat.requestPermissions(gpsTrainingActivity, strArr, 14);
        }
    }
}
