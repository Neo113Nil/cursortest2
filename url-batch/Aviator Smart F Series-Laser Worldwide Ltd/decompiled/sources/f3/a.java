package f3;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.crrepa.band.aviator.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.orhanobut.logger.f;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class a {
    private static String ANDROID_AUTHORITY = "com.android.calendar";
    private static String CALENDARS_ACCOUNT_NAME = "MY@google.com";
    private static String CALENDARS_ACCOUNT_TYPE = "com.android.my";
    private static String CALENDARS_DISPLAY_NAME = "Default";
    private static String CALENDARS_NAME = "MY";
    private static String CALENDER_EVENT_TYPE = "/events";
    private static String CALENDER_REMINDER_TYPE = "/reminders";
    private static String CALENDER_TYPE = "/calendars";
    private static String CONTENT = "content://";
    private static String OPPO_AUTHORITY = "com.coloros.calendar";
    public static final String WRC = "WRC";
    private static final String WRC_DESCRIPTION_SEPARATOR = "-";

    public static void addAllEvent(Context context, String str, Date date, long j8, int i8, int i9) {
        if (i9 <= 0) {
            return;
        }
        long time = date.getTime();
        for (int i10 = 1; i10 <= i8; i10++) {
            long j9 = time + ((i10 - 1) * j8 * 60000);
            boolean addCalendarTimesEvent = addCalendarTimesEvent(context, str, i10, j9, i9);
            Calendar calendar = k.getCalendar();
            calendar.setTimeInMillis(j9);
            f.d("water ==> addCalendar - the " + i10 + " times : " + m.format(calendar.getTime(), context.getString(R.string.hour_minute_24_format)) + " isSuccess : " + addCalendarTimesEvent);
        }
    }

    private static long addCalendarAccount(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", CALENDARS_NAME);
        contentValues.put("account_name", CALENDARS_ACCOUNT_NAME);
        contentValues.put("account_type", CALENDARS_ACCOUNT_TYPE);
        contentValues.put("calendar_displayName", CALENDARS_DISPLAY_NAME);
        contentValues.put(MapBundleKey.MapObjKey.OBJ_SL_VISI, (Integer) 1);
        contentValues.put("calendar_color", (Integer) (-16776961));
        contentValues.put("calendar_access_level", Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION));
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", CALENDARS_ACCOUNT_NAME);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri insert = context.getContentResolver().insert(getCalenderUri(context).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build(), contentValues);
        if (insert == null) {
            return -1L;
        }
        return ContentUris.parseId(insert);
    }

    private static boolean addCalendarDayEvent(Context context, String str, long j8, long j9, long j10, int i8) {
        int checkAndAddCalendarAccount;
        if (context == null || (checkAndAddCalendarAccount = checkAndAddCalendarAccount(context)) < 0) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("description", getDescription(j8));
        contentValues.put("calendar_id", Integer.valueOf(checkAndAddCalendarAccount));
        contentValues.put("dtstart", Long.valueOf(j9));
        contentValues.put("dtend", Long.valueOf(600000 + j9));
        contentValues.put("hasAlarm", (Integer) 1);
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        Uri insert = context.getContentResolver().insert(getCalenderEventUrl(context), contentValues);
        if (insert == null) {
            return false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(insert)));
        contentValues2.put("minutes", (Integer) 0);
        contentValues2.put(FirebaseAnalytics.Param.METHOD, (Integer) 1);
        Uri insert2 = context.getContentResolver().insert(getCalenderReminderUrl(context), contentValues2);
        f.d("water ==> uri: " + insert2 + "--> repeat times : " + i8 + " --> interval : " + j10);
        return insert2 != null;
    }

    private static boolean addCalendarTimesEvent(Context context, String str, int i8, long j8, int i9) {
        int checkAndAddCalendarAccount;
        if (context == null || (checkAndAddCalendarAccount = checkAndAddCalendarAccount(context)) < 0) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("description", getDescription(i8));
        contentValues.put("calendar_id", Integer.valueOf(checkAndAddCalendarAccount));
        contentValues.put("dtstart", Long.valueOf(j8));
        contentValues.put("dtend", Long.valueOf(j8));
        contentValues.put("hasAlarm", (Integer) 1);
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        contentValues.put("rrule", "FREQ=DAILY;INTERVAL=1;COUNT=" + i9);
        Uri insert = context.getContentResolver().insert(getCalenderEventUrl(context), contentValues);
        if (insert == null) {
            return false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(insert)));
        contentValues2.put("minutes", (Integer) 0);
        contentValues2.put(FirebaseAnalytics.Param.METHOD, (Integer) 1);
        Uri insert2 = context.getContentResolver().insert(getCalenderReminderUrl(context), contentValues2);
        f.d("water ==> uri: " + insert2 + "--> repeat days : " + i9);
        return insert2 != null;
    }

    private static int checkAndAddCalendarAccount(Context context) {
        int checkCalendarAccount = checkCalendarAccount(context);
        if (checkCalendarAccount >= 0) {
            return checkCalendarAccount;
        }
        if (addCalendarAccount(context) >= 0) {
            return checkCalendarAccount(context);
        }
        return -1;
    }

    @SuppressLint({"Range"})
    private static int checkCalendarAccount(Context context) {
        Cursor query = context.getContentResolver().query(getCalenderUri(context), null, null, null, null);
        if (query == null) {
            if (query != null) {
            }
            return -1;
        }
        try {
            if (query.getCount() <= 0) {
                return -1;
            }
            query.moveToFirst();
            return query.getInt(query.getColumnIndex(FileDownloadModel.ID));
        } finally {
            query.close();
        }
    }

    @SuppressLint({"Range"})
    public static void deleteAllEvent(Context context) {
        if (context == null) {
            return;
        }
        Uri calenderEventUrl = getCalenderEventUrl(context);
        Cursor query = context.getContentResolver().query(calenderEventUrl, null, null, null, null);
        if (query == null) {
            return;
        }
        try {
            if (query.getCount() > 0) {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(query.getColumnIndex("description"));
                    if (!TextUtils.isEmpty(string) && string.contains(WRC)) {
                        f.d("water ==> deleteRows: " + context.getContentResolver().delete(ContentUris.withAppendedId(calenderEventUrl, query.getInt(query.getColumnIndex(FileDownloadModel.ID))), null, null));
                    }
                    query.moveToNext();
                }
            }
            query.close();
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    private static Uri getCalenderEventUrl(Context context) {
        return getUri(context, CALENDER_EVENT_TYPE);
    }

    private static Uri getCalenderReminderUrl(Context context) {
        return getUri(context, CALENDER_REMINDER_TYPE);
    }

    private static Uri getCalenderUri(Context context) {
        return getUri(context, CALENDER_TYPE);
    }

    private static String getDescription(long j8) {
        return "WRC-" + j8;
    }

    private static Uri getUri(Context context, String str) {
        StringBuilder sb = new StringBuilder(CONTENT);
        if (com.crrepa.band.my.device.calendar.utils.b.hasOppoCalendar(context)) {
            sb.append(OPPO_AUTHORITY);
        } else {
            sb.append(ANDROID_AUTHORITY);
        }
        sb.append(str);
        return Uri.parse(sb.toString());
    }
}
