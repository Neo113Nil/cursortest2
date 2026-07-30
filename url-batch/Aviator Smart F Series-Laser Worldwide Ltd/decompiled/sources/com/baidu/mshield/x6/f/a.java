package com.baidu.mshield.x6.f;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class a {
    public static void a(Context context) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intent intent = new Intent("com.baidu.mshield.x6.alarm.work.finger");
            intent.setPackage(context.getPackageName());
            int i8 = Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 100, intent, i8));
            Intent intent2 = new Intent("com.baidu.mshield.x6.alarm.work.zid");
            intent2.setPackage(context.getPackageName());
            alarmManager.cancel(PendingIntent.getBroadcast(context, 101, intent2, i8));
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
    }

    public static void b(Context context) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intent intent = new Intent("com.baidu.mshield.x6.alarm.work.finger");
            intent.setPackage(context.getPackageName());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 100, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE);
            try {
                alarmManager.cancel(broadcast);
            } catch (Throwable th) {
                f.b(th);
            }
            int b8 = new com.baidu.mshield.x6.b.b(context).b();
            com.baidu.mshield.b.c.a.b("finger alarm interval=" + b8 + " Min");
            alarmManager.set(1, System.currentTimeMillis() + (((long) b8) * 60000), broadcast);
        } catch (Throwable th2) {
            f.b(th2);
        }
    }

    public static void c(Context context) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intent intent = new Intent("com.baidu.mshield.x6.alarm.work.zid");
            intent.setPackage(context.getPackageName());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 101, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE);
            try {
                alarmManager.cancel(broadcast);
            } catch (Throwable th) {
                f.b(th);
            }
            com.baidu.mshield.b.c.a.b("zid alarm interval=" + com.baidu.mshield.x6.e.a.a(context) + " HOUR");
            alarmManager.set(1, System.currentTimeMillis() + (((long) com.baidu.mshield.x6.e.a.a(context)) * 3600000), broadcast);
        } catch (Throwable th2) {
            f.b(th2);
        }
    }
}
