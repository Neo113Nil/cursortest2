package o0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import l0.q;
import u0.C0677g;
import u0.C0679i;
import u0.C0680j;
import y1.CallableC0758b;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5567a = q.f("Alarms");

    public static void a(Context context, C0680j c0680j, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f5568j;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.c(intent, c0680j);
        PendingIntent service = PendingIntent.getService(context, i7, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        q.d().a(f5567a, "Cancelling existing alarm with (workSpecId, systemId) (" + c0680j + ", " + i7 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, C0680j c0680j, long j4) {
        C0679i p4 = workDatabase.p();
        C0677g b7 = p4.b(c0680j);
        if (b7 != null) {
            int i7 = b7.f5979c;
            a(context, c0680j, i7);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f5568j;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.c(intent, c0680j);
            PendingIntent service = PendingIntent.getService(context, i7, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j4, service);
                return;
            }
            return;
        }
        Object n7 = workDatabase.n(new CallableC0758b(2, new V5.g(workDatabase)));
        kotlin.jvm.internal.i.d(n7, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) n7).intValue();
        p4.d(new C0677g(c0680j.f5985a, c0680j.f5986b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f5568j;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.c(intent2, c0680j);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j4, service2);
        }
    }
}
