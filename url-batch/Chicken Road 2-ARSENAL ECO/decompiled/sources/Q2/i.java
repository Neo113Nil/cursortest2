package Q2;

import android.content.Context;
import l0.C0488b;
import l0.w;
import m0.o;
import y1.C0760d;

/* loaded from: classes.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            o.b(context, new C0488b(new C0760d()));
        } catch (IllegalStateException e4) {
            com.onesignal.debug.internal.logging.b.warn("OSWorkManagerHelper initializing WorkManager failed: ", e4);
        }
    }

    public final synchronized w getInstance(Context context) {
        o a7;
        kotlin.jvm.internal.i.e(context, "context");
        try {
            a7 = o.a(context);
        } catch (IllegalStateException e4) {
            com.onesignal.debug.internal.logging.b.warn("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e4);
            initializeWorkManager(context);
            a7 = o.a(context);
        }
        return a7;
    }
}
