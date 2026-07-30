package com.crrepa.band.my.device.scan;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class t {
    private static final String[] PERMISSION_NEEDBLUETOOTHPERMISSIONSUCCESS = {"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
    private static final String[] PERMISSION_NEEDLOCATIONPERMISSIONSUCCESS = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private static final String[] PERMISSION_STARTCAMERA = {"android.permission.CAMERA"};
    private static final int REQUEST_NEEDBLUETOOTHPERMISSIONSUCCESS = 5;
    private static final int REQUEST_NEEDLOCATIONPERMISSIONSUCCESS = 6;
    private static final int REQUEST_STARTCAMERA = 7;

    private t() {
    }

    static void needBluetoothPermissionSuccessWithPermissionCheck(@NonNull BandScanActivity bandScanActivity) {
        String[] strArr = PERMISSION_NEEDBLUETOOTHPERMISSIONSUCCESS;
        if (q7.b.hasSelfPermissions(bandScanActivity, strArr)) {
            bandScanActivity.needBluetoothPermissionSuccess();
        } else {
            ActivityCompat.requestPermissions(bandScanActivity, strArr, 5);
        }
    }

    static void needLocationPermissionSuccessWithPermissionCheck(@NonNull BandScanActivity bandScanActivity) {
        String[] strArr = PERMISSION_NEEDLOCATIONPERMISSIONSUCCESS;
        if (q7.b.hasSelfPermissions(bandScanActivity, strArr)) {
            bandScanActivity.needLocationPermissionSuccess();
        } else {
            ActivityCompat.requestPermissions(bandScanActivity, strArr, 6);
        }
    }

    static void onRequestPermissionsResult(@NonNull BandScanActivity bandScanActivity, int i8, int[] iArr) {
        if (i8 == 5) {
            if (q7.b.verifyPermissions(iArr)) {
                bandScanActivity.needBluetoothPermissionSuccess();
                return;
            } else if (q7.b.shouldShowRequestPermissionRationale(bandScanActivity, PERMISSION_NEEDBLUETOOTHPERMISSIONSUCCESS)) {
                bandScanActivity.showDeniedForBluetooth();
                return;
            } else {
                bandScanActivity.showNeverAskForBluetooth();
                return;
            }
        }
        if (i8 == 6) {
            if (q7.b.verifyPermissions(iArr)) {
                bandScanActivity.needLocationPermissionSuccess();
                return;
            } else if (q7.b.shouldShowRequestPermissionRationale(bandScanActivity, PERMISSION_NEEDLOCATIONPERMISSIONSUCCESS)) {
                bandScanActivity.showDeniedForLocation();
                return;
            } else {
                bandScanActivity.showNeverAskForLocation();
                return;
            }
        }
        if (i8 != 7) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            bandScanActivity.startCamera();
        } else if (q7.b.shouldShowRequestPermissionRationale(bandScanActivity, PERMISSION_STARTCAMERA)) {
            bandScanActivity.showDeniedForCamera();
        } else {
            bandScanActivity.showNeverAskForCamera();
        }
    }

    static void startCameraWithPermissionCheck(@NonNull BandScanActivity bandScanActivity) {
        String[] strArr = PERMISSION_STARTCAMERA;
        if (q7.b.hasSelfPermissions(bandScanActivity, strArr)) {
            bandScanActivity.startCamera();
        } else {
            ActivityCompat.requestPermissions(bandScanActivity, strArr, 7);
        }
    }
}
