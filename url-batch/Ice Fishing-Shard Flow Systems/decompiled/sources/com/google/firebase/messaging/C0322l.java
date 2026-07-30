package com.google.firebase.messaging;

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
import u.C0934e;
import x1.AbstractC1000b;
import z1.AbstractC1053a;

/* renamed from: com.google.firebase.messaging.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322l {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4509c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static M f4510d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4511a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4512b;

    public C0322l(ExecutorService executorService) {
        this.f4512b = new C0934e(0);
        this.f4511a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z7) {
        M m2;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f4509c) {
            try {
                if (f4510d == null) {
                    f4510d = new M(context);
                }
                m2 = f4510d;
            } finally {
            }
        }
        if (!z7) {
            return m2.b(intent).f(new e0.c(0), new A4.c(24));
        }
        if (z.a().d(context)) {
            synchronized (J.f4468b) {
                try {
                    J.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        J.f4469c.a(J.f4467a);
                    }
                    m2.b(intent).addOnCompleteListener(new A4.b(6, intent));
                } finally {
                }
            }
        } else {
            m2.b(intent);
        }
        return AbstractC1053a.w(-1);
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f4511a;
        e0.c cVar = (e0.c) this.f4512b;
        boolean z7 = AbstractC1000b.b() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z8 = (intent.getFlags() & 268435456) != 0;
        return (!z7 || z8) ? AbstractC1053a.i(cVar, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i2;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                z a7 = z.a();
                a7.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) a7.f4538l).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (a7) {
                    try {
                        str = (String) a7.f4535d;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        a7.f4535d = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        a7.f4535d = serviceInfo.name;
                                    }
                                    str = (String) a7.f4535d;
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
                    if (a7.d(context2)) {
                        startService = J.c(context2, intent3);
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
                } catch (IllegalStateException e7) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
                    i2 = 402;
                } catch (SecurityException e8) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e8);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).g(cVar, new K1.a() { // from class: com.google.firebase.messaging.k
            @Override // K1.a
            public final Object h(Task task) {
                return (AbstractC1000b.b() && ((Integer) task.getResult()).intValue() == 402) ? C0322l.a(context, intent, z8).f(new e0.c(0), new A4.c(23)) : task;
            }
        }) : a(context, intent, z8);
    }

    public C0322l(Context context) {
        this.f4511a = context;
        this.f4512b = new e0.c(0);
    }
}
