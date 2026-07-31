package t;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: t.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639F {

    /* renamed from: d, reason: collision with root package name */
    public static String f5897d;

    /* renamed from: g, reason: collision with root package name */
    public static ServiceConnectionC0638E f5900g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5901a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f5902b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5896c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f5898e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f5899f = new Object();

    public C0639F(Context context) {
        this.f5901a = context;
        this.f5902b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i7, Notification notification) {
        NotificationManager notificationManager = this.f5902b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i7, notification);
            return;
        }
        C0635B c0635b = new C0635B(this.f5901a.getPackageName(), i7, notification);
        synchronized (f5899f) {
            try {
                if (f5900g == null) {
                    f5900g = new ServiceConnectionC0638E(this.f5901a.getApplicationContext());
                }
                f5900g.f5893b.obtainMessage(0, c0635b).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i7);
    }
}
