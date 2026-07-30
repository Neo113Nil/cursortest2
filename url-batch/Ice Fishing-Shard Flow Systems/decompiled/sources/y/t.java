package y;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static String f8516d;

    /* renamed from: g, reason: collision with root package name */
    public static s f8519g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8520a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f8521b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8515c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f8517e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f8518f = new Object();

    public t(Context context) {
        this.f8520a = context;
        this.f8521b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i2, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f8521b.notify(null, i2, notification);
            return;
        }
        p pVar = new p(this.f8520a.getPackageName(), i2, notification);
        synchronized (f8518f) {
            try {
                if (f8519g == null) {
                    f8519g = new s(this.f8520a.getApplicationContext());
                }
                f8519g.f8512b.obtainMessage(0, pVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8521b.cancel(null, i2);
    }
}
