package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cn;
import com.bytedance.sdk.openadsdk.common.iv;
import com.bytedance.sdk.openadsdk.common.klz;
import com.bytedance.sdk.openadsdk.common.mw;
import com.bytedance.sdk.openadsdk.common.olo;
import com.bytedance.sdk.openadsdk.common.phc;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.utils.iqz;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.phc;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.bytedance.sdk.openadsdk.utils.rt;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {
    private TextView bvs;
    private String cn;
    private boolean cud;
    private fkt cyb;
    private mw dgt;
    private nps.zmn ev;
    olo fs;
    private com.bytedance.sdk.openadsdk.common.btk hgd;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn iqz;
    private Context iv;
    private ImageView jy;
    private String kgc;
    private int kjb;
    private Button klz;
    private com.bytedance.sdk.openadsdk.rt.zmn kra;
    private nqi kw;
    private com.bytedance.sdk.openadsdk.core.hhw.hhw mw;
    private com.bytedance.sdk.openadsdk.rt.fb na;
    private com.bytedance.sdk.component.bvs.nps nps;
    private String nqi;
    private com.bytedance.sdk.openadsdk.core.widget.zmn.hhw nu;
    private int olo;
    private String phc;
    private cn rc;
    private String rt;
    private rt so;
    private com.bytedance.sdk.openadsdk.rt.zmn.zmn uqd;
    private ILoader uqh;
    private ImageView vlj;
    private boolean ww;
    private klz yj;
    private ImageView yof;
    private int zak;
    private ImageView zg;
    com.bytedance.sdk.openadsdk.fb.mw zmn;
    TTAdDislikeToast zn;
    private final AtomicBoolean doe = new AtomicBoolean(true);
    private final AtomicInteger bjh = new AtomicInteger(0);
    private final AtomicInteger rp = new AtomicInteger(0);
    private final AtomicInteger am = new AtomicInteger(0);
    final AtomicBoolean fb = new AtomicBoolean(false);
    final AtomicBoolean btk = new AtomicBoolean(false);
    private boolean oub = false;
    private long gn = 0;
    int hhw = -1;
    private String mhu = "DOWNLOAD";

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.cn.btk()) {
            finish();
            return;
        }
        try {
            kgc.fs(this);
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nqi zmn2 = am.zmn().zmn(am.zmn(getIntent()));
        this.kw = zmn2;
        if (zmn2 != null) {
            this.ww = zmn2.rt();
            this.kw.lbc(0);
            if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false)) {
                phc.zmn(this.kw);
            }
        }
        if (bundle != null) {
            try {
                int i = bundle.getInt("meta_index", -1);
                this.hhw = i;
                if (i >= 0) {
                    this.kw = am.zmn().zmn(this.hhw);
                }
            } catch (Throwable unused2) {
            }
        }
        com.bytedance.sdk.openadsdk.rt.btk.zmn(this);
        this.phc = "";
        zmn(4);
        nqi nqiVar = this.kw;
        if (nqiVar != null) {
            this.rt = nqiVar.ji();
            this.cn = this.kw.ze();
            this.nqi = this.kw.ltf();
            this.phc = this.kw.rc();
            this.olo = this.kw.mw();
            this.kgc = this.kw.klz();
        }
        try {
            setContentView(zmn(this.phc));
            if (this.kw == null) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false)) {
                fs();
            }
            hhw();
            if (!TextUtils.isEmpty(this.nqi)) {
                this.uqh = com.bytedance.sdk.openadsdk.nps.fs.zmn().fs();
                int zmn3 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.uqh, this.nqi);
                this.kjb = zmn3;
                this.zak = zmn3 > 0 ? 2 : 0;
            }
            this.iv = this;
            if (this.nps != null) {
                com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(this).zmn(false).fs(false).zmn(this.nps.getWebView());
            }
            if (this.cud) {
                this.dgt.zmn(true);
            }
            com.bytedance.sdk.component.bvs.nps npsVar = this.nps;
            if (npsVar != null && npsVar.getWebView() != null) {
                com.bytedance.sdk.openadsdk.fb.mw fs2 = new com.bytedance.sdk.openadsdk.fb.mw(this.kw, this.nps.getWebView(), new zmn(this.kjb, this.kw, "landingpage", this), this.zak).fs(true);
                this.zmn = fs2;
                this.ev = fs2.zmn;
                this.hgd = oub.zmn(this.kw, this.nps, this.iv, this.kgc);
                this.zmn.btk(this.oub);
                this.na = new com.bytedance.sdk.openadsdk.rt.fb(this.zmn);
                this.kw.kw(this.oub);
            }
            nps();
            com.bytedance.sdk.component.bvs.nps npsVar2 = this.nps;
            if (npsVar2 != null) {
                npsVar2.setLandingPage(true);
                this.nps.setTag("landingpage");
                this.nps.setMaterialMeta(this.kw.xz());
            }
            com.bytedance.sdk.openadsdk.core.widget.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(this.iv, this.cyb, this.rt, this.hgd, this.zmn, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onLoadResource(WebView view, String url) {
                    super.onLoadResource(view, url);
                    CreativeInfoManager.onResourceLoaded(h.u, view, url);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$1;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                    BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
                    safedk_TTLandingPageActivity$1_onPageStarted_439657c226d2563aab96d8b4c302a9ec(webView, str, bitmap);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    super.onReceivedError(view, errorCode, description, failingUrl);
                    BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$1;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                    return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_TTLandingPageActivity$1_shouldInterceptRequest_21637abb657bb18d8a570e2600cb5d7a(webView, str));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                    BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                    return shouldOverrideUrlLoading;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.mw != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.mw.setVisibility(8);
                        }
                    } catch (Throwable unused3) {
                    }
                    if (TTLandingPageActivity.this.yj != null) {
                        TTLandingPageActivity.this.yj.fs();
                    }
                }

                public WebResourceResponse safedk_TTLandingPageActivity$1_shouldInterceptRequest_21637abb657bb18d8a570e2600cb5d7a(WebView p0, String p1) {
                    try {
                        if (!TextUtils.isEmpty(TTLandingPageActivity.this.nqi)) {
                            TTLandingPageActivity.this.bjh.incrementAndGet();
                            WebResourceResponseModel zmn4 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(TTLandingPageActivity.this.uqh, TTLandingPageActivity.this.nqi, p1);
                            if (zmn4 != null && zmn4.getWebResourceResponse() != null) {
                                TTLandingPageActivity.this.am.incrementAndGet();
                                return zmn4.getWebResourceResponse();
                            }
                            if (zmn4 != null && zmn4.getMsg() == 2) {
                                TTLandingPageActivity.this.rp.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(p0, p1);
                        }
                        return super.shouldInterceptRequest(p0, p1);
                    } catch (Throwable unused3) {
                        return super.shouldInterceptRequest(p0, p1);
                    }
                }

                public void safedk_TTLandingPageActivity$1_onPageStarted_439657c226d2563aab96d8b4c302a9ec(WebView p0, String p1, Bitmap p2) {
                    super.onPageStarted(p0, p1, p2);
                }
            };
            this.nu = hhwVar;
            hhwVar.zmn(this.kw);
            this.nu.zmn("landingpage");
            com.bytedance.sdk.openadsdk.rt.fb fbVar = this.na;
            if (fbVar != null) {
                this.nu.zmn(fbVar);
            }
            com.bytedance.sdk.component.bvs.nps npsVar3 = this.nps;
            if (npsVar3 != null) {
                npsVar3.setWebViewClient(this.nu);
                com.bytedance.sdk.component.bvs.nps npsVar4 = this.nps;
                if (npsVar4 != null) {
                    npsVar4.setUserAgentString(iqz.zmn(npsVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.bvs.nps npsVar5 = this.nps;
                if (npsVar5 != null) {
                    npsVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.kw, "landingpage", this.zak);
            if (this.nps != null) {
                if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false) && this.oub) {
                    com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn;
                    if (mwVar != null) {
                        mwVar.zn(this.phc);
                        this.zmn.fb(this.phc);
                        this.zmn.zmn(this.phc, 0L);
                    }
                    klz klzVar = this.yj;
                    if (klzVar != null) {
                        klzVar.fs();
                    }
                } else {
                    com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.nps, this.phc);
                }
                this.nps.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.cyb, this.zmn, this.hgd) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.12
                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.cud) {
                            TTLandingPageActivity.this.dgt.zmn(str);
                            TTLandingPageActivity.this.dgt.fs(webView.getUrl());
                            if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_iab_history", true)) {
                                try {
                                    if (TextUtils.isEmpty(str)) {
                                        str = TTLandingPageActivity.this.phc;
                                    }
                                    TTLandingPageActivity.this.uqd = new com.bytedance.sdk.openadsdk.rt.zmn.zmn();
                                    TTLandingPageActivity.this.uqd.fs(TTLandingPageActivity.this.kw.fb().fs());
                                    TTLandingPageActivity.this.uqd.zn(String.valueOf(System.currentTimeMillis()));
                                    TTLandingPageActivity.this.uqd.btk(webView.getUrl());
                                    TTLandingPageActivity.this.uqd.fs(TTLandingPageActivity.this.kw.il());
                                    TTLandingPageActivity.this.uqd.zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zn(TTLandingPageActivity.this.kw.iyj()));
                                    TTLandingPageActivity.this.uqd.fb(str);
                                    com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(TTLandingPageActivity.this.uqd);
                                    return;
                                } catch (Exception unused3) {
                                    TTLandingPageActivity.this.kw.il();
                                    Objects.toString(TTLandingPageActivity.this.uqd);
                                    return;
                                }
                            }
                            return;
                        }
                        if (TTLandingPageActivity.this.bvs != null) {
                            TextView textView = TTLandingPageActivity.this.bvs;
                            if (TextUtils.isEmpty(str)) {
                                str = doe.zmn(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        if (TTLandingPageActivity.this.yj != null) {
                            TTLandingPageActivity.this.yj.zmn(i2);
                        }
                        if (TTLandingPageActivity.this.mw != null && !TTLandingPageActivity.this.isFinishing()) {
                            if (i2 != 100 || !TTLandingPageActivity.this.mw.isShown()) {
                                TTLandingPageActivity.this.mw.setProgress(i2);
                            } else {
                                TTLandingPageActivity.this.mw.setVisibility(8);
                            }
                        }
                        if (!TTLandingPageActivity.this.cud || TTLandingPageActivity.this.dgt == null) {
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - TTLandingPageActivity.this.gn >= 200 || i2 == 100) {
                            TTLandingPageActivity.this.dgt.zmn(webView, TTLandingPageActivity.this.ev);
                            TTLandingPageActivity.this.gn = currentTimeMillis;
                        }
                    }
                });
                if (this.nps.getWebView() != null) {
                    this.nps.getWebView().setOnScrollChangeListener(new fs(this.zmn));
                    this.nps.getWebView().setOnTouchListener(new zn(this.zmn, this.hgd) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.13
                        private long btk;
                        private float fb;
                        private final int fs = kgc.fs();
                        private float hhw = 0.0f;
                        private float nps = 0.0f;
                        private float zn;

                        @Override // com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.zn, android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$13;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                            return safedk_TTLandingPageActivity$13_onTouch_7294b78e5b5f59ca044bb69ae96d532b(view, motionEvent);
                        }

                        public boolean safedk_TTLandingPageActivity$13_onTouch_7294b78e5b5f59ca044bb69ae96d532b(View p0, MotionEvent p1) {
                            if (TTLandingPageActivity.this.na != null) {
                                TTLandingPageActivity.this.na.zmn();
                            }
                            if (!TTLandingPageActivity.this.cud) {
                                return super.onTouch(p0, p1);
                            }
                            try {
                                int actionMasked = p1.getActionMasked();
                                if (actionMasked == 0) {
                                    this.zn = p1.getRawX();
                                    this.fb = p1.getRawY();
                                    this.btk = System.currentTimeMillis();
                                } else if (actionMasked == 2) {
                                    float rawX = p1.getRawX();
                                    float rawY = p1.getRawY();
                                    if (Math.abs(rawX - this.zn) < this.fs) {
                                        Math.abs(rawY - this.fb);
                                    }
                                    this.hhw += Math.abs(p1.getX() - this.zn);
                                    this.nps += Math.abs(p1.getY() - this.fb);
                                    System.currentTimeMillis();
                                    if (rawY - this.fb > this.fs) {
                                        TTLandingPageActivity.this.dgt.zmn();
                                    }
                                    if (rawY - this.fb < (-this.fs)) {
                                        TTLandingPageActivity.this.dgt.fs();
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e("TTAD.LandingPageAct", "TouchRecordTool onTouch error", th);
                            }
                            return super.onTouch(p0, p1);
                        }
                    });
                }
                this.nps.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.14
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        if (TTLandingPageActivity.this.iqz != null) {
                            TTLandingPageActivity.this.iqz.zmn(TTLandingPageActivity.this.kw);
                        }
                    }
                });
            }
            zn();
            com.bytedance.sdk.openadsdk.rt.zmn zmnVar = this.kra;
            if (zmnVar != null) {
                zmnVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.15
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$15;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_TTLandingPageActivity$15_onClick_0d0639500f4a26fe94a07b7aa706e5fa(view);
                    }

                    public void safedk_TTLandingPageActivity$15_onClick_0d0639500f4a26fe94a07b7aa706e5fa(View p0) {
                        TTLandingPageActivity.this.zn("onSelectPrivacy");
                        TTLandingPageActivity tTLandingPageActivity = TTLandingPageActivity.this;
                        TTWebsiteActivity.zmn(tTLandingPageActivity, tTLandingPageActivity.kw, TTLandingPageActivity.this.kgc);
                    }
                });
            }
            zn.zmn.zmn(SystemClock.elapsedRealtime() - elapsedRealtime, this.kw, "landingpage", this.uqh, this.nqi);
        } catch (Throwable unused3) {
            finish();
        }
    }

    private void fs() {
        if (TextUtils.isEmpty(this.phc)) {
            return;
        }
        com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.16
            @Override // com.bytedance.sdk.openadsdk.kgc.fb
            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                zmnVar.fs("lp_reuse");
                zmnVar.fb(TTLandingPageActivity.this.kgc);
                return zmnVar;
            }
        });
        if (this.oub) {
            com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn;
            if (mwVar != null) {
                mwVar.btk(true);
                this.kw.kw(true);
            }
            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("lp_reuse");
                    zmnVar.fb(TTLandingPageActivity.this.kgc);
                    return zmnVar;
                }
            });
            com.bytedance.sdk.openadsdk.cyb.fb.zmn(true);
            return;
        }
        this.oub = false;
        com.bytedance.sdk.openadsdk.cyb.fb.zmn(false);
        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.kgc.fb
            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                zmnVar.fs("lp_reuse");
                zmnVar.fb(TTLandingPageActivity.this.kgc);
                return zmnVar;
            }
        });
    }

    public static class zmn implements com.bytedance.sdk.openadsdk.fb.klz {
        private final WeakReference<TTLandingPageActivity> fb;
        private final nqi fs;
        private final int zmn;
        private final String zn;

        public zmn(int i, nqi nqiVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.zmn = i;
            this.fs = nqiVar;
            this.zn = str;
            this.fb = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.fb.klz
        public void zmn(int i) {
            TTLandingPageActivity tTLandingPageActivity = this.fb.get();
            if (tTLandingPageActivity != null) {
                zn.zmn.zmn(this.zmn, tTLandingPageActivity.rp.get(), tTLandingPageActivity.am.get(), tTLandingPageActivity.bjh.get() - tTLandingPageActivity.am.get(), this.fs, this.zn, i);
            }
        }
    }

    private static class fs implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.fb.mw> zmn;

        public fs(com.bytedance.sdk.openadsdk.fb.mw mwVar) {
            this.zmn = new WeakReference<>(mwVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn.get();
            if (mwVar != null) {
                mwVar.fs(i2);
            }
        }
    }

    private static class zn implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.common.btk> fs;
        private final WeakReference<com.bytedance.sdk.openadsdk.fb.mw> zmn;

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$zn;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
            return safedk_TTLandingPageActivity$zn_onTouch_764cca0689d025a2915070f658020e2c(view, motionEvent);
        }

        public zn(com.bytedance.sdk.openadsdk.fb.mw mwVar, com.bytedance.sdk.openadsdk.common.btk btkVar) {
            this.zmn = new WeakReference<>(mwVar);
            this.fs = new WeakReference<>(btkVar);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean safedk_TTLandingPageActivity$zn_onTouch_764cca0689d025a2915070f658020e2c(View p0, MotionEvent p1) {
            com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn.get();
            if (mwVar != null) {
                mwVar.zmn(p1);
            }
            com.bytedance.sdk.openadsdk.common.btk btkVar = this.fs.get();
            if (btkVar == null) {
                return false;
            }
            btkVar.zmn(p1);
            return false;
        }
    }

    private View zmn(String str) {
        Bundle bundle;
        com.bytedance.sdk.component.bvs.nps npsVar;
        com.bytedance.sdk.openadsdk.core.model.fs ew;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        if (Build.VERSION.SDK_INT >= 35) {
            znVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        btkVar.setOrientation(1);
        znVar.addView(btkVar, new FrameLayout.LayoutParams(-1, -1));
        boolean am = kgc.fb().am();
        this.cud = am;
        nqi nqiVar = this.kw;
        if (nqiVar != null && am) {
            this.dgt = new mw(this, nqiVar, this.kgc, false);
        }
        View cnVar = new cn(this, new cn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.19
            @Override // com.bytedance.sdk.openadsdk.common.cn.zmn
            public View zmn(Context context) {
                if (TTLandingPageActivity.this.kw != null && TTLandingPageActivity.this.cud) {
                    return TTLandingPageActivity.this.dgt.fb();
                }
                return new iv(context);
            }
        });
        cnVar.setId(com.bytedance.sdk.openadsdk.utils.olo.cd);
        btkVar.addView(cnVar, new LinearLayout.LayoutParams(-1, this.cud ? -2 : jy.fs(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        btkVar.addView(znVar2, layoutParams);
        if (!com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false) || TextUtils.isEmpty(str)) {
            bundle = null;
            npsVar = null;
        } else {
            String str2 = System.identityHashCode(this.kw) + "_" + str;
            npsVar = phc.zmn(this, str2);
            bundle = phc.zmn(str2);
        }
        if (npsVar == null) {
            npsVar = new com.bytedance.sdk.component.bvs.nps(this, nps.zn.LANDING_PAGE);
        } else {
            if (bundle != null && npsVar.getWebView() != null) {
                npsVar.getWebView().restoreState(bundle);
            }
            this.oub = true;
        }
        npsVar.setId(com.bytedance.sdk.openadsdk.utils.olo.gn);
        znVar2.addView(npsVar, new FrameLayout.LayoutParams(-1, -1));
        cn cnVar2 = new cn(this, new cn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.cn.zmn
            public View zmn(Context context) {
                return new com.bytedance.sdk.openadsdk.common.zg(context);
            }
        });
        cnVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.xrr);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        znVar2.addView(cnVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.hhw.hhw(this, null, R.style.Widget.ProgressBar.Horizontal);
        hhwVar.setId(com.bytedance.sdk.openadsdk.utils.olo.ax);
        hhwVar.setProgress(1);
        hhwVar.setVisibility(8);
        hhwVar.setProgressDrawable(rc.zmn(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, jy.fs(this, 3.0f));
        layoutParams3.gravity = 49;
        znVar2.addView(hhwVar, layoutParams3);
        nqi nqiVar2 = this.kw;
        if (nqiVar2 != null && (ew = nqiVar2.ew()) != null) {
            String fb = ew.fb();
            if (!TextUtils.isEmpty(fb)) {
                com.bytedance.sdk.openadsdk.rt.zmn zmnVar = new com.bytedance.sdk.openadsdk.rt.zmn(this);
                this.kra = zmnVar;
                zmnVar.setId(com.bytedance.sdk.openadsdk.utils.olo.tdm);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                this.kra.setPadding(jy.fs(this, 16.0f), jy.fs(this, 16.0f), jy.fs(this, 16.0f), jy.fs(this, 16.0f));
                this.kra.setPrivacyText(fb);
                layoutParams4.gravity = 80;
                znVar2.addView(this.kra, layoutParams4);
            }
        }
        klz klzVar = new klz(this);
        klzVar.setOnlyLoading(this.ww);
        klzVar.setId(520093721);
        znVar.addView(klzVar, new FrameLayout.LayoutParams(-1, -1));
        return znVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zn() {
        nqi nqiVar = this.kw;
        if (nqiVar == null || nqiVar.va() != 4) {
            return;
        }
        cn cnVar = this.rc;
        if (cnVar != null) {
            cnVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.olo.ouf);
        this.klz = button;
        if (button != null) {
            fs(btk());
            if (this.iqz == null) {
                this.iqz = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this, TextUtils.isEmpty(this.kgc) ? oub.fs(this.olo) : this.kgc);
            }
            com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(this, this.kw, this.kgc, this.olo);
            zmnVar.zmn(false);
            this.klz.setOnClickListener(zmnVar);
            this.klz.setOnTouchListener(zmnVar);
            zmnVar.zn(true);
            zmnVar.zmn(this.iqz);
        }
    }

    private String btk() {
        nqi nqiVar = this.kw;
        if (nqiVar != null && !TextUtils.isEmpty(nqiVar.gt())) {
            this.mhu = this.kw.gt();
        }
        return this.mhu;
    }

    private void fs(String str) {
        if (TextUtils.isEmpty(str) || this.klz == null || isFinishing()) {
            return;
        }
        this.klz.setText(str);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        zn();
    }

    private void hhw() {
        com.bytedance.sdk.component.bvs.nps npsVar = (com.bytedance.sdk.component.bvs.nps) findViewById(com.bytedance.sdk.openadsdk.utils.olo.gn);
        this.nps = npsVar;
        oub.zmn(this.kw, npsVar);
        this.rc = (cn) findViewById(com.bytedance.sdk.openadsdk.utils.olo.xrr);
        cn cnVar = (cn) findViewById(com.bytedance.sdk.openadsdk.utils.olo.cd);
        klz klzVar = (klz) findViewById(520093721);
        this.yj = klzVar;
        if (klzVar != null) {
            klzVar.zmn(this.kw);
            this.yj.zmn();
        }
        if (cnVar != null) {
            cnVar.setVisibility(0);
        }
        if (this.cud) {
            this.jy = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.wq);
        } else {
            this.jy = (ImageView) findViewById(520093720);
        }
        ImageView imageView = this.jy;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTLandingPageActivity$3_onClick_3bcf521a3d14d8ca8872fa5c0ebd3ebf(view);
                }

                public void safedk_TTLandingPageActivity$3_onClick_3bcf521a3d14d8ca8872fa5c0ebd3ebf(View p0) {
                    View p02 = TTLandingPageActivity.this.nps;
                    if (p02 != null) {
                        if (TTLandingPageActivity.this.ev != null) {
                            TTLandingPageActivity.this.ev.zmn();
                        }
                        if (TTLandingPageActivity.this.nps.zg()) {
                            TTLandingPageActivity.this.nps.bvs();
                            if (!TTLandingPageActivity.this.cud || TTLandingPageActivity.this.dgt == null) {
                                return;
                            }
                            WebView webView = TTLandingPageActivity.this.nps.getWebView();
                            if (TTLandingPageActivity.this.dgt == null || webView == null) {
                                return;
                            }
                            TTLandingPageActivity.this.dgt.zmn(webView, TTLandingPageActivity.this.ev);
                            return;
                        }
                        if (TTLandingPageActivity.this.cud) {
                            return;
                        }
                        TTLandingPageActivity.this.finish();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.bmc);
        this.vlj = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$4;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTLandingPageActivity$4_onClick_a00f7a7bf075a5ac577123570b76c9e0(view);
                }

                public void safedk_TTLandingPageActivity$4_onClick_a00f7a7bf075a5ac577123570b76c9e0(View p0) {
                    View p02 = TTLandingPageActivity.this.nps;
                    if (p02 == null || !TTLandingPageActivity.this.nps.iv()) {
                        return;
                    }
                    TTLandingPageActivity.this.nps.rc();
                    if (!TTLandingPageActivity.this.cud || TTLandingPageActivity.this.dgt == null) {
                        return;
                    }
                    WebView webView = TTLandingPageActivity.this.nps.getWebView();
                    if (TTLandingPageActivity.this.dgt == null || webView == null) {
                        return;
                    }
                    TTLandingPageActivity.this.dgt.zmn(webView, TTLandingPageActivity.this.ev);
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.zg = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTLandingPageActivity$5_onClick_8743e34773e549a74782da0f39797b63(view);
                }

                public void safedk_TTLandingPageActivity$5_onClick_8743e34773e549a74782da0f39797b63(View p0) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.bvs = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.ob);
        com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = (com.bytedance.sdk.openadsdk.core.hhw.hhw) findViewById(com.bytedance.sdk.openadsdk.utils.olo.ax);
        this.mw = hhwVar;
        if (hhwVar != null) {
            hhwVar.setVisibility(0);
        }
        this.yof = (ImageView) findViewById(520093740);
        if (this.cud) {
            final com.bytedance.sdk.openadsdk.common.phc phcVar = new com.bytedance.sdk.openadsdk.common.phc(this, false);
            ImageView imageView4 = this.yof;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$6;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_TTLandingPageActivity$6_onClick_39c27603d3a56af29a0ee658e864ab7c(view);
                    }

                    public void safedk_TTLandingPageActivity$6_onClick_39c27603d3a56af29a0ee658e864ab7c(View p0) {
                        phcVar.setOnMenuItemClickListener(new phc.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6.1
                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void zmn() {
                                if (TTLandingPageActivity.this.kw != null) {
                                    com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(TTLandingPageActivity.this.kw);
                                }
                                com.bytedance.sdk.component.utils.fs.zmn(TTLandingPageActivity.this, new Intent(TTLandingPageActivity.this, (Class<?>) TTHistoryActivity.class), null);
                                TTLandingPageActivity.this.zn("onSelectHistory");
                                phcVar.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void fs() {
                                com.bytedance.sdk.component.bvs.nps npsVar2 = TTLandingPageActivity.this.nps;
                                if (npsVar2 == null || npsVar2.getUrl() == null) {
                                    return;
                                }
                                if (TTLandingPageActivity.this.mw != null) {
                                    TTLandingPageActivity.this.mw.setVisibility(0);
                                    TTLandingPageActivity.this.mw.setProgress(0);
                                }
                                npsVar2.nps();
                                String url = npsVar2.getUrl();
                                if (url != null) {
                                    npsVar2.a_(url);
                                }
                                TTLandingPageActivity.this.zn("onSelectRetry");
                                phcVar.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void zn() {
                                ClipboardManager clipboardManager;
                                if (TTLandingPageActivity.this.nps != null) {
                                    String url = TTLandingPageActivity.this.nps.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                TTLandingPageActivity.this.zn("onSelectCopyLink");
                                phcVar.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void fb() {
                                if (TTLandingPageActivity.this.nps != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTLandingPageActivity.this.nps.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.fs.zmn(TTLandingPageActivity.this, intent, null);
                                    }
                                    TTLandingPageActivity.this.zn("onSelectOpenInBrowser");
                                    phcVar.zmn();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void btk() {
                                TTLandingPageActivity.this.zmn();
                                TTLandingPageActivity.this.zn("onSelectReport");
                                phcVar.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
                            public void hhw() {
                                TTLandingPageActivity.this.zn("onSelectPrivacy");
                                if (com.bytedance.sdk.openadsdk.utils.fs.btk()) {
                                    TTLandingPageActivity tTLandingPageActivity = TTLandingPageActivity.this;
                                    IABLandingPageActivity.zmn(tTLandingPageActivity, tTLandingPageActivity.kw, TTLandingPageActivity.this.kgc);
                                } else {
                                    TTLandingPageActivity tTLandingPageActivity2 = TTLandingPageActivity.this;
                                    TTWebsiteActivity.zmn(tTLandingPageActivity2, tTLandingPageActivity2.kw, TTLandingPageActivity.this.kgc);
                                }
                                phcVar.zmn();
                            }
                        });
                        phcVar.zmn(p0);
                    }
                });
            }
        }
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.olo.sxr);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTLandingPageActivity$7;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTLandingPageActivity$7_onClick_b8d6c2209d28ac83ce06a793bdcb5480(view);
                }

                public void safedk_TTLandingPageActivity$7_onClick_b8d6c2209d28ac83ce06a793bdcb5480(View p0) {
                    TTLandingPageActivity.this.zmn();
                }
            });
        }
    }

    private void nps() {
        fkt fktVar = new fkt(this);
        this.cyb = fktVar;
        fktVar.fs(this.nps).zn(this.rt).fb(this.cn).zmn(this.kw).fs(this.olo).zmn(this.kw.mig()).btk(this.kw.gor()).zmn(this.nps).fs("landingpage");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        nqi nqiVar = this.kw;
        if (nqiVar != null) {
            nqiVar.lbc(1);
        }
        fkt fktVar = this.cyb;
        if (fktVar != null) {
            fktVar.rc();
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn;
        if (mwVar != null) {
            mwVar.nps();
        }
        rt rtVar = this.so;
        if (rtVar != null) {
            rtVar.zmn();
        }
        com.bytedance.sdk.component.bvs.nps npsVar = this.nps;
        if (npsVar != null) {
            npsVar.klz();
            final com.bytedance.sdk.component.bvs.nps npsVar2 = this.nps;
            if (npsVar2 != null) {
                npsVar2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8
                    @Override // java.lang.Runnable
                    public void run() {
                        npsVar2.scrollBy(0, 1);
                        npsVar2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                if (npsVar2 == null || TTLandingPageActivity.this.isFinishing()) {
                                    return;
                                }
                                npsVar2.scrollBy(0, -1);
                            }
                        }, 10L);
                    }
                }, 200L);
            }
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        nqi nqiVar = this.kw;
        if (nqiVar != null) {
            nqiVar.lbc(0);
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        rt rtVar = this.so;
        if (rtVar != null) {
            rtVar.fs();
        }
        nqi nqiVar = this.kw;
        if (nqiVar != null) {
            nqiVar.nps(SystemClock.elapsedRealtime());
            this.kw.lbc(0);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        zg();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void rt() {
        zg();
    }

    private void zg() {
        if (bvs() && !this.doe.getAndSet(true)) {
            iv();
            zmn(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private boolean bvs() {
        return !TextUtils.isEmpty(this.phc) && this.phc.contains("__luban_sdk");
    }

    private void zmn(final int i) {
        if (this.zg == null || !bvs()) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                jy.zmn((View) TTLandingPageActivity.this.zg, i);
            }
        });
    }

    private void iv() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.cyb.zmn("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        com.bytedance.sdk.component.bvs.nps npsVar;
        com.bytedance.sdk.component.bvs.nps npsVar2;
        super.onDestroy();
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false)) {
            nqi nqiVar = this.kw;
            if (nqiVar != null) {
                nqiVar.lbc(0);
            }
            com.bytedance.sdk.openadsdk.fb.mw mwVar = this.zmn;
            if (mwVar != null && (npsVar2 = this.nps) != null) {
                mwVar.zmn(npsVar2);
            }
            if (this.nps != null && !TextUtils.isEmpty(this.phc)) {
                Bundle bundle = new Bundle();
                if (this.nps.getWebView() != null) {
                    this.nps.getWebView().saveState(bundle);
                }
                com.bytedance.sdk.openadsdk.utils.phc.zmn(System.identityHashCode(this.kw) + "_" + this.phc, this.nps, bundle);
            } else {
                com.bytedance.sdk.component.bvs.nps npsVar3 = this.nps;
                if (npsVar3 != null) {
                    zak.zmn(npsVar3);
                }
            }
            this.nps = null;
        } else {
            com.bytedance.sdk.openadsdk.fb.mw mwVar2 = this.zmn;
            if (mwVar2 != null && (npsVar = this.nps) != null) {
                mwVar2.zmn(npsVar);
            }
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false)) {
            com.bytedance.sdk.component.bvs.nps npsVar4 = this.nps;
            if (npsVar4 != null) {
                zak.zmn(npsVar4);
            }
            this.nps = null;
        }
        fkt fktVar = this.cyb;
        if (fktVar != null) {
            fktVar.klz();
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar3 = this.zmn;
        if (mwVar3 != null) {
            mwVar3.fb(true);
        }
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.na;
        if (fbVar != null) {
            fbVar.zn();
        }
        if (!TextUtils.isEmpty(this.nqi)) {
            zn.zmn.zmn(this.am.get(), this.bjh.get(), this.kw);
        }
        com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.uqh);
        rt rtVar = this.so;
        if (rtVar != null) {
            rtVar.zn();
        }
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_iab_history", true) && this.cud) {
            com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().fs();
        }
    }

    protected void zmn() {
        if (isFinishing()) {
            return;
        }
        if (this.btk.get()) {
            klz();
            return;
        }
        if (this.fs == null) {
            rc();
        }
        olo oloVar = this.fs;
        if (oloVar != null) {
            oloVar.zmn();
        }
    }

    private void rc() {
        try {
            if (this.fs == null) {
                olo oloVar = new olo(this.iv, this.kw);
                this.fs = oloVar;
                oloVar.setDislikeSource("landing_page");
                this.fs.setCallback(new olo.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(View view) {
                        TTLandingPageActivity.this.fb.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void fs(View view) {
                        TTLandingPageActivity.this.fb.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.btk.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.btk.set(true);
                        TTLandingPageActivity.this.mw();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.fs);
            if (this.zn == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.iv);
                this.zn = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void klz() {
        TTAdDislikeToast tTAdDislikeToast = this.zn;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mw() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.zn) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.hhw >= 0) {
            am.zmn().zn(this.hhw);
            this.hhw = -1;
        }
        com.bytedance.sdk.openadsdk.utils.fb.zmn(this, this.kw);
        nqi nqiVar = this.kw;
        if (nqiVar != null) {
            nqiVar.lbc(1);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int zmn2 = this.kw != null ? am.zmn().zmn(this.kw) : -1;
            this.hhw = zmn2;
            bundle.putInt("meta_index", zmn2);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(final String str) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("iab_more_options", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.11
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("iab_more_options").fs(jSONObject.toString());
            }
        });
    }
}
