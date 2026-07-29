package com.aiming.mdt.adt;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.aiming.mdt.a.C0033;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.ViewOnAttachStateChangeListenerC0159;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.webview.AdJSInterface;
import com.aiming.mdt.utils.webview.C0265;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.Constants;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes.dex */
public class AdtActivity extends Activity {
    private C0265 mAdView;
    private AdJSInterface mJsInterface;
    private RelativeLayout mLytWeb;

    /* renamed from: com.aiming.mdt.adt.AdtActivity$ʼ, reason: contains not printable characters */
    class C0198 extends WebViewClient {
        private C0198() {
        }

        /* synthetic */ C0198(AdtActivity adtActivity, byte b2) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intent intent;
            AdtActivity adtActivity;
            AdtActivity adtActivity2;
            try {
                StringBuilder sb = new StringBuilder("shouldOverrideUrlLoading:");
                sb.append(str);
                C0282.m971(sb.toString());
                if (C0226.m825(str)) {
                    C0226.m824(webView.getContext(), str);
                    adtActivity2 = AdtActivity.this;
                } else {
                    if (str.startsWith(Constants.HTTP)) {
                        webView.loadUrl(str);
                        return true;
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        intent = Intent.parseUri(str, 2);
                        intent.setFlags(268435456);
                        adtActivity = AdtActivity.this;
                    } else {
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(268435456);
                        intent.setData(Uri.parse(str));
                        adtActivity = AdtActivity.this;
                    }
                    adtActivity.startActivity(intent);
                    adtActivity2 = AdtActivity.this;
                }
                adtActivity2.finish();
                return true;
            } catch (Exception e) {
                C0282.m972("shouldOverrideUrlLoading error", e);
                return true;
            }
        }
    }

    private void initAndLoad(String str, AdBean adBean) {
        if (TextUtils.isEmpty(adBean.getAdUrl())) {
            finish();
            return;
        }
        this.mAdView = ViewOnAttachStateChangeListenerC0159.m599().m604();
        if (this.mJsInterface == null) {
            this.mJsInterface = new AdJSInterface(str, adBean.getOriData(), null);
        }
        ViewOnAttachStateChangeListenerC0159.m599();
        ViewOnAttachStateChangeListenerC0159.m601(this.mAdView, this.mJsInterface, TapjoyConstants.TJC_SDK_PLACEMENT);
        if (this.mAdView.getParent() != null) {
            ((ViewGroup) this.mAdView.getParent()).removeView(this.mAdView);
        }
        this.mAdView.setWebViewClient(new C0198(this, (byte) 0));
        this.mLytWeb.addView(this.mAdView);
        this.mAdView.getLayoutParams().width = -1;
        this.mAdView.getLayoutParams().height = -1;
        if (adBean.isWebview()) {
            this.mAdView.setVisibility(0);
            C0033 c0033 = new C0033(this, -7829368);
            this.mLytWeb.addView(c0033);
            c0033.setOnClickListener(new ViewOnClickListenerC0236(this));
            int i = (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 20.0f) + 0.5f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(30, 30, 30, 30);
            c0033.setLayoutParams(layoutParams);
        } else {
            this.mAdView.setVisibility(8);
            ProgressBar progressBar = new ProgressBar(this);
            this.mLytWeb.addView(progressBar);
            int i2 = (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 40.0f) + 0.5f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
            layoutParams2.addRule(13);
            progressBar.setLayoutParams(layoutParams2);
            sendTimeoutMsg();
        }
        this.mAdView.loadUrl(adBean.getAdUrl());
    }

    private void sendTimeoutMsg() {
        new C0285.HandlerC0287(null).postDelayed(new RunnableC0240(this), 8000L);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.mLytWeb = new RelativeLayout(this);
            setContentView(this.mLytWeb);
            String stringExtra = getIntent().getStringExtra(AudienceNetworkActivity.PLACEMENT_ID);
            if (getIntent().getExtras() != null) {
                getIntent().getExtras().setClassLoader(AdBean.class.getClassLoader());
            }
            initAndLoad(stringExtra, (AdBean) getIntent().getParcelableExtra("ad"));
        } catch (Throwable th) {
            C0282.m972("AdtActivity", th);
            C0076.m232().m236(th);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.mLytWeb != null) {
            this.mLytWeb.removeAllViews();
        }
        if (this.mJsInterface != null) {
            this.mJsInterface.onDestroy();
            this.mJsInterface = null;
        }
        ViewOnAttachStateChangeListenerC0159.m599();
        ViewOnAttachStateChangeListenerC0159.m603(this.mAdView, TapjoyConstants.TJC_SDK_PLACEMENT);
        super.onDestroy();
    }
}
