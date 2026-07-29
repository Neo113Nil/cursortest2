package com.mopub.common.privacy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.CloseableLayout;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.exceptions.IntentNotResolvableException;

/* loaded from: classes2.dex */
class ConsentDialogLayout extends CloseableLayout {
    static int FINISHED_LOADING = 101;
    static final String URL_CLOSE = "mopub://close";
    static final String URL_CONSENT_NO = "mopub://consent?no";
    static final String URL_CONSENT_YES = "mopub://consent?yes";
    private ConsentListener mConsentListener;
    private PageLoadListener mLoadListener;
    private final WebView mWebView;
    private final WebViewClient webViewClient;

    interface ConsentListener {
        void onCloseClick();

        void onConsentClick(ConsentStatus consentStatus);
    }

    interface PageLoadListener {
        void onLoadProgress(int i);
    }

    public ConsentDialogLayout(Context context) {
        super(context);
        this.webViewClient = new WebViewClient() { // from class: com.mopub.common.privacy.ConsentDialogLayout.2
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (ConsentDialogLayout.this.mLoadListener != null) {
                    ConsentDialogLayout.this.mLoadListener.onLoadProgress(0);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (ConsentDialogLayout.this.mLoadListener != null) {
                    ConsentDialogLayout.this.mLoadListener.onLoadProgress(ConsentDialogLayout.FINISHED_LOADING);
                }
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (ConsentDialogLayout.URL_CONSENT_YES.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onConsentClick(ConsentStatus.EXPLICIT_YES);
                    }
                    return true;
                }
                if (ConsentDialogLayout.URL_CONSENT_NO.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onConsentClick(ConsentStatus.EXPLICIT_NO);
                    }
                    return true;
                }
                if (ConsentDialogLayout.URL_CLOSE.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onCloseClick();
                    }
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Intents.launchActionViewIntent(ConsentDialogLayout.this.getContext(), Uri.parse(str), "Cannot open native browser for " + str);
                        return true;
                    } catch (IntentNotResolvableException e) {
                        MoPubLog.e(e.getMessage());
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        };
        this.mWebView = initWebView();
    }

    public ConsentDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.webViewClient = new WebViewClient() { // from class: com.mopub.common.privacy.ConsentDialogLayout.2
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (ConsentDialogLayout.this.mLoadListener != null) {
                    ConsentDialogLayout.this.mLoadListener.onLoadProgress(0);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (ConsentDialogLayout.this.mLoadListener != null) {
                    ConsentDialogLayout.this.mLoadListener.onLoadProgress(ConsentDialogLayout.FINISHED_LOADING);
                }
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (ConsentDialogLayout.URL_CONSENT_YES.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onConsentClick(ConsentStatus.EXPLICIT_YES);
                    }
                    return true;
                }
                if (ConsentDialogLayout.URL_CONSENT_NO.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onConsentClick(ConsentStatus.EXPLICIT_NO);
                    }
                    return true;
                }
                if (ConsentDialogLayout.URL_CLOSE.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onCloseClick();
                    }
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Intents.launchActionViewIntent(ConsentDialogLayout.this.getContext(), Uri.parse(str), "Cannot open native browser for " + str);
                        return true;
                    } catch (IntentNotResolvableException e) {
                        MoPubLog.e(e.getMessage());
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        };
        this.mWebView = initWebView();
    }

    public ConsentDialogLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.webViewClient = new WebViewClient() { // from class: com.mopub.common.privacy.ConsentDialogLayout.2
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (ConsentDialogLayout.this.mLoadListener != null) {
                    ConsentDialogLayout.this.mLoadListener.onLoadProgress(0);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (ConsentDialogLayout.this.mLoadListener != null) {
                    ConsentDialogLayout.this.mLoadListener.onLoadProgress(ConsentDialogLayout.FINISHED_LOADING);
                }
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (ConsentDialogLayout.URL_CONSENT_YES.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onConsentClick(ConsentStatus.EXPLICIT_YES);
                    }
                    return true;
                }
                if (ConsentDialogLayout.URL_CONSENT_NO.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onConsentClick(ConsentStatus.EXPLICIT_NO);
                    }
                    return true;
                }
                if (ConsentDialogLayout.URL_CLOSE.equals(str)) {
                    if (ConsentDialogLayout.this.mConsentListener != null) {
                        ConsentDialogLayout.this.mConsentListener.onCloseClick();
                    }
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Intents.launchActionViewIntent(ConsentDialogLayout.this.getContext(), Uri.parse(str), "Cannot open native browser for " + str);
                        return true;
                    } catch (IntentNotResolvableException e) {
                        MoPubLog.e(e.getMessage());
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        };
        this.mWebView = initWebView();
    }

    void startLoading(String str, PageLoadListener pageLoadListener) {
        Preconditions.checkNotNull(str);
        this.mLoadListener = pageLoadListener;
        setupEventsListeners(this.mWebView);
        this.mWebView.loadDataWithBaseURL("https://ads.mopub.com/", str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
    }

    void setConsentClickListener(ConsentListener consentListener) {
        Preconditions.checkNotNull(consentListener);
        this.mConsentListener = consentListener;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private WebView initWebView() {
        WebView webView = new WebView(getContext());
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        WebSettings settings = webView.getSettings();
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            webView.setId(View.generateViewId());
        }
        setCloseVisible(false);
        addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return webView;
    }

    private void setupEventsListeners(WebView webView) {
        webView.setWebViewClient(this.webViewClient);
        setOnCloseListener(new CloseableLayout.OnCloseListener() { // from class: com.mopub.common.privacy.ConsentDialogLayout.1
            @Override // com.mopub.common.CloseableLayout.OnCloseListener
            public void onClose() {
                if (ConsentDialogLayout.this.mConsentListener != null) {
                    ConsentDialogLayout.this.mConsentListener.onCloseClick();
                }
            }
        });
    }
}
