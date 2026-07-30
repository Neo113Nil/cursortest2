package p5;

import J0.y;
import K0.p;
import android.content.Context;

/* loaded from: classes2.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            p.c(context, new J0.b(new W3.e(4)));
        } catch (IllegalStateException e6) {
            com.onesignal.debug.internal.logging.b.warn("OSWorkManagerHelper initializing WorkManager failed: ", e6);
        }
    }

    public final synchronized y getInstance(Context context) {
        p b9;
        kotlin.jvm.internal.h.e(context, "context");
        try {
            b9 = p.b(context);
        } catch (IllegalStateException e6) {
            com.onesignal.debug.internal.logging.b.warn("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e6);
            initializeWorkManager(context);
            b9 = p.b(context);
        }
        return b9;
    }
}
