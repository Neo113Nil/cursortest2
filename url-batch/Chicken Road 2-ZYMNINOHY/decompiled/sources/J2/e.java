package J2;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1176a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1177b;

    /* renamed from: c, reason: collision with root package name */
    public d f1178c;

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f1177b) {
            this.f1177b = true;
            if (this.f1176a) {
                a(true);
                d dVar = this.f1178c;
                if (dVar != null) {
                    dVar.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = runningAppProcessInfo.importance == 100 || b();
        if (this.f1177b != z) {
            this.f1177b = z;
            if (this.f1176a) {
                a(z);
                d dVar = this.f1178c;
                if (dVar != null) {
                    dVar.a(z);
                }
            }
        }
    }

    public void a(boolean z) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
