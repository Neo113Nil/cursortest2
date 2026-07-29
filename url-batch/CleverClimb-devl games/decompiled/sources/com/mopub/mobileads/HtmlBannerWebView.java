package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.mobileads.CustomEventBanner;

/* loaded from: classes2.dex */
public class HtmlBannerWebView extends BaseHtmlWebView {
    public static final String EXTRA_AD_CLICK_DATA = "com.mopub.intent.extra.AD_CLICK_DATA";

    public HtmlBannerWebView(Context context, AdReport adReport) {
        super(context, adReport);
    }

    public void init(CustomEventBanner.CustomEventBannerListener customEventBannerListener, boolean z, String str, String str2, String str3) {
        super.init(z);
        setWebViewClient(new HtmlWebViewClient(new HtmlBannerWebViewListener(customEventBannerListener), this, str2, str, str3));
    }

    static class HtmlBannerWebViewListener implements HtmlWebViewListener {
        private final CustomEventBanner.CustomEventBannerListener mCustomEventBannerListener;

        public HtmlBannerWebViewListener(CustomEventBanner.CustomEventBannerListener customEventBannerListener) {
            this.mCustomEventBannerListener = customEventBannerListener;
        }

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onLoaded(BaseHtmlWebView baseHtmlWebView) {
            this.mCustomEventBannerListener.onBannerLoaded(baseHtmlWebView);
        }

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onFailed(MoPubErrorCode moPubErrorCode) {
            this.mCustomEventBannerListener.onBannerFailed(moPubErrorCode);
        }

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onClicked() {
            this.mCustomEventBannerListener.onBannerClicked();
        }

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onCollapsed() {
            this.mCustomEventBannerListener.onBannerCollapsed();
        }
    }
}
