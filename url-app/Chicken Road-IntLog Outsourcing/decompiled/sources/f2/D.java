package f2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5566a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5567b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static H1.a f5568c;

    public static void a(Context context) {
        if (f5568c == null) {
            H1.a aVar = new H1.a(context);
            f5568c = aVar;
            synchronized (aVar.f1123a) {
                aVar.f1129g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f5567b) {
            try {
                if (f5568c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f5568c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f5567b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f5568c.a(f5566a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
