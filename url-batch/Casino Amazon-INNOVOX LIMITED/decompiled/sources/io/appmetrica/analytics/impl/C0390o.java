package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0390o extends A7 implements ActivityLifecycleRegistry {

    /* renamed from: a, reason: collision with root package name */
    public Application f1404a;
    public volatile EnumC0365n b = EnumC0365n.d;
    public final C0451qa c = new C0451qa(true);

    public final synchronized void a(Context context) {
        if (this.f1404a == null) {
            try {
                this.f1404a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC0365n enumC0365n = this.b;
        EnumC0365n enumC0365n2 = EnumC0365n.b;
        if (enumC0365n != enumC0365n2 && !this.c.f1451a.isEmpty()) {
            if (this.f1404a == null) {
                this.b = EnumC0365n.c;
            } else {
                this.b = enumC0365n2;
                this.f1404a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.b == EnumC0365n.b && this.c.f1451a.isEmpty()) {
            this.b = EnumC0365n.d;
            Application application = this.f1404a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, ActivityEvent.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(activity, ActivityEvent.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, ActivityEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, ActivityEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, ActivityEvent.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, ActivityEvent.STOPPED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0004, code lost:
    
        if (r6.length == 0) goto L6;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void registerListener(ActivityLifecycleListener activityLifecycleListener, ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
        }
        activityEventArr = ActivityEvent.values();
        for (ActivityEvent activityEvent : activityEventArr) {
            this.c.a(activityEvent, activityLifecycleListener);
        }
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0004, code lost:
    
        if (r8.length == 0) goto L6;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void unregisterListener(ActivityLifecycleListener activityLifecycleListener, ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
        }
        activityEventArr = ActivityEvent.values();
        for (ActivityEvent activityEvent : activityEventArr) {
            C0451qa c0451qa = this.c;
            Collection collection = (Collection) c0451qa.f1451a.get(activityEvent);
            if (collection != null && collection.remove(activityLifecycleListener)) {
                if (collection.isEmpty() && c0451qa.b) {
                    c0451qa.f1451a.remove(activityEvent);
                }
                new ArrayList(collection);
            }
        }
        c();
    }

    public final synchronized void a(Application application) {
        if (this.f1404a == null) {
            this.f1404a = application;
        }
        b();
    }

    public final EnumC0365n a() {
        return this.b;
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.c.f1451a.get(activityEvent);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }
}
