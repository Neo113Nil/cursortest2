package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cn;
import com.bytedance.sdk.openadsdk.common.klz;
import com.bytedance.sdk.openadsdk.common.olo;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rt;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.rc.fb {
    private klz bxw;
    private TextView cd;
    private PAGLogoView hwg;
    TTAdDislikeToast kra;
    private com.bytedance.sdk.openadsdk.common.btk lbc;
    private long lt;
    private com.bytedance.sdk.openadsdk.core.widget.zmn.hhw rje;
    private View tet;
    olo uqd;
    private TextView ve;
    private boolean xrr;
    private View yo;

    /* renamed from: io, reason: collision with root package name */
    private boolean f3737io = false;
    final AtomicBoolean na = new AtomicBoolean(false);
    final AtomicBoolean mhu = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        nqi nqiVar;
        com.bytedance.sdk.component.bvs.nps npsVar;
        super.onCreate(bundle);
        if (!cn.btk() || (nqiVar = this.rt) == null || (npsVar = ((TTVideoLandingPageActivity) this).zmn) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.btk zmn = oub.zmn(nqiVar, npsVar, this.btk, this.am);
        this.lbc = zmn;
        if (zmn != null) {
            zmn.zmn("landingpage_split_screen");
        }
        if (((TTVideoLandingPageActivity) this).zmn.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).zmn.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    mw mwVar = TTVideoLandingPageLink2Activity.this.oub;
                    if (mwVar != null) {
                        mwVar.fs(i2);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(this.btk, this.zg, this.hhw, this.lbc, this.oub, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageLink2Activity$5;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
                safedk_TTVideoLandingPageLink2Activity$5_onPageStarted_18cdb6cf46242d96f5adc274b7c9f0c6(webView, str, bitmap);
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
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.tet != null && !TTVideoLandingPageLink2Activity.this.xrr) {
                        TTVideoLandingPageLink2Activity.this.tet.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.f3737io = true;
                    TTVideoLandingPageLink2Activity.this.cyb();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(tTVideoLandingPageLink2Activity.rt, tTVideoLandingPageLink2Activity.am, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.lt, true);
                } catch (Throwable unused) {
                }
            }

            public void safedk_TTVideoLandingPageLink2Activity$5_onPageStarted_18cdb6cf46242d96f5adc274b7c9f0c6(WebView p0, String p1, Bitmap p2) {
                super.onPageStarted(p0, p1, p2);
                TTVideoLandingPageLink2Activity.this.lt = System.currentTimeMillis();
            }
        };
        this.rje = hhwVar;
        hhwVar.zmn(this.rt);
        ((TTVideoLandingPageActivity) this).zmn.setWebViewClient(this.rje);
        ((TTVideoLandingPageActivity) this).zmn.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.zg, this.oub, this.lbc) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.bxw != null) {
                    TTVideoLandingPageLink2Activity.this.bxw.zmn(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.ufa);
        if (textView != null && this.rt.uqh() != null) {
            textView.setText(this.rt.uqh().btk());
        }
        nqi nqiVar2 = this.rt;
        cn.zn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.xrr = true;
                    if (TTVideoLandingPageLink2Activity.this.bxw != null) {
                        TTVideoLandingPageLink2Activity.this.bxw.fs();
                    }
                    TTVideoLandingPageLink2Activity.this.yo.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.hwg != null) {
                        TTVideoLandingPageLink2Activity.this.hwg.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f3737io) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(tTVideoLandingPageLink2Activity.rt, tTVideoLandingPageLink2Activity.am, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.lt, false);
                } catch (Exception unused) {
                }
            }
        }, (nqiVar2 == null || nqiVar2.uqh() == null) ? 10000L : this.rt.uqh().zmn() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected View zmn() {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        if (Build.VERSION.SDK_INT >= 35) {
            btkVar.setFitsSystemWindows(true);
        }
        btkVar.setOrientation(1);
        btkVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        btkVar.addView(znVar, new LinearLayout.LayoutParams(-1, jy.fs(this, 220.0f)));
        View znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        znVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.ww);
        znVar.addView(znVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        btkVar2.setOrientation(0);
        btkVar2.setPadding(0, jy.fs(this, 20.0f), 0, 0);
        znVar.addView(btkVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        btkVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.cn cnVar = new com.bytedance.sdk.openadsdk.core.widget.cn(this);
        cnVar.setId(520093713);
        cnVar.setGravity(17);
        cnVar.setText(doe.zmn(this, "tt_reward_feedback"));
        cnVar.setTextColor(-1);
        cnVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, jy.fs(this, 28.0f));
        int fs = jy.fs(this, 16.0f);
        layoutParams2.rightMargin = fs;
        layoutParams2.leftMargin = fs;
        btkVar2.addView(cnVar, layoutParams2);
        rt rtVar = new rt(this);
        rtVar.setId(com.bytedance.sdk.openadsdk.utils.olo.oub);
        rtVar.setPadding(jy.fs(this, 7.0f), jy.fs(this, 7.0f), jy.fs(this, 7.0f), jy.fs(this, 7.0f));
        rtVar.setImageResource(doe.fb(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(jy.fs(this, 28.0f), jy.fs(this, 28.0f));
        layoutParams3.rightMargin = jy.fs(this, 12.0f);
        btkVar2.addView(rtVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(this);
        npsVar.setVisibility(8);
        npsVar.setId(com.bytedance.sdk.openadsdk.utils.olo.jy);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = jy.fs(this, 10.0f);
        btkVar.addView(npsVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.widget.zmn(this);
        zmnVar.setId(com.bytedance.sdk.openadsdk.utils.olo.vlj);
        zmnVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        zmnVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(jy.fs(this, 44.0f), jy.fs(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = jy.fs(this, 5.0f);
        npsVar.addView(zmnVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(this);
        int i = com.bytedance.sdk.openadsdk.utils.olo.yof;
        zgVar.setId(i);
        zgVar.setBackground(rc.zmn(this, "tt_circle_solid_mian"));
        zgVar.setGravity(17);
        zgVar.setTextColor(-1);
        zgVar.setTextSize(2, 19.0f);
        zgVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(jy.fs(this, 44.0f), jy.fs(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = jy.fs(this, 5.0f);
        npsVar.addView(zgVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(this);
        zgVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.dgt);
        zgVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar2.setEllipsize(truncateAt);
        zgVar2.setTextColor(Color.parseColor("#e5000000"));
        zgVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = jy.fs(this, 5.0f);
        layoutParams7.rightMargin = jy.fs(this, 80.0f);
        layoutParams7.addRule(1, i);
        npsVar.addView(zgVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(this);
        zgVar3.setId(com.bytedance.sdk.openadsdk.utils.olo.cud);
        zgVar3.setClickable(true);
        zgVar3.setMaxLines(1);
        zgVar3.setEllipsize(truncateAt);
        zgVar3.setFocusable(true);
        zgVar3.setGravity(17);
        zgVar3.setText(doe.zmn(this, "tt_video_mobile_go_detail"));
        zgVar3.setTextColor(-1);
        zgVar3.setTextSize(2, 14.0f);
        zgVar3.setPadding(jy.fs(this, 2.0f), jy.fs(this, 2.0f), jy.fs(this, 2.0f), jy.fs(this, 2.0f));
        zgVar3.setBackground(rc.zmn(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(jy.fs(this, 90.0f), jy.fs(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = jy.fs(this, 5.0f);
        npsVar.addView(zgVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        btkVar.addView(znVar3, new LinearLayout.LayoutParams(-1, -1));
        View npsVar2 = new com.bytedance.sdk.component.bvs.nps(this, nps.zn.LANDING_PAGE);
        npsVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.gn);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = jy.fs(this, 2.0f);
        znVar3.addView(npsVar2, layoutParams9);
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar3 = new com.bytedance.sdk.openadsdk.core.hhw.nps(this);
        npsVar3.setId(com.bytedance.sdk.openadsdk.utils.olo.uqd);
        npsVar3.setBackgroundColor(Color.parseColor("#F8F8F8"));
        znVar3.addView(npsVar3, new FrameLayout.LayoutParams(-1, -1));
        View klzVar = new klz(this);
        klzVar.setId(com.bytedance.sdk.openadsdk.utils.olo.kra);
        npsVar3.addView(klzVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        btkVar3.setId(com.bytedance.sdk.openadsdk.utils.olo.nu);
        btkVar3.setOrientation(1);
        btkVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        npsVar3.addView(btkVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.olo oloVar = new com.bytedance.sdk.openadsdk.core.widget.olo(this);
        oloVar.setId(com.bytedance.sdk.openadsdk.utils.olo.na);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(jy.fs(this, 80.0f), jy.fs(this, 80.0f));
        layoutParams11.gravity = 17;
        btkVar3.addView(oloVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zg(this);
        zgVar4.setId(com.bytedance.sdk.openadsdk.utils.olo.mhu);
        zgVar4.setTextColor(Color.parseColor("#161823"));
        zgVar4.setTextSize(0, jy.fs(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = jy.fs(this, 12.0f);
        btkVar3.addView(zgVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar5 = new com.bytedance.sdk.openadsdk.core.hhw.zg(this);
        zgVar5.setId(com.bytedance.sdk.openadsdk.utils.olo.bxw);
        zgVar5.setTextColor(Color.parseColor("#80161823"));
        zgVar5.setTextSize(0, jy.fs(this, 16.0f));
        zgVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int fs2 = jy.fs(this, 60.0f);
        layoutParams13.rightMargin = fs2;
        layoutParams13.leftMargin = fs2;
        layoutParams13.topMargin = jy.fs(this, 8.0f);
        btkVar3.addView(zgVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar6 = new com.bytedance.sdk.openadsdk.core.hhw.zg(this);
        zgVar6.setId(com.bytedance.sdk.openadsdk.utils.olo.tet);
        zgVar6.setGravity(17);
        zgVar6.setTextColor(-1);
        zgVar6.setText(doe.zmn(this, "tt_video_mobile_go_detail"));
        zgVar6.setBackground(rc.zmn(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(jy.fs(this, 255.0f), jy.fs(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = jy.fs(this, 32.0f);
        btkVar3.addView(zgVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.hwg = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.olo.yo);
        this.hwg.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, jy.fs(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = jy.fs(this, 18.0f);
        layoutParams15.bottomMargin = jy.fs(this, 61.0f);
        npsVar3.addView(this.hwg, layoutParams15);
        View cnVar2 = new com.bytedance.sdk.openadsdk.common.cn(this, new cn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.cn.zmn
            public View zmn(Context context) {
                return new com.bytedance.sdk.openadsdk.common.zg(context);
            }
        });
        cnVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.xrr);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, jy.fs(this, 48.0f));
        layoutParams16.gravity = 81;
        znVar3.addView(cnVar2, layoutParams16);
        return btkVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void zn() {
        super.zn();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(doe.zmn(kgc.zmn(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageLink2Activity$9;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTVideoLandingPageLink2Activity$9_onClick_2c10df2b1b3847f520024d46cf2fec23(view);
                }

                public void safedk_TTVideoLandingPageLink2Activity$9_onClick_2c10df2b1b3847f520024d46cf2fec23(View p0) {
                    TTVideoLandingPageLink2Activity.this.mw();
                }
            });
        }
        this.ve = (TextView) findViewById(520093714);
        this.bxw = (klz) findViewById(com.bytedance.sdk.openadsdk.utils.olo.kra);
        this.tet = findViewById(com.bytedance.sdk.openadsdk.utils.olo.uqd);
        this.yo = findViewById(com.bytedance.sdk.openadsdk.utils.olo.nu);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.mhu);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.bxw);
        com.bytedance.sdk.openadsdk.core.widget.olo oloVar = (com.bytedance.sdk.openadsdk.core.widget.olo) findViewById(com.bytedance.sdk.openadsdk.utils.olo.na);
        this.cd = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.olo.tet);
        if (this.rt.uaq() != null && !TextUtils.isEmpty(this.rt.uaq().zmn())) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.rt.uaq(), oloVar, this.rt);
        }
        textView2.setText(this.rt.dey());
        textView3.setText(this.rt.pf());
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.olo.yo);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageLink2Activity$10;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_TTVideoLandingPageLink2Activity$10_onClick_724f3f488839888c64821df18ce91b34(view);
            }

            public void safedk_TTVideoLandingPageLink2Activity$10_onClick_724f3f488839888c64821df18ce91b34(View p0) {
                if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    IABLandingPageActivity.zmn(tTVideoLandingPageLink2Activity.btk, tTVideoLandingPageLink2Activity.rt, tTVideoLandingPageLink2Activity.am);
                } else {
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity2 = TTVideoLandingPageLink2Activity.this;
                    TTWebsiteActivity.zmn(tTVideoLandingPageLink2Activity2.btk, tTVideoLandingPageLink2Activity2.rt, tTVideoLandingPageLink2Activity2.am);
                }
            }
        });
        if (findViewById instanceof PAGLogoView) {
            ((PAGLogoView) findViewById).initData(this.rt);
        }
        com.bytedance.sdk.component.bvs.nps npsVar = ((TTVideoLandingPageActivity) this).zmn;
        if (npsVar != null && npsVar.getWebView() != null) {
            oub.zmn(this.rt, ((TTVideoLandingPageActivity) this).zmn);
        }
        if (((TTVideoLandingPageActivity) this).zmn.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).zmn.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageLink2Activity$11;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                    return safedk_TTVideoLandingPageLink2Activity$11_onTouch_d82af4a1932c841266170bdec8d6a22e(view, motionEvent);
                }

                public boolean safedk_TTVideoLandingPageLink2Activity$11_onTouch_d82af4a1932c841266170bdec8d6a22e(View p0, MotionEvent p1) {
                    mw mwVar = TTVideoLandingPageLink2Activity.this.oub;
                    if (mwVar != null) {
                        mwVar.zmn(p1);
                    }
                    if (TTVideoLandingPageLink2Activity.this.lbc == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.lbc.zmn(p1);
                    return false;
                }
            });
        }
        klz klzVar = this.bxw;
        if (klzVar != null) {
            klzVar.zmn(this.rt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn() {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.rt, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        klz klzVar = this.bxw;
        if (klzVar != null) {
            klzVar.zmn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void btk() {
        if (hhw()) {
            super.btk();
            com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
            if (hhwVar != null) {
                if (hhwVar.getNativeVideoController() != null) {
                    this.klz.getNativeVideoController().zmn(false);
                    this.klz.getNativeVideoController().hhw(false);
                    this.iv.setClickable(true);
                    this.iv.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.12
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageLink2Activity$12;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                            return safedk_TTVideoLandingPageLink2Activity$12_onTouch_1ca33e6fe161c3a928610b90324cf723(view, motionEvent);
                        }

                        public boolean safedk_TTVideoLandingPageLink2Activity$12_onTouch_1ca33e6fe161c3a928610b90324cf723(View p0, MotionEvent p1) {
                            if (p1.getAction() != 0) {
                                return false;
                            }
                            TTVideoLandingPageLink2Activity.this.cn();
                            return false;
                        }
                    });
                }
                this.klz.getNativeVideoController().zmn(new zn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.2
                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
                    public void fs(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
                    public void zmn() {
                    }

                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
                    public void zmn(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.zmn
                    public void zmn(long j, long j2) {
                        if (TTVideoLandingPageLink2Activity.this.ve != null) {
                            int max = (int) Math.max(0L, (j2 - j) / 1000);
                            TTVideoLandingPageLink2Activity.this.ve.setText(String.valueOf(max));
                            if (max <= 0) {
                                TTVideoLandingPageLink2Activity.this.ve.setVisibility(8);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.rt.tj().get(0), imageView, this.rt);
            this.iv.setVisibility(0);
            this.iv.removeAllViews();
            this.iv.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageLink2Activity$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTVideoLandingPageLink2Activity$3_onClick_0bc06d1d46b4280acc0e7f9fdef1539c(view);
                }

                public void safedk_TTVideoLandingPageLink2Activity$3_onClick_0bc06d1d46b4280acc0e7f9fdef1539c(View p0) {
                    com.bytedance.sdk.openadsdk.fb.zn.fs(TTVideoLandingPageLink2Activity.this.rt, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    protected boolean hhw() {
        int i = this.rc;
        return i == 5 || i == 15 || i == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void iv() {
        super.iv();
        nqi nqiVar = this.rt;
        if (nqiVar != null) {
            nqiVar.rt(true);
        }
        TextView textView = this.cd;
        if (textView != null) {
            textView.setText(fs());
            this.cd.setClickable(true);
            this.cd.setOnClickListener(this.gn);
            this.cd.setOnTouchListener(this.gn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cyb() {
        klz klzVar = this.bxw;
        if (klzVar != null) {
            klzVar.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        cyb();
        if (!this.xrr && this.oub != null && ((TTVideoLandingPageActivity) this).zmn != null && this.bxw.getVisibility() == 8) {
            this.oub.zmn(((TTVideoLandingPageActivity) this).zmn);
        }
        super.onDestroy();
    }

    private void olo() {
        TTAdDislikeToast tTAdDislikeToast = this.kra;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    protected void mw() {
        if (isFinishing()) {
            return;
        }
        if (this.mhu.get()) {
            olo();
            return;
        }
        if (this.uqd == null) {
            kw();
        }
        olo oloVar = this.uqd;
        if (oloVar != null) {
            oloVar.zmn();
        }
    }

    private void kw() {
        try {
            if (this.uqd == null) {
                olo oloVar = new olo(this.btk, this.rt);
                this.uqd = oloVar;
                oloVar.setDislikeSource("landing_page");
                this.uqd.setCallback(new olo.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(View view) {
                        TTVideoLandingPageLink2Activity.this.na.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void fs(View view) {
                        TTVideoLandingPageLink2Activity.this.na.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.mhu.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.mhu.set(true);
                        TTVideoLandingPageLink2Activity.this.iqz();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.uqd);
            if (this.kra == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.btk);
                this.kra = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iqz() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.kra) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }
}
