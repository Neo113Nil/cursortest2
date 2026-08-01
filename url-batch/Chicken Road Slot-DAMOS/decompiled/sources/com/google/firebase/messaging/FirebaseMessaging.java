package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b7.o0;
import com.google.android.gms.internal.measurement.ra;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static d9.c f3075l;

    /* renamed from: m, reason: collision with root package name */
    public static w8.a f3076m = new l8.f(1);

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f3077n;

    /* renamed from: a, reason: collision with root package name */
    public final g8.g f3078a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3079b;

    /* renamed from: c, reason: collision with root package name */
    public final ra f3080c;

    /* renamed from: d, reason: collision with root package name */
    public final se f3081d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3082e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f3083f;
    public final ScheduledThreadPoolExecutor g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f3084h;

    /* renamed from: i, reason: collision with root package name */
    public final b1.m f3085i;
    public final x8.d j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3086k;

    public FirebaseMessaging(final g8.g gVar, w8.a aVar, w8.a aVar2, final x8.d dVar, w8.a aVar3, t8.c cVar) {
        gVar.a();
        Context context = gVar.f4300a;
        final b1.m mVar = new b1.m();
        mVar.f1008b = 0;
        mVar.f1009c = context;
        gVar.a();
        y6.c cVar2 = new y6.c(gVar.f4300a);
        ra raVar = new ra();
        raVar.f2737a = gVar;
        raVar.f2738b = mVar;
        raVar.f2739c = cVar2;
        raVar.f2740d = aVar;
        raVar.f2741e = aVar2;
        raVar.f2742f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new h7.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new h7.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h7.a("Firebase-Messaging-File-Io"));
        this.f3086k = false;
        f3076m = aVar3;
        this.f3078a = gVar;
        this.f3083f = new o0(this, cVar);
        gVar.a();
        final Context context2 = gVar.f4300a;
        this.f3079b = context2;
        k kVar = new k();
        this.f3085i = mVar;
        this.f3080c = raVar;
        this.j = dVar;
        se seVar = new se(context2, gVar, dVar, raVar, mVar);
        this.f3081d = seVar;
        this.f3082e = new j(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.f3084h = threadPoolExecutor;
        gVar.a();
        Context context3 = gVar.f4300a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (seVar.o()) {
            l lVar = new l(this);
            x8.c cVar3 = (x8.c) dVar;
            synchronized (cVar3) {
                cVar3.f10555k.add(lVar);
            }
        }
        final int i3 = 0;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.m

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f3156e;

            {
                this.f3156e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w7.n p4;
                int i10;
                switch (i3) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f3156e;
                        if (firebaseMessaging.f3083f.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f3086k) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f3156e;
                        final Context context4 = firebaseMessaging2.f3079b;
                        e0.f(context4);
                        ra raVar2 = firebaseMessaging2.f3080c;
                        final boolean f3 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e2 = e0.e(context4);
                            if (!e2.contains("proxy_retention") || e2.getBoolean("proxy_retention", false) != f3) {
                                y6.c cVar4 = (y6.c) raVar2.f2739c;
                                if (cVar4.f10636c.p() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f3);
                                    y6.l k10 = y6.l.k(cVar4.f10635b);
                                    synchronized (k10) {
                                        i10 = k10.f10659d;
                                        k10.f10659d = i10 + 1;
                                    }
                                    p4 = k10.l(new y6.k(i10, 4, bundle, 0));
                                } else {
                                    p4 = z4.w.p(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                p4.e(new n.a(1), new w7.d() { // from class: com.google.firebase.messaging.t
                                    @Override // w7.d
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor edit = e0.e(context4).edit();
                                        edit.putBoolean("proxy_retention", f3);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new h7.a("Firebase-Messaging-Topics-Io"));
        z4.w.i(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                z zVar;
                Context context4 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                b1.m mVar2 = mVar;
                g8.g gVar2 = gVar;
                FirebaseMessaging firebaseMessaging = this;
                x8.d dVar2 = dVar;
                synchronized (z.class) {
                    try {
                        WeakReference weakReference = z.f3190b;
                        zVar = weakReference != null ? (z) weakReference.get() : null;
                        if (zVar == null) {
                            SharedPreferences sharedPreferences = context4.getSharedPreferences("com.google.android.gms.appid", 0);
                            z zVar2 = new z();
                            synchronized (zVar2) {
                                zVar2.f3191a = se.k(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            z.f3190b = new WeakReference(zVar2);
                            zVar = zVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new b0(mVar2, zVar, new a1.n(gVar2, firebaseMessaging, dVar2, 14, false), context4, scheduledThreadPoolExecutor3);
            }
        }).e(scheduledThreadPoolExecutor, new n(this, 0));
        final int i10 = 1;
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.m

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f3156e;

            {
                this.f3156e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w7.n p4;
                int i102;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f3156e;
                        if (firebaseMessaging.f3083f.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f3086k) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f3156e;
                        final Context context4 = firebaseMessaging2.f3079b;
                        e0.f(context4);
                        ra raVar2 = firebaseMessaging2.f3080c;
                        final boolean f3 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e2 = e0.e(context4);
                            if (!e2.contains("proxy_retention") || e2.getBoolean("proxy_retention", false) != f3) {
                                y6.c cVar4 = (y6.c) raVar2.f2739c;
                                if (cVar4.f10636c.p() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f3);
                                    y6.l k10 = y6.l.k(cVar4.f10635b);
                                    synchronized (k10) {
                                        i102 = k10.f10659d;
                                        k10.f10659d = i102 + 1;
                                    }
                                    p4 = k10.l(new y6.k(i102, 4, bundle, 0));
                                } else {
                                    p4 = z4.w.p(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                p4.e(new n.a(1), new w7.d() { // from class: com.google.firebase.messaging.t
                                    @Override // w7.d
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor edit = e0.e(context4).edit();
                                        edit.putBoolean("proxy_retention", f3);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f3077n == null) {
                    f3077n = new ScheduledThreadPoolExecutor(1, new h7.a("TAG"));
                }
                f3077n.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized d9.c c(Context context) {
        d9.c cVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f3075l == null) {
                    f3075l = new d9.c(context);
                }
                cVar = f3075l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(g8.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            c7.c0.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        w d10 = d();
        if (!h(d10)) {
            return d10.f3179a;
        }
        String c10 = b1.m.c(this.f3078a);
        j jVar = this.f3082e;
        o oVar = new o(this, c10, d10);
        synchronized (jVar) {
            task = (Task) ((s.e) jVar.f3151b).get(c10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                task = oVar.a().g((Executor) jVar.f3150a, new f(3, jVar, c10));
                ((s.e) jVar.f3151b).put(c10, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c10);
            }
        }
        try {
            return (String) z4.w.f(task);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException("FCM Registration failed!", e2);
        }
    }

    public final w d() {
        w b10;
        d9.c c10 = c(this.f3079b);
        g8.g gVar = this.f3078a;
        gVar.a();
        String d10 = "[DEFAULT]".equals(gVar.f4301b) ? "" : gVar.d();
        String c11 = b1.m.c(this.f3078a);
        synchronized (c10) {
            b10 = w.b(((SharedPreferences) c10.f3701e).getString(d10 + "|T|" + c11 + "|*", null));
        }
        return b10;
    }

    public final void e() {
        Task p4;
        int i3;
        y6.c cVar = (y6.c) this.f3080c.f2739c;
        if (cVar.f10636c.p() >= 241100000) {
            y6.l k10 = y6.l.k(cVar.f10635b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (k10) {
                i3 = k10.f10659d;
                k10.f10659d = i3 + 1;
            }
            p4 = k10.l(new y6.k(i3, 5, bundle, 1)).f(d6.n.f3648i, s7.c0.E);
        } else {
            p4 = z4.w.p(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        p4.e(this.g, new n(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f3079b;
        e0.f(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if ("com.google.android.gms".equals(notificationDelegate)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f3078a.b(i8.a.class) != null) {
                    return true;
                }
                if (e0.d() && f3076m != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void g(long j) {
        b(new x(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.f3086k = true;
    }

    public final boolean h(w wVar) {
        String str;
        if (wVar != null) {
            String str2 = wVar.f3179a;
            String b10 = this.f3085i.b();
            if (System.currentTimeMillis() <= wVar.f3180b + 604800000 && b10.equals((String) wVar.f3181c)) {
                if (this.f3081d.o()) {
                    try {
                        str = (String) z4.w.f(((x8.c) this.j).c());
                    } catch (InterruptedException | ExecutionException unused) {
                        str = null;
                    }
                    return !str2.equalsIgnoreCase(str);
                }
                if (str2.length() > 22) {
                    return false;
                }
            }
        }
        return true;
    }
}
