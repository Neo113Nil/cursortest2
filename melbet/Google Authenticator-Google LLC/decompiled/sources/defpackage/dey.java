package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import com.google.android.libraries.androidatgoogle.privacy.lock.PrivacyScreenLockActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dey implements Application.ActivityLifecycleCallbacks {
    private final kee a;

    public dey(kee keeVar) {
        this.a = keeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        kee keeVar = this.a;
        if (keeVar.s() == null) {
            keeVar.t(activity);
        }
        if (activity instanceof PrivacyScreenLockActivity) {
            return;
        }
        if (((dev) keeVar.a).e.get()) {
            Window window = activity.getWindow();
            if (window != null) {
                window.addFlags(8192);
                return;
            }
            return;
        }
        Window window2 = activity.getWindow();
        if (window2 != null) {
            window2.clearFlags(8192);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        kee keeVar = this.a;
        if (ksp.b(keeVar.s(), activity)) {
            keeVar.t(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        this.a.t(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
