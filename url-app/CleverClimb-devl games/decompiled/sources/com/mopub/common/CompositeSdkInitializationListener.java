package com.mopub.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
class CompositeSdkInitializationListener implements SdkInitializationListener {
    private final SdkInitializationListener mSdkInitializationListener;
    private int mTimes;

    public CompositeSdkInitializationListener(SdkInitializationListener sdkInitializationListener, int i) {
        Preconditions.checkNotNull(sdkInitializationListener);
        this.mSdkInitializationListener = sdkInitializationListener;
        this.mTimes = i;
    }

    @Override // com.mopub.common.SdkInitializationListener
    public void onInitializationFinished() {
        this.mTimes--;
        if (this.mTimes <= 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mopub.common.CompositeSdkInitializationListener.1
                @Override // java.lang.Runnable
                public void run() {
                    CompositeSdkInitializationListener.this.mSdkInitializationListener.onInitializationFinished();
                }
            });
        }
    }
}
