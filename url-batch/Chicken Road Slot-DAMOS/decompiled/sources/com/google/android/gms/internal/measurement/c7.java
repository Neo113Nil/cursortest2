package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d7 f2191d;

    public c7(d7 d7Var) {
        this.f2191d = d7Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2191d.a(new t6(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2191d.a(new b7(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f2191d.a(new b7(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f2191d.a(new b7(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a6 a6Var = new a6();
        this.f2191d.a(new t6(this, activity, a6Var));
        Bundle D = a6Var.D(50L);
        if (D != null) {
            bundle.putAll(D);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2191d.a(new b7(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f2191d.a(new b7(this, activity, 3));
    }
}
