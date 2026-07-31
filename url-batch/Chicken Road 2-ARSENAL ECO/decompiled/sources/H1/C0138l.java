package H1;

import a.AbstractC0219a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import q.C0582b;

/* renamed from: H1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138l {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f972c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static N f973d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f974a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f975b;

    public C0138l(ExecutorService executorService) {
        this.f975b = new C0582b();
        this.f974a = executorService;
    }

    public static k1.n a(Context context, Intent intent, boolean z5) {
        N n7;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f972c) {
            try {
                if (f973d == null) {
                    f973d = new N(context);
                }
                n7 = f973d;
            } finally {
            }
        }
        if (!z5) {
            return n7.b(intent).c(new P.c(0), new B1.g(6));
        }
        if (A.b().d(context)) {
            synchronized (K.f921b) {
                try {
                    K.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        K.f922c.a(K.f920a);
                    }
                    k1.n b7 = n7.b(intent);
                    B0.b bVar = new B0.b(3, intent);
                    b7.getClass();
                    b7.f5170b.c(new k1.k(k1.i.f5158a, bVar));
                    b7.n();
                } finally {
                }
            }
        } else {
            n7.b(intent);
        }
        return AbstractC0219a.p(-1);
    }

    public k1.n b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f974a;
        P.c cVar = (P.c) this.f975b;
        boolean z5 = Y0.b.b() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z6 = (intent.getFlags() & 268435456) != 0;
        return (!z5 || z6) ? AbstractC0219a.f(cVar, new Callable() { // from class: H1.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i7;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                A b7 = A.b();
                b7.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) b7.f879d).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (b7) {
                    try {
                        str = (String) b7.f876a;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        b7.f876a = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        b7.f876a = serviceInfo.name;
                                    }
                                    str = (String) b7.f876a;
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
                    if (b7.d(context2)) {
                        startService = K.c(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i7 = 404;
                    } else {
                        i7 = -1;
                    }
                } catch (IllegalStateException e4) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e4);
                    i7 = 402;
                } catch (SecurityException e7) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e7);
                    i7 = 401;
                }
                return Integer.valueOf(i7);
            }
        }).d(cVar, new k1.a() { // from class: H1.k
            @Override // k1.a
            public final Object a(k1.n nVar) {
                return (Y0.b.b() && ((Integer) nVar.f()).intValue() == 402) ? C0138l.a(context, intent, z6).c(new P.c(0), new B1.g(5)) : nVar;
            }
        }) : a(context, intent, z6);
    }

    public C0138l(Context context) {
        this.f974a = context;
        this.f975b = new P.c(0);
    }
}
