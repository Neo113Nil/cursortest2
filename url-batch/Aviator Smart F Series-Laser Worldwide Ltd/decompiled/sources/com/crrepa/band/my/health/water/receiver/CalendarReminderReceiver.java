package com.crrepa.band.my.health.water.receiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.crrepa.band.my.health.water.WaterReminderActivity;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes2.dex */
public class CalendarReminderReceiver extends BroadcastReceiver {
    private static CalendarReminderReceiver calendarReminderReceiver;

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public static void register(Context context) {
        if (calendarReminderReceiver == null) {
            calendarReminderReceiver = new CalendarReminderReceiver();
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.EVENT_REMINDER");
        intentFilter.setPriority(1000);
        intentFilter.addDataScheme(FirebaseAnalytics.Param.CONTENT);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(calendarReminderReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(calendarReminderReceiver, intentFilter);
        }
    }

    public static void unregister(Context context) {
        context.unregisterReceiver(calendarReminderReceiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int columnIndex;
        if (intent.getAction().equals("android.intent.action.EVENT_REMINDER")) {
            Cursor query = context.getContentResolver().query(CalendarContract.CalendarAlerts.CONTENT_URI_BY_INSTANCE, new String[]{"title"}, "alarmTime=?", new String[]{intent.getData().getLastPathSegment()}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && (columnIndex = query.getColumnIndex("title")) >= 0) {
                        String string = query.getString(columnIndex);
                        if (!TextUtils.isEmpty(string) && string.equals(WaterProvider.getAppPromptTip(context))) {
                            context.startActivity(new Intent(context, (Class<?>) WaterReminderActivity.class));
                        }
                    }
                } finally {
                    query.close();
                }
            }
        }
    }
}
