package C0;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f352a;

    static {
        String f3 = s0.s.f("WakeLocks");
        kotlin.jvm.internal.i.d(f3, "tagWithPrefix(\"WakeLocks\")");
        f352a = f3;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (r.f353a) {
        }
        kotlin.jvm.internal.i.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
