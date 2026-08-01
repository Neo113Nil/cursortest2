package d6;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3651a = t5.o.f("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (p.f3652a) {
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
