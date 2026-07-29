package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.AdReport;
import com.mopub.common.DataKeys;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.CustomEventInterstitial;
import com.mopub.mobileads.WebViewCacheService;
import com.mopub.mobileads.factories.CustomEventInterstitialFactory;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class CustomEventInterstitialAdapter implements CustomEventInterstitial.CustomEventInterstitialListener {
    public static final int DEFAULT_INTERSTITIAL_TIMEOUT_DELAY = 30000;
    private long mBroadcastIdentifier;
    private Context mContext;
    private CustomEventInterstitial mCustomEventInterstitial;
    private CustomEventInterstitialAdapterListener mCustomEventInterstitialAdapterListener;
    private final Handler mHandler;
    private boolean mInvalidated;
    private Map<String, Object> mLocalExtras;
    private final MoPubInterstitial mMoPubInterstitial;
    private Map<String, String> mServerExtras;
    private final Runnable mTimeout;

    interface CustomEventInterstitialAdapterListener {
        void onCustomEventInterstitialClicked();

        void onCustomEventInterstitialDismissed();

        void onCustomEventInterstitialFailed(MoPubErrorCode moPubErrorCode);

        void onCustomEventInterstitialLoaded();

        void onCustomEventInterstitialShown();
    }

    public CustomEventInterstitialAdapter(MoPubInterstitial moPubInterstitial, String str, Map<String, String> map, long j, AdReport adReport) {
        Preconditions.checkNotNull(map);
        this.mHandler = new Handler();
        this.mMoPubInterstitial = moPubInterstitial;
        this.mBroadcastIdentifier = j;
        this.mContext = this.mMoPubInterstitial.getActivity();
        this.mTimeout = new Runnable() { // from class: com.mopub.mobileads.CustomEventInterstitialAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                MoPubLog.d("Third-party network timed out.");
                CustomEventInterstitialAdapter.this.onInterstitialFailed(MoPubErrorCode.NETWORK_TIMEOUT);
                CustomEventInterstitialAdapter.this.invalidate();
            }
        };
        MoPubLog.d("Attempting to invoke custom event: " + str);
        try {
            this.mCustomEventInterstitial = CustomEventInterstitialFactory.create(str);
            this.mServerExtras = new TreeMap(map);
            this.mLocalExtras = this.mMoPubInterstitial.getLocalExtras();
            if (this.mMoPubInterstitial.getLocation() != null) {
                this.mLocalExtras.put(GooglePlayServicesInterstitial.LOCATION_KEY, this.mMoPubInterstitial.getLocation());
            }
            this.mLocalExtras.put(DataKeys.BROADCAST_IDENTIFIER_KEY, Long.valueOf(j));
            this.mLocalExtras.put(DataKeys.AD_REPORT_KEY, adReport);
        } catch (Exception unused) {
            MoPubLog.d("Couldn't locate or instantiate custom event: " + str + ".");
            this.mMoPubInterstitial.onCustomEventInterstitialFailed(MoPubErrorCode.ADAPTER_NOT_FOUND);
        }
    }

    void loadInterstitial() {
        if (isInvalidated() || this.mCustomEventInterstitial == null) {
            return;
        }
        this.mHandler.postDelayed(this.mTimeout, getTimeoutDelayMilliseconds());
        try {
            this.mCustomEventInterstitial.loadInterstitial(this.mContext, this, this.mLocalExtras, this.mServerExtras);
        } catch (Exception e) {
            MoPubLog.d("Loading a custom event interstitial threw an exception.", e);
            onInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
        }
    }

    void showInterstitial() {
        if (isInvalidated() || this.mCustomEventInterstitial == null) {
            return;
        }
        try {
            this.mCustomEventInterstitial.showInterstitial();
        } catch (Exception e) {
            MoPubLog.d("Showing a custom event interstitial threw an exception.", e);
            onInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
        }
    }

    void invalidate() {
        if (this.mCustomEventInterstitial != null) {
            try {
                this.mCustomEventInterstitial.onInvalidate();
            } catch (Exception e) {
                MoPubLog.d("Invalidating a custom event interstitial threw an exception.", e);
            }
        }
        this.mCustomEventInterstitial = null;
        this.mContext = null;
        this.mServerExtras = null;
        this.mLocalExtras = null;
        this.mCustomEventInterstitialAdapterListener = null;
        WebViewCacheService.Config popWebViewConfig = WebViewCacheService.popWebViewConfig(Long.valueOf(this.mBroadcastIdentifier));
        if (popWebViewConfig != null) {
            popWebViewConfig.getWebView().destroy();
        }
        this.mInvalidated = true;
    }

    boolean isInvalidated() {
        return this.mInvalidated;
    }

    void setAdapterListener(CustomEventInterstitialAdapterListener customEventInterstitialAdapterListener) {
        this.mCustomEventInterstitialAdapterListener = customEventInterstitialAdapterListener;
    }

    private void cancelTimeout() {
        this.mHandler.removeCallbacks(this.mTimeout);
    }

    private int getTimeoutDelayMilliseconds() {
        if (this.mMoPubInterstitial == null || this.mMoPubInterstitial.getAdTimeoutDelay() == null || this.mMoPubInterstitial.getAdTimeoutDelay().intValue() < 0) {
            return 30000;
        }
        return this.mMoPubInterstitial.getAdTimeoutDelay().intValue() * 1000;
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
    public void onInterstitialLoaded() {
        if (isInvalidated()) {
            return;
        }
        cancelTimeout();
        if (this.mCustomEventInterstitialAdapterListener != null) {
            this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialLoaded();
        }
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
    public void onInterstitialFailed(MoPubErrorCode moPubErrorCode) {
        if (isInvalidated() || this.mCustomEventInterstitialAdapterListener == null) {
            return;
        }
        if (moPubErrorCode == null) {
            moPubErrorCode = MoPubErrorCode.UNSPECIFIED;
        }
        cancelTimeout();
        this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialFailed(moPubErrorCode);
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
    public void onInterstitialShown() {
        if (isInvalidated() || this.mCustomEventInterstitialAdapterListener == null) {
            return;
        }
        this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialShown();
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
    public void onInterstitialClicked() {
        if (isInvalidated() || this.mCustomEventInterstitialAdapterListener == null) {
            return;
        }
        this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialClicked();
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
    public void onLeaveApplication() {
        onInterstitialClicked();
    }

    @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
    public void onInterstitialDismissed() {
        if (isInvalidated() || this.mCustomEventInterstitialAdapterListener == null) {
            return;
        }
        this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialDismissed();
    }

    @Deprecated
    void setCustomEventInterstitial(CustomEventInterstitial customEventInterstitial) {
        this.mCustomEventInterstitial = customEventInterstitial;
    }
}
