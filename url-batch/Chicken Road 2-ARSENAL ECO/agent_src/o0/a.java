package o0;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i7, long j4, PendingIntent pendingIntent) {
        alarmManager.setExact(i7, j4, pendingIntent);
    }
}
