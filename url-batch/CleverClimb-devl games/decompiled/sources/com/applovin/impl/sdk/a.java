package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final j f2896a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.applovin.impl.sdk.e.a> f2897b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f2898c;

    public a(j jVar, Context context) {
        this.f2898c = new WeakReference<>(null);
        this.f2896a = jVar;
        if (context instanceof Activity) {
            this.f2898c = new WeakReference<>((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return this.f2898c.get();
    }

    public void a(com.applovin.impl.sdk.e.a aVar) {
        this.f2897b.add(aVar);
    }

    public void b(com.applovin.impl.sdk.e.a aVar) {
        this.f2897b.remove(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f2897b).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.e.a) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f2897b).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.e.a) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Iterator it = new ArrayList(this.f2897b).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.e.a) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f2898c = new WeakReference<>(activity);
        Iterator it = new ArrayList(this.f2897b).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.e.a) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f2897b).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.e.a) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f2897b).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.e.a) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f2897b).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.e.a) it.next()).onActivityStopped(activity);
        }
    }
}
