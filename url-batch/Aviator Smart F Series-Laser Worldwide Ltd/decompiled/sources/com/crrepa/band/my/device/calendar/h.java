package com.crrepa.band.my.device.calendar;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;

/* loaded from: classes2.dex */
public class h extends ContentObserver {
    private static final String CALENDER_EVENT_URL = "content://com.android.calendar/events";
    private static final String OPPO_CALENDER_EVENT_URL = "content://com.coloros.calendar/events";
    private static boolean registered = false;
    private final Context context;

    public h(Context context, Handler handler) {
        super(handler);
        this.context = context.getApplicationContext();
    }

    private static h getInstance(Context context) {
        if (q7.b.hasSelfPermissions(context, "android.permission.READ_CALENDAR")) {
            return new h(context, new Handler());
        }
        return null;
    }

    public static boolean register(Context context) {
        h hVar = getInstance(context);
        if (hVar == null) {
            com.orhanobut.logger.f.d("CalendarObserver is null!");
            return false;
        }
        if (!BandCalendarEventProvider.isSupportCalendarEvent()) {
            com.orhanobut.logger.f.d("not support calendar event!");
            return false;
        }
        com.orhanobut.logger.f.d("CalendarObserver register: " + registered);
        if (!registered) {
            registered = true;
            com.orhanobut.logger.f.d("CalendarObserver registerContentObserver");
            ContentResolver contentResolver = context.getContentResolver();
            try {
                contentResolver.registerContentObserver(Uri.parse(CALENDER_EVENT_URL), true, hVar);
                contentResolver.registerContentObserver(Uri.parse(OPPO_CALENDER_EVENT_URL), true, hVar);
            } catch (Exception e8) {
                e8.printStackTrace();
                registered = false;
            }
        }
        return registered;
    }

    public static boolean unregister(Context context) {
        h hVar = getInstance(context);
        if (hVar == null) {
            com.orhanobut.logger.f.d("SmsObserver is null!");
            return false;
        }
        com.orhanobut.logger.f.d("SmsObserver unregister");
        context.getContentResolver().unregisterContentObserver(hVar);
        registered = false;
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z7) {
        super.onChange(z7);
        com.orhanobut.logger.f.d("calendar onChange: " + z7);
        com.crrepa.band.my.device.calendar.utils.a.getInstance().sendAllCalendarEvent(this.context);
    }
}
