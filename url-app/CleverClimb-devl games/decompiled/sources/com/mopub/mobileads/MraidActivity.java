package com.mopub.mobileads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.AdReport;
import com.mopub.common.Constants;
import com.mopub.common.DataKeys;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.IntentActions;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.JavaScriptWebViewCallbacks;
import com.mopub.mobileads.CustomEventInterstitial;
import com.mopub.mraid.MraidBridge;
import com.mopub.mraid.MraidController;
import com.mopub.mraid.MraidWebViewClient;
import com.mopub.mraid.MraidWebViewDebugListener;
import com.mopub.mraid.PlacementType;
import com.mopub.network.Networking;

/* loaded from: classes2.dex */
public class MraidActivity extends BaseInterstitialActivity {
    private MraidWebViewDebugListener mDebugListener;
    private ExternalViewabilitySessionManager mExternalViewabilitySessionManager;
    private MraidController mMraidController;

    public static void preRenderHtml(Interstitial interstitial, Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, String str, Long l) {
        Preconditions.checkNotNull(interstitial);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(customEventInterstitialListener);
        Preconditions.checkNotNull(l);
        preRenderHtml(interstitial, customEventInterstitialListener, str, new MraidBridge.MraidWebView(context), l);
    }

    @VisibleForTesting
    static void preRenderHtml(Interstitial interstitial, final CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, String str, BaseWebView baseWebView, Long l) {
        Preconditions.checkNotNull(interstitial);
        Preconditions.checkNotNull(customEventInterstitialListener);
        Preconditions.checkNotNull(baseWebView);
        Preconditions.checkNotNull(l);
        baseWebView.enablePlugins(false);
        baseWebView.enableJavascriptCaching();
        baseWebView.setWebViewClient(new MraidWebViewClient() { // from class: com.mopub.mobileads.MraidActivity.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                if (!"mopub://failLoad".equals(str2)) {
                    return true;
                }
                CustomEventInterstitial.CustomEventInterstitialListener.this.onInterstitialFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                CustomEventInterstitial.CustomEventInterstitialListener.this.onInterstitialLoaded();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str2, String str3) {
                super.onReceivedError(webView, i, str2, str3);
                CustomEventInterstitial.CustomEventInterstitialListener.this.onInterstitialFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
            }
        });
        Context context = baseWebView.getContext();
        ExternalViewabilitySessionManager externalViewabilitySessionManager = new ExternalViewabilitySessionManager(context);
        externalViewabilitySessionManager.createDisplaySession(context, baseWebView, true);
        baseWebView.loadDataWithBaseURL(Networking.getBaseUrlScheme() + "://" + Constants.HOST + "/", str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
        WebViewCacheService.storeWebViewConfig(l, interstitial, baseWebView, externalViewabilitySessionManager);
    }

    public static void start(Context context, AdReport adReport, String str, long j) {
        try {
            context.startActivity(createIntent(context, adReport, str, j));
        } catch (ActivityNotFoundException unused) {
            Log.d("MraidInterstitial", "MraidActivity.class not found. Did you declare MraidActivity in your manifest?");
        }
    }

    @VisibleForTesting
    protected static Intent createIntent(Context context, AdReport adReport, String str, long j) {
        Intent intent = new Intent(context, (Class<?>) MraidActivity.class);
        intent.putExtra(DataKeys.HTML_RESPONSE_BODY_KEY, str);
        intent.putExtra(DataKeys.BROADCAST_IDENTIFIER_KEY, j);
        intent.putExtra(DataKeys.AD_REPORT_KEY, adReport);
        intent.addFlags(268435456);
        return intent;
    }

    @Override // com.mopub.mobileads.BaseInterstitialActivity
    public View getAdView() {
        String stringExtra = getIntent().getStringExtra(DataKeys.HTML_RESPONSE_BODY_KEY);
        if (stringExtra == null) {
            MoPubLog.w("MraidActivity received a null HTML body. Finishing the activity.");
            finish();
            return new View(this);
        }
        this.mMraidController = new MraidController(this, this.mAdReport, PlacementType.INTERSTITIAL);
        this.mMraidController.setDebugListener(this.mDebugListener);
        this.mMraidController.setMraidListener(new MraidController.MraidListener() { // from class: com.mopub.mobileads.MraidActivity.2
            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onExpand() {
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onLoaded(View view) {
                MraidActivity.this.mMraidController.loadJavascript(JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getJavascript());
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onFailedToLoad() {
                MoPubLog.d("MraidActivity failed to load. Finishing the activity");
                if (MraidActivity.this.getBroadcastIdentifier() != null) {
                    EventForwardingBroadcastReceiver.broadcastAction(MraidActivity.this, MraidActivity.this.getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_FAIL);
                }
                MraidActivity.this.finish();
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onClose() {
                MraidActivity.this.mMraidController.loadJavascript(JavaScriptWebViewCallbacks.WEB_VIEW_DID_CLOSE.getJavascript());
                MraidActivity.this.finish();
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onOpen() {
                if (MraidActivity.this.getBroadcastIdentifier() != null) {
                    EventForwardingBroadcastReceiver.broadcastAction(MraidActivity.this, MraidActivity.this.getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_CLICK);
                }
            }
        });
        this.mMraidController.setUseCustomCloseListener(new MraidController.UseCustomCloseListener() { // from class: com.mopub.mobileads.MraidActivity.3
            @Override // com.mopub.mraid.MraidController.UseCustomCloseListener
            public void useCustomCloseChanged(boolean z) {
                if (z) {
                    MraidActivity.this.hideInterstitialCloseButton();
                } else {
                    MraidActivity.this.showInterstitialCloseButton();
                }
            }
        });
        this.mMraidController.fillContent(getBroadcastIdentifier(), stringExtra, new MraidController.MraidWebViewCacheListener() { // from class: com.mopub.mobileads.MraidActivity.4
            @Override // com.mopub.mraid.MraidController.MraidWebViewCacheListener
            public void onReady(MraidBridge.MraidWebView mraidWebView, ExternalViewabilitySessionManager externalViewabilitySessionManager) {
                if (externalViewabilitySessionManager != null) {
                    MraidActivity.this.mExternalViewabilitySessionManager = externalViewabilitySessionManager;
                    return;
                }
                MraidActivity.this.mExternalViewabilitySessionManager = new ExternalViewabilitySessionManager(MraidActivity.this);
                MraidActivity.this.mExternalViewabilitySessionManager.createDisplaySession(MraidActivity.this, mraidWebView, true);
            }
        });
        return this.mMraidController.getAdContainer();
    }

    @Override // com.mopub.mobileads.BaseInterstitialActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mExternalViewabilitySessionManager != null) {
            this.mExternalViewabilitySessionManager.startDeferredDisplaySession(this);
        }
        if (getBroadcastIdentifier() != null) {
            EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_SHOW);
        }
        getWindow().setFlags(16777216, 16777216);
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.mMraidController != null) {
            this.mMraidController.pause(isFinishing());
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.mMraidController != null) {
            this.mMraidController.resume();
        }
    }

    @Override // com.mopub.mobileads.BaseInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        if (this.mExternalViewabilitySessionManager != null) {
            this.mExternalViewabilitySessionManager.endDisplaySession();
            this.mExternalViewabilitySessionManager = null;
        }
        if (this.mMraidController != null) {
            this.mMraidController.destroy();
        }
        if (getBroadcastIdentifier() != null) {
            EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_DISMISS);
        }
        super.onDestroy();
    }

    @VisibleForTesting
    public void setDebugListener(MraidWebViewDebugListener mraidWebViewDebugListener) {
        this.mDebugListener = mraidWebViewDebugListener;
        if (this.mMraidController != null) {
            this.mMraidController.setDebugListener(mraidWebViewDebugListener);
        }
    }
}
