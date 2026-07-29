package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.b.k;

/* loaded from: classes.dex */
class IronSourceBaseAdapter {
    static final String ADAPTER_VERSION = "6.7.9.0";
    static final String KEY_APP_KEY = "appKey";
    static final String KEY_INSTANCE_ID = "instanceId";
    static final String MEDIATION_NAME = "AdMob";
    static final String TAG = "IronSource";
    public String mInstanceID;
    public boolean mIsLogEnabled;
    private Handler mUIHandler;

    IronSourceBaseAdapter() {
    }

    void initIronSourceSDK(Context context, String str, k.a aVar) {
        k.a(MEDIATION_NAME);
        k.b((Activity) context, str, aVar);
    }

    synchronized void sendEventOnUIThread(Runnable runnable) {
        if (this.mUIHandler == null) {
            this.mUIHandler = new Handler(Looper.getMainLooper());
        }
        this.mUIHandler.post(runnable);
    }

    void onLog(String str) {
        if (this.mIsLogEnabled) {
            Log.d(TAG, str);
        }
    }
}
