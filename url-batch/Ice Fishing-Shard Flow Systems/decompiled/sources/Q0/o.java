package Q0;

import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2319a;

    static {
        String f7 = G0.s.f("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(f7, "tagWithPrefix(\"WakeLocks\")");
        f2319a = f7;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String i2 = r4.f.i("WorkManager: ", tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, i2);
        synchronized (p.f2320a) {
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
