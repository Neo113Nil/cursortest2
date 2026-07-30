package com.crrepa.band.my.training;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class p {
    private static final String[] PERMISSION_REQUESTBACKGROUNDLOCATION = {"android.permission.ACCESS_BACKGROUND_LOCATION"};
    private static final int REQUEST_REQUESTBACKGROUNDLOCATION = 23;

    private static final class b implements q7.a {
        private final WeakReference<RequestLocationActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            RequestLocationActivity requestLocationActivity = this.weakTarget.get();
            if (requestLocationActivity == null) {
                return;
            }
            requestLocationActivity.showDeniedForBackgroundLocation();
        }

        @Override // q7.a
        public void proceed() {
            RequestLocationActivity requestLocationActivity = this.weakTarget.get();
            if (requestLocationActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(requestLocationActivity, p.PERMISSION_REQUESTBACKGROUNDLOCATION, 23);
        }

        private b(@NonNull RequestLocationActivity requestLocationActivity) {
            this.weakTarget = new WeakReference<>(requestLocationActivity);
        }
    }

    private p() {
    }

    static void onRequestPermissionsResult(@NonNull RequestLocationActivity requestLocationActivity, int i8, int[] iArr) {
        if (i8 != 23) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            requestLocationActivity.requestBackgroundLocation();
        } else if (q7.b.shouldShowRequestPermissionRationale(requestLocationActivity, PERMISSION_REQUESTBACKGROUNDLOCATION)) {
            requestLocationActivity.showDeniedForBackgroundLocation();
        } else {
            requestLocationActivity.showNeverAskForBackgroundLocation();
        }
    }

    static void requestBackgroundLocationWithPermissionCheck(@NonNull RequestLocationActivity requestLocationActivity) {
        String[] strArr = PERMISSION_REQUESTBACKGROUNDLOCATION;
        if (q7.b.hasSelfPermissions(requestLocationActivity, strArr)) {
            requestLocationActivity.requestBackgroundLocation();
        } else if (q7.b.shouldShowRequestPermissionRationale(requestLocationActivity, strArr)) {
            requestLocationActivity.showRationaleForBackgroundLocation(new b(requestLocationActivity));
        } else {
            ActivityCompat.requestPermissions(requestLocationActivity, strArr, 23);
        }
    }
}
