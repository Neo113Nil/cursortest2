package com.crrepa.band.my.device.calendar.utils;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import com.crrepa.ble.conn.bean.CRPCalendarEventInfo;
import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class b {
    private static final int ALL_DAY_END_HOUR = 23;
    private static final int ALL_DAY_END_MINUTE = 59;
    public static final int ALL_DAY_EVENT = 1;
    private static final int ALL_DAY_START_HOUR = 0;
    private static final int ALL_DAY_START_MINUTE = 0;
    private static final String DEFAULT_SORT_ORDER = "begin ASC";
    public static final int NEW_OPPO_CALENDAR_VERSION_CODE = 7001000;
    public static final String OPPO_CALENDAR_PACKAGE_NAME = "com.coloros.calendar";
    private static final String WHERE_CALENDARS_SELECTED = "visible=?";
    public static final Uri CONTENT_URI = Uri.parse("content://com.coloros.calendar/instances/when");
    private static final String[] WHERE_CALENDARS_ARGS = {"1"};

    public static long getEvenAlertTime(Context context, long j8) {
        String[] strArr = {Long.toString(j8)};
        Cursor query = context.getContentResolver().query(CalendarContract.CalendarAlerts.CONTENT_URI, new String[]{"alarmTime"}, "event_id=?", strArr, null);
        long j9 = 0;
        while (query.moveToNext()) {
            int columnIndex = query.getColumnIndex("alarmTime");
            if (columnIndex >= 0) {
                j9 = query.getLong(columnIndex);
            }
        }
        return j9;
    }

    public static Cursor getEventCursor(Context context, long j8, long j9) {
        if (!hasOppoCalendar(context)) {
            return CalendarContract.Instances.query(context.getContentResolver(), null, j8, j9);
        }
        Uri.Builder buildUpon = CONTENT_URI.buildUpon();
        ContentUris.appendId(buildUpon, j8);
        ContentUris.appendId(buildUpon, j9);
        return context.getContentResolver().query(buildUpon.build(), null, WHERE_CALENDARS_SELECTED, WHERE_CALENDARS_ARGS, DEFAULT_SORT_ORDER);
    }

    @SuppressLint({"Range"})
    public static ArrayList<CRPCalendarEventInfo> getEventList(Context context, int i8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        long time = calendar.getTime().getTime();
        calendar.add(1, 1);
        long time2 = calendar.getTime().getTime();
        ArrayList<CRPCalendarEventInfo> arrayList = new ArrayList<>();
        Cursor eventCursor = getEventCursor(context, time, time2);
        while (eventCursor.moveToNext() && arrayList.size() < i8) {
            String string = eventCursor.getString(eventCursor.getColumnIndex("title"));
            long j8 = eventCursor.getLong(eventCursor.getColumnIndex("begin"));
            long j9 = eventCursor.getLong(eventCursor.getColumnIndex("end"));
            f.d("calendar event title ：" + string);
            f.d("calendar event eventStartTime ：" + j8);
            f.d("calendar event eventEndTime ：" + j9);
            CRPCalendarEventInfo cRPCalendarEventInfo = new CRPCalendarEventInfo();
            cRPCalendarEventInfo.setId(arrayList.size());
            cRPCalendarEventInfo.setTitle(string);
            cRPCalendarEventInfo.setTime(j8 / 1000);
            if (eventCursor.getInt(eventCursor.getColumnIndex("allDay")) == 1) {
                cRPCalendarEventInfo.setStartHour(0);
                cRPCalendarEventInfo.setStartMinute(0);
                cRPCalendarEventInfo.setEndHour(23);
                cRPCalendarEventInfo.setEndMinute(59);
            } else {
                calendar.setTimeInMillis(j8);
                cRPCalendarEventInfo.setStartHour(calendar.get(11));
                cRPCalendarEventInfo.setStartMinute(calendar.get(12));
                calendar.setTimeInMillis(j9);
                cRPCalendarEventInfo.setEndHour(calendar.get(11));
                cRPCalendarEventInfo.setEndMinute(calendar.get(12));
            }
            arrayList.add(cRPCalendarEventInfo);
        }
        eventCursor.close();
        return arrayList;
    }

    public static boolean hasOppoCalendar(Context context) {
        int i8;
        try {
            i8 = context.getPackageManager().getPackageInfo(OPPO_CALENDAR_PACKAGE_NAME, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i8 = 0;
        }
        f.d("versionCode: " + i8);
        return 7001000 < i8;
    }
}
