package com.crrepa.band.my.device.pushmessage;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class b {
    private static final String[] PERMISSION_ENABLEANSWERCALLPERMISSION = {"android.permission.ANSWER_PHONE_CALLS"};
    private static final String[] PERMISSION_ENABLECALLPERMISSION = {"android.permission.READ_CALL_LOG", "android.permission.CALL_PHONE", "android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE"};
    private static final String[] PERMISSION_ENABLESMSNOTIFICATION = {"android.permission.READ_SMS", "android.permission.READ_CONTACTS"};
    private static final int REQUEST_ENABLEANSWERCALLPERMISSION = 2;
    private static final int REQUEST_ENABLECALLPERMISSION = 3;
    private static final int REQUEST_ENABLESMSNOTIFICATION = 4;

    /* renamed from: com.crrepa.band.my.device.pushmessage.b$b, reason: collision with other inner class name */
    private static final class C0184b implements q7.a {
        private final WeakReference<BandNotificationActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            BandNotificationActivity bandNotificationActivity = this.weakTarget.get();
            if (bandNotificationActivity == null) {
                return;
            }
            bandNotificationActivity.showDeniedForAnswerCall();
        }

        @Override // q7.a
        public void proceed() {
            BandNotificationActivity bandNotificationActivity = this.weakTarget.get();
            if (bandNotificationActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(bandNotificationActivity, b.PERMISSION_ENABLEANSWERCALLPERMISSION, 2);
        }

        private C0184b(@NonNull BandNotificationActivity bandNotificationActivity) {
            this.weakTarget = new WeakReference<>(bandNotificationActivity);
        }
    }

    private b() {
    }

    static void enableAnswerCallPermissionWithPermissionCheck(@NonNull BandNotificationActivity bandNotificationActivity) {
        String[] strArr = PERMISSION_ENABLEANSWERCALLPERMISSION;
        if (q7.b.hasSelfPermissions(bandNotificationActivity, strArr)) {
            bandNotificationActivity.enableAnswerCallPermission();
        } else if (q7.b.shouldShowRequestPermissionRationale(bandNotificationActivity, strArr)) {
            bandNotificationActivity.showRationaleForAnswerCall(new C0184b(bandNotificationActivity));
        } else {
            ActivityCompat.requestPermissions(bandNotificationActivity, strArr, 2);
        }
    }

    static void enableCallPermissionWithPermissionCheck(@NonNull BandNotificationActivity bandNotificationActivity) {
        String[] strArr = PERMISSION_ENABLECALLPERMISSION;
        if (q7.b.hasSelfPermissions(bandNotificationActivity, strArr)) {
            bandNotificationActivity.enableCallPermission();
        } else {
            ActivityCompat.requestPermissions(bandNotificationActivity, strArr, 3);
        }
    }

    static void enableSmsNotificationWithPermissionCheck(@NonNull BandNotificationActivity bandNotificationActivity) {
        String[] strArr = PERMISSION_ENABLESMSNOTIFICATION;
        if (q7.b.hasSelfPermissions(bandNotificationActivity, strArr)) {
            bandNotificationActivity.enableSmsNotification();
        } else {
            ActivityCompat.requestPermissions(bandNotificationActivity, strArr, 4);
        }
    }

    static void onRequestPermissionsResult(@NonNull BandNotificationActivity bandNotificationActivity, int i8, int[] iArr) {
        if (i8 == 2) {
            if (q7.b.verifyPermissions(iArr)) {
                bandNotificationActivity.enableAnswerCallPermission();
                return;
            } else if (q7.b.shouldShowRequestPermissionRationale(bandNotificationActivity, PERMISSION_ENABLEANSWERCALLPERMISSION)) {
                bandNotificationActivity.showDeniedForAnswerCall();
                return;
            } else {
                bandNotificationActivity.showNeverAskForAnswerCall();
                return;
            }
        }
        if (i8 == 3) {
            if (q7.b.verifyPermissions(iArr)) {
                bandNotificationActivity.enableCallPermission();
                return;
            } else if (q7.b.shouldShowRequestPermissionRationale(bandNotificationActivity, PERMISSION_ENABLECALLPERMISSION)) {
                bandNotificationActivity.showDeniedForCall();
                return;
            } else {
                bandNotificationActivity.showNeverAskForCall();
                return;
            }
        }
        if (i8 != 4) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            bandNotificationActivity.enableSmsNotification();
        } else if (q7.b.shouldShowRequestPermissionRationale(bandNotificationActivity, PERMISSION_ENABLESMSNOTIFICATION)) {
            bandNotificationActivity.showDeniedForSMS();
        } else {
            bandNotificationActivity.showNeverAskForSMS();
        }
    }
}
