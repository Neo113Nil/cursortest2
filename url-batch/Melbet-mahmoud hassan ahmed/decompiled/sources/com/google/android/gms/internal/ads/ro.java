package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* loaded from: classes.dex */
final class ro implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private Activity f11284f;

    /* renamed from: g, reason: collision with root package name */
    private Context f11285g;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f11291m;

    /* renamed from: o, reason: collision with root package name */
    private long f11293o;

    /* renamed from: h, reason: collision with root package name */
    private final Object f11286h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private boolean f11287i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11288j = false;

    /* renamed from: k, reason: collision with root package name */
    private final List<so> f11289k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final List<hp> f11290l = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private boolean f11292n = false;

    ro() {
    }

    private final void k(Activity activity) {
        synchronized (this.f11286h) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f11284f = activity;
            }
        }
    }

    public final Activity a() {
        return this.f11284f;
    }

    public final Context b() {
        return this.f11285g;
    }

    public final void f(so soVar) {
        synchronized (this.f11286h) {
            this.f11289k.add(soVar);
        }
    }

    public final void g(Application application, Context context) {
        if (this.f11292n) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f11285g = application;
        this.f11293o = ((Long) sw.c().b(m10.G0)).longValue();
        this.f11292n = true;
    }

    public final void h(so soVar) {
        synchronized (this.f11286h) {
            this.f11289k.remove(soVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f11286h) {
            Activity activity2 = this.f11284f;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f11284f = null;
                }
                Iterator<hp> it = this.f11290l.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza()) {
                            it.remove();
                        }
                    } catch (Exception e7) {
                        y2.t.p().s(e7, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        io0.e("", e7);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f11286h) {
            Iterator<hp> it = this.f11290l.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception e7) {
                    y2.t.p().s(e7, "AppActivityTracker.ActivityListener.onActivityPaused");
                    io0.e("", e7);
                }
            }
        }
        this.f11288j = true;
        Runnable runnable = this.f11291m;
        if (runnable != null) {
            a3.g2.f72i.removeCallbacks(runnable);
        }
        s33 s33Var = a3.g2.f72i;
        qo qoVar = new qo(this);
        this.f11291m = qoVar;
        s33Var.postDelayed(qoVar, this.f11293o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f11288j = false;
        boolean z6 = !this.f11287i;
        this.f11287i = true;
        Runnable runnable = this.f11291m;
        if (runnable != null) {
            a3.g2.f72i.removeCallbacks(runnable);
        }
        synchronized (this.f11286h) {
            Iterator<hp> it = this.f11290l.iterator();
            while (it.hasNext()) {
                try {
                    it.next().c();
                } catch (Exception e7) {
                    y2.t.p().s(e7, "AppActivityTracker.ActivityListener.onActivityResumed");
                    io0.e("", e7);
                }
            }
            if (z6) {
                Iterator<so> it2 = this.f11289k.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().c(true);
                    } catch (Exception e8) {
                        io0.e("", e8);
                    }
                }
            } else {
                io0.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
