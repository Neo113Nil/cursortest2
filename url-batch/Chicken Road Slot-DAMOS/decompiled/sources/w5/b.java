package w5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c6.j;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10081a = o.f("Alarms");

    public static void a(Context context, j jVar, int i3) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f10082s;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i3, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o.d().a(f10081a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i3 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j jVar, long j) {
        c6.i y3 = workDatabase.y();
        c6.g f3 = y3.f(jVar);
        if (f3 != null) {
            int i3 = f3.f1818c;
            a(context, jVar, i3);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f10082s;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.c(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i3, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object t6 = workDatabase.t(new u8.b(2, new d6.f(workDatabase, 0)));
        t6.getClass();
        int intValue = ((Number) t6).intValue();
        y3.g(new c6.g(jVar.f1824a, jVar.f1825b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f10082s;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.c(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j, service2);
        }
    }
}
