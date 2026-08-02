package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class guw implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ gva a;
    final /* synthetic */ Application.ActivityLifecycleCallbacks b;

    public guw(gva gvaVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = gvaVar;
        this.b = activityLifecycleCallbacks;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"), 236);
        try {
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityDestroyed(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"), 237);
        try {
            activityLifecycleCallbacks.onActivityDestroyed(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPaused(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"), 238);
        try {
            activityLifecycleCallbacks.onActivityPaused(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"), 239);
        try {
            activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPostDestroyed(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"), 240);
        try {
            activityLifecycleCallbacks.onActivityPostDestroyed(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPostPaused(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"), 241);
        try {
            activityLifecycleCallbacks.onActivityPostPaused(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPostResumed(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"), 242);
        try {
            activityLifecycleCallbacks.onActivityPostResumed(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"), 243);
        try {
            activityLifecycleCallbacks.onActivityPostSaveInstanceState(activity, bundle);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPostStarted(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"), 244);
        try {
            activityLifecycleCallbacks.onActivityPostStarted(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPostStopped(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"), 245);
        try {
            activityLifecycleCallbacks.onActivityPostStopped(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"), 246);
        try {
            activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPreDestroyed(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"), 247);
        try {
            activityLifecycleCallbacks.onActivityPreDestroyed(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPrePaused(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"), 248);
        try {
            activityLifecycleCallbacks.onActivityPrePaused(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPreResumed(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"), 249);
        try {
            activityLifecycleCallbacks.onActivityPreResumed(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"), 250);
        try {
            activityLifecycleCallbacks.onActivityPreSaveInstanceState(activity, bundle);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPreStarted(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"), 251);
        try {
            activityLifecycleCallbacks.onActivityPreStarted(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityPreStopped(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"), 252);
        try {
            activityLifecycleCallbacks.onActivityPreStopped(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityResumed(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"), 253);
        try {
            activityLifecycleCallbacks.onActivityResumed(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"), 254);
        try {
            activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityStarted(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"), 255);
        try {
            activityLifecycleCallbacks.onActivityStarted(activity);
            ixf.j(f, null);
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!hoq.aI()) {
            activityLifecycleCallbacks.onActivityStopped(activity);
            return;
        }
        gtt f = this.a.f(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"), 256);
        try {
            activityLifecycleCallbacks.onActivityStopped(activity);
            ixf.j(f, null);
        } finally {
        }
    }
}
