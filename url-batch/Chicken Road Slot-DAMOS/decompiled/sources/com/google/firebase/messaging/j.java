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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3148c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static h0 f3149d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3150a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3151b;

    public j(ExecutorService executorService) {
        this.f3151b = new s.e(0);
        this.f3150a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        h0 h0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f3148c) {
            try {
                if (f3149d == null) {
                    f3149d = new h0(context);
                }
                h0Var = f3149d;
            } finally {
            }
        }
        if (!z10) {
            return h0Var.b(intent).f(new n.a(1), new a2.r(10));
        }
        if (v.c().e(context)) {
            synchronized (e0.f3129a) {
                try {
                    e0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        e0.f3130b.a();
                    }
                    h0Var.b(intent).addOnCompleteListener(new b1.h(3, intent));
                } finally {
                }
            }
        } else {
            h0Var.b(intent);
        }
        return z4.w.q(-1);
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f3150a;
        n.a aVar = (n.a) this.f3151b;
        boolean z10 = g7.b.b() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? z4.w.i(aVar, new Callable() { // from class: com.google.firebase.messaging.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i3;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                v c10 = v.c();
                c10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) c10.f3178r).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c10) {
                    try {
                        str = (String) c10.f3175d;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        c10.f3175d = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        c10.f3175d = serviceInfo.name;
                                    }
                                    str = (String) c10.f3175d;
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
                    if (c10.e(context2)) {
                        startService = e0.j(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i3 = 404;
                    } else {
                        i3 = -1;
                    }
                } catch (IllegalStateException e2) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
                    i3 = 402;
                } catch (SecurityException e9) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e9);
                    i3 = 401;
                }
                return Integer.valueOf(i3);
            }
        }).g(aVar, new w7.a() { // from class: com.google.firebase.messaging.i
            @Override // w7.a
            public final Object f(Task task) {
                return (g7.b.b() && ((Integer) task.getResult()).intValue() == 402) ? j.a(context, intent, z11).f(new n.a(1), new a2.r(9)) : task;
            }
        }) : a(context, intent, z11);
    }

    public j(Context context) {
        this.f3150a = context;
        this.f3151b = new n.a(1);
    }
}
