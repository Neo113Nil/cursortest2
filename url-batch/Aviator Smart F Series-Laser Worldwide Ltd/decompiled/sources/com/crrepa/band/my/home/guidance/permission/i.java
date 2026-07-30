package com.crrepa.band.my.home.guidance.permission;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class i {
    private static final String[] PERMISSION_NEEDPERMISSION = {"android.permission.POST_NOTIFICATIONS"};
    private static final int REQUEST_NEEDPERMISSION = 21;

    private i() {
    }

    static void needPermissionWithPermissionCheck(@NonNull NotificationPermissionActivity notificationPermissionActivity) {
        String[] strArr = PERMISSION_NEEDPERMISSION;
        if (q7.b.hasSelfPermissions(notificationPermissionActivity, strArr)) {
            notificationPermissionActivity.needPermission();
        } else {
            ActivityCompat.requestPermissions(notificationPermissionActivity, strArr, 21);
        }
    }

    static void onRequestPermissionsResult(@NonNull NotificationPermissionActivity notificationPermissionActivity, int i8, int[] iArr) {
        if (i8 != 21) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            notificationPermissionActivity.needPermission();
        } else if (q7.b.shouldShowRequestPermissionRationale(notificationPermissionActivity, PERMISSION_NEEDPERMISSION)) {
            notificationPermissionActivity.onDenied();
        } else {
            notificationPermissionActivity.onNeverAskAgain();
        }
    }
}
