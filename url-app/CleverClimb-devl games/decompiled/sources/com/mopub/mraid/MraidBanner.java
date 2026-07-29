package com.mopub.mraid;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.DataKeys;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.JavaScriptWebViewCallbacks;
import com.mopub.mobileads.AdViewController;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.mobileads.factories.MraidControllerFactory;
import com.mopub.mraid.MraidBridge;
import com.mopub.mraid.MraidController;
import java.util.Map;

/* loaded from: classes2.dex */
class MraidBanner extends CustomEventBanner {
    private boolean mBannerImpressionPixelCountEnabled = false;
    private CustomEventBanner.CustomEventBannerListener mBannerListener;
    private MraidWebViewDebugListener mDebugListener;
    private ExternalViewabilitySessionManager mExternalViewabilitySessionManager;
    private MraidController mMraidController;

    MraidBanner() {
    }

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void loadBanner(final Context context, CustomEventBanner.CustomEventBannerListener customEventBannerListener, Map<String, Object> map, Map<String, String> map2) {
        this.mBannerListener = customEventBannerListener;
        if (extrasAreValid(map2)) {
            String str = map2.get(DataKeys.HTML_RESPONSE_BODY_KEY);
            Object obj = map.get(DataKeys.BANNER_IMPRESSION_PIXEL_COUNT_ENABLED);
            if (obj instanceof Boolean) {
                this.mBannerImpressionPixelCountEnabled = ((Boolean) obj).booleanValue();
            }
            try {
                this.mMraidController = MraidControllerFactory.create(context, (AdReport) map.get(DataKeys.AD_REPORT_KEY), PlacementType.INLINE);
                this.mMraidController.setDebugListener(this.mDebugListener);
                this.mMraidController.setMraidListener(new MraidController.MraidListener() { // from class: com.mopub.mraid.MraidBanner.1
                    @Override // com.mopub.mraid.MraidController.MraidListener
                    public void onLoaded(View view) {
                        AdViewController.setShouldHonorServerDimensions(view);
                        MraidBanner.this.mBannerListener.onBannerLoaded(view);
                    }

                    @Override // com.mopub.mraid.MraidController.MraidListener
                    public void onFailedToLoad() {
                        MraidBanner.this.mBannerListener.onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
                    }

                    @Override // com.mopub.mraid.MraidController.MraidListener
                    public void onExpand() {
                        MraidBanner.this.mBannerListener.onBannerExpanded();
                        MraidBanner.this.mBannerListener.onBannerClicked();
                    }

                    @Override // com.mopub.mraid.MraidController.MraidListener
                    public void onOpen() {
                        MraidBanner.this.mBannerListener.onBannerClicked();
                    }

                    @Override // com.mopub.mraid.MraidController.MraidListener
                    public void onClose() {
                        MraidBanner.this.mBannerListener.onBannerCollapsed();
                    }
                });
                this.mMraidController.fillContent(null, str, new MraidController.MraidWebViewCacheListener() { // from class: com.mopub.mraid.MraidBanner.2
                    @Override // com.mopub.mraid.MraidController.MraidWebViewCacheListener
                    public void onReady(MraidBridge.MraidWebView mraidWebView, ExternalViewabilitySessionManager externalViewabilitySessionManager) {
                        mraidWebView.getSettings().setJavaScriptEnabled(true);
                        if (context instanceof Activity) {
                            MraidBanner.this.mExternalViewabilitySessionManager = new ExternalViewabilitySessionManager(context);
                            MraidBanner.this.mExternalViewabilitySessionManager.createDisplaySession(context, mraidWebView, MraidBanner.this.mBannerImpressionPixelCountEnabled);
                        }
                    }
                });
                return;
            } catch (ClassCastException e) {
                MoPubLog.w("MRAID banner creating failed:", e);
                this.mBannerListener.onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
                return;
            }
        }
        this.mBannerListener.onBannerFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
    }

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void onInvalidate() {
        if (this.mExternalViewabilitySessionManager != null) {
            this.mExternalViewabilitySessionManager.endDisplaySession();
            this.mExternalViewabilitySessionManager = null;
        }
        if (this.mMraidController != null) {
            this.mMraidController.setMraidListener(null);
            this.mMraidController.destroy();
        }
    }

    @Override // com.mopub.mobileads.CustomEventBanner
    protected void trackMpxAndThirdPartyImpressions() {
        if (this.mMraidController == null) {
            return;
        }
        this.mMraidController.loadJavascript(JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getJavascript());
        if (!this.mBannerImpressionPixelCountEnabled || this.mExternalViewabilitySessionManager == null) {
            return;
        }
        Activity activity = this.mMraidController.getWeakActivity().get();
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
    public void setDebugListener(MraidWebViewDebugListener mraidWebViewDebugListener) {
        this.mDebugListener = mraidWebViewDebugListener;
        if (this.mMraidController != null) {
            this.mMraidController.setDebugListener(mraidWebViewDebugListener);
        }
    }

    @VisibleForTesting
    boolean isBannerImpressionPixelCountEnabled() {
        return this.mBannerImpressionPixelCountEnabled;
    }
}
