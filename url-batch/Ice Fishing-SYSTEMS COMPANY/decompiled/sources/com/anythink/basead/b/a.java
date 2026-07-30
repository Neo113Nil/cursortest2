package com.anythink.basead.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    private static final int f5848d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f5849e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f5850f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f5851g = 4;

    /* renamed from: a, reason: collision with root package name */
    int f5852a;

    /* renamed from: h, reason: collision with root package name */
    private int f5855h;

    /* renamed from: c, reason: collision with root package name */
    boolean f5854c = false;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f5853b = new ConcurrentHashMap<>(3);

    private void a(int i, Activity activity) {
        if (i == 2) {
            int i4 = this.f5855h;
            this.f5855h = activity != null ? activity.hashCode() : i4;
            if (i4 == 0) {
                com.anythink.basead.c.a().a(true);
            }
            com.anythink.basead.c.a().a(activity);
            return;
        }
        if (i == 3) {
            if (this.f5855h != 0 || activity == null) {
                return;
            }
            this.f5855h = activity.hashCode();
            return;
        }
        if (i == 4 && activity != null && activity.hashCode() == this.f5855h) {
            this.f5855h = 0;
            com.anythink.basead.c.a().a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        com.anythink.basead.c.a().f6205c = true;
        a(3, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.anythink.basead.c.a().c();
        a(2, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f5852a++;
        this.f5853b.put(activity.toString(), Boolean.TRUE);
        a(1, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        com.anythink.basead.c.a().f6204b = true;
        this.f5852a--;
        boolean containsKey = this.f5853b.containsKey(activity.toString());
        if (!this.f5854c && !containsKey) {
            this.f5854c = true;
            this.f5852a++;
        }
        if (containsKey) {
            try {
                this.f5853b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        a(4, activity);
    }
}
