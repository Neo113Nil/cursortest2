package com.aiming.mdt.adt.interstitial;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.widget.RelativeLayout;
import com.aiming.mdt.a.C0033;
import com.aiming.mdt.a.C0042;
import com.aiming.mdt.a.C0128;
import com.aiming.mdt.adt.ActivityC0232;
import com.aiming.mdt.utils.webview.AdJSInterface;
import com.aiming.mdt.utils.webview.InterfaceC0267;
import com.aiming.mdt.utils.webview.ViewOnAttachStateChangeListenerC0269;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes.dex */
public class InterstitialActivity extends ActivityC0232 implements InterfaceC0267 {
    private static final String JS_WEBVIEW_PAUSE = "javascript:webview_pause();";
    private static final String JS_WEBVIEW_RESUME = "javascript:webview_resume()";
    private boolean isBackEnable = true;
    private C0033 mDrawCrossMarkView;
    private AdJSInterface mJsInterface;
    private InterfaceC0216 mListener;

    private void updateCloseBtnStatus() {
        RunnableC0215 runnableC0215 = new RunnableC0215(this);
        if (this.mLytAd != null) {
            this.mLytAd.postDelayed(runnableC0215, 3000L);
        }
    }

    @Override // com.aiming.mdt.adt.ActivityC0232
    protected void callbackWhenClose() {
        super.callbackWhenClose();
        if (this.mListener != null) {
            this.mListener.onAdClose();
        }
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void click() {
        C0128.m478(this, this.mAdBean);
        C0042.m99(this, this.mPlacementId, this.mAdBean);
        callbackAdClickOnUIThread();
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void close() {
        callbackAdCloseOnUIThread();
        finish();
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void hideClose() {
        this.isBackEnable = false;
        updateCloseBtnStatus();
    }

    @Override // com.aiming.mdt.adt.ActivityC0232
    protected void initViewAndLoad(String str) {
        super.initViewAndLoad(str);
        if (this.mJsInterface == null) {
            this.mJsInterface = new AdJSInterface(this.mPlacementId, this.mAdBean.getOriData(), this);
        }
        ViewOnAttachStateChangeListenerC0269.m920();
        ViewOnAttachStateChangeListenerC0269.m921(this.mAdView, this.mJsInterface, TapjoyConstants.TJC_SDK_PLACEMENT);
        this.mDrawCrossMarkView = new C0033(this, -7829368);
        this.mLytAd.addView(this.mDrawCrossMarkView);
        this.mDrawCrossMarkView.setOnClickListener(new ViewOnClickListenerC0219(this));
        this.mDrawCrossMarkView.setVisibility(8);
        updateCloseBtnStatus();
        int i = (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 20.0f) + 0.5f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(30, 30, 30, 30);
        this.mDrawCrossMarkView.setLayoutParams(layoutParams);
        this.mAdView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.mAdView.loadUrl(str);
        C0128.m477(this, this.mPlacementId, this.mAdBean, false);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.isBackEnable) {
            callbackAdCloseOnUIThread();
            super.onBackPressed();
        }
    }

    @Override // com.aiming.mdt.adt.ActivityC0232, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mAdListener.get() != null) {
            this.mListener = (InterfaceC0216) this.mAdListener.get();
            this.mListener.onAdShowed();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.mLytAd != null) {
            this.mLytAd.removeAllViews();
        }
        if (this.mJsInterface != null) {
            this.mJsInterface.onDestroy();
            this.mJsInterface = null;
        }
        if (this.mAdView != null) {
            this.mAdView.stopLoading();
            ViewOnAttachStateChangeListenerC0269.m920();
            ViewOnAttachStateChangeListenerC0269.m919(this.mAdView, TapjoyConstants.TJC_SDK_PLACEMENT);
        }
        this.mAdBean = null;
        this.mListener = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.mAdView != null) {
            this.mAdView.loadUrl(JS_WEBVIEW_PAUSE);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.mAdView != null) {
            this.mAdView.loadUrl(JS_WEBVIEW_RESUME);
        }
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void showClose() {
        this.isBackEnable = true;
        updateCloseBtnStatus();
    }
}
