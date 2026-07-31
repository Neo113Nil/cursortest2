package v0;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6078a;

    static {
        String f7 = l0.q.f("WakeLocks");
        kotlin.jvm.internal.i.d(f7, "tagWithPrefix(\"WakeLocks\")");
        f6078a = f7;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (n.f6079a) {
        }
        kotlin.jvm.internal.i.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
