package com.mopub.mobileads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.AdReport;
import com.mopub.common.Constants;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.ViewGestureDetector;
import com.mopub.network.Networking;

/* loaded from: classes2.dex */
public class BaseHtmlWebView extends BaseWebView implements ViewGestureDetector.UserClickListener {
    private boolean mClicked;
    private final ViewGestureDetector mViewGestureDetector;

    public BaseHtmlWebView(Context context, AdReport adReport) {
        super(context);
        disableScrollingAndZoom();
        getSettings().setJavaScriptEnabled(true);
        this.mViewGestureDetector = new ViewGestureDetector(context, this, adReport);
        this.mViewGestureDetector.setUserClickListener(this);
        enablePlugins(true);
        setBackgroundColor(0);
    }

    public void init(boolean z) {
        initializeOnTouchListener(z);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (str == null) {
            return;
        }
        if (str.startsWith("javascript:")) {
            super.loadUrl(str);
            return;
        }
        MoPubLog.d("Loading url: " + str);
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.mIsDestroyed) {
            MoPubLog.w(BaseHtmlWebView.class.getSimpleName() + "#stopLoading() called after destroy()");
            return;
        }
        WebSettings settings = getSettings();
        if (settings == null) {
            MoPubLog.w(BaseHtmlWebView.class.getSimpleName() + "#getSettings() returned null");
            return;
        }
        settings.setJavaScriptEnabled(false);
        super.stopLoading();
        settings.setJavaScriptEnabled(true);
    }

    private void disableScrollingAndZoom() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
    }

    void loadHtmlResponse(String str) {
        loadDataWithBaseURL(Networking.getBaseUrlScheme() + "://" + Constants.HOST + "/", str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
    }

    void initializeOnTouchListener(final boolean z) {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.mopub.mobileads.BaseHtmlWebView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BaseHtmlWebView.this.mViewGestureDetector.sendTouchEvent(motionEvent);
                return motionEvent.getAction() == 2 && !z;
            }
        });
    }

    @Override // com.mopub.mobileads.ViewGestureDetector.UserClickListener
    public void onUserClick() {
        this.mClicked = true;
    }

    @Override // com.mopub.mobileads.ViewGestureDetector.UserClickListener
    public void onResetUserClick() {
        this.mClicked = false;
    }

    @Override // com.mopub.mobileads.ViewGestureDetector.UserClickListener
    public boolean wasClicked() {
        return this.mClicked;
    }
}
