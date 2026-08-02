package com.buildbox;

import android.app.Activity;

/* loaded from: classes.dex */
public interface Integrator {
    void onActivityCreated(Activity activity);

    void onActivityDestroyed(Activity activity);

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);

    void setUserConsent(boolean z);
}
