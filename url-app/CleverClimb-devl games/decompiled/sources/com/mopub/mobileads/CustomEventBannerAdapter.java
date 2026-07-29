package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.DataKeys;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.ReflectionTarget;
import com.mopub.mobileads.BannerVisibilityTracker;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.factories.CustomEventBannerFactory;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class CustomEventBannerAdapter implements CustomEventBanner.CustomEventBannerListener {
    public static final int DEFAULT_BANNER_TIMEOUT_DELAY = 10000;
    private Context mContext;
    private CustomEventBanner mCustomEventBanner;
    private final Handler mHandler;
    private boolean mInvalidated;
    private Map<String, Object> mLocalExtras;
    private MoPubView mMoPubView;
    private Map<String, String> mServerExtras;
    private boolean mStoredAutorefresh;
    private final Runnable mTimeout;
    private BannerVisibilityTracker mVisibilityTracker;
    private int mImpressionMinVisibleDips = Integer.MIN_VALUE;
    private int mImpressionMinVisibleMs = Integer.MIN_VALUE;
    private boolean mIsVisibilityImpressionTrackingEnabled = false;

    public CustomEventBannerAdapter(MoPubView moPubView, String str, Map<String, String> map, long j, AdReport adReport) {
        Preconditions.checkNotNull(map);
        this.mHandler = new Handler();
        this.mMoPubView = moPubView;
        this.mContext = moPubView.getContext();
        this.mTimeout = new Runnable() { // from class: com.mopub.mobileads.CustomEventBannerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                MoPubLog.d("Third-party network timed out.");
                CustomEventBannerAdapter.this.onBannerFailed(MoPubErrorCode.NETWORK_TIMEOUT);
                CustomEventBannerAdapter.this.invalidate();
            }
        };
        MoPubLog.d("Attempting to invoke custom event: " + str);
        try {
            this.mCustomEventBanner = CustomEventBannerFactory.create(str);
            this.mServerExtras = new TreeMap(map);
            parseBannerImpressionTrackingHeaders();
            this.mLocalExtras = this.mMoPubView.getLocalExtras();
            if (this.mMoPubView.getLocation() != null) {
                this.mLocalExtras.put(GooglePlayServicesInterstitial.LOCATION_KEY, this.mMoPubView.getLocation());
            }
            this.mLocalExtras.put(DataKeys.BROADCAST_IDENTIFIER_KEY, Long.valueOf(j));
            this.mLocalExtras.put(DataKeys.AD_REPORT_KEY, adReport);
            this.mLocalExtras.put(DataKeys.AD_WIDTH, Integer.valueOf(this.mMoPubView.getAdWidth()));
            this.mLocalExtras.put(DataKeys.AD_HEIGHT, Integer.valueOf(this.mMoPubView.getAdHeight()));
            this.mLocalExtras.put(DataKeys.BANNER_IMPRESSION_PIXEL_COUNT_ENABLED, Boolean.valueOf(this.mIsVisibilityImpressionTrackingEnabled));
        } catch (Exception unused) {
            MoPubLog.d("Couldn't locate or instantiate custom event: " + str + ".");
            this.mMoPubView.loadFailUrl(MoPubErrorCode.ADAPTER_NOT_FOUND);
        }
    }

    @ReflectionTarget
    void loadAd() {
        if (isInvalidated() || this.mCustomEventBanner == null) {
            return;
        }
        this.mHandler.postDelayed(this.mTimeout, getTimeoutDelayMilliseconds());
        try {
            this.mCustomEventBanner.loadBanner(this.mContext, this, this.mLocalExtras, this.mServerExtras);
        } catch (Exception e) {
            MoPubLog.d("Loading a custom event banner threw an exception.", e);
            onBannerFailed(MoPubErrorCode.INTERNAL_ERROR);
        }
    }

    @ReflectionTarget
    void invalidate() {
        if (this.mCustomEventBanner != null) {
            try {
                this.mCustomEventBanner.onInvalidate();
            } catch (Exception e) {
                MoPubLog.d("Invalidating a custom event banner threw an exception", e);
            }
        }
        if (this.mVisibilityTracker != null) {
            try {
                this.mVisibilityTracker.destroy();
            } catch (Exception e2) {
                MoPubLog.d("Destroying a banner visibility tracker threw an exception", e2);
            }
        }
        this.mContext = null;
        this.mCustomEventBanner = null;
        this.mLocalExtras = null;
        this.mServerExtras = null;
        this.mInvalidated = true;
    }

    boolean isInvalidated() {
        return this.mInvalidated;
    }

    @VisibleForTesting
    @Deprecated
    int getImpressionMinVisibleDips() {
        return this.mImpressionMinVisibleDips;
    }

    @VisibleForTesting
    @Deprecated
    int getImpressionMinVisibleMs() {
        return this.mImpressionMinVisibleMs;
    }

    @VisibleForTesting
    @Deprecated
    boolean isVisibilityImpressionTrackingEnabled() {
        return this.mIsVisibilityImpressionTrackingEnabled;
    }

    @VisibleForTesting
    @Deprecated
    BannerVisibilityTracker getVisibilityTracker() {
        return this.mVisibilityTracker;
    }

    private void cancelTimeout() {
        this.mHandler.removeCallbacks(this.mTimeout);
    }

    private int getTimeoutDelayMilliseconds() {
        if (this.mMoPubView == null || this.mMoPubView.getAdTimeoutDelay() == null || this.mMoPubView.getAdTimeoutDelay().intValue() < 0) {
            return 10000;
        }
        return this.mMoPubView.getAdTimeoutDelay().intValue() * 1000;
    }

    private void parseBannerImpressionTrackingHeaders() {
        String str = this.mServerExtras.get(DataKeys.BANNER_IMPRESSION_MIN_VISIBLE_DIPS);
        String str2 = this.mServerExtras.get(DataKeys.BANNER_IMPRESSION_MIN_VISIBLE_MS);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.mImpressionMinVisibleDips = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            MoPubLog.d("Cannot parse integer from header Banner-Impression-Min-Pixels");
        }
        try {
            this.mImpressionMinVisibleMs = Integer.parseInt(str2);
        } catch (NumberFormatException unused2) {
            MoPubLog.d("Cannot parse integer from header Banner-Impression-Min-Ms");
        }
        if (this.mImpressionMinVisibleDips <= 0 || this.mImpressionMinVisibleMs < 0) {
            return;
        }
        this.mIsVisibilityImpressionTrackingEnabled = true;
    }

    @Override // com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener
    public void onBannerLoaded(View view) {
        if (isInvalidated()) {
            return;
        }
        cancelTimeout();
        if (this.mMoPubView != null) {
            this.mMoPubView.nativeAdLoaded();
            if (this.mIsVisibilityImpressionTrackingEnabled) {
                this.mVisibilityTracker = new BannerVisibilityTracker(this.mContext, this.mMoPubView, view, this.mImpressionMinVisibleDips, this.mImpressionMinVisibleMs);
                this.mVisibilityTracker.setBannerVisibilityTrackerListener(new BannerVisibilityTracker.BannerVisibilityTrackerListener() { // from class: com.mopub.mobileads.CustomEventBannerAdapter.2
                    @Override // com.mopub.mobileads.BannerVisibilityTracker.BannerVisibilityTrackerListener
                    public void onVisibilityChanged() {
                        CustomEventBannerAdapter.this.mMoPubView.trackNativeImpression();
                        if (CustomEventBannerAdapter.this.mCustomEventBanner != null) {
                            CustomEventBannerAdapter.this.mCustomEventBanner.trackMpxAndThirdPartyImpressions();
                        }
                    }
                });
            }
            this.mMoPubView.setAdContentView(view);
            if (this.mIsVisibilityImpressionTrackingEnabled || (view instanceof HtmlBannerWebView)) {
                return;
            }
            this.mMoPubView.trackNativeImpression();
        }
    }

    @Override // com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener
    public void onBannerFailed(MoPubErrorCode moPubErrorCode) {
        if (isInvalidated() || this.mMoPubView == null) {
            return;
        }
        if (moPubErrorCode == null) {
            moPubErrorCode = MoPubErrorCode.UNSPECIFIED;
        }
        cancelTimeout();
        this.mMoPubView.loadFailUrl(moPubErrorCode);
    }

    @Override // com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener
    public void onBannerExpanded() {
        if (isInvalidated()) {
            return;
        }
        this.mStoredAutorefresh = this.mMoPubView.getAutorefreshEnabled();
        this.mMoPubView.setAutorefreshEnabled(false);
        this.mMoPubView.adPresentedOverlay();
    }

    @Override // com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener
    public void onBannerCollapsed() {
        if (isInvalidated()) {
            return;
        }
        this.mMoPubView.setAutorefreshEnabled(this.mStoredAutorefresh);
        this.mMoPubView.adClosed();
    }

    @Override // com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener
    public void onBannerClicked() {
        if (isInvalidated() || this.mMoPubView == null) {
            return;
        }
        this.mMoPubView.registerClick();
    }

    @Override // com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener
    public void onLeaveApplication() {
        onBannerClicked();
    }
}
