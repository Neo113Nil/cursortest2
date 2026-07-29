package com.mopub.mobileads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.AdReport;
import com.mopub.common.CreativeOrientation;
import com.mopub.common.DataKeys;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.IntentActions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.JavaScriptWebViewCallbacks;
import com.mopub.mobileads.CustomEventInterstitial;
import com.mopub.mobileads.WebViewCacheService;
import com.mopub.mobileads.factories.HtmlInterstitialWebViewFactory;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class MoPubActivity extends BaseInterstitialActivity {
    private ExternalViewabilitySessionManager mExternalViewabilitySessionManager;
    private HtmlInterstitialWebView mHtmlInterstitialWebView;

    public static void start(Context context, String str, AdReport adReport, boolean z, String str2, String str3, CreativeOrientation creativeOrientation, long j) {
        try {
            context.startActivity(createIntent(context, str, adReport, z, str2, str3, creativeOrientation, j));
        } catch (ActivityNotFoundException unused) {
            Log.d("MoPubActivity", "MoPubActivity not found - did you declare it in AndroidManifest.xml?");
        }
    }

    static Intent createIntent(Context context, String str, AdReport adReport, boolean z, String str2, String str3, CreativeOrientation creativeOrientation, long j) {
        Intent intent = new Intent(context, (Class<?>) MoPubActivity.class);
        intent.putExtra(DataKeys.HTML_RESPONSE_BODY_KEY, str);
        intent.putExtra(DataKeys.SCROLLABLE_KEY, z);
        intent.putExtra(DataKeys.CLICKTHROUGH_URL_KEY, str3);
        intent.putExtra(DataKeys.REDIRECT_URL_KEY, str2);
        intent.putExtra(DataKeys.BROADCAST_IDENTIFIER_KEY, j);
        intent.putExtra(DataKeys.AD_REPORT_KEY, adReport);
        intent.putExtra(DataKeys.CREATIVE_ORIENTATION_KEY, creativeOrientation);
        intent.addFlags(268435456);
        return intent;
    }

    static void preRenderHtml(Interstitial interstitial, Context context, AdReport adReport, final CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, String str, boolean z, String str2, String str3, long j) {
        HtmlInterstitialWebView create = HtmlInterstitialWebViewFactory.create(context.getApplicationContext(), adReport, customEventInterstitialListener, z, str2, str3);
        create.enablePlugins(false);
        create.enableJavascriptCaching();
        create.setWebViewClient(new WebViewClient() { // from class: com.mopub.mobileads.MoPubActivity.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str4) {
                if ("mopub://finishLoad".equals(str4)) {
                    CustomEventInterstitial.CustomEventInterstitialListener.this.onInterstitialLoaded();
                    return true;
                }
                if (!"mopub://failLoad".equals(str4)) {
                    return true;
                }
                CustomEventInterstitial.CustomEventInterstitialListener.this.onInterstitialFailed(null);
                return true;
            }
        });
        ExternalViewabilitySessionManager externalViewabilitySessionManager = new ExternalViewabilitySessionManager(context);
        externalViewabilitySessionManager.createDisplaySession(context, create, true);
        create.loadHtmlResponse(str);
        WebViewCacheService.storeWebViewConfig(Long.valueOf(j), interstitial, create, externalViewabilitySessionManager);
    }

    @Override // com.mopub.mobileads.BaseInterstitialActivity
    public View getAdView() {
        WebViewCacheService.Config popWebViewConfig;
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra(DataKeys.SCROLLABLE_KEY, false);
        String stringExtra = intent.getStringExtra(DataKeys.REDIRECT_URL_KEY);
        String stringExtra2 = intent.getStringExtra(DataKeys.CLICKTHROUGH_URL_KEY);
        String stringExtra3 = intent.getStringExtra(DataKeys.HTML_RESPONSE_BODY_KEY);
        Long broadcastIdentifier = getBroadcastIdentifier();
        if (broadcastIdentifier != null && (popWebViewConfig = WebViewCacheService.popWebViewConfig(broadcastIdentifier)) != null && (popWebViewConfig.getWebView() instanceof HtmlInterstitialWebView)) {
            this.mHtmlInterstitialWebView = (HtmlInterstitialWebView) popWebViewConfig.getWebView();
            this.mHtmlInterstitialWebView.init(new BroadcastingInterstitialListener(), booleanExtra, stringExtra, stringExtra2, this.mAdReport != null ? this.mAdReport.getDspCreativeId() : null);
            this.mHtmlInterstitialWebView.enablePlugins(true);
            this.mHtmlInterstitialWebView.loadUrl(JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getUrl());
            this.mExternalViewabilitySessionManager = popWebViewConfig.getViewabilityManager();
            return this.mHtmlInterstitialWebView;
        }
        MoPubLog.d("WebView cache miss. Recreating the WebView.");
        this.mHtmlInterstitialWebView = HtmlInterstitialWebViewFactory.create(getApplicationContext(), this.mAdReport, new BroadcastingInterstitialListener(), booleanExtra, stringExtra, stringExtra2);
        this.mExternalViewabilitySessionManager = new ExternalViewabilitySessionManager(this);
        this.mExternalViewabilitySessionManager.createDisplaySession(this, this.mHtmlInterstitialWebView, true);
        this.mHtmlInterstitialWebView.loadHtmlResponse(stringExtra3);
        return this.mHtmlInterstitialWebView;
    }

    @Override // com.mopub.mobileads.BaseInterstitialActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        CreativeOrientation creativeOrientation;
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra(DataKeys.CREATIVE_ORIENTATION_KEY);
        if (serializableExtra == null || !(serializableExtra instanceof CreativeOrientation)) {
            creativeOrientation = CreativeOrientation.UNDEFINED;
        } else {
            creativeOrientation = (CreativeOrientation) serializableExtra;
        }
        DeviceUtils.lockOrientation(this, creativeOrientation);
        if (this.mExternalViewabilitySessionManager != null) {
            this.mExternalViewabilitySessionManager.startDeferredDisplaySession(this);
        }
        EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_SHOW);
    }

    @Override // com.mopub.mobileads.BaseInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        if (this.mExternalViewabilitySessionManager != null) {
            this.mExternalViewabilitySessionManager.endDisplaySession();
            this.mExternalViewabilitySessionManager = null;
        }
        if (this.mHtmlInterstitialWebView != null) {
            this.mHtmlInterstitialWebView.loadUrl(JavaScriptWebViewCallbacks.WEB_VIEW_DID_CLOSE.getUrl());
            this.mHtmlInterstitialWebView.destroy();
        }
        EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_DISMISS);
        super.onDestroy();
    }

    class BroadcastingInterstitialListener implements CustomEventInterstitial.CustomEventInterstitialListener {
        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialDismissed() {
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialShown() {
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onLeaveApplication() {
        }

        BroadcastingInterstitialListener() {
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialLoaded() {
            if (MoPubActivity.this.mHtmlInterstitialWebView != null) {
                MoPubActivity.this.mHtmlInterstitialWebView.loadUrl(JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getUrl());
            }
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialFailed(MoPubErrorCode moPubErrorCode) {
            EventForwardingBroadcastReceiver.broadcastAction(MoPubActivity.this, MoPubActivity.this.getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_FAIL);
            MoPubActivity.this.finish();
        }

        @Override // com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
        public void onInterstitialClicked() {
            EventForwardingBroadcastReceiver.broadcastAction(MoPubActivity.this, MoPubActivity.this.getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_CLICK);
        }
    }
}
