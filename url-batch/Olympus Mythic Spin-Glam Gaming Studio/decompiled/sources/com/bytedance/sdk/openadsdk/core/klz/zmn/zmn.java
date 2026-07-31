package com.bytedance.sdk.openadsdk.core.klz.zmn;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes15.dex */
public class zmn implements Application.ActivityLifecycleCallbacks {
    private static volatile zmn zmn;
    private final fs fs;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private zmn(Application application) {
        this.fs = fs.zmn(application);
    }

    public static zmn zmn(Application application) {
        if (zmn == null) {
            synchronized (zmn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zmn(application);
                        application.registerActivityLifecycleCallbacks(zmn);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public String zmn(String str, long j, int i) {
        fs fsVar = this.fs;
        if (fsVar != null) {
            return fsVar.zmn(str, j, i);
        }
        return POBCommonConstants.NULL_VALUE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.zmn(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        fs fsVar = this.fs;
        if (fsVar != null) {
            fsVar.fs(activity);
        }
    }
}
