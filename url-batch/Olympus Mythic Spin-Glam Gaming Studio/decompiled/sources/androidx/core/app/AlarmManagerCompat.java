package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes8.dex */
public final class AlarmManagerCompat {

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static void setAlarmClock(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }

        @DoNotInline
        static AlarmManager.AlarmClockInfo createAlarmClockInfo(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }
    }

    @RequiresApi
    static class Api23Impl {
        @DoNotInline
        static void setAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        @DoNotInline
        static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    @RequiresApi
    static class Api31Impl {
        @DoNotInline
        static boolean canScheduleExactAlarms(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }
}
