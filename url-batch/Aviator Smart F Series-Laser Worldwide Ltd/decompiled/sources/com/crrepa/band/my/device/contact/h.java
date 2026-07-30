package com.crrepa.band.my.device.contact;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class h {
    private static final String[] PERMISSION_NEEDCONTACTSPERMISSIONSUCCESS = {"android.permission.READ_CONTACTS"};
    private static final int REQUEST_NEEDCONTACTSPERMISSIONSUCCESS = 24;

    private h() {
    }

    static void needContactsPermissionSuccessWithPermissionCheck(@NonNull SelectContactActivity selectContactActivity) {
        String[] strArr = PERMISSION_NEEDCONTACTSPERMISSIONSUCCESS;
        if (q7.b.hasSelfPermissions(selectContactActivity, strArr)) {
            selectContactActivity.needContactsPermissionSuccess();
        } else {
            ActivityCompat.requestPermissions(selectContactActivity, strArr, 24);
        }
    }

    static void onRequestPermissionsResult(@NonNull SelectContactActivity selectContactActivity, int i8, int[] iArr) {
        if (i8 != 24) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            selectContactActivity.needContactsPermissionSuccess();
        } else if (q7.b.shouldShowRequestPermissionRationale(selectContactActivity, PERMISSION_NEEDCONTACTSPERMISSIONSUCCESS)) {
            selectContactActivity.showDeniedForContacts();
        } else {
            selectContactActivity.showNeverAskForContacts();
        }
    }
}
