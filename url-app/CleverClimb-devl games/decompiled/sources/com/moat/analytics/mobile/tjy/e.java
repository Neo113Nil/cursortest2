package com.moat.analytics.mobile.tjy;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f7279a;

    private e(c cVar) {
        this.f7279a = cVar;
    }

    private boolean a(Activity activity) {
        WeakReference weakReference;
        weakReference = this.f7279a.f7276b;
        Activity activity2 = (Activity) weakReference.get();
        return activity2 != null && activity2.equals(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ap apVar;
        WeakReference weakReference;
        try {
            apVar = this.f7279a.f7278d;
            if (apVar.b()) {
                Log.d("MoatActivityState", "Activity destroyed: " + activity.getClass() + "@" + activity.hashCode());
            }
            if (a(activity)) {
                this.f7279a.e = false;
                weakReference = this.f7279a.f7275a;
                ((Application) weakReference.get()).unregisterActivityLifecycleCallbacks(this);
            }
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ap apVar;
        apVar = this.f7279a.f7278d;
        if (apVar.b()) {
            Log.d("MoatActivityState", "Activity paused: " + activity.getClass() + "@" + activity.hashCode());
        }
        if (a(activity)) {
            this.f7279a.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ap apVar;
        apVar = this.f7279a.f7278d;
        if (apVar.b()) {
            Log.d("MoatActivityState", "Activity resumed: " + activity.getClass() + "@" + activity.hashCode());
        }
        if (a(activity)) {
            this.f7279a.e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ap apVar;
        apVar = this.f7279a.f7278d;
        if (apVar.b()) {
            Log.d("MoatActivityState", "Activity started: " + activity.getClass() + "@" + activity.hashCode());
        }
        if (a(activity)) {
            this.f7279a.e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ap apVar;
        apVar = this.f7279a.f7278d;
        if (apVar.b()) {
            Log.d("MoatActivityState", "Activity stopped: " + activity.getClass() + "@" + activity.hashCode());
        }
        if (a(activity)) {
            this.f7279a.e = true;
        }
    }
}
