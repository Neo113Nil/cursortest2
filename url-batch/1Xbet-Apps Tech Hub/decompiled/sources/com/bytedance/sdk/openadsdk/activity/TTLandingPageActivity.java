package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserDownloadButton;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewBottomBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewTitleBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserTitleBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserTitleBarForDark;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.common.Mxy;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.qh;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.gA;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.widget.pvs.sUS;
import com.bytedance.sdk.openadsdk.icD.Wyp;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.bNS;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.sUS;
import com.bytedance.sdk.openadsdk.utils.so;
import com.bytedance.sdk.openadsdk.utils.vA;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTLandingPageActivity extends TTBaseActivity implements com.bytedance.sdk.openadsdk.yiw.Jd {
    private int CvL;
    private int Gp;
    private String IP;
    private PAGProgressBar Ju;
    private TextView Mxy;
    private LandingPageLoadingLayout Pj;
    private Context Wyp;
    private ILoader ZhG;
    private String bNS;
    private String cR;
    private boolean cRf;
    private Mxy dx;
    private boolean gA;
    private sUS.pvs gSd;
    TTAdDislikeDialog icD;
    private qh jlb;
    private Button kj;
    private CvL mnm;
    private String ny;
    com.bytedance.sdk.openadsdk.icD.qh pvs;
    private com.bytedance.sdk.openadsdk.common.icD qD;
    private PangleViewStub qh;
    private String rCZ;
    private com.bytedance.sdk.openadsdk.utils.qh sP;
    private SSWebView sUS;
    private ImageView so;
    private com.com.bytedance.overseas.sdk.pvs.vG uc;
    private int vA;
    TTAdDislikeToast vG;
    private cR zM;
    private final AtomicBoolean OT = new AtomicBoolean(true);
    private final AtomicInteger dyT = new AtomicInteger(0);
    private final AtomicInteger dX = new AtomicInteger(0);
    private final AtomicInteger ae = new AtomicInteger(0);
    final AtomicBoolean Jd = new AtomicBoolean(false);
    final AtomicBoolean NB = new AtomicBoolean(false);
    private String od = "ダウンロード";

    @Override // com.bytedance.sdk.openadsdk.yiw.Jd
    public void pvs(boolean z, JSONArray jSONArray) {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        pvs(3);
        super.onCreate(bundle);
        if (!Ju.NB()) {
            finish();
            return;
        }
        try {
            mnm.pvs(this);
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            setContentView(icD());
            Intent intent = getIntent();
            int intExtra = intent.getIntExtra("sdk_version", 1);
            this.IP = intent.getStringExtra("adid");
            this.bNS = intent.getStringExtra("log_extra");
            this.vA = intent.getIntExtra(FirebaseAnalytics.Param.SOURCE, -1);
            String stringExtra = intent.getStringExtra(ImagesContract.URL);
            this.rCZ = stringExtra;
            icD(4);
            String stringExtra2 = intent.getStringExtra("web_title");
            this.cR = intent.getStringExtra("event_tag");
            this.ny = intent.getStringExtra("gecko_id");
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.zM = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(stringExtra3));
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.zM = OT.pvs().icD();
                OT.pvs().sUS();
            }
            if (this.zM == null) {
                finish();
                return;
            }
            this.gA = mnm.Jd().ny();
            NB();
            if (!TextUtils.isEmpty(this.ny)) {
                this.ZhG = com.bytedance.sdk.openadsdk.Jd.icD.pvs().icD();
                int pvs = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.ZhG, this.ny);
                this.CvL = pvs;
                this.Gp = pvs > 0 ? 2 : 0;
            }
            this.Wyp = this;
            if (this.sUS != null) {
                com.bytedance.sdk.openadsdk.core.widget.pvs.vG.pvs(this).pvs(false).icD(false).pvs(this.sUS.getWebView());
            }
            SSWebView sSWebView = this.sUS;
            if (sSWebView != null && sSWebView.getWebView() != null) {
                com.bytedance.sdk.openadsdk.icD.qh pvs2 = new com.bytedance.sdk.openadsdk.icD.qh(this.zM, this.sUS.getWebView(), new Wyp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.icD.Wyp
                    public void pvs(int i) {
                        vG.pvs.pvs(TTLandingPageActivity.this.CvL, TTLandingPageActivity.this.dX.get(), TTLandingPageActivity.this.ae.get(), TTLandingPageActivity.this.dyT.get() - TTLandingPageActivity.this.ae.get(), TTLandingPageActivity.this.zM, "landingpage", i);
                    }
                }, this.Gp).pvs(true);
                this.pvs = pvs2;
                this.gSd = pvs2.pvs;
                this.qD = jlb.pvs(this.zM, this.sUS, this.Wyp, this.cR);
            }
            sUS();
            this.sUS.setLandingPage(true);
            this.sUS.setTag("landingpage");
            this.sUS.setMaterialMeta(this.zM.xa());
            this.sUS.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(this.Wyp, this.mnm, this.IP, this.qD, this.pvs, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.Ju != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.Ju.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.Pj != null) {
                        TTLandingPageActivity.this.Pj.icD();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (!TextUtils.isEmpty(TTLandingPageActivity.this.ny)) {
                            TTLandingPageActivity.this.dyT.incrementAndGet();
                            WebResourceResponseModel pvs3 = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(TTLandingPageActivity.this.ZhG, TTLandingPageActivity.this.ny, str);
                            if (pvs3 != null && pvs3.getWebResourceResponse() != null) {
                                TTLandingPageActivity.this.ae.incrementAndGet();
                                return pvs3.getWebResourceResponse();
                            }
                            if (pvs3 != null && pvs3.getMsg() == 2) {
                                TTLandingPageActivity.this.dX.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            });
            SSWebView sSWebView2 = this.sUS;
            if (sSWebView2 != null) {
                sSWebView2.setUserAgentString(bNS.pvs(sSWebView2.getWebView(), intExtra));
            }
            SSWebView sSWebView3 = this.sUS;
            if (sSWebView3 != null) {
                sSWebView3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.zM, "landingpage", this.Gp);
            vA.pvs(this.sUS, stringExtra);
            this.sUS.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.mnm, this.pvs, this.qD) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.14
                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.Jd, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (TTLandingPageActivity.this.Pj != null) {
                        TTLandingPageActivity.this.Pj.pvs(i);
                    }
                    if (TTLandingPageActivity.this.gA) {
                        if (TTLandingPageActivity.this.jlb != null) {
                            TTLandingPageActivity.this.jlb.pvs(i);
                        }
                        if (TTLandingPageActivity.this.dx == null || i != 100) {
                            return;
                        }
                        TTLandingPageActivity.this.dx.pvs(webView, TTLandingPageActivity.this.gSd);
                        return;
                    }
                    if (TTLandingPageActivity.this.Ju == null || TTLandingPageActivity.this.isFinishing()) {
                        return;
                    }
                    if (i != 100 || !TTLandingPageActivity.this.Ju.isShown()) {
                        TTLandingPageActivity.this.Ju.setProgress(i);
                    } else {
                        TTLandingPageActivity.this.Ju.setVisibility(8);
                    }
                }
            });
            if (this.sUS.getWebView() != null) {
                this.sUS.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.15
                    @Override // android.view.View.OnScrollChangeListener
                    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                        if (TTLandingPageActivity.this.pvs != null) {
                            TTLandingPageActivity.this.pvs.icD(i2);
                        }
                    }
                });
                if (this.gA) {
                    this.sUS.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.16
                        float pvs = 0.0f;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (TTLandingPageActivity.this.pvs != null) {
                                TTLandingPageActivity.this.pvs.pvs(motionEvent);
                            }
                            if (motionEvent.getAction() == 0) {
                                this.pvs = motionEvent.getY();
                            }
                            if (motionEvent.getAction() == 2) {
                                float y = motionEvent.getY();
                                float f = this.pvs;
                                if (y - f > 8.0f) {
                                    if (TTLandingPageActivity.this.jlb != null) {
                                        TTLandingPageActivity.this.jlb.pvs();
                                    }
                                    if (TTLandingPageActivity.this.dx != null) {
                                        TTLandingPageActivity.this.dx.pvs();
                                    }
                                    return false;
                                }
                                if (y - f < -8.0f) {
                                    if (TTLandingPageActivity.this.jlb != null) {
                                        TTLandingPageActivity.this.jlb.icD();
                                    }
                                    if (TTLandingPageActivity.this.dx != null) {
                                        TTLandingPageActivity.this.dx.icD();
                                    }
                                }
                            }
                            return false;
                        }
                    });
                } else {
                    this.sUS.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.17
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (TTLandingPageActivity.this.pvs == null) {
                                return false;
                            }
                            TTLandingPageActivity.this.pvs.pvs(motionEvent);
                            return false;
                        }
                    });
                }
            }
            this.sUS.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.18
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (TTLandingPageActivity.this.uc != null) {
                        TTLandingPageActivity.this.uc.Jd();
                    }
                }
            });
            TextView textView = this.Mxy;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = uc.pvs(this, "tt_web_title_default");
                }
                textView.setText(stringExtra2);
            }
            vG();
            com.bytedance.sdk.openadsdk.utils.qh pvs3 = com.bytedance.sdk.openadsdk.utils.sUS.pvs(this, new sUS.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.19
                @Override // com.bytedance.sdk.openadsdk.utils.sUS.pvs
                public void icD() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.sUS.pvs
                public View pvs() {
                    return TTLandingPageActivity.this.so;
                }
            });
            this.sP = pvs3;
            pvs3.pvs(0L);
            vG.pvs.pvs(SystemClock.elapsedRealtime() - elapsedRealtime, this.zM, "landingpage", this.ZhG, this.ny);
        } catch (Throwable unused2) {
            finish();
        }
    }

    private View icD() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setOrientation(1);
        pAGFrameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        PangleViewStub pangleViewStub = new PangleViewStub(this, new PangleViewStub.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.20
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.pvs
            public View pvs(Context context) {
                return new LandingPageBrowserTitleBar(context);
            }
        });
        pangleViewStub.setId(kj.rW);
        pAGLinearLayout.addView(pangleViewStub, new LinearLayout.LayoutParams(-1, Pj.icD(this, 44.0f)));
        PangleViewStub pangleViewStub2 = new PangleViewStub(this, new PangleViewStub.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.pvs
            public View pvs(Context context) {
                return new LandingPageBrowserTitleBarForDark(context);
            }
        });
        pangleViewStub2.setId(kj.Cwg);
        pAGLinearLayout.addView(pangleViewStub2, new LinearLayout.LayoutParams(-1, Pj.icD(this, 44.0f)));
        PangleViewStub pangleViewStub3 = new PangleViewStub(this, new PangleViewStub.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.pvs
            public View pvs(Context context) {
                return new LandingPageBrowserNewTitleBar(context);
            }
        });
        pangleViewStub3.setId(kj.neB);
        pAGLinearLayout.addView(pangleViewStub3, new LinearLayout.LayoutParams(-1, Pj.icD(this, 44.0f)));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(pAGFrameLayout2, layoutParams);
        SSWebView sSWebView = new SSWebView(this);
        sSWebView.setId(kj.sq);
        pAGFrameLayout2.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        PangleViewStub pangleViewStub4 = new PangleViewStub(this, new PangleViewStub.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.pvs
            public View pvs(Context context) {
                return new LandingPageBrowserDownloadButton(context);
            }
        });
        pangleViewStub4.setId(kj.thO);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        pAGFrameLayout2.addView(pangleViewStub4, layoutParams2);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
        pAGProgressBar.setId(kj.cGU);
        pAGProgressBar.setProgress(1);
        pAGProgressBar.setVisibility(8);
        pAGProgressBar.setProgressDrawable(so.pvs(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, Pj.icD(this, 3.0f));
        layoutParams3.gravity = 49;
        pAGFrameLayout2.addView(pAGProgressBar, layoutParams3);
        PangleViewStub pangleViewStub5 = new PangleViewStub(this, new PangleViewStub.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.pvs
            public View pvs(Context context) {
                return new LandingPageBrowserNewBottomBar(context);
            }
        });
        pangleViewStub5.setId(kj.qd);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, Pj.icD(this, 44.0f));
        layoutParams4.gravity = 80;
        pAGFrameLayout2.addView(pangleViewStub5, layoutParams4);
        LandingPageLoadingLayout landingPageLoadingLayout = new LandingPageLoadingLayout(this);
        landingPageLoadingLayout.setId(520093721);
        pAGFrameLayout.addView(landingPageLoadingLayout, new FrameLayout.LayoutParams(-1, -1));
        return pAGFrameLayout;
    }

    private void pvs(int i) {
        if (i == 1 || Build.VERSION.SDK_INT == 26) {
            return;
        }
        if (Build.VERSION.SDK_INT == 27) {
            try {
                setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        } else {
            setRequestedOrientation(i);
        }
    }

    private void vG() {
        cR cRVar = this.zM;
        if (cRVar == null || cRVar.jhZ() != 4) {
            return;
        }
        PangleViewStub pangleViewStub = this.qh;
        if (pangleViewStub != null) {
            pangleViewStub.setVisibility(0);
        }
        Button button = (Button) findViewById(kj.rcB);
        this.kj = button;
        if (button != null) {
            pvs(Jd());
            if (this.uc == null) {
                this.uc = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this, this.zM, TextUtils.isEmpty(this.cR) ? jlb.icD(this.vA) : this.cR);
            }
            com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.icD.pvs(this, this.zM, this.cR, this.vA);
            pvsVar.pvs(false);
            this.kj.setOnClickListener(pvsVar);
            this.kj.setOnTouchListener(pvsVar);
            pvsVar.vG(true);
            pvsVar.pvs(this.uc);
        }
    }

    private String Jd() {
        cR cRVar = this.zM;
        if (cRVar != null && !TextUtils.isEmpty(cRVar.Cwg())) {
            this.od = this.zM.Cwg();
        }
        return this.od;
    }

    private void pvs(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.kj) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.kj == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.kj.setText(str);
            }
        });
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vG();
    }

    private void NB() {
        SSWebView sSWebView = (SSWebView) findViewById(kj.sq);
        this.sUS = sSWebView;
        jlb.pvs(this.zM, sSWebView);
        this.qh = (PangleViewStub) findViewById(kj.thO);
        PangleViewStub pangleViewStub = (PangleViewStub) findViewById(kj.rW);
        PangleViewStub pangleViewStub2 = (PangleViewStub) findViewById(kj.Cwg);
        LandingPageLoadingLayout landingPageLoadingLayout = (LandingPageLoadingLayout) findViewById(520093721);
        this.Pj = landingPageLoadingLayout;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.pvs(this.zM, this.cR, true);
            this.Pj.pvs();
        }
        if (this.gA) {
            PangleViewStub pangleViewStub3 = (PangleViewStub) findViewById(kj.neB);
            PangleViewStub pangleViewStub4 = (PangleViewStub) findViewById(kj.qd);
            pangleViewStub3.setVisibility(0);
            pangleViewStub4.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(kj.Ca);
            LinearLayout linearLayout = (LinearLayout) findViewById(kj.tQ);
            qh qhVar = new qh(this, relativeLayout, this.zM);
            this.jlb = qhVar;
            ImageView vG = qhVar.vG();
            this.so = vG;
            vG.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.dx = new Mxy(this, linearLayout, this.sUS, this.zM, "landingpage");
            return;
        }
        int Ju = com.bytedance.sdk.openadsdk.core.so.icD().Ju();
        if (Ju != 0) {
            if (Ju == 1 && pangleViewStub2 != null) {
                pangleViewStub2.setVisibility(0);
            }
        } else if (pangleViewStub != null) {
            pangleViewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.sUS != null) {
                        if (TTLandingPageActivity.this.gSd != null) {
                            TTLandingPageActivity.this.gSd.pvs();
                        }
                        if (TTLandingPageActivity.this.sUS.NB()) {
                            TTLandingPageActivity.this.sUS.sUS();
                        } else if (TTLandingPageActivity.this.yiw()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(520093716);
        this.so = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.Mxy = (TextView) findViewById(kj.FFl);
        PAGProgressBar pAGProgressBar = (PAGProgressBar) findViewById(kj.cGU);
        this.Ju = pAGProgressBar;
        pAGProgressBar.setVisibility(0);
        TextView textView = (TextView) findViewById(kj.UYh);
        if (textView != null) {
            textView.setText(uc.pvs(mnm.pvs(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.pvs();
                }
            });
        }
    }

    private void sUS() {
        CvL cvL = new CvL(this);
        this.mnm = cvL;
        cvL.icD(this.sUS).vG(this.IP).Jd(this.bNS).pvs(this.zM).icD(this.vA).pvs(this.zM.sP()).NB(this.zM.Sn()).pvs(this.sUS).icD("landingpage").pvs(this);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        CvL cvL = this.mnm;
        if (cvL != null) {
            cvL.Wyp();
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.pvs;
        if (qhVar != null) {
            qhVar.yiw();
        }
        if (!this.cRf) {
            this.cRf = true;
            pvs(4);
        }
        com.bytedance.sdk.openadsdk.utils.qh qhVar2 = this.sP;
        if (qhVar2 != null) {
            qhVar2.pvs();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.pvs;
        if (qhVar != null) {
            qhVar.so();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.utils.qh qhVar = this.sP;
        if (qhVar != null) {
            qhVar.icD();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (yiw() && !this.OT.getAndSet(true)) {
            so();
            icD(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yiw() {
        return !TextUtils.isEmpty(this.rCZ) && this.rCZ.contains("__luban_sdk");
    }

    private void icD(final int i) {
        if (this.so == null || !yiw()) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
            @Override // java.lang.Runnable
            public void run() {
                Pj.pvs((View) TTLandingPageActivity.this.so, i);
            }
        });
    }

    private void so() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.mnm.pvs("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        SSWebView sSWebView;
        super.onDestroy();
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.pvs;
        if (qhVar != null && (sSWebView = this.sUS) != null) {
            qhVar.pvs(sSWebView);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.sUS;
        if (sSWebView2 != null) {
            gA.pvs(sSWebView2.getWebView());
        }
        this.sUS = null;
        CvL cvL = this.mnm;
        if (cvL != null) {
            cvL.qh();
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar2 = this.pvs;
        if (qhVar2 != null) {
            qhVar2.vG(true);
        }
        if (!TextUtils.isEmpty(this.ny)) {
            vG.pvs.pvs(this.ae.get(), this.dyT.get(), this.zM);
        }
        com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.ZhG);
        com.bytedance.sdk.openadsdk.utils.qh qhVar3 = this.sP;
        if (qhVar3 != null) {
            qhVar3.vG();
        }
    }

    protected void pvs() {
        if (isFinishing()) {
            return;
        }
        if (this.NB.get()) {
            Wyp();
            return;
        }
        if (this.icD == null) {
            Mxy();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.icD;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.pvs();
        }
    }

    private void Mxy() {
        try {
            if (this.icD == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.Wyp, this.zM);
                this.icD = tTAdDislikeDialog;
                tTAdDislikeDialog.setDislikeSource("landing_page");
                this.icD.setCallback(new TTAdDislikeDialog.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.13
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void pvs(View view) {
                        TTLandingPageActivity.this.Jd.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void icD(View view) {
                        TTLandingPageActivity.this.Jd.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void pvs(int i, FilterWord filterWord) {
                        if (TTLandingPageActivity.this.NB.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.NB.set(true);
                        TTLandingPageActivity.this.qh();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.icD);
            if (this.vG == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.Wyp);
                this.vG = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void Wyp() {
        TTAdDislikeToast tTAdDislikeToast = this.vG;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.pvs(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.vG) == null) {
            return;
        }
        tTAdDislikeToast.pvs(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.vG.pvs(this, this.zM);
    }
}
