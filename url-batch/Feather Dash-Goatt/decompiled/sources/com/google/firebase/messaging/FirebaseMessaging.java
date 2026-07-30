package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.bk;
import defpackage.c3;
import defpackage.ca0;
import defpackage.ck;
import defpackage.du1;
import defpackage.ez;
import defpackage.gf1;
import defpackage.iz;
import defpackage.j41;
import defpackage.jb;
import defpackage.ka0;
import defpackage.mq;
import defpackage.mz;
import defpackage.nq0;
import defpackage.nz;
import defpackage.p01;
import defpackage.pl0;
import defpackage.po0;
import defpackage.s9;
import defpackage.t41;
import defpackage.t80;
import defpackage.tq;
import defpackage.vu1;
import defpackage.xu1;
import defpackage.y90;
import defpackage.yw;
import defpackage.zf1;
import defpackage.zw;
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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static nq0 j;
    public static p01 k = new ck(5);
    public static ScheduledThreadPoolExecutor l;
    public final ez a;
    public final Context b;
    public final jb c;
    public final yw d;
    public final nz e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final pl0 h;
    public boolean i;

    public FirebaseMessaging(ez ezVar, p01 p01Var, p01 p01Var2, iz izVar, p01 p01Var3, gf1 gf1Var) {
        ezVar.a();
        Context context = ezVar.a;
        final pl0 pl0Var = new pl0();
        final int i = 0;
        pl0Var.b = 0;
        pl0Var.c = context;
        ezVar.a();
        t41 t41Var = new t41(ezVar.a);
        final jb jbVar = new jb();
        jbVar.a = ezVar;
        jbVar.b = pl0Var;
        jbVar.c = t41Var;
        jbVar.d = p01Var;
        jbVar.e = p01Var2;
        jbVar.f = izVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new po0("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new po0("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new po0("Firebase-Messaging-File-Io"));
        this.i = false;
        k = p01Var3;
        this.a = ezVar;
        this.e = new nz(this, gf1Var);
        ezVar.a();
        final Context context2 = ezVar.a;
        this.b = context2;
        zw zwVar = new zw();
        this.h = pl0Var;
        this.c = jbVar;
        this.d = new yw(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        ezVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(zwVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: lz
            public final /* synthetic */ FirebaseMessaging e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zu1 o;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.e;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.e.a() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        ca0.p(context3);
                        jb jbVar2 = firebaseMessaging.c;
                        final boolean f = firebaseMessaging.f();
                        SharedPreferences r = ka0.r(context3);
                        if (!r.contains("proxy_retention") || r.getBoolean("proxy_retention", false) != f) {
                            t41 t41Var2 = (t41) jbVar2.c;
                            if (t41Var2.c.k() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", f);
                                xu1 k2 = xu1.k(t41Var2.b);
                                synchronized (k2) {
                                    i3 = k2.a;
                                    k2.a = i3 + 1;
                                }
                                o = k2.l(new vu1(i3, 4, bundle, 0));
                            } else {
                                o = t80.o(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            o.e(new kz0(), new qr0() { // from class: r01
                                @Override // defpackage.qr0
                                public final void h(Object obj) {
                                    SharedPreferences.Editor edit = ka0.r(context3).edit();
                                    edit.putBoolean("proxy_retention", f);
                                    edit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new po0("Firebase-Messaging-Topics-Io"));
        t80.i(scheduledThreadPoolExecutor2, new Callable() { // from class: ti1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                si1 si1Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                pl0 pl0Var2 = pl0Var;
                jb jbVar2 = jbVar;
                synchronized (si1.class) {
                    try {
                        WeakReference weakReference = si1.b;
                        si1 si1Var2 = weakReference != null ? (si1) weakReference.get() : null;
                        if (si1Var2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            si1Var = new si1();
                            synchronized (si1Var) {
                                si1Var.a = mc.h(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            si1.b = new WeakReference(si1Var);
                        } else {
                            si1Var = si1Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new ui1(firebaseMessaging, pl0Var2, si1Var, jbVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).e(scheduledThreadPoolExecutor, new mz(this, i));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: lz
            public final /* synthetic */ FirebaseMessaging e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zu1 o;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.e;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (firebaseMessaging.e.a() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        ca0.p(context3);
                        jb jbVar2 = firebaseMessaging.c;
                        final boolean f = firebaseMessaging.f();
                        SharedPreferences r = ka0.r(context3);
                        if (!r.contains("proxy_retention") || r.getBoolean("proxy_retention", false) != f) {
                            t41 t41Var2 = (t41) jbVar2.c;
                            if (t41Var2.c.k() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", f);
                                xu1 k2 = xu1.k(t41Var2.b);
                                synchronized (k2) {
                                    i3 = k2.a;
                                    k2.a = i3 + 1;
                                }
                                o = k2.l(new vu1(i3, 4, bundle, 0));
                            } else {
                                o = t80.o(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            o.e(new kz0(), new qr0() { // from class: r01
                                @Override // defpackage.qr0
                                public final void h(Object obj) {
                                    SharedPreferences.Editor edit = ka0.r(context3).edit();
                                    edit.putBoolean("proxy_retention", f);
                                    edit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.f()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ScheduledThreadPoolExecutor(1, new po0("TAG"));
                }
                l.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized nq0 c(Context context) {
        nq0 nq0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (j == null) {
                    j = new nq0(context);
                }
                nq0Var = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nq0Var;
    }

    public static synchronized FirebaseMessaging getInstance(ez ezVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            ezVar.a();
            firebaseMessaging = (FirebaseMessaging) ezVar.d.a(FirebaseMessaging.class);
            y90.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        tq d = d();
        if (!h(d)) {
            return (String) d.b;
        }
        String c = pl0.c(this.a);
        yw ywVar = this.d;
        synchronized (ywVar) {
            task = (Task) ((s9) ywVar.g).get(c);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c);
                }
                jb jbVar = this.c;
                task = jbVar.h(jbVar.j(pl0.c((ez) jbVar.a), "*", new Bundle())).k(this.g, new mq(this, c, d, 1)).g((Executor) ywVar.e, new bk(ywVar, c));
                ((s9) ywVar.g).put(c, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c);
            }
        }
        try {
            return (String) t80.c(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final tq d() {
        tq c;
        nq0 c2 = c(this.b);
        ez ezVar = this.a;
        ezVar.a();
        String c3 = "[DEFAULT]".equals(ezVar.b) ? "" : ezVar.c();
        String c4 = pl0.c(this.a);
        synchronized (c2) {
            c = tq.c(((SharedPreferences) c2.e).getString(c3 + "|T|" + c4 + "|*", null));
        }
        return c;
    }

    public final void e() {
        Task o;
        int i;
        t41 t41Var = (t41) this.c.c;
        int i2 = 1;
        if (t41Var.c.k() >= 241100000) {
            xu1 k2 = xu1.k(t41Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (k2) {
                i = k2.a;
                k2.a = i + 1;
            }
            o = k2.l(new vu1(i, 5, bundle, 1)).f(du1.g, j41.q);
        } else {
            o = t80.o(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        o.e(this.f, new mz(this, i2));
    }

    public final boolean f() {
        Context context = this.b;
        ca0.p(context);
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
            }
            ez ezVar = this.a;
            ezVar.a();
            if (ezVar.d.a(c3.class) != null) {
                return true;
            }
            if (ka0.m() && k != null) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void g(long j2) {
        b(new zf1(this, Math.min(Math.max(30L, 2 * j2), 28800L)), j2);
        this.i = true;
    }

    public final boolean h(tq tqVar) {
        if (tqVar != null) {
            return System.currentTimeMillis() > tqVar.a + 604800000 || !this.h.b().equals((String) tqVar.c);
        }
        return true;
    }
}
