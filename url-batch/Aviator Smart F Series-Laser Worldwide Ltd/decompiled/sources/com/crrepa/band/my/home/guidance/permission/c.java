package com.crrepa.band.my.home.guidance.permission;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class c {
    private static final String[] PERMISSION_NEEDPERMISSION = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
    private static final int REQUEST_NEEDPERMISSION = 8;

    private c() {
    }

    static void needPermissionWithPermissionCheck(@NonNull BluetoothPermissionActivity bluetoothPermissionActivity) {
        String[] strArr = PERMISSION_NEEDPERMISSION;
        if (q7.b.hasSelfPermissions(bluetoothPermissionActivity, strArr)) {
            bluetoothPermissionActivity.needPermission();
        } else {
            ActivityCompat.requestPermissions(bluetoothPermissionActivity, strArr, 8);
        }
    }

    static void onRequestPermissionsResult(@NonNull BluetoothPermissionActivity bluetoothPermissionActivity, int i8, int[] iArr) {
        if (i8 != 8) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            bluetoothPermissionActivity.needPermission();
        } else if (q7.b.shouldShowRequestPermissionRationale(bluetoothPermissionActivity, PERMISSION_NEEDPERMISSION)) {
            bluetoothPermissionActivity.onDenied();
        } else {
            bluetoothPermissionActivity.onNeverAskAgain();
        }
    }
}
