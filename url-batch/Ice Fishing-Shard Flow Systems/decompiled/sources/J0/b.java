package J0;

import G0.s;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c2.CallableC0293c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1319a = s.f("Alarms");

    public static void a(Context context, P0.j jVar, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f1320m;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i2, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        s.d().a(f1319a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i2 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, P0.j generationalId, long j) {
        P0.i p7 = workDatabase.p();
        P0.g h7 = p7.h(generationalId);
        if (h7 != null) {
            int i2 = h7.f2198c;
            a(context, generationalId, i2);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f1320m;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.d(intent, generationalId);
            PendingIntent service = PendingIntent.getService(context, i2, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object n7 = workDatabase.n(new CallableC0293c(2, new B.f(workDatabase)));
        Intrinsics.checkNotNullExpressionValue(n7, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) n7).intValue();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        p7.i(new P0.g(generationalId.f2204a, generationalId.f2205b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f1320m;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.d(intent2, generationalId);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j, service2);
        }
    }
}
