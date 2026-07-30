package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.w8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4102w8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A, reason: collision with root package name */
    public RunnableC3068d f34943A;

    /* renamed from: C, reason: collision with root package name */
    public long f34945C;

    /* renamed from: n, reason: collision with root package name */
    public Activity f34946n;

    /* renamed from: u, reason: collision with root package name */
    public Application f34947u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34948v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f34949w = new AtomicBoolean(true);

    /* renamed from: x, reason: collision with root package name */
    public boolean f34950x = false;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f34951y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f34952z = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public boolean f34944B = false;

    public final void a(Activity activity) {
        synchronized (this.f34948v) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f34946n = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f34948v) {
            try {
                Activity activity2 = this.f34946n;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f34946n = null;
                }
                Iterator it = this.f34952z.iterator();
                while (it.hasNext()) {
                    try {
                        ((C2713On) it.next()).d();
                    } catch (Exception e6) {
                        p2.j.f39798C.f39808h.d("AppActivityTracker.ActivityListener.onActivityDestroyed", e6);
                        int i = t2.C.f40822b;
                        u2.i.d("", e6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f34948v) {
            Iterator it = this.f34952z.iterator();
            while (it.hasNext()) {
                try {
                    ((C2713On) it.next()).c();
                } catch (Exception e6) {
                    p2.j.f39798C.f39808h.d("AppActivityTracker.ActivityListener.onActivityPaused", e6);
                    int i = t2.C.f40822b;
                    u2.i.d("", e6);
                }
            }
        }
        this.f34950x = true;
        RunnableC3068d runnableC3068d = this.f34943A;
        if (runnableC3068d != null) {
            t2.G.f40858l.removeCallbacks(runnableC3068d);
        }
        t2.D d2 = t2.G.f40858l;
        RunnableC3068d runnableC3068d2 = new RunnableC3068d(9, this);
        this.f34943A = runnableC3068d2;
        d2.postDelayed(runnableC3068d2, this.f34945C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f34950x = false;
        boolean andSet = this.f34949w.getAndSet(true);
        RunnableC3068d runnableC3068d = this.f34943A;
        if (runnableC3068d != null) {
            t2.G.f40858l.removeCallbacks(runnableC3068d);
        }
        synchronized (this.f34948v) {
            Iterator it = this.f34952z.iterator();
            while (it.hasNext()) {
                try {
                    ((C2713On) it.next()).b();
                } catch (Exception e6) {
                    p2.j.f39798C.f39808h.d("AppActivityTracker.ActivityListener.onActivityResumed", e6);
                    int i = t2.C.f40822b;
                    u2.i.d("", e6);
                }
            }
            if (andSet) {
                int i4 = t2.C.f40822b;
                u2.i.a("App is still foreground.");
            } else {
                Iterator it2 = this.f34951y.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC4156x8) it2.next()).i0(true);
                    } catch (Exception e9) {
                        int i9 = t2.C.f40822b;
                        u2.i.d("", e9);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
