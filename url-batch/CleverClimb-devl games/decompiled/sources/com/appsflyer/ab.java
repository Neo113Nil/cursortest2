package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
final class ab implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static ab f3417a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3418b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3419c = true;

    /* renamed from: d, reason: collision with root package name */
    private a f3420d = null;

    interface a {
        void a(Activity activity);

        void a(WeakReference<Context> weakReference);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    ab() {
    }

    static /* synthetic */ boolean c(ab abVar) {
        abVar.f3418b = false;
        return false;
    }

    static ab a() {
        if (f3417a == null) {
            f3417a = new ab();
        }
        return f3417a;
    }

    public static ab b() {
        if (f3417a == null) {
            throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
        }
        return f3417a;
    }

    public final void a(Application application, a aVar) {
        this.f3420d = aVar;
        if (Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(f3417a);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f3419c = false;
        boolean z = !this.f3418b;
        this.f3418b = true;
        if (z) {
            try {
                this.f3420d.a(activity);
            } catch (Exception e) {
                d.a("Listener threw exception! ", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f3419c = true;
        try {
            new b(new WeakReference(activity.getApplicationContext())).executeOnExecutor(com.appsflyer.a.a().b(), new Void[0]);
        } catch (RejectedExecutionException e) {
            d.a("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            d.a("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    class b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<Context> f3421a;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
            return a();
        }

        public b(WeakReference<Context> weakReference) {
            this.f3421a = weakReference;
        }

        private Void a() {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                d.a("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            if (ab.this.f3418b && ab.this.f3419c) {
                ab.c(ab.this);
                try {
                    ab.this.f3420d.a(this.f3421a);
                } catch (Exception e2) {
                    d.a("Listener threw exception! ", e2);
                    cancel(true);
                }
            }
            this.f3421a.clear();
            return null;
        }
    }
}
