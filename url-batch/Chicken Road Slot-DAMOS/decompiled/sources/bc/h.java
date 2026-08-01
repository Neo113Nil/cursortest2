package bc;

import android.content.Context;
import s7.c0;
import t5.u;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();

    private h() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            m.b(context, new t5.b(new c0(17)));
        } catch (IllegalStateException e2) {
            com.onesignal.debug.internal.logging.b.error("OSWorkManagerHelper initializing WorkManager failed: ", e2);
        }
    }

    public final synchronized u getInstance(Context context) {
        m a9;
        context.getClass();
        try {
            a9 = m.a(context);
        } catch (IllegalStateException e2) {
            com.onesignal.debug.internal.logging.b.error("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e2);
            initializeWorkManager(context);
            a9 = m.a(context);
        }
        return a9;
    }
}
