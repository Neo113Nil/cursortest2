package com.google.firebase.messaging;

import I.C0108d;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b2.InterfaceC0272c;
import com.google.android.gms.tasks.Task;
import e2.InterfaceC0372a;
import f2.C0396c;
import f2.InterfaceC0397d;
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
import p1.C0820c;
import r1.InterfaceC0843b;
import u.C0934e;
import y1.ThreadFactoryC1023a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    public static B.f f4435m;

    /* renamed from: o, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f4437o;

    /* renamed from: a, reason: collision with root package name */
    public final P1.g f4438a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4439b;

    /* renamed from: c, reason: collision with root package name */
    public final D6.z f4440c;

    /* renamed from: d, reason: collision with root package name */
    public final D6.y f4441d;

    /* renamed from: e, reason: collision with root package name */
    public final C0322l f4442e;

    /* renamed from: f, reason: collision with root package name */
    public final s f4443f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4444g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f4445h;

    /* renamed from: i, reason: collision with root package name */
    public final C0108d f4446i;
    public final InterfaceC0397d j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4447k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f4434l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    public static InterfaceC0372a f4436n = new S1.f(6);

    public FirebaseMessaging(final P1.g gVar, InterfaceC0372a interfaceC0372a, InterfaceC0372a interfaceC0372a2, final InterfaceC0397d interfaceC0397d, InterfaceC0372a interfaceC0372a3, InterfaceC0272c interfaceC0272c) {
        gVar.a();
        final C0108d c0108d = new C0108d(gVar.f2270a);
        D6.z zVar = new D6.z(gVar, c0108d, interfaceC0372a, interfaceC0372a2, interfaceC0397d);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC1023a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1023a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1023a("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.f4447k = false;
        f4436n = interfaceC0372a3;
        this.f4438a = gVar;
        this.f4443f = new s(this, interfaceC0272c);
        gVar.a();
        final Context context = gVar.f2270a;
        this.f4439b = context;
        C0323m c0323m = new C0323m();
        this.f4446i = c0108d;
        this.f4440c = zVar;
        this.j = interfaceC0397d;
        D1.f fVar = new D1.f(context, D1.f.j, InterfaceC0843b.f7434a, r1.i.f7447b);
        D6.y yVar = new D6.y();
        yVar.f634e = fVar;
        yVar.f633d = gVar;
        yVar.f635i = interfaceC0397d;
        yVar.f636l = zVar;
        yVar.f637m = c0108d;
        this.f4441d = yVar;
        this.f4442e = new C0322l(newSingleThreadExecutor);
        this.f4444g = scheduledThreadPoolExecutor;
        this.f4445h = threadPoolExecutor;
        gVar.a();
        Context context2 = gVar.f2270a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(c0323m);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (yVar.c()) {
            n nVar = new n(this);
            C0396c c0396c = (C0396c) interfaceC0397d;
            synchronized (c0396c) {
                c0396c.f4788k.add(nVar);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f4516e;

            {
                this.f4516e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                K1.p v7;
                int i5;
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f4516e;
                        if (firebaseMessaging.f4443f.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f4447k) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f4516e;
                        final Context context3 = firebaseMessaging2.f4439b;
                        O6.g.Q(context3);
                        D6.z zVar2 = firebaseMessaging2.f4440c;
                        final boolean f7 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences t6 = P0.f.t(context3);
                            if (!t6.contains("proxy_retention") || t6.getBoolean("proxy_retention", false) != f7) {
                                C0820c c0820c = (C0820c) zVar2.f641d;
                                if (c0820c.f7164c.c() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f7);
                                    p1.l b7 = p1.l.b(c0820c.f7163b);
                                    synchronized (b7) {
                                        i5 = b7.f7191a;
                                        b7.f7191a = i5 + 1;
                                    }
                                    v7 = b7.c(new p1.k(i5, 4, bundle, 0));
                                } else {
                                    v7 = AbstractC1053a.v(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                v7.e(new e0.c(0), new K1.e() { // from class: com.google.firebase.messaging.w
                                    @Override // K1.e
                                    public final void k(Object obj) {
                                        SharedPreferences.Editor edit = P0.f.t(context3).edit();
                                        edit.putBoolean("proxy_retention", f7);
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
        final int i5 = 1;
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1023a("Firebase-Messaging-Topics-Io"));
        int i7 = G.f4449i;
        AbstractC1053a.i(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.F
            @Override // java.util.concurrent.Callable
            public final Object call() {
                E e7;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                C0108d c0108d2 = c0108d;
                P1.g gVar2 = gVar;
                FirebaseMessaging firebaseMessaging = this;
                InterfaceC0397d interfaceC0397d2 = interfaceC0397d;
                synchronized (E.class) {
                    try {
                        WeakReference weakReference = E.f4426b;
                        e7 = weakReference != null ? (E) weakReference.get() : null;
                        if (e7 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            E e8 = new E();
                            synchronized (e8) {
                                e8.f4427a = D6.y.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            E.f4426b = new WeakReference(e8);
                            e7 = e8;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new G(c0108d2, e7, new D0.j(gVar2, firebaseMessaging, interfaceC0397d2, 15, false), context3, scheduledThreadPoolExecutor3);
            }
        }).e(scheduledThreadPoolExecutor, new p(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.o

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f4516e;

            {
                this.f4516e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                K1.p v7;
                int i52;
                switch (i5) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f4516e;
                        if (firebaseMessaging.f4443f.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f4447k) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f4516e;
                        final Context context3 = firebaseMessaging2.f4439b;
                        O6.g.Q(context3);
                        D6.z zVar2 = firebaseMessaging2.f4440c;
                        final boolean f7 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences t6 = P0.f.t(context3);
                            if (!t6.contains("proxy_retention") || t6.getBoolean("proxy_retention", false) != f7) {
                                C0820c c0820c = (C0820c) zVar2.f641d;
                                if (c0820c.f7164c.c() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f7);
                                    p1.l b7 = p1.l.b(c0820c.f7163b);
                                    synchronized (b7) {
                                        i52 = b7.f7191a;
                                        b7.f7191a = i52 + 1;
                                    }
                                    v7 = b7.c(new p1.k(i52, 4, bundle, 0));
                                } else {
                                    v7 = AbstractC1053a.v(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                v7.e(new e0.c(0), new K1.e() { // from class: com.google.firebase.messaging.w
                                    @Override // K1.e
                                    public final void k(Object obj) {
                                        SharedPreferences.Editor edit = P0.f.t(context3).edit();
                                        edit.putBoolean("proxy_retention", f7);
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
                if (f4437o == null) {
                    f4437o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1023a("TAG"));
                }
                f4437o.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized B.f c(Context context) {
        B.f fVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f4435m == null) {
                    f4435m = new B.f(context, 20);
                }
                fVar = f4435m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(P1.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.c(FirebaseMessaging.class);
            t1.u.g(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        A d7 = d();
        if (!h(d7)) {
            return d7.f4412a;
        }
        String f7 = C0108d.f(this.f4438a);
        C0322l c0322l = this.f4442e;
        q qVar = new q(this, f7, d7);
        synchronized (c0322l) {
            task = (Task) ((C0934e) c0322l.f4512b).get(f7);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + f7);
                }
                task = qVar.a().g((Executor) c0322l.f4511a, new C0318h(c0322l, 3, f7));
                ((C0934e) c0322l.f4512b).put(f7, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + f7);
            }
        }
        try {
            return (String) AbstractC1053a.e(task);
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException("FCM Registration failed!", e7);
        }
    }

    public final A d() {
        A b7;
        B.f c7 = c(this.f4439b);
        P1.g gVar = this.f4438a;
        gVar.a();
        String g7 = "[DEFAULT]".equals(gVar.f2271b) ? "" : gVar.g();
        String f7 = C0108d.f(this.f4438a);
        synchronized (c7) {
            b7 = A.b(((SharedPreferences) c7.f152e).getString(g7 + "|T|" + f7 + "|*", null));
        }
        return b7;
    }

    public final void e() {
        Task v7;
        int i2;
        C0820c c0820c = (C0820c) this.f4440c.f641d;
        if (c0820c.f7164c.c() >= 241100000) {
            p1.l b7 = p1.l.b(c0820c.f7163b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (b7) {
                i2 = b7.f7191a;
                b7.f7191a = i2 + 1;
            }
            v7 = b7.c(new p1.k(i2, 5, bundle, 1)).f(K1.n.f1442e, q1.h.f7332l);
        } else {
            v7 = AbstractC1053a.v(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        v7.e(this.f4444g, new p(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f4439b;
        O6.g.Q(context);
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
                if (this.f4438a.c(Q1.a.class) != null) {
                    return true;
                }
                if (AbstractC1053a.p() && f4436n != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void g(long j) {
        b(new C(this, Math.min(Math.max(30L, 2 * j), f4434l)), j);
        this.f4447k = true;
    }

    public final boolean h(A a7) {
        String str;
        if (a7 != null) {
            String str2 = a7.f4412a;
            String e7 = this.f4446i.e();
            if (System.currentTimeMillis() <= a7.f4414c + A.f4411d && e7.equals(a7.f4413b)) {
                if (this.f4441d.c()) {
                    try {
                        str = (String) AbstractC1053a.e(((C0396c) this.j).c());
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
