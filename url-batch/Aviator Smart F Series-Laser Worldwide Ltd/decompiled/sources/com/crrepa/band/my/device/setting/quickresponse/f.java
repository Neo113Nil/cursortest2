package com.crrepa.band.my.device.setting.quickresponse;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class f {
    private static final String[] PERMISSION_NEEDSENDSMSPERMISSIONSUCCESS = {"android.permission.SEND_SMS"};
    private static final int REQUEST_NEEDSENDSMSPERMISSIONSUCCESS = 22;

    private f() {
    }

    static void needSendSmsPermissionSuccessWithPermissionCheck(@NonNull QuickResponseSettingActivity quickResponseSettingActivity) {
        String[] strArr = PERMISSION_NEEDSENDSMSPERMISSIONSUCCESS;
        if (q7.b.hasSelfPermissions(quickResponseSettingActivity, strArr)) {
            quickResponseSettingActivity.needSendSmsPermissionSuccess();
        } else {
            ActivityCompat.requestPermissions(quickResponseSettingActivity, strArr, 22);
        }
    }

    static void onRequestPermissionsResult(@NonNull QuickResponseSettingActivity quickResponseSettingActivity, int i8, int[] iArr) {
        if (i8 != 22) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            quickResponseSettingActivity.needSendSmsPermissionSuccess();
        } else if (q7.b.shouldShowRequestPermissionRationale(quickResponseSettingActivity, PERMISSION_NEEDSENDSMSPERMISSIONSUCCESS)) {
            quickResponseSettingActivity.showDeniedForSendMsg();
        } else {
            quickResponseSettingActivity.showNeverAskForSendMsg();
        }
    }
}
