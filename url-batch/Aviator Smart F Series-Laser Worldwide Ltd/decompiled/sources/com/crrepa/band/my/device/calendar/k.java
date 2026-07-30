package com.crrepa.band.my.device.calendar;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

/* loaded from: classes2.dex */
final class k {
    private static final String[] PERMISSION_SYNCCALENDAR = {"android.permission.READ_CALENDAR"};
    private static final int REQUEST_SYNCCALENDAR = 9;

    private k() {
    }

    static void onRequestPermissionsResult(@NonNull CalendarSyncActivity calendarSyncActivity, int i8, int[] iArr) {
        if (i8 != 9) {
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            calendarSyncActivity.syncCalendar();
        } else if (q7.b.shouldShowRequestPermissionRationale(calendarSyncActivity, PERMISSION_SYNCCALENDAR)) {
            calendarSyncActivity.onPermissionDenied();
        } else {
            calendarSyncActivity.onNeverAskAgain();
        }
    }

    static void syncCalendarWithPermissionCheck(@NonNull CalendarSyncActivity calendarSyncActivity) {
        String[] strArr = PERMISSION_SYNCCALENDAR;
        if (q7.b.hasSelfPermissions(calendarSyncActivity, strArr)) {
            calendarSyncActivity.syncCalendar();
        } else {
            ActivityCompat.requestPermissions(calendarSyncActivity, strArr, 9);
        }
    }
}
