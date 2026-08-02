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
/* loaded from: classes.dex */
public final class C0832o extends AbstractC1125z7 implements ActivityLifecycleRegistry {

    /* renamed from: a, reason: collision with root package name */
    public Application f12477a;

    /* renamed from: b, reason: collision with root package name */
    public volatile EnumC0806n f12478b = EnumC0806n.f12384d;

    /* renamed from: c, reason: collision with root package name */
    public final C0869pa f12479c = new C0869pa(true);

    public final synchronized void a(Context context) {
        if (this.f12477a == null) {
            try {
                this.f12477a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC0806n enumC0806n = this.f12478b;
        EnumC0806n enumC0806n2 = EnumC0806n.f12382b;
        if (enumC0806n != enumC0806n2 && !this.f12479c.f12571a.isEmpty()) {
            if (this.f12477a == null) {
                this.f12478b = EnumC0806n.f12383c;
            } else {
                this.f12478b = enumC0806n2;
                this.f12477a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.f12478b == EnumC0806n.f12382b && this.f12479c.f12571a.isEmpty()) {
            this.f12478b = EnumC0806n.f12384d;
            Application application = this.f12477a;
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, LOOP:0: B:5:0x000f->B:6:0x0011, LOOP_END, TryCatch #0 {all -> 0x0007, blocks: (B:18:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001b, B:3:0x0009), top: B:17:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void registerListener(ActivityLifecycleListener activityLifecycleListener, ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                }
                for (ActivityEvent activityEvent : activityEventArr) {
                    this.f12479c.a(activityEvent, activityLifecycleListener);
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
        activityEventArr = ActivityEvent.values();
        while (r1 < r0) {
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:31:0x0003, B:4:0x000d, B:6:0x0011, B:8:0x001f, B:10:0x0025, B:12:0x002b, B:14:0x002f, B:15:0x0034, B:17:0x0039, B:21:0x003c, B:3:0x0009), top: B:30:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void unregisterListener(ActivityLifecycleListener activityLifecycleListener, ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                }
                for (ActivityEvent activityEvent : activityEventArr) {
                    C0869pa c0869pa = this.f12479c;
                    Collection collection = (Collection) c0869pa.f12571a.get(activityEvent);
                    if (collection != null && collection.remove(activityLifecycleListener)) {
                        if (collection.isEmpty() && c0869pa.f12572b) {
                            c0869pa.f12571a.remove(activityEvent);
                        }
                        new ArrayList(collection);
                    }
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
        activityEventArr = ActivityEvent.values();
        while (r1 < r0) {
        }
        c();
    }

    public final synchronized void a(Application application) {
        try {
            if (this.f12477a == null) {
                this.f12477a = application;
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final EnumC0806n a() {
        return this.f12478b;
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f12479c.f12571a.get(activityEvent);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }
}
