package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.common.DataKeys;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.JavaScriptWebViewCallbacks;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.factories.HtmlBannerWebViewFactory;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public class HtmlBanner extends CustomEventBanner {
    private boolean mBannerImpressionPixelCountEnabled = false;
    private ExternalViewabilitySessionManager mExternalViewabilitySessionManager;
    private HtmlBannerWebView mHtmlBannerWebView;
    private WeakReference<Activity> mWeakActivity;

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void loadBanner(Context context, CustomEventBanner.CustomEventBannerListener customEventBannerListener, Map<String, Object> map, Map<String, String> map2) {
        Object obj = map.get(DataKeys.BANNER_IMPRESSION_PIXEL_COUNT_ENABLED);
        if (obj instanceof Boolean) {
            this.mBannerImpressionPixelCountEnabled = ((Boolean) obj).booleanValue();
        }
        if (extrasAreValid(map2)) {
            String str = map2.get(DataKeys.HTML_RESPONSE_BODY_KEY);
            String str2 = map2.get(DataKeys.REDIRECT_URL_KEY);
            String str3 = map2.get(DataKeys.CLICKTHROUGH_URL_KEY);
            Boolean valueOf = Boolean.valueOf(map2.get(DataKeys.SCROLLABLE_KEY));
            try {
                this.mHtmlBannerWebView = HtmlBannerWebViewFactory.create(context, (AdReport) map.get(DataKeys.AD_REPORT_KEY), customEventBannerListener, valueOf.booleanValue(), str2, str3);
                AdViewController.setShouldHonorServerDimensions(this.mHtmlBannerWebView);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    this.mWeakActivity = new WeakReference<>(activity);
                    this.mExternalViewabilitySessionManager = new ExternalViewabilitySessionManager(activity);
                    this.mExternalViewabilitySessionManager.createDisplaySession(activity, this.mHtmlBannerWebView, this.mBannerImpressionPixelCountEnabled);
                } else {
                    MoPubLog.d("Unable to start viewability session for HTML banner: Context provided was not an Activity.");
                }
                this.mHtmlBannerWebView.loadHtmlResponse(str);
                return;
            } catch (ClassCastException unused) {
                MoPubLog.e("LocalExtras contained an incorrect type.");
                customEventBannerListener.onBannerFailed(MoPubErrorCode.INTERNAL_ERROR);
                return;
            }
        }
        customEventBannerListener.onBannerFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
    }

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void onInvalidate() {
        if (this.mExternalViewabilitySessionManager != null) {
            this.mExternalViewabilitySessionManager.endDisplaySession();
            this.mExternalViewabilitySessionManager = null;
        }
        if (this.mHtmlBannerWebView != null) {
            this.mHtmlBannerWebView.destroy();
        }
    }

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void trackMpxAndThirdPartyImpressions() {
        if (this.mHtmlBannerWebView == null) {
            return;
        }
        this.mHtmlBannerWebView.loadUrl(JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getUrl());
        if (!this.mBannerImpressionPixelCountEnabled || this.mExternalViewabilitySessionManager == null || this.mWeakActivity == null) {
            return;
        }
        Activity activity = this.mWeakActivity.get();
        if (activity != null) {
            this.mExternalViewabilitySessionManager.startDeferredDisplaySession(activity);
        } else {
            MoPubLog.d("Lost the activity for deferred Viewability tracking. Dropping session.");
        }
    }

    private boolean extrasAreValid(Map<String, String> map) {
        return map.containsKey(DataKeys.HTML_RESPONSE_BODY_KEY);
    }

    @VisibleForTesting
    boolean isBannerImpressionPixelCountEnabled() {
        return this.mBannerImpressionPixelCountEnabled;
    }
}
