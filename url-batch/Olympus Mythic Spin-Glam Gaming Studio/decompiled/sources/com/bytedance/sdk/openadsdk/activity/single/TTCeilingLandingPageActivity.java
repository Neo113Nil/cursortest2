package com.bytedance.sdk.openadsdk.activity.single;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.kw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.yandex.div.internal.widget.DivLayoutParams;

/* loaded from: classes3.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {
    private String btk;
    private com.bytedance.sdk.openadsdk.common.btk bvs;
    private String fb;
    private nqi fs;
    private int hhw;
    private com.bytedance.sdk.component.bvs.nps iv;
    private String nps;
    private mw zg;
    zmn zmn;
    private fkt zn;

    public interface zmn {
        void zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!cn.btk()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.hhw = intent.getIntExtra("source", -1);
        nqi zmn2 = am.zmn().zmn(am.zmn(intent));
        this.fs = zmn2;
        if (zmn2 == null) {
            finish();
            return;
        }
        this.nps = zmn2.rc();
        this.fb = this.fs.ji();
        this.btk = this.fs.ze();
        this.hhw = this.fs.utx().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        if (Build.VERSION.SDK_INT >= 35) {
            znVar.setFitsSystemWindows(true);
        }
        zmn(this, znVar);
        setContentView(znVar);
        zmn();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zmn(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar;
        this.iv = new com.bytedance.sdk.component.bvs.nps(context, nps.zn.LANDING_PAGE);
        frameLayout.addView(this.iv, new FrameLayout.LayoutParams(-1, -1));
        View fs = com.bytedance.sdk.openadsdk.core.widget.hhw.fs(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = jy.fs(context, 18.0f);
        layoutParams.rightMargin = jy.fs(context, 18.0f);
        frameLayout.addView(fs, layoutParams);
        final int nps = this.fs.rp().nps();
        if (nps != 3) {
            fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(jy.fs(context, 28.0f), jy.fs(context, 28.0f));
            layoutParams2.gravity = DivLayoutParams.DEFAULT_GRAVITY;
            layoutParams2.topMargin = jy.fs(context, 18.0f);
            layoutParams2.leftMargin = jy.fs(context, 18.0f);
            int fs2 = jy.fs(context, 5.0f);
            fbVar.setPadding(fs2, fs2, fs2, fs2);
            fbVar.setScaleType(ImageView.ScaleType.FIT_XY);
            fbVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
            fbVar.setImageDrawable(doe.zn(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(fbVar, layoutParams2);
        } else {
            fbVar = null;
        }
        com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.iv, this.nps);
        final WebView webView = this.iv.getWebView();
        fs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTCeilingLandingPageActivity$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_TTCeilingLandingPageActivity$1_onClick_28a26313c76514bb375e358c225eb14c(view);
            }

            public void safedk_TTCeilingLandingPageActivity$1_onClick_28a26313c76514bb375e358c225eb14c(View p0) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        mw mwVar = new mw(this.fs, webView, true);
        this.zg = mwVar;
        mwVar.zmn("landingpage_split_ceiling");
        final nps.zmn zmnVar = this.zg.zmn;
        if (fbVar != null) {
            fbVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTCeilingLandingPageActivity$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTCeilingLandingPageActivity$2_onClick_4ce466feade9ba703a5bda990481be66(view);
                }

                public void safedk_TTCeilingLandingPageActivity$2_onClick_4ce466feade9ba703a5bda990481be66(View p0) {
                    int i = nps;
                    if (i == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 != null && webView2.canGoBack()) {
                        webView.goBack();
                        nps.zmn zmnVar2 = zmnVar;
                        if (zmnVar2 != null) {
                            zmnVar2.zmn();
                            return;
                        }
                        return;
                    }
                    TTCeilingLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.btk zmn2 = oub.zmn(this.fs, this.iv, this, "landingpage_split_ceiling");
        this.bvs = zmn2;
        if (zmn2 != null) {
            zmn2.zmn("landingpage_split_ceiling");
            this.bvs.zmn();
        }
        oub.zmn(this.fs, this.iv, true);
        this.zmn = new zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.zmn
            public void zmn() {
                if (TTCeilingLandingPageActivity.this.fs.rp().zg() == kw.fs) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(this, this.zn, this.fb, this.bvs, this.zg, true, true, this.zmn) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                return shouldOverrideUrlLoading;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        hhwVar.zmn(this.fs);
        com.bytedance.sdk.openadsdk.core.widget.zmn.btk btkVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.zn, this.zg, this.bvs) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i) {
                super.onProgressChanged(webView2, i);
            }
        };
        com.bytedance.sdk.component.bvs.nps npsVar = this.iv;
        if (npsVar != null) {
            npsVar.setWebViewClient(hhwVar);
            this.iv.setWebChromeClient(btkVar);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTCeilingLandingPageActivity$6;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                    return safedk_TTCeilingLandingPageActivity$6_onTouch_9d00baf01927ffd84c82841b85b4652c(view, motionEvent);
                }

                public boolean safedk_TTCeilingLandingPageActivity$6_onTouch_9d00baf01927ffd84c82841b85b4652c(View p0, MotionEvent p1) {
                    if (TTCeilingLandingPageActivity.this.zg == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.zg.zmn(p1);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (TTCeilingLandingPageActivity.this.zg != null) {
                        TTCeilingLandingPageActivity.this.zg.fs(i2);
                    }
                }
            });
        }
    }

    private void zmn() {
        fkt fktVar = new fkt(this);
        this.zn = fktVar;
        fktVar.fs(this.iv).zn(this.fb).fb(this.btk).zmn(this.fs).fs(this.hhw).zmn(this.fs.mig()).btk(this.fs.gor()).zmn(this.iv).fs("landingpage_split_ceiling");
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        mw mwVar = this.zg;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.bvs.nps npsVar = this.iv;
        if (npsVar != null) {
            zak.zmn(npsVar);
        }
    }
}
