package com.baidu.mshield.x0.d;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.C;
import com.my.lib.data.ErrorCode;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8427a;

    public static void a(Context context, long j8) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intent intent = new Intent("com.baidu.mshield.x0.alarm.action");
            intent.setPackage(context.getPackageName());
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 100, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE);
            try {
                alarmManager.cancel(broadcast);
            } catch (Throwable th) {
                d.a(th);
            }
            alarmManager.set(1, System.currentTimeMillis() + j8, broadcast);
        } catch (Throwable th2) {
            d.a(th2);
        }
    }

    public static int b(Context context) {
        try {
            String c8 = new com.baidu.mshield.x0.l.a(context).c("plc33");
            if (!TextUtils.isEmpty(c8)) {
                return new JSONObject(c8).optJSONObject(ErrorCode.PARAMETER_ERROR).optInt("t", 60);
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return 60;
    }

    public static void c(Context context) {
        int b8 = new com.baidu.mshield.x0.l.a(context).b();
        if (b8 == 0) {
            b8 = 24;
        }
        a(context, "com.baidu.mshield.x0.detect.app.fr", b8 * 3600000, 1);
    }

    public static void a(Context context) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intent intent = new Intent("com.baidu.mshield.x0.alarm.action");
            intent.setPackage(context.getPackageName());
            alarmManager.cancel(PendingIntent.getBroadcast(context, 100, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE));
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static void a(Context context, boolean z7) {
        f8427a = z7;
        a(context, new com.baidu.mshield.x0.l.a(context));
        c(context);
        f8427a = false;
    }

    public static void a(Context context, String str, long j8, int i8) {
        try {
            long currentTimeMillis = System.currentTimeMillis() + j8;
            a aVar = new a();
            aVar.f8424a = str;
            aVar.f8426c = currentTimeMillis;
            aVar.f8425b = i8;
            a a8 = com.baidu.mshield.x0.f.a.a(context).a(str);
            if (a8 != null) {
                long j9 = a8.f8426c;
                long n8 = new com.baidu.mshield.x0.l.a(context).n();
                if (!f8427a && j9 >= n8) {
                    aVar.f8426c = j9;
                }
            }
            com.baidu.mshield.x0.f.a.a(context).a(aVar);
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static void a(Context context, com.baidu.mshield.x0.l.a aVar) {
        if (aVar == null) {
            aVar = new com.baidu.mshield.x0.l.a(context);
        }
        a(context, "com.baidu.mshield.x0.timer.pp.action", aVar.m() * 60000, 0);
    }
}
