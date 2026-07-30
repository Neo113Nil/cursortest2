package a1;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class d {
    private static final String CWC = "CWC";
    private static final String CWC_DESCRIPTION_SEPARATOR = "-";
    private static String OPPO_AUTHORITY = "com.coloros.calendar";
    public static final Uri OPPO_CALENDARS_CONTENT_URI = Uri.parse("content://" + OPPO_AUTHORITY + "/calendars");
    public static final Uri OPPO_EVENTS_CONTENT_URI = Uri.parse("content://" + OPPO_AUTHORITY + "/events");
    public static final Uri OPPO_REMINDERS_CONTENT_URI = Uri.parse("content://" + OPPO_AUTHORITY + "/reminders");
    private static String CALENDARS_NAME = "MY";
    private static String CALENDARS_ACCOUNT_NAME = "MY@google.com";
    private static String CALENDARS_ACCOUNT_TYPE = "com.android.my";
    private static String CALENDARS_DISPLAY_NAME = "Default";
    private static boolean isOppoCalendar = com.crrepa.band.my.device.calendar.utils.b.hasOppoCalendar(com.moyoung.dafit.module.common.utils.d.get());

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
        Uri insert = context.getContentResolver().insert(getCalenderUri().buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build(), contentValues);
        if (insert == null) {
            return -1L;
        }
        return ContentUris.parseId(insert);
    }

    public static boolean addCalendarEvent(Context context, String str, long j8, long j9) {
        int checkAndAddCalendarAccount;
        if (context == null || (checkAndAddCalendarAccount = checkAndAddCalendarAccount(context)) < 0) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j9);
        long time = calendar.getTime().getTime();
        calendar.setTimeInMillis(600000 + time);
        long time2 = calendar.getTime().getTime();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("description", getDescription(j8));
        contentValues.put("calendar_id", Integer.valueOf(checkAndAddCalendarAccount));
        contentValues.put("dtstart", Long.valueOf(time));
        contentValues.put("dtend", Long.valueOf(time2));
        contentValues.put("hasAlarm", (Integer) 1);
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        Uri insert = context.getContentResolver().insert(getCalenderEventUrl(), contentValues);
        com.orhanobut.logger.f.d("newEventUri uri: " + insert);
        if (insert == null) {
            return false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(insert)));
        contentValues2.put("minutes", (Integer) 0);
        contentValues2.put(FirebaseAnalytics.Param.METHOD, (Integer) 1);
        Uri insert2 = context.getContentResolver().insert(getCalenderReminderUrl(), contentValues2);
        com.orhanobut.logger.f.d("uri: " + insert2);
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
        Cursor query = context.getContentResolver().query(getCalenderUri(), null, null, null, null);
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
    public static void deleteAllCricketEndEvent(Context context) {
        Uri calenderEventUrl;
        Cursor cricketEventCursor;
        if (context == null || (cricketEventCursor = getCricketEventCursor(context, (calenderEventUrl = getCalenderEventUrl()))) == null) {
            return;
        }
        com.orhanobut.logger.f.d("deleteAllCricketEndEvent getCount: " + cricketEventCursor.getCount());
        try {
            if (cricketEventCursor.getCount() > 0) {
                cricketEventCursor.moveToFirst();
                while (!cricketEventCursor.isAfterLast()) {
                    String string = cricketEventCursor.getString(cricketEventCursor.getColumnIndex("description"));
                    if (!TextUtils.isEmpty(string) && string.contains(CWC)) {
                        String[] split = string.split("-");
                        if (split.length >= 2 && 512 <= Integer.parseInt(split[1])) {
                            com.orhanobut.logger.f.d("deleteRows: " + context.getContentResolver().delete(ContentUris.withAppendedId(calenderEventUrl, cricketEventCursor.getInt(cricketEventCursor.getColumnIndex(FileDownloadModel.ID))), null, null));
                        }
                    }
                    cricketEventCursor.moveToNext();
                }
            }
            cricketEventCursor.close();
        } catch (Throwable th) {
            cricketEventCursor.close();
            throw th;
        }
    }

    @SuppressLint({"Range"})
    public static void deleteAllEvent(Context context) {
        Uri calenderEventUrl;
        Cursor cricketEventCursor;
        if (context == null || (cricketEventCursor = getCricketEventCursor(context, (calenderEventUrl = getCalenderEventUrl()))) == null) {
            return;
        }
        com.orhanobut.logger.f.d("deleteAllEvent getCount: " + cricketEventCursor.getCount());
        try {
            if (cricketEventCursor.getCount() > 0) {
                cricketEventCursor.moveToFirst();
                while (!cricketEventCursor.isAfterLast()) {
                    String string = cricketEventCursor.getString(cricketEventCursor.getColumnIndex("description"));
                    if (!TextUtils.isEmpty(string) && string.contains(CWC)) {
                        Uri withAppendedId = ContentUris.withAppendedId(calenderEventUrl, cricketEventCursor.getInt(cricketEventCursor.getColumnIndex(FileDownloadModel.ID)));
                        com.orhanobut.logger.f.d("deleteUri: " + withAppendedId);
                        com.orhanobut.logger.f.d("deleteRows: " + context.getContentResolver().delete(withAppendedId, null, null));
                    }
                    cricketEventCursor.moveToNext();
                }
            }
            cricketEventCursor.close();
        } catch (Throwable th) {
            cricketEventCursor.close();
            throw th;
        }
    }

    private static Uri getCalenderEventUrl() {
        return isOppoCalendar ? OPPO_EVENTS_CONTENT_URI : CalendarContract.Events.CONTENT_URI;
    }

    private static Uri getCalenderReminderUrl() {
        return isOppoCalendar ? OPPO_REMINDERS_CONTENT_URI : CalendarContract.Reminders.CONTENT_URI;
    }

    private static Uri getCalenderUri() {
        return isOppoCalendar ? OPPO_CALENDARS_CONTENT_URI : CalendarContract.Calendars.CONTENT_URI;
    }

    private static Cursor getCricketEventCursor(Context context, Uri uri) {
        return context.getContentResolver().query(uri, null, "description LIKE ?", new String[]{"CWC%"}, null);
    }

    private static String getDescription(long j8) {
        return "CWC-" + j8;
    }
}
