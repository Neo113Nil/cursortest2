package com.google.firebase.messaging;

import B2.N;
import K2.l;
import K3.g;
import N3.f;
import O2.w;
import V3.b;
import Y3.a;
import Z3.d;
import a.AbstractC0415a;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.fragment.app.C0471d;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.C2561Fo;
import com.google.android.gms.internal.ads.RunnableC2757Rg;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icefishing.icefishingliveapp.A;
import e2.C4468a;
import f4.h;
import f4.j;
import f4.q;
import f4.u;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC4797a;
import q2.C4903n;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static A f36352k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f36354m;

    /* renamed from: a, reason: collision with root package name */
    public final g f36355a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f36356b;

    /* renamed from: c, reason: collision with root package name */
    public final C4903n f36357c;

    /* renamed from: d, reason: collision with root package name */
    public final h f36358d;

    /* renamed from: e, reason: collision with root package name */
    public final n f36359e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f36360f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f36361g;

    /* renamed from: h, reason: collision with root package name */
    public final C2561Fo f36362h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f36351j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static a f36353l = new f(6);

    public FirebaseMessaging(g gVar, a aVar, a aVar2, d dVar, a aVar3, b bVar) {
        final int i = 1;
        final int i4 = 0;
        gVar.a();
        Context context = gVar.f1623a;
        final C2561Fo c2561Fo = new C2561Fo(context, 2);
        final C4903n c4903n = new C4903n(gVar, c2561Fo, aVar, aVar2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new T2.a("Firebase-Messaging-Task", 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new T2.a("Firebase-Messaging-Init", 0));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new T2.a("Firebase-Messaging-File-Io", 0));
        this.i = false;
        f36353l = aVar3;
        this.f36355a = gVar;
        this.f36359e = new n(this, bVar);
        gVar.a();
        final Context context2 = gVar.f1623a;
        this.f36356b = context2;
        com.bumptech.glide.b bVar2 = new com.bumptech.glide.b();
        this.f36362h = c2561Fo;
        this.f36357c = c4903n;
        this.f36358d = new h(newSingleThreadExecutor);
        this.f36360f = scheduledThreadPoolExecutor;
        this.f36361g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(bVar2);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: f4.i

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f37749u;

            {
                this.f37749u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h3.n q6;
                int i9;
                switch (i4) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f37749u;
                        if (firebaseMessaging.f36359e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f37749u;
                        final Context context3 = firebaseMessaging2.f36356b;
                        com.bumptech.glide.h.p(context3);
                        final boolean f6 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences h9 = p8.g.h(context3);
                            if (!h9.contains("proxy_retention") || h9.getBoolean("proxy_retention", false) != f6) {
                                K2.b bVar3 = (K2.b) firebaseMessaging2.f36357c.f40103w;
                                if (bVar3.f1570c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f6);
                                    K2.n c4 = K2.n.c(bVar3.f1569b);
                                    synchronized (c4) {
                                        i9 = c4.f1604a;
                                        c4.f1604a = i9 + 1;
                                    }
                                    q6 = c4.d(new K2.l(i9, 4, bundle, 0));
                                } else {
                                    q6 = AbstractC0415a.q(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                q6.c(new ExecutorC4797a(1), new h3.e() { // from class: f4.o
                                    @Override // h3.e
                                    public final void l(Object obj) {
                                        SharedPreferences.Editor edit = p8.g.h(context3).edit();
                                        edit.putBoolean("proxy_retention", f6);
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
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new T2.a("Firebase-Messaging-Topics-Io", 0));
        int i9 = u.f37783j;
        AbstractC0415a.g(new Callable() { // from class: f4.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                s sVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C2561Fo c2561Fo2 = c2561Fo;
                C4903n c4903n2 = c4903n;
                synchronized (s.class) {
                    try {
                        WeakReference weakReference = s.f37775c;
                        sVar = weakReference != null ? (s) weakReference.get() : null;
                        if (sVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            s sVar2 = new s(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (sVar2) {
                                sVar2.f37776a = N.i(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            s.f37775c = new WeakReference(sVar2);
                            sVar = sVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new u(firebaseMessaging, c2561Fo2, sVar, c4903n2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).c(scheduledThreadPoolExecutor, new j(this, i4));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: f4.i

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f37749u;

            {
                this.f37749u = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h3.n q6;
                int i92;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f37749u;
                        if (firebaseMessaging.f36359e.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f37749u;
                        final Context context3 = firebaseMessaging2.f36356b;
                        com.bumptech.glide.h.p(context3);
                        final boolean f6 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences h9 = p8.g.h(context3);
                            if (!h9.contains("proxy_retention") || h9.getBoolean("proxy_retention", false) != f6) {
                                K2.b bVar3 = (K2.b) firebaseMessaging2.f36357c.f40103w;
                                if (bVar3.f1570c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f6);
                                    K2.n c4 = K2.n.c(bVar3.f1569b);
                                    synchronized (c4) {
                                        i92 = c4.f1604a;
                                        c4.f1604a = i92 + 1;
                                    }
                                    q6 = c4.d(new K2.l(i92, 4, bundle, 0));
                                } else {
                                    q6 = AbstractC0415a.q(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                q6.c(new ExecutorC4797a(1), new h3.e() { // from class: f4.o
                                    @Override // h3.e
                                    public final void l(Object obj) {
                                        SharedPreferences.Editor edit = p8.g.h(context3).edit();
                                        edit.putBoolean("proxy_retention", f6);
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

    public static void b(Runnable runnable, long j9) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36354m == null) {
                    f36354m = new ScheduledThreadPoolExecutor(1, new T2.a("TAG", 0));
                }
                f36354m.schedule(runnable, j9, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized A c(Context context) {
        A a9;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36352k == null) {
                    f36352k = new A(context);
                }
                a9 = f36352k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a9;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            w.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        h3.n nVar;
        q d2 = d();
        if (!h(d2)) {
            return d2.f37768a;
        }
        String c4 = C2561Fo.c(this.f36355a);
        h hVar = this.f36358d;
        synchronized (hVar) {
            nVar = (h3.n) ((s.b) hVar.f37747b).getOrDefault(c4, null);
            if (nVar == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c4);
                }
                C4903n c4903n = this.f36357c;
                nVar = c4903n.f(c4903n.n(C2561Fo.c((g) c4903n.f40101u), new Bundle(), "*")).j(this.f36361g, new C4468a(this, c4, d2, 1)).e((ExecutorService) hVar.f37746a, new C0471d(4, hVar, c4));
                ((s.b) hVar.f37747b).put(c4, nVar);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c4);
            }
        }
        try {
            return (String) AbstractC0415a.e(nVar);
        } catch (InterruptedException | ExecutionException e6) {
            throw new IOException(e6);
        }
    }

    public final q d() {
        q b9;
        A c4 = c(this.f36356b);
        g gVar = this.f36355a;
        gVar.a();
        String d2 = "[DEFAULT]".equals(gVar.f1624b) ? "" : gVar.d();
        String c9 = C2561Fo.c(this.f36355a);
        synchronized (c4) {
            b9 = q.b(c4.f36499a.getString(d2 + "|T|" + c9 + "|*", null));
        }
        return b9;
    }

    public final void e() {
        h3.n q6;
        int i;
        K2.b bVar = (K2.b) this.f36357c.f40103w;
        if (bVar.f1570c.a() >= 241100000) {
            K2.n c4 = K2.n.c(bVar.f1569b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c4) {
                i = c4.f1604a;
                c4.f1604a = i + 1;
            }
            q6 = c4.d(new l(i, 5, bundle, 1)).d(K2.h.f1583v, K2.d.f1577v);
        } else {
            q6 = AbstractC0415a.q(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        q6.c(this.f36360f, new j(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f36356b;
        com.bumptech.glide.h.p(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if ("com.google.android.gms".equals(notificationDelegate)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f36355a.b(L3.a.class) != null || (com.bumptech.glide.g.K() && f36353l != null)) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public final synchronized void g(long j9) {
        b(new RunnableC2757Rg(this, Math.min(Math.max(30L, 2 * j9), f36351j)), j9);
        this.i = true;
    }

    public final boolean h(q qVar) {
        if (qVar != null) {
            return System.currentTimeMillis() > qVar.f37770c + q.f37767d || !this.f36362h.b().equals(qVar.f37769b);
        }
        return true;
    }
}
