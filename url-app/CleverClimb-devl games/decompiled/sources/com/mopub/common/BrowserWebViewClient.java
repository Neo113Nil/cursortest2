package com.mopub.common;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.UrlHandler;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Drawables;
import java.util.EnumSet;

/* loaded from: classes2.dex */
class BrowserWebViewClient extends WebViewClient {
    private static final EnumSet<UrlAction> SUPPORTED_URL_ACTIONS = EnumSet.of(UrlAction.HANDLE_PHONE_SCHEME, UrlAction.OPEN_APP_MARKET, UrlAction.OPEN_IN_APP_BROWSER, UrlAction.HANDLE_SHARE_TWEET, UrlAction.FOLLOW_DEEP_LINK_WITH_FALLBACK, UrlAction.FOLLOW_DEEP_LINK);
    private MoPubBrowser mMoPubBrowser;

    public BrowserWebViewClient(MoPubBrowser moPubBrowser) {
        this.mMoPubBrowser = moPubBrowser;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        MoPubLog.d("MoPubBrowser error: " + str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new UrlHandler.Builder().withSupportedUrlActions(SUPPORTED_URL_ACTIONS).withoutMoPubBrowser().withResultActions(new UrlHandler.ResultActions() { // from class: com.mopub.common.BrowserWebViewClient.1
            @Override // com.mopub.common.UrlHandler.ResultActions
            public void urlHandlingFailed(String str2, UrlAction urlAction) {
            }

            @Override // com.mopub.common.UrlHandler.ResultActions
            public void urlHandlingSucceeded(String str2, UrlAction urlAction) {
                if (urlAction.equals(UrlAction.OPEN_IN_APP_BROWSER)) {
                    BrowserWebViewClient.this.mMoPubBrowser.getWebView().loadUrl(str2);
                } else {
                    BrowserWebViewClient.this.mMoPubBrowser.finish();
                }
            }
        }).build().handleResolvedUrl(this.mMoPubBrowser.getApplicationContext(), str, true, null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Drawable createDrawable;
        Drawable createDrawable2;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            createDrawable = Drawables.LEFT_ARROW.createDrawable(this.mMoPubBrowser);
        } else {
            createDrawable = Drawables.UNLEFT_ARROW.createDrawable(this.mMoPubBrowser);
        }
        this.mMoPubBrowser.getBackButton().setImageDrawable(createDrawable);
        if (webView.canGoForward()) {
            createDrawable2 = Drawables.RIGHT_ARROW.createDrawable(this.mMoPubBrowser);
        } else {
            createDrawable2 = Drawables.UNRIGHT_ARROW.createDrawable(this.mMoPubBrowser);
        }
        this.mMoPubBrowser.getForwardButton().setImageDrawable(createDrawable2);
    }
}
