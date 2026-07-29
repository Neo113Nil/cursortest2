package com.aiming.mdt.adt.interactive;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.aiming.mdt.a.C0035;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0128;
import com.aiming.mdt.a.C0139;
import com.aiming.mdt.a.InterfaceC0180;
import com.aiming.mdt.adt.ActivityC0232;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.adt.interactive.C0210;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.Constants;
import com.aiming.mdt.utils.webview.AdJSInterface;
import com.aiming.mdt.utils.webview.C0265;
import com.aiming.mdt.utils.webview.InterfaceC0268;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public class InteractiveActivity extends ActivityC0232 implements InterfaceC0180, InterfaceC0268 {
    private static final String JS_ACTIVITY_PAUSED = "javascript:nve.onclose()";
    private static final String JS_ACTIVITY_SHOWED = "javascript:nve.onshow()";
    private static final String JS_VIDEO_ENDED = "javascript:nve.onended()";
    private static final String JS_VIDEO_PLAYING = "javascript:nve.onplaying()";
    private static final String JS_VIDEO_READY = "javascript:nve.onplay()";
    private boolean isBackPressed;
    private boolean isVideoReady;
    private AdJSInterface mJsInterface;
    private InterfaceC0212 mListener;
    private RelativeLayout titleRLayout;

    /* renamed from: com.aiming.mdt.adt.interactive.InteractiveActivity$ʼ, reason: contains not printable characters */
    class C0201 extends ActivityC0232.C0233 {
        private C0201() {
            super();
        }

        /* synthetic */ C0201(InteractiveActivity interactiveActivity, byte b2) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            if (webView == null || InteractiveActivity.this.isFinishing() || TextUtils.isEmpty(webView.getTitle())) {
                C0282.m971("InteractiveAd-title is null");
                return;
            }
            if (InteractiveActivity.this.isBackPressed && TextUtils.equals(webView.getTitle(), "about:blank")) {
                StringBuilder sb = new StringBuilder("InteractiveAd");
                sb.append(webView.getTitle());
                C0282.m971(sb.toString());
                InteractiveActivity.this.adClose();
                return;
            }
            InteractiveActivity.this.updateTitle(webView.getTitle());
            StringBuilder sb2 = new StringBuilder("InteractiveAd-title:");
            sb2.append(webView.getTitle());
            C0282.m971(sb2.toString());
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                File m530 = C0139.m530(webView.getContext(), str, Constants.FILE_HEADER_SUFFIX);
                if (m530.exists()) {
                    String m534 = C0139.m534(m530, Constants.KEY_LOCATION);
                    if (!TextUtils.isEmpty(m534)) {
                        StringBuilder sb = new StringBuilder("Interactive onPageStarted redirect url : ");
                        sb.append(m534);
                        C0282.m971(sb.toString());
                        URL url = new URL(m534);
                        webView.stopLoading();
                        webView.loadUrl(url.toString());
                        return;
                    }
                }
                super.onPageStarted(webView, str, bitmap);
            } catch (Exception e) {
                super.onPageStarted(webView, str, bitmap);
                C0282.m972("Interactive onPageStarted", e);
                C0076.m232().m236(e);
            }
        }

        @Override // com.aiming.mdt.adt.ActivityC0232.C0233, android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intent intent;
            InteractiveActivity interactiveActivity;
            InteractiveActivity interactiveActivity2;
            try {
                StringBuilder sb = new StringBuilder("shouldOverrideUrlLoading:");
                sb.append(str);
                C0282.m971(sb.toString());
                if (C0226.m825(str)) {
                    C0226.m824(InteractiveActivity.this.getApplicationContext(), str);
                    interactiveActivity2 = InteractiveActivity.this;
                } else {
                    if (str.startsWith(com.mopub.common.Constants.HTTP)) {
                        webView.loadUrl(str);
                        return true;
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        intent = Intent.parseUri(str, 2);
                        intent.setFlags(268435456);
                        interactiveActivity = InteractiveActivity.this;
                    } else {
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(268435456);
                        intent.setData(Uri.parse(str));
                        interactiveActivity = InteractiveActivity.this;
                    }
                    interactiveActivity.startActivity(intent);
                    interactiveActivity2 = InteractiveActivity.this;
                }
                interactiveActivity2.finish();
                return true;
            } catch (Exception e) {
                C0282.m972("shouldOverrideUrlLoading error", e);
                C0076.m232().m236(e);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adClose() {
        callbackAdCloseOnUIThread();
        finish();
    }

    private void initTitleView() {
        if (this.titleRLayout != null) {
            return;
        }
        this.titleRLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f) + 0.5f));
        layoutParams.addRule(10);
        this.titleRLayout.setLayoutParams(layoutParams);
        this.titleRLayout.setBackgroundColor(-1);
        this.mLytAd.addView(this.titleRLayout);
        C0210 c0210 = new C0210(this);
        c0210.setId(C0210.m809());
        c0210.m810(C0210.EnumC0211.f718);
        this.titleRLayout.addView(c0210);
        c0210.setOnClickListener(new ViewOnClickListenerC0205(this));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 36.0f) + 0.5f), (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 36.0f) + 0.5f));
        layoutParams2.addRule(9);
        layoutParams2.addRule(13);
        c0210.setLayoutParams(layoutParams2);
        TextView textView = new TextView(this);
        textView.setTag("interactive_title");
        this.titleRLayout.addView(textView);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        textView.setLayoutParams(layoutParams3);
        textView.setMaxEms(12);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        this.titleRLayout.bringToFront();
    }

    private void setUpJsInterface() {
        if (this.mJsInterface != null) {
            return;
        }
        this.mJsInterface = new AdJSInterface(this.mPlacementId, this.mAdBean.getOriData(), this);
        ViewOnAttachStateChangeListenerC0206.m800().m804(this.mJsInterface, TapjoyConstants.TJC_SDK_PLACEMENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTitle(String str) {
        C0285.m979(new RunnableC0203(this, str));
    }

    @Override // com.aiming.mdt.adt.ActivityC0232
    protected void callbackWhenClose() {
        super.callbackWhenClose();
        if (this.mListener != null) {
            this.mListener.onAdClose();
        }
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    @JavascriptInterface
    public void click() {
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    @JavascriptInterface
    public void close() {
        C0282.m971("js close");
        adClose();
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    @JavascriptInterface
    public void hideClose() {
    }

    @Override // com.aiming.mdt.adt.ActivityC0232
    protected void initViewAndLoad(String str) {
        initTitleView();
        this.mAdView = ViewOnAttachStateChangeListenerC0206.m800().m806();
        if (this.mAdView.getParent() != null) {
            ((ViewGroup) this.mAdView.getParent()).removeView(this.mAdView);
        }
        if (Build.VERSION.SDK_INT >= 19 && (getApplicationInfo().flags & 2) != 0) {
            C0265.setWebContentsDebuggingEnabled(true);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f) + 0.5f);
        this.mLytAd.addView(this.mAdView, layoutParams);
        this.mAdView.getSettings().setUseWideViewPort(false);
        this.mAdView.setWebViewClient(new C0201(this, (byte) 0));
        this.mAdView.setWebChromeClient(new C0208(this));
        setUpJsInterface();
        this.mAdView.loadUrl(str);
        StringBuilder sb = new StringBuilder("imp url : ");
        sb.append(str);
        C0282.m971(sb.toString());
        C0128.m477(C0226.m829(), this.mPlacementId, this.mAdBean, true);
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0268
    @JavascriptInterface
    public boolean isVideoReady() {
        C0282.m971("js isVideoReady");
        C0035.m54().m58();
        return this.isVideoReady;
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0268
    public void loadVideo() {
        C0282.m971("js loadVideo");
        C0035.m54().m58();
        if (isFinishing() || this.isVideoReady) {
            return;
        }
        C0035.m54().m60();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (this.mAdView == null || !this.mAdView.canGoBack()) {
                callbackAdCloseOnUIThread();
                super.onBackPressed();
            } else {
                this.mAdView.goBack();
                this.isBackPressed = true;
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
        }
    }

    @Override // com.aiming.mdt.adt.ActivityC0232, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.mLytAd.setBackgroundColor(-1);
            if (this.mAdListener.get() != null) {
                this.mListener = (InterfaceC0212) this.mAdListener.get();
            }
            if (this.mListener != null) {
                this.mListener.onAdShowed();
            }
            C0035.m54().m56(this);
            C0035.m54().m60();
        } catch (Exception e) {
            callbackAdCloseOnUIThread();
            C0282.m972("InteractiveActivity", e);
            C0076.m232().m236(e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C0282.m971("interactive onDestroy");
        if (this.mLytAd != null) {
            this.mLytAd.removeAllViews();
            this.mLytAd = null;
        }
        if (this.titleRLayout != null) {
            this.titleRLayout.removeAllViews();
            this.titleRLayout = null;
        }
        if (this.mJsInterface != null) {
            this.mJsInterface.onDestroy();
            this.mJsInterface = null;
        }
        if (this.mAdView != null) {
            ViewOnAttachStateChangeListenerC0206.m800().m807(TapjoyConstants.TJC_SDK_PLACEMENT);
        }
        C0035.m54().m63();
        this.mListener = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        ViewOnAttachStateChangeListenerC0206.m800().m805(JS_ACTIVITY_PAUSED);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        C0035.m54().m58();
        ViewOnAttachStateChangeListenerC0206.m800().m805(JS_ACTIVITY_SHOWED);
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0268
    @JavascriptInterface
    public boolean playVideo() {
        C0282.m971("js playVideo");
        C0035.m54().m64();
        return true;
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    @JavascriptInterface
    public void showClose() {
    }

    @Override // com.aiming.mdt.a.InterfaceC0180
    public void videoClose() {
        C0282.m971("Video is close");
        this.isVideoReady = false;
        ViewOnAttachStateChangeListenerC0206.m800().m805(JS_VIDEO_ENDED);
    }

    @Override // com.aiming.mdt.a.InterfaceC0180
    public void videoReady() {
        C0282.m971("video is ready");
        this.isVideoReady = true;
        ViewOnAttachStateChangeListenerC0206.m800().m805(JS_VIDEO_READY);
    }

    @Override // com.aiming.mdt.a.InterfaceC0180
    public void videoShow() {
        C0282.m971("show video");
        ViewOnAttachStateChangeListenerC0206.m800().m805(JS_VIDEO_PLAYING);
    }
}
