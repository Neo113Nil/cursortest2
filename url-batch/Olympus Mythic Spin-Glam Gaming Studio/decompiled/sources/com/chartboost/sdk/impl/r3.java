package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class r3 extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private void safedk_webview_r3_webviewSetWebChromeClient_125764fdd2f003b0a7114b2bd8a34776(WebChromeClient p1) {
        Logger.d("ChartboostNetwork|SafeDK: Partial-Network> Lcom/chartboost/sdk/impl/r3;->safedk_webview_r3_webviewSetWebChromeClient_125764fdd2f003b0a7114b2bd8a34776(Landroid/webkit/WebChromeClient;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewSetWebChromeClient invoked, WebView address : ", this, ", WebChromeClient = ", p1, ", SDK_PACKAGE_NAME = ", com.safedk.android.utils.h.c);
            if (z) {
                BrandSafetyUtils.a(com.safedk.android.utils.h.c, this, p1);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewSetWebChromeClient exception", th);
        }
        super.setWebChromeClient(p1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView
    @SuppressLint({"SetJavaScriptEnabled"})
    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        safedk_webview_r3_webviewSetWebChromeClient_125764fdd2f003b0a7114b2bd8a34776(webChromeClient);
        a();
    }

    public final void a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
    }
}
