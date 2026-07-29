package com.cmplay.base.util.notify;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.base.util.l;
import com.tapjoy.TJAdUnitConstants;

/* loaded from: classes.dex */
public class NotifyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("setNotify", "NotifyReceiver.onReceive   cur date:" + l.a(System.currentTimeMillis(), "yyyy-MM-dd/HH:mm:ss"));
        if (intent != null) {
            String stringExtra = intent.getStringExtra(TJAdUnitConstants.String.TITLE);
            String stringExtra2 = intent.getStringExtra("content");
            if (intent.getBooleanExtra("foreground_hiden", false) && a(context)) {
                return;
            }
            String stringExtra3 = intent.getStringExtra("transfer_data");
            int intExtra = intent.getIntExtra("id", 0);
            long longExtra = intent.getLongExtra("intervalTime", 0L);
            if (longExtra > 0 && Build.VERSION.SDK_INT >= 19) {
                Log.d("setNotify", "setNotify");
                Intent intent2 = new Intent(context, (Class<?>) NotifyReceiver.class);
                intent2.setAction("com.cmplay.base.util.notify");
                intent2.setPackage(context.getPackageName());
                intent2.putExtra(TJAdUnitConstants.String.TITLE, stringExtra);
                intent2.putExtra("content", stringExtra2);
                intent2.putExtra("id", intExtra);
                intent2.putExtra("transfer_data", stringExtra3);
                intent2.putExtra("intervalTime", longExtra);
                ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).setWindow(0, System.currentTimeMillis(), longExtra, PendingIntent.getBroadcast(context, intExtra, intent2, 134217728));
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            try {
                Intent intent3 = new Intent(context, Class.forName(a(context, context.getPackageName())));
                intent3.putExtra("notify_action", 100);
                intent3.putExtra("transfer_data", stringExtra3);
                PendingIntent activity = PendingIntent.getActivity(context, intExtra, intent3, 268435456);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = "";
                }
                NotificationCompat.Builder contentTitle = builder.setContentTitle(stringExtra);
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = "";
                }
                NotificationCompat.Builder contentText = contentTitle.setContentText(stringExtra2);
                contentText.setSmallIcon(context.getResources().getIdentifier("icon_notify", "drawable", context.getPackageName()));
                if (Build.VERSION.SDK_INT >= 26) {
                    String str = context.getPackageName() + "100";
                    notificationManager.createNotificationChannel(new NotificationChannel(str, context.getPackageName(), 4));
                    contentText.setChannelId(str);
                }
                Notification build = contentText.build();
                build.flags |= 16;
                build.contentIntent = activity;
                notificationManager.notify(intExtra, build);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static String a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        ResolveInfo next = context.getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            return next.activityInfo.name;
        }
        return null;
    }

    private boolean a(Context context) {
        if (context == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }
}
