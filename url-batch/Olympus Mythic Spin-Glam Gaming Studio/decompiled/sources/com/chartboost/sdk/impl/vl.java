package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class vl extends k2 {
    public static final b i = new b(null);
    public final String f;
    public final WebView g;
    public boolean h;

    public static final class a extends WebViewClient {
        public final /* synthetic */ Function0 b;

        public a(Function0 function0) {
            this.b = function0;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.c, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.c, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.c, view, errorCode, description, failingUrl);
        }

        public boolean safedk_vl$a_shouldOverrideUrlLoading_eb72d6a9ee5a7dd7e601801f8260a8be(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            if (vl.this.getGestureDetected$ChartboostMonetization_9_12_1_productionRelease()) {
                vl.this.setGestureDetected$ChartboostMonetization_9_12_1_productionRelease(false);
                Function0 function0 = this.b;
                if (function0 != null) {
                    function0.mo4828invoke();
                }
                return true;
            }
            xb.e("Persistent CTA WebView navigation suppressed: no user gesture. url=" + url, null, 2, null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.c, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/vl$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_vl$a_shouldOverrideUrlLoading_eb72d6a9ee5a7dd7e601801f8260a8be = safedk_vl$a_shouldOverrideUrlLoading_eb72d6a9ee5a7dd7e601801f8260a8be(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.c, webView, str, safedk_vl$a_shouldOverrideUrlLoading_eb72d6a9ee5a7dd7e601801f8260a8be);
            return safedk_vl$a_shouldOverrideUrlLoading_eb72d6a9ee5a7dd7e601801f8260a8be;
        }
    }

    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            vl.this.setGestureDetected$ChartboostMonetization_9_12_1_productionRelease(true);
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(Context context, AttributeSet attributeSet, int i2, String persistentCtaContentDescription, final Function0 function0) {
        super(context, attributeSet, i2, function0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(persistentCtaContentDescription, "persistentCtaContentDescription");
        this.f = persistentCtaContentDescription;
        GestureDetector gestureDetector = new GestureDetector(context, new c());
        WebView webView = new WebView(context);
        webView.setId(View.generateViewId());
        webView.setLayoutParams(new ConstraintLayout.LayoutParams(a(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE), a(60)));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        a(webView, gestureDetector);
        webView.setWebViewClient(new a(function0));
        webView.setFocusable(true);
        webView.setClickable(true);
        webView.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.vl$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vl.a(vl.this, function0, view);
            }
        });
        this.g = webView;
        setContentDescription(persistentCtaContentDescription);
        addView(webView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(webView.getId(), 1, 0, 1);
        constraintSet.connect(webView.getId(), 2, 0, 2);
        constraintSet.connect(webView.getId(), 3, 0, 3);
        constraintSet.connect(webView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
    }

    @VisibleForTesting
    public static /* synthetic */ void getGestureDetected$ChartboostMonetization_9_12_1_productionRelease$annotations() {
    }

    @Override // com.chartboost.sdk.impl.k2
    public void a(t5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String b2 = config.b();
        if (b2 != null) {
            ChartboostNetworkBridge.webviewLoadDataWithBaseURL(this.g, null, b2, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        }
    }

    @Override // com.chartboost.sdk.impl.k2, com.chartboost.sdk.impl.b1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.k2, com.chartboost.sdk.impl.b1, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setContentUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ChartboostNetworkBridge.webviewLoadUrl(this.g, url);
    }

    @VisibleForTesting
    @NotNull
    public final WebView getWebView() {
        return this.g;
    }

    public final boolean getGestureDetected$ChartboostMonetization_9_12_1_productionRelease() {
        return this.h;
    }

    public final void setGestureDetected$ChartboostMonetization_9_12_1_productionRelease(boolean z) {
        this.h = z;
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ vl(Context context, AttributeSet attributeSet, int i2, String str, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r3, r4, str, (i3 & 16) != 0 ? null : function0);
        AttributeSet attributeSet2 = (i3 & 2) != 0 ? null : attributeSet;
        int i4 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            str = context.getString(R.string.persistent_cta_description, "Advertisement");
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
    }

    public final void a(WebView webView, final GestureDetector gestureDetector) {
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.chartboost.sdk.impl.vl$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return vl.a(gestureDetector, view, motionEvent);
            }
        });
    }

    public static final boolean a(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(gestureDetector, "$gestureDetector");
        gestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    public static final void a(vl this$0, Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h = false;
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }

    @Override // com.chartboost.sdk.impl.k2
    public void a(il tracker, gl purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.g, purpose);
    }
}
