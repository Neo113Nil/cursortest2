package D;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: d, reason: collision with root package name */
    public static String f511d;

    /* renamed from: g, reason: collision with root package name */
    public static M f514g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f515a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f516b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f510c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f512e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f513f = new Object();

    public N(Context context) {
        this.f515a = context;
        this.f516b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f516b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        J j9 = new J(this.f515a.getPackageName(), i, notification);
        synchronized (f513f) {
            try {
                if (f514g == null) {
                    f514g = new M(this.f515a.getApplicationContext());
                }
                f514g.f507u.obtainMessage(0, j9).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
}
