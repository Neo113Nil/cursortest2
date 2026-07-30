package com.crrepa.band.my;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class c {
    private static final String[] PERMISSION_ENABLENOTIFICATIONSPERMISSION = {"android.permission.POST_NOTIFICATIONS"};
    private static final int REQUEST_ENABLENOTIFICATIONSPERMISSION = 20;

    private c() {
    }

    static void enableNotificationsPermissionWithPermissionCheck(@NonNull MainActivity mainActivity) {
        String[] strArr = PERMISSION_ENABLENOTIFICATIONSPERMISSION;
        if (q7.b.hasSelfPermissions(mainActivity, strArr)) {
            mainActivity.enableNotificationsPermission();
        } else {
            ActivityCompat.requestPermissions(mainActivity, strArr, 20);
        }
    }

    static void onRequestPermissionsResult(@NonNull MainActivity mainActivity, int i8, int[] iArr) {
        if (i8 != 20) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            mainActivity.enableNotificationsPermission();
        } else if (q7.b.shouldShowRequestPermissionRationale(mainActivity, PERMISSION_ENABLENOTIFICATIONSPERMISSION)) {
            mainActivity.showDeniedForCall();
        } else {
            mainActivity.showNeverAskForCall();
        }
    }
}
