package e3;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static String f3847d;
    public static s g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f3851b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3846c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f3848e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f3849f = new Object();

    public t(Context context) {
        this.f3850a = context;
        this.f3851b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i3, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f3851b.notify(null, i3, notification);
            return;
        }
        p pVar = new p(this.f3850a.getPackageName(), i3, notification);
        synchronized (f3849f) {
            try {
                if (g == null) {
                    g = new s(this.f3850a.getApplicationContext());
                }
                g.f3843b.obtainMessage(0, pVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3851b.cancel(null, i3);
    }
}
