package s3;

import G0.B;
import G0.C0103c;
import H0.p;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            p.b(context, new C0103c(new c2.e()));
        } catch (IllegalStateException e7) {
            com.onesignal.debug.internal.logging.b.warn("OSWorkManagerHelper initializing WorkManager failed: ", e7);
        }
    }

    public final synchronized B getInstance(Context context) {
        p a7;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            a7 = p.a(context);
        } catch (IllegalStateException e7) {
            com.onesignal.debug.internal.logging.b.warn("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e7);
            initializeWorkManager(context);
            a7 = p.a(context);
        }
        return a7;
    }
}
