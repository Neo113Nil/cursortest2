package com.moat.analytics.mobile.cha;

import android.app.Activity;

/* loaded from: classes2.dex */
public interface WebAdTracker {
    void removeListener();

    @Deprecated
    void setActivity(Activity activity);

    void setListener(TrackerListener trackerListener);

    void startTracking();

    void stopTracking();
}
