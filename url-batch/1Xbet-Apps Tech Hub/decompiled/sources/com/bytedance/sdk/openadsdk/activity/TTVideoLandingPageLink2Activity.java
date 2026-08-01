package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.work.WorkRequest;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserDownloadButton;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewBottomBar;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.common.Mxy;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.yiw.Jd {
    private Mxy Ca;
    private long Cwg;
    private com.bytedance.sdk.openadsdk.common.icD HWd;
    private View OyE;
    private LinearLayout Zm;
    TTAdDislikeToast ZsW;
    private boolean cGU;
    private LandingPageLoadingLayout cnN;
    TTAdDislikeDialog ea;
    private View joF;
    private TextView qd;
    private TextView rW;
    private boolean thO;
    private boolean neB = false;
    final AtomicBoolean CjQ = new AtomicBoolean(false);
    final AtomicBoolean BSi = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!Ju.NB() || this.mnm == null || this.pvs == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.icD pvs = jlb.pvs(this.mnm, this.pvs, this.NB, this.jlb);
        this.HWd = pvs;
        if (pvs != null) {
            pvs.pvs("landingpage_split_screen");
        }
        this.cGU = mnm.Jd().ny();
        if (this.pvs.getWebView() != null) {
            this.pvs.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (TTVideoLandingPageLink2Activity.this.od != null) {
                        TTVideoLandingPageLink2Activity.this.od.icD(i2);
                    }
                }
            });
        }
        this.pvs.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(this.NB, this.Wyp, this.so, this.HWd, this.od, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.OyE != null && !TTVideoLandingPageLink2Activity.this.thO) {
                        TTVideoLandingPageLink2Activity.this.OyE.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.Zm != null) {
                        TTVideoLandingPageLink2Activity.this.Zm.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.neB = true;
                    TTVideoLandingPageLink2Activity.this.IP();
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(TTVideoLandingPageLink2Activity.this.mnm, TTVideoLandingPageLink2Activity.this.jlb, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.Cwg, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.Cwg = System.currentTimeMillis();
            }
        });
        this.pvs.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.Wyp, this.od, this.HWd) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.Jd, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.cGU && TTVideoLandingPageLink2Activity.this.Ca != null && i == 100) {
                    TTVideoLandingPageLink2Activity.this.Ca.pvs(webView, TTVideoLandingPageLink2Activity.this.yWX);
                }
                if (TTVideoLandingPageLink2Activity.this.cnN != null) {
                    TTVideoLandingPageLink2Activity.this.cnN.pvs(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(kj.wS);
        if (textView != null && this.mnm.Mxy() != null) {
            textView.setText(this.mnm.Mxy().NB());
        }
        Ju.vG().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.thO = true;
                    if (TTVideoLandingPageLink2Activity.this.cnN != null) {
                        TTVideoLandingPageLink2Activity.this.cnN.icD();
                    }
                    TTVideoLandingPageLink2Activity.this.joF.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.neB) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(TTVideoLandingPageLink2Activity.this.mnm, TTVideoLandingPageLink2Activity.this.jlb, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.Cwg, false);
                } catch (Exception unused) {
                }
            }
        }, (this.mnm == null || this.mnm.Mxy() == null) ? WorkRequest.MIN_BACKOFF_MILLIS : this.mnm.Mxy().pvs() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected View pvs() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setBackgroundColor(-1);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout, new LinearLayout.LayoutParams(-1, Pj.icD(this, 220.0f)));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this);
        pAGFrameLayout2.setId(kj.gSd);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setPadding(0, Pj.icD(this, 20.0f), 0, 0);
        pAGFrameLayout.addView(pAGLinearLayout2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout2.addView(view, layoutParams);
        ShadowTextView shadowTextView = new ShadowTextView(this);
        shadowTextView.setId(520093713);
        shadowTextView.setGravity(17);
        shadowTextView.setText(uc.icD(this, "tt_reward_feedback"));
        shadowTextView.setTextColor(-1);
        shadowTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, Pj.icD(this, 28.0f));
        int icD = Pj.icD(this, 16.0f);
        layoutParams2.rightMargin = icD;
        layoutParams2.leftMargin = icD;
        pAGLinearLayout2.addView(shadowTextView, layoutParams2);
        ShadowImageView shadowImageView = new ShadowImageView(this);
        shadowImageView.setId(kj.qD);
        shadowImageView.setPadding(Pj.icD(this, 7.0f), Pj.icD(this, 7.0f), Pj.icD(this, 7.0f), Pj.icD(this, 7.0f));
        shadowImageView.setImageResource(uc.Jd(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(Pj.icD(this, 28.0f), Pj.icD(this, 28.0f));
        layoutParams3.rightMargin = Pj.icD(this, 12.0f);
        pAGLinearLayout2.addView(shadowImageView, layoutParams3);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
        pAGRelativeLayout.setVisibility(8);
        pAGRelativeLayout.setId(kj.od);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = Pj.icD(this, 10.0f);
        pAGLinearLayout.addView(pAGRelativeLayout, layoutParams4);
        CornerIV cornerIV = new CornerIV(this);
        cornerIV.setId(kj.OhP);
        cornerIV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        cornerIV.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(Pj.icD(this, 44.0f), Pj.icD(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = Pj.icD(this, 5.0f);
        pAGRelativeLayout.addView(cornerIV, layoutParams5);
        PAGTextView pAGTextView = new PAGTextView(this);
        pAGTextView.setId(kj.jhZ);
        pAGTextView.setBackground(so.pvs(this, "tt_circle_solid_mian"));
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 19.0f);
        pAGTextView.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(Pj.icD(this, 44.0f), Pj.icD(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = Pj.icD(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView, layoutParams6);
        PAGTextView pAGTextView2 = new PAGTextView(this);
        pAGTextView2.setId(kj.SE);
        pAGTextView2.setMaxLines(1);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setTextColor(Color.parseColor("#e5000000"));
        pAGTextView2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = Pj.icD(this, 5.0f);
        layoutParams7.rightMargin = Pj.icD(this, 80.0f);
        layoutParams7.addRule(1, kj.jhZ);
        pAGRelativeLayout.addView(pAGTextView2, layoutParams7);
        PAGTextView pAGTextView3 = new PAGTextView(this);
        pAGTextView3.setId(kj.yWX);
        pAGTextView3.setClickable(true);
        pAGTextView3.setMaxLines(1);
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setFocusable(true);
        pAGTextView3.setGravity(17);
        pAGTextView3.setText(uc.icD(this, "tt_video_mobile_go_detail"));
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setTextSize(2, 14.0f);
        pAGTextView3.setPadding(Pj.icD(this, 2.0f), Pj.icD(this, 2.0f), Pj.icD(this, 2.0f), Pj.icD(this, 2.0f));
        pAGTextView3.setBackground(so.pvs(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(Pj.icD(this, 90.0f), Pj.icD(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = Pj.icD(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView3, layoutParams8);
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout3, new LinearLayout.LayoutParams(-1, -1));
        SSWebView sSWebView = new SSWebView(this);
        sSWebView.setId(kj.sq);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = Pj.icD(this, 2.0f);
        pAGFrameLayout3.addView(sSWebView, layoutParams9);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(this);
        pAGRelativeLayout2.setId(kj.ea);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        pAGFrameLayout3.addView(pAGRelativeLayout2, new FrameLayout.LayoutParams(-1, -1));
        LandingPageLoadingLayout landingPageLoadingLayout = new LandingPageLoadingLayout(this);
        landingPageLoadingLayout.setId(kj.ZsW);
        pAGRelativeLayout2.addView(landingPageLoadingLayout, new RelativeLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(this);
        pAGLinearLayout3.setId(kj.sP);
        pAGLinearLayout3.setOrientation(1);
        pAGLinearLayout3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        pAGRelativeLayout2.addView(pAGLinearLayout3, layoutParams10);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this);
        tTRoundRectImageView.setId(kj.CjQ);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(Pj.icD(this, 80.0f), Pj.icD(this, 80.0f));
        layoutParams11.gravity = 17;
        pAGLinearLayout3.addView(tTRoundRectImageView, layoutParams11);
        PAGTextView pAGTextView4 = new PAGTextView(this);
        pAGTextView4.setId(kj.BSi);
        pAGTextView4.setTextColor(Color.parseColor("#161823"));
        pAGTextView4.setTextSize(0, Pj.icD(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = Pj.icD(this, 12.0f);
        pAGLinearLayout3.addView(pAGTextView4, layoutParams12);
        PAGTextView pAGTextView5 = new PAGTextView(this);
        pAGTextView5.setId(kj.cnN);
        pAGTextView5.setTextColor(Color.parseColor("#80161823"));
        pAGTextView5.setTextSize(0, Pj.icD(this, 16.0f));
        pAGTextView5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int icD2 = Pj.icD(this, 60.0f);
        layoutParams13.rightMargin = icD2;
        layoutParams13.leftMargin = icD2;
        layoutParams13.topMargin = Pj.icD(this, 8.0f);
        pAGLinearLayout3.addView(pAGTextView5, layoutParams13);
        PAGTextView pAGTextView6 = new PAGTextView(this);
        pAGTextView6.setId(kj.OyE);
        pAGTextView6.setGravity(17);
        pAGTextView6.setTextColor(-1);
        pAGTextView6.setText(uc.icD(this, "tt_video_mobile_go_detail"));
        pAGTextView6.setBackground(so.pvs(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(Pj.icD(this, 255.0f), Pj.icD(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = Pj.icD(this, 32.0f);
        pAGLinearLayout3.addView(pAGTextView6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        pAGLogoView.setId(kj.joF);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, Pj.icD(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = Pj.icD(this, 16.0f);
        layoutParams15.bottomMargin = Pj.icD(this, 20.0f);
        pAGRelativeLayout2.addView(pAGLogoView, layoutParams15);
        PangleViewStub pangleViewStub = new PangleViewStub(this, new PangleViewStub.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.pvs
            public View pvs(Context context) {
                return new LandingPageBrowserDownloadButton(context);
            }
        });
        pangleViewStub.setId(kj.thO);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, Pj.icD(this, 48.0f));
        layoutParams16.gravity = 81;
        pAGFrameLayout3.addView(pangleViewStub, layoutParams16);
        PangleViewStub pangleViewStub2 = new PangleViewStub(this, new PangleViewStub.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.pvs
            public View pvs(Context context) {
                return new LandingPageBrowserNewBottomBar(context);
            }
        });
        pangleViewStub2.setId(kj.qd);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, Pj.icD(this, 44.0f));
        layoutParams17.gravity = 80;
        pAGFrameLayout3.addView(pangleViewStub2, layoutParams17);
        return pAGLinearLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void vG() {
        super.vG();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(uc.pvs(mnm.pvs(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.kj();
                }
            });
        }
        this.qd = (TextView) findViewById(520093714);
        this.cnN = (LandingPageLoadingLayout) findViewById(kj.ZsW);
        this.OyE = findViewById(kj.ea);
        this.joF = findViewById(kj.sP);
        TextView textView2 = (TextView) findViewById(kj.BSi);
        TextView textView3 = (TextView) findViewById(kj.cnN);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) findViewById(kj.CjQ);
        this.rW = (TextView) findViewById(kj.OyE);
        if (this.mnm.ea() != null && !TextUtils.isEmpty(this.mnm.ea().pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.mnm.ea(), tTRoundRectImageView, this.mnm);
        }
        textView2.setText(this.mnm.OhP());
        textView3.setText(this.mnm.rW());
        findViewById(kj.joF).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.pvs(TTVideoLandingPageLink2Activity.this.NB, TTVideoLandingPageLink2Activity.this.mnm, TTVideoLandingPageLink2Activity.this.jlb);
            }
        });
        if (this.pvs != null && this.pvs.getWebView() != null) {
            jlb.pvs(this.mnm, this.pvs);
        }
        boolean ny = mnm.Jd().ny();
        this.cGU = ny;
        if (ny) {
            ((PangleViewStub) findViewById(kj.qd)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(kj.tQ);
            this.Zm = linearLayout;
            linearLayout.setVisibility(8);
            this.Ca = new Mxy(this, this.Zm, this.pvs, this.mnm, "landingpage_split_screen");
            if (this.pvs.getWebView() != null) {
                this.pvs.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float pvs = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.pvs = motionEvent.getY();
                        }
                        if (TTVideoLandingPageLink2Activity.this.od != null) {
                            TTVideoLandingPageLink2Activity.this.od.pvs(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.pvs;
                            if (y - f > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.Ca != null) {
                                    TTVideoLandingPageLink2Activity.this.Ca.pvs();
                                }
                                return false;
                            }
                            if (y - f < -8.0f && TTVideoLandingPageLink2Activity.this.Ca != null) {
                                TTVideoLandingPageLink2Activity.this.Ca.icD();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (this.pvs.getWebView() != null) {
            this.pvs.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTVideoLandingPageLink2Activity.this.od == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.od.pvs(motionEvent);
                    return false;
                }
            });
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.cnN;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.pvs(this.mnm, this.jlb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ju() {
        com.bytedance.sdk.openadsdk.icD.vG.pvs(this.mnm, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LandingPageLoadingLayout landingPageLoadingLayout = this.cnN;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.pvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void Jd() {
        if (NB()) {
            super.Jd();
            if (this.IP != null) {
                if (this.IP.getNativeVideoController() != null) {
                    this.IP.getNativeVideoController().pvs(false);
                    ((com.bytedance.sdk.openadsdk.core.video.nativevideo.vG) this.IP.getNativeVideoController()).yiw(false);
                    this.kj.setClickable(true);
                    this.kj.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() != 0) {
                                return false;
                            }
                            TTVideoLandingPageLink2Activity.this.Ju();
                            return false;
                        }
                    });
                }
                this.IP.getNativeVideoController().pvs(new vG.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                    public void icD(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                    public void pvs() {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                    public void pvs(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.pvs
                    public void pvs(long j, long j2) {
                        if (TTVideoLandingPageLink2Activity.this.qd != null) {
                            int max = (int) Math.max(0L, (j2 - j) / 1000);
                            TTVideoLandingPageLink2Activity.this.qd.setText(String.valueOf(max));
                            if (max <= 0) {
                                TTVideoLandingPageLink2Activity.this.qd.setVisibility(8);
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
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.mnm.BSi().get(0), imageView, this.mnm);
            this.kj.setVisibility(0);
            this.kj.removeAllViews();
            this.kj.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.icD.vG.icD(TTVideoLandingPageLink2Activity.this.mnm, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected boolean NB() {
        return this.Ju == 5 || this.Ju == 15 || this.Ju == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void Mxy() {
        super.Mxy();
        if (this.mnm != null) {
            this.mnm.sUS(true);
        }
        TextView textView = this.rW;
        if (textView != null) {
            textView.setText(icD());
            this.rW.setClickable(true);
            this.rW.setOnClickListener(this.sq);
            this.rW.setOnTouchListener(this.sq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IP() {
        LandingPageLoadingLayout landingPageLoadingLayout = this.cnN;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.icD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onDestroy() {
        IP();
        if (!this.thO && this.od != null && this.pvs != null && this.cnN.getVisibility() == 8) {
            this.od.pvs(this.pvs);
        }
        super.onDestroy();
    }

    private void bNS() {
        TTAdDislikeToast tTAdDislikeToast = this.ZsW;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.pvs(TTAdDislikeToast.getDislikeTip());
    }

    protected void kj() {
        if (isFinishing()) {
            return;
        }
        if (this.BSi.get()) {
            bNS();
            return;
        }
        if (this.ea == null) {
            mnm();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.ea;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.pvs();
        }
    }

    private void mnm() {
        try {
            if (this.ea == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.NB, this.mnm);
                this.ea = tTAdDislikeDialog;
                tTAdDislikeDialog.setDislikeSource("landing_page");
                this.ea.setCallback(new TTAdDislikeDialog.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void pvs(View view) {
                        TTVideoLandingPageLink2Activity.this.CjQ.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void icD(View view) {
                        TTVideoLandingPageLink2Activity.this.CjQ.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void pvs(int i, FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.BSi.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.BSi.set(true);
                        TTVideoLandingPageLink2Activity.this.vA();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.ea);
            if (this.ZsW == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.NB);
                this.ZsW = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vA() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.ZsW) == null) {
            return;
        }
        tTAdDislikeToast.pvs(TTAdDislikeToast.getDislikeSendTip());
    }
}
