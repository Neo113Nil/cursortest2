package H1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j1.C0435a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final long f920a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f921b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0435a f922c;

    public static void a(Context context) {
        if (f922c == null) {
            C0435a c0435a = new C0435a(context);
            f922c = c0435a;
            synchronized (c0435a.f4879a) {
                c0435a.f4885g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f921b) {
            try {
                if (f922c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f922c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f921b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f922c.a(f920a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
