package com.aiming.mdt.mediation;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class CallbackManager {
    private Map<String, Callback> mCallbacks;

    private static final class CallbackManagerHolder {
        private static final CallbackManager INSTANCE = new CallbackManager();

        private CallbackManagerHolder() {
        }
    }

    private CallbackManager() {
        this.mCallbacks = new HashMap();
    }

    private Callback getCallback(String str) {
        return this.mCallbacks.get(str);
    }

    public static CallbackManager getInstance() {
        return CallbackManagerHolder.INSTANCE;
    }

    public final void addCallback(String str, Callback callback) {
        if (callback == null) {
            return;
        }
        this.mCallbacks.put(str, callback);
    }

    final void onInsClick(String str, String str2, String str3) {
        Callback callback = getCallback(str);
        if (callback != null) {
            callback.onInstanceClick(str2, str3);
        }
    }

    public final void onInsClose(String str, String str2, String str3, boolean z) {
        Callback callback = getCallback(str);
        if (callback != null) {
            callback.onInsClose(str2, str3, z);
        }
    }

    public final synchronized void onInsError(String str, String str2, String str3, String str4) {
        Callback callback = getCallback(str);
        if (callback != null) {
            callback.onInsError(str2, str3, str4);
        }
    }

    public final synchronized void onInsReady(String str, String str2, String str3, Object obj) {
        Callback callback = getCallback(str);
        if (callback != null) {
            callback.onInsReady(str2, str3, obj);
        }
    }

    final void onInsRewarded(String str, int i, String str2, String str3) {
        Callback callback = getCallback(str);
        if (callback != null) {
            callback.onInsRewarded(i, str, str2, str3);
        }
    }

    public final void onInsShow(String str, String str2, String str3, Object obj) {
        Callback callback = getCallback(str);
        if (callback != null) {
            callback.onInsShow(str2, str3, obj);
        }
    }

    public final void removeCallback(String str) {
        this.mCallbacks.remove(str);
    }
}
