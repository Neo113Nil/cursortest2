package com.google.firebase.messaging;

import A1.a;
import A3.c;
import B1.e;
import D0.h;
import D3.M;
import H1.B;
import H1.C0133g;
import H1.C0138l;
import H1.C0140n;
import H1.D;
import H1.H;
import H1.o;
import H1.q;
import H1.r;
import H1.s;
import H1.v;
import Q0.b;
import Q0.d;
import U0.t;
import a.AbstractC0219a;
import a1.AbstractC0223a;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
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
import k1.n;
import m1.g;
import n1.InterfaceC0541a;
import q.C0582b;
import x1.InterfaceC0727b;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static M f3898k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f3900m;

    /* renamed from: a, reason: collision with root package name */
    public final g f3901a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3902b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3903c;

    /* renamed from: d, reason: collision with root package name */
    public final C0138l f3904d;

    /* renamed from: e, reason: collision with root package name */
    public final s f3905e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3906f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f3907g;

    /* renamed from: h, reason: collision with root package name */
    public final v f3908h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3909i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3897j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static a f3899l = new o(0);

    public FirebaseMessaging(g gVar, a aVar, a aVar2, e eVar, a aVar3, InterfaceC0727b interfaceC0727b) {
        gVar.a();
        Context context = gVar.f5425a;
        final v vVar = new v(context);
        final h hVar = new h(gVar, vVar, aVar, aVar2, eVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new Z0.a("Firebase-Messaging-Task"));
        final int i7 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new Z0.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z0.a("Firebase-Messaging-File-Io"));
        final int i8 = 0;
        this.f3909i = false;
        f3899l = aVar3;
        this.f3901a = gVar;
        this.f3905e = new s(this, interfaceC0727b);
        gVar.a();
        final Context context2 = gVar.f5425a;
        this.f3902b = context2;
        C0140n c0140n = new C0140n();
        this.f3908h = vVar;
        this.f3903c = hVar;
        this.f3904d = new C0138l(newSingleThreadExecutor);
        this.f3906f = scheduledThreadPoolExecutor;
        this.f3907g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c0140n);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: H1.p

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f981g;

            {
                this.f981g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k1.n nVar;
                int i9;
                switch (i8) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f981g;
                        if (firebaseMessaging.f3905e.c() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f3909i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f981g;
                        final Context context3 = firebaseMessaging2.f3902b;
                        AbstractC0219a.t(context3);
                        D0.h hVar2 = firebaseMessaging2.f3903c;
                        final boolean f7 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences w5 = AbstractC0223a.w(context3);
                            if (!w5.contains("proxy_retention") || w5.getBoolean("proxy_retention", false) != f7) {
                                Q0.b bVar = (Q0.b) hVar2.f332d;
                                if (bVar.f1968c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f7);
                                    Q0.o b7 = Q0.o.b(bVar.f1967b);
                                    synchronized (b7) {
                                        i9 = b7.f2004a;
                                        b7.f2004a = i9 + 1;
                                    }
                                    nVar = b7.c(new Q0.n(i9, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    k1.n nVar2 = new k1.n();
                                    nVar2.j(iOException);
                                    nVar = nVar2;
                                }
                                nVar.b(new P.c(0), new k1.e() { // from class: H1.y
                                    @Override // k1.e
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor edit = AbstractC0223a.w(context3).edit();
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
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new Z0.a("Firebase-Messaging-Topics-Io"));
        int i9 = H.f901j;
        AbstractC0219a.f(scheduledThreadPoolExecutor2, new Callable() { // from class: H1.G
            @Override // java.util.concurrent.Callable
            public final Object call() {
                F f7;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                v vVar2 = vVar;
                D0.h hVar2 = hVar;
                synchronized (F.class) {
                    try {
                        WeakReference weakReference = F.f893b;
                        f7 = weakReference != null ? (F) weakReference.get() : null;
                        if (f7 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            F f8 = new F();
                            synchronized (f8) {
                                f8.f894a = A.e.g(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            F.f893b = new WeakReference(f8);
                            f7 = f8;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new H(firebaseMessaging, vVar2, f7, hVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).b(scheduledThreadPoolExecutor, new q(this, i8));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: H1.p

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f981g;

            {
                this.f981g = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k1.n nVar;
                int i92;
                switch (i7) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f981g;
                        if (firebaseMessaging.f3905e.c() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f3909i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f981g;
                        final Context context3 = firebaseMessaging2.f3902b;
                        AbstractC0219a.t(context3);
                        D0.h hVar2 = firebaseMessaging2.f3903c;
                        final boolean f7 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences w5 = AbstractC0223a.w(context3);
                            if (!w5.contains("proxy_retention") || w5.getBoolean("proxy_retention", false) != f7) {
                                Q0.b bVar = (Q0.b) hVar2.f332d;
                                if (bVar.f1968c.b() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f7);
                                    Q0.o b7 = Q0.o.b(bVar.f1967b);
                                    synchronized (b7) {
                                        i92 = b7.f2004a;
                                        b7.f2004a = i92 + 1;
                                    }
                                    nVar = b7.c(new Q0.n(i92, 4, bundle, 0));
                                } else {
                                    IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                    k1.n nVar2 = new k1.n();
                                    nVar2.j(iOException);
                                    nVar = nVar2;
                                }
                                nVar.b(new P.c(0), new k1.e() { // from class: H1.y
                                    @Override // k1.e
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor edit = AbstractC0223a.w(context3).edit();
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

    public static void b(Runnable runnable, long j4) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f3900m == null) {
                    f3900m = new ScheduledThreadPoolExecutor(1, new Z0.a("TAG"));
                }
                f3900m.schedule(runnable, j4, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized M c(Context context) {
        M m4;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f3898k == null) {
                    f3898k = new M(context);
                }
                m4 = f3898k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m4;
    }

    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            t.g(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        n nVar;
        B d7 = d();
        if (!h(d7)) {
            return d7.f881a;
        }
        String b7 = v.b(this.f3901a);
        C0138l c0138l = this.f3904d;
        synchronized (c0138l) {
            nVar = (n) ((C0582b) c0138l.f975b).getOrDefault(b7, null);
            if (nVar == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b7);
                }
                h hVar = this.f3903c;
                nVar = hVar.e(hVar.n(v.b((g) hVar.f330b), "*", new Bundle())).i(this.f3907g, new r(this, b7, d7, 0)).d((Executor) c0138l.f974a, new C0133g(c0138l, 1, b7));
                ((C0582b) c0138l.f975b).put(b7, nVar);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b7);
            }
        }
        try {
            return (String) AbstractC0219a.c(nVar);
        } catch (InterruptedException | ExecutionException e4) {
            throw new IOException(e4);
        }
    }

    public final B d() {
        B b7;
        M c7 = c(this.f3902b);
        g gVar = this.f3901a;
        gVar.a();
        String d7 = "[DEFAULT]".equals(gVar.f5426b) ? "" : gVar.d();
        String b8 = v.b(this.f3901a);
        synchronized (c7) {
            b7 = B.b(((SharedPreferences) c7.f401g).getString(d7 + "|T|" + b8 + "|*", null));
        }
        return b7;
    }

    public final void e() {
        n nVar;
        int i7;
        b bVar = (b) this.f3903c.f332d;
        if (bVar.f1968c.b() >= 241100000) {
            Q0.o b7 = Q0.o.b(bVar.f1967b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (b7) {
                i7 = b7.f2004a;
                b7.f2004a = i7 + 1;
            }
            nVar = b7.c(new Q0.n(i7, 5, bundle, 1)).c(Q0.h.f1981h, d.f1975h);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            n nVar2 = new n();
            nVar2.j(iOException);
            nVar = nVar2;
        }
        nVar.b(this.f3906f, new q(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f3902b;
        AbstractC0219a.t(context);
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
                if (this.f3901a.b(InterfaceC0541a.class) != null) {
                    return true;
                }
                if (c.L() && f3899l != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void g(long j4) {
        b(new D(this, Math.min(Math.max(30L, 2 * j4), f3897j)), j4);
        this.f3909i = true;
    }

    public final boolean h(B b7) {
        if (b7 != null) {
            return System.currentTimeMillis() > b7.f883c + B.f880d || !this.f3908h.a().equals(b7.f882b);
        }
        return true;
    }
}
