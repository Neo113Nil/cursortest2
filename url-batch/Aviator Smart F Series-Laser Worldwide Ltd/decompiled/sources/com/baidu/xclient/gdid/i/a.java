package com.baidu.xclient.gdid.i;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.baidu.xclient.gdid.d;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f10743a = 60000;

    /* renamed from: b, reason: collision with root package name */
    public static long f10744b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    public static long f10745c = 86400000;

    public static void a(Context context, long j8) {
        if (j8 <= 0) {
            return;
        }
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intent intent = new Intent(b.f10746a);
            intent.setPackage(d.a().a(context));
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 100, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE);
            alarmManager.cancel(broadcast);
            alarmManager.set(1, System.currentTimeMillis() + j8, broadcast);
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
    }
}
