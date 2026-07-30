package com.crrepa.band.my.home.guidance.permission;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class f {
    private static final String[] PERMISSION_NEEDPERMISSION = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private static final int REQUEST_NEEDPERMISSION = 19;

    private f() {
    }

    static void needPermissionWithPermissionCheck(@NonNull LocationPermissionActivity locationPermissionActivity) {
        String[] strArr = PERMISSION_NEEDPERMISSION;
        if (q7.b.hasSelfPermissions(locationPermissionActivity, strArr)) {
            locationPermissionActivity.needPermission();
        } else {
            ActivityCompat.requestPermissions(locationPermissionActivity, strArr, 19);
        }
    }

    static void onRequestPermissionsResult(@NonNull LocationPermissionActivity locationPermissionActivity, int i8, int[] iArr) {
        if (i8 != 19) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            locationPermissionActivity.needPermission();
        } else if (q7.b.shouldShowRequestPermissionRationale(locationPermissionActivity, PERMISSION_NEEDPERMISSION)) {
            locationPermissionActivity.onDenied();
        } else {
            locationPermissionActivity.onNeverAskAgain();
        }
    }
}
