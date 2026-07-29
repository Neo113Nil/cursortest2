package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.AdReport;
import com.mopub.mobileads.CustomEventInterstitial;

/* loaded from: classes2.dex */
public class HtmlInterstitialWebView extends BaseHtmlWebView {
    private Handler mHandler;

    public HtmlInterstitialWebView(Context context, AdReport adReport) {
        super(context, adReport);
        this.mHandler = new Handler();
    }

    public void init(CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, boolean z, String str, String str2, String str3) {
        super.init(z);
        setWebViewClient(new HtmlWebViewClient(new HtmlInterstitialWebViewListener(customEventInterstitialListener), this, str2, str, str3));
    }

    private void postHandlerRunnable(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    static class HtmlInterstitialWebViewListener implements HtmlWebViewListener {
        private final CustomEventInterstitial.CustomEventInterstitialListener mCustomEventInterstitialListener;

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onCollapsed() {
        }

        public HtmlInterstitialWebViewListener(CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener) {
            this.mCustomEventInterstitialListener = customEventInterstitialListener;
        }

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onLoaded(BaseHtmlWebView baseHtmlWebView) {
            this.mCustomEventInterstitialListener.onInterstitialLoaded();
        }

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onFailed(MoPubErrorCode moPubErrorCode) {
            this.mCustomEventInterstitialListener.onInterstitialFailed(moPubErrorCode);
        }

        @Override // com.mopub.mobileads.HtmlWebViewListener
        public void onClicked() {
            this.mCustomEventInterstitialListener.onInterstitialClicked();
        }
    }
}
