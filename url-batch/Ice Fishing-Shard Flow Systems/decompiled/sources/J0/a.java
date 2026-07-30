package J0;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i2, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i2, j, pendingIntent);
    }
}
