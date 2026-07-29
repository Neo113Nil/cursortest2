package com.youappi.sdk.logic.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.youappi.sdk.logic.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9433a = "b";

    /* renamed from: b, reason: collision with root package name */
    private final Logger f9434b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9435c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f9436d;
    private Runnable f;
    private Object i;
    private final Object g = new Object();
    private int h = -1;
    private Map<String, Integer> e = new HashMap();

    @SuppressLint({"NewApi"})
    public b(Context context, Handler handler, Logger logger) {
        this.f9435c = context;
        this.f9434b = logger;
        this.f9436d = handler;
        Context applicationContext = context.getApplicationContext();
        if (!Application.class.isAssignableFrom(applicationContext.getClass()) || Build.VERSION.SDK_INT < 14) {
            return;
        }
        this.i = new Application.ActivityLifecycleCallbacks() { // from class: com.youappi.sdk.logic.impl.b.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                b.this.f9434b.log(b.f9433a, "onActivityDestroyed " + activity.getClass().getSimpleName());
                b.this.c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                b.this.f9434b.log(b.f9433a, "onActivityPaused");
                b.this.b(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                b.this.f9434b.log(b.f9433a, "onActivityResumed");
                b.this.a(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                b.this.f9434b.log(b.f9433a, "onActivityStopped");
            }
        };
        ((Application) applicationContext).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Log.i(b.class.getSimpleName(), "On state verified " + i);
        if (this.h == i) {
            return;
        }
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        String d2 = d(activity);
        synchronized (this.g) {
            this.e.put(d2, 2);
        }
        if (this.f != null) {
            this.f9436d.removeCallbacks(this.f);
        }
        this.f = new Runnable() { // from class: com.youappi.sdk.logic.impl.b.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.g) {
                    boolean z = true;
                    Iterator it = b.this.e.values().iterator();
                    while (it.hasNext()) {
                        if (((Integer) it.next()).intValue() != 2) {
                            z = false;
                        }
                    }
                    if (z) {
                        b.this.a(2);
                    }
                }
            }
        };
        this.f9436d.postDelayed(this.f, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        String d2 = d(activity);
        synchronized (this.g) {
            this.e.remove(d2);
        }
        if (this.f != null) {
            this.f9436d.removeCallbacks(this.f);
        }
        this.f = new Runnable() { // from class: com.youappi.sdk.logic.impl.b.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.g) {
                    if (b.this.e.isEmpty()) {
                        b.this.a(3);
                    }
                }
            }
        };
        this.f9436d.postDelayed(this.f, 500L);
    }

    private static String d(Activity activity) {
        return activity.getClass().getSimpleName() + activity.hashCode();
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 14) {
            Context applicationContext = this.f9435c.getApplicationContext();
            if (!Application.class.isAssignableFrom(applicationContext.getClass()) || this.i == null) {
                return;
            }
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.i);
        }
    }

    public void a(Activity activity) {
        String d2 = d(activity);
        synchronized (this.g) {
            this.e.put(d2, 1);
        }
        if (this.f != null) {
            this.f9436d.removeCallbacks(this.f);
        }
        this.f = new Runnable() { // from class: com.youappi.sdk.logic.impl.b.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.g) {
                    boolean z = false;
                    Iterator it = b.this.e.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((Integer) it.next()).intValue() == 1) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        b.this.a(1);
                    }
                }
            }
        };
        this.f9436d.postDelayed(this.f, 500L);
    }
}
