package com.crrepa.band.my.device.cricket;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class d {
    private static final String[] PERMISSION_SYNCCALENDAR = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
    private static final int REQUEST_SYNCCALENDAR = 10;

    private static final class b implements q7.a {
        private final WeakReference<CricketActivity> weakTarget;

        @Override // q7.a
        public void cancel() {
            CricketActivity cricketActivity = this.weakTarget.get();
            if (cricketActivity == null) {
                return;
            }
            cricketActivity.onPermissionDenied();
        }

        @Override // q7.a
        public void proceed() {
            CricketActivity cricketActivity = this.weakTarget.get();
            if (cricketActivity == null) {
                return;
            }
            ActivityCompat.requestPermissions(cricketActivity, d.PERMISSION_SYNCCALENDAR, 10);
        }

        private b(@NonNull CricketActivity cricketActivity) {
            this.weakTarget = new WeakReference<>(cricketActivity);
        }
    }

    private d() {
    }

    static void onRequestPermissionsResult(@NonNull CricketActivity cricketActivity, int i8, int[] iArr) {
        if (i8 != 10) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            cricketActivity.syncCalendar();
        } else if (q7.b.shouldShowRequestPermissionRationale(cricketActivity, PERMISSION_SYNCCALENDAR)) {
            cricketActivity.onPermissionDenied();
        } else {
            cricketActivity.onNeverAskAgain();
        }
    }

    static void syncCalendarWithPermissionCheck(@NonNull CricketActivity cricketActivity) {
        String[] strArr = PERMISSION_SYNCCALENDAR;
        if (q7.b.hasSelfPermissions(cricketActivity, strArr)) {
            cricketActivity.syncCalendar();
        } else if (q7.b.shouldShowRequestPermissionRationale(cricketActivity, strArr)) {
            cricketActivity.showRationaleForCalendar(new b(cricketActivity));
        } else {
            ActivityCompat.requestPermissions(cricketActivity, strArr, 10);
        }
    }
}
