package com.mopub.mobileads;

import android.app.Activity;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MoPubLifecycleManager;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class CustomEventRewardedAd {
    protected abstract boolean checkAndInitializeSdk(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception;

    protected abstract String getAdNetworkId();

    @VisibleForTesting
    protected abstract LifecycleListener getLifecycleListener();

    protected abstract boolean isReady();

    protected abstract void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception;

    protected abstract void onInvalidate();

    protected abstract void show();

    final void loadCustomEvent(Activity activity, Map<String, Object> map, Map<String, String> map2) {
        try {
            if (checkAndInitializeSdk(activity, map, map2)) {
                MoPubLifecycleManager.getInstance(activity).addLifecycleListener(getLifecycleListener());
            }
            loadWithSdkInitialized(activity, map, map2);
        } catch (Exception e) {
            MoPubLog.e(e.getMessage());
        }
    }
}
