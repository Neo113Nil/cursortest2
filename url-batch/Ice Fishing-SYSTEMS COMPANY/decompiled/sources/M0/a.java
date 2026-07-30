package M0;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i, long j9, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j9, pendingIntent);
    }
}
