package f2;

import E.C0028c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import r.C1392b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5611c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static G f5612d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5613a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5614b;

    public j(ExecutorService executorService) {
        this.f5614b = new C1392b();
        this.f5613a = executorService;
    }

    public static I1.o a(Context context, Intent intent, boolean z) {
        G g6;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f5611c) {
            try {
                if (f5612d == null) {
                    f5612d = new G(context);
                }
                g6 = f5612d;
            } finally {
            }
        }
        if (!z) {
            return g6.b(intent).g(new U.d(0), new C0028c(22));
        }
        if (t.c().e(context)) {
            synchronized (D.f5567b) {
                try {
                    D.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        D.f5568c.a(D.f5566a);
                    }
                    I1.o b6 = g6.b(intent);
                    D3.g gVar = new D3.g(19, intent);
                    b6.getClass();
                    b6.f1264b.b(new I1.l(I1.i.f1249a, gVar));
                    b6.n();
                } finally {
                }
            }
        } else {
            g6.b(intent);
        }
        return B0.f.r(-1);
    }

    public I1.o b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean b6 = s1.b.b();
        final Context context = (Context) this.f5613a;
        boolean z = b6 && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z5 = (intent.getFlags() & 268435456) != 0;
        if (z && !z5) {
            return a(context, intent, z5);
        }
        U.d dVar = (U.d) this.f5614b;
        return B0.f.f(dVar, new Callable() { // from class: f2.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i2;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                t c2 = t.c();
                c2.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) c2.f5639d).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c2) {
                    try {
                        str = (String) c2.f5636a;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        c2.f5636a = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        c2.f5636a = serviceInfo.name;
                                    }
                                    str = (String) c2.f5636a;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (c2.e(context2)) {
                        startService = D.c(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    } else {
                        i2 = -1;
                    }
                } catch (IllegalStateException e3) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e3);
                    i2 = 402;
                } catch (SecurityException e6) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e6);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).h(dVar, new I1.a() { // from class: f2.i
            @Override // I1.a
            public final Object j(Task task) {
                if (!s1.b.b() || ((Integer) task.c()).intValue() != 402) {
                    return task;
                }
                return j.a(context, intent, z5).g(new U.d(0), new C0028c(21));
            }
        });
    }

    public j(Context context) {
        this.f5613a = context;
        this.f5614b = new U.d(0);
    }
}
