package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import d0.j;
import e0.i;
import l0.g;
import l0.h;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1478a = j.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h y6 = iVar.o().y();
        g b7 = y6.b(str);
        if (b7 != null) {
            b(context, str, b7.f18455b);
            j.c().a(f1478a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            y6.c(str);
        }
    }

    private static void b(Context context, String str, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.c(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        j.c().a(f1478a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i7)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j7) {
        int b7;
        WorkDatabase o7 = iVar.o();
        h y6 = o7.y();
        g b8 = y6.b(str);
        if (b8 != null) {
            b(context, str, b8.f18455b);
            b7 = b8.f18455b;
        } else {
            b7 = new m0.c(o7).b();
            y6.d(new g(str, b7));
        }
        d(context, str, b7, j7);
    }

    private static void d(Context context, String str, int i7, long j7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i8 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i7, b.c(context, str), i8 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i8 >= 19) {
                alarmManager.setExact(0, j7, service);
            } else {
                alarmManager.set(0, j7, service);
            }
        }
    }
}
