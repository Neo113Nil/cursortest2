package w5;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i3, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i3, j, pendingIntent);
    }
}
