package com.bytedance.sdk.openadsdk.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.gA;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.pvs.sUS;
import com.bytedance.sdk.openadsdk.icD.Wyp;
import com.bytedance.sdk.openadsdk.icD.qh;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.bNS;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.vA;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseActivity implements com.bytedance.sdk.openadsdk.yiw.Jd {
    protected PangleViewStub CvL;
    protected Button Gp;
    protected NativeVideoTsView IP;
    protected TextView Jd;
    protected String Mxy;
    protected Context NB;
    protected RelativeLayout OT;
    private int OyE;
    protected String SE;
    protected CvL Wyp;
    protected CornerIV ZhG;
    protected com.com.bytedance.overseas.sdk.pvs.vG ae;
    protected long bNS;
    private int cnN;
    protected TextView dX;
    protected TextView dyT;
    private ILoader ea;
    protected int gSd;
    protected ImageView icD;
    protected String jlb;
    protected FrameLayout kj;
    protected cR mnm;
    protected TextView ny;
    protected qh od;
    protected SSWebView pvs;
    protected com.bytedance.sdk.openadsdk.multipro.icD.pvs qD;
    protected int qh;
    protected int sUS;
    protected String so;
    protected ImageView vG;
    protected sUS.pvs yWX;
    protected int Ju = -1;
    protected int vA = 0;
    protected int cR = 0;
    protected int zM = 0;
    protected int uc = 0;
    protected String rCZ = "ダウンロード";
    protected boolean gA = false;
    protected boolean dx = false;
    protected boolean Pj = true;
    protected boolean cRf = false;
    protected String sP = null;
    protected AtomicBoolean OhP = new AtomicBoolean(true);
    protected JSONArray jhZ = null;
    private final AtomicInteger ZsW = new AtomicInteger(0);
    private final AtomicInteger CjQ = new AtomicInteger(0);
    private final AtomicInteger BSi = new AtomicInteger(0);
    protected com.bytedance.sdk.openadsdk.core.icD.pvs sq = null;
    private final vG.icD joF = new vG.icD() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.icD
        public void pvs(boolean z) {
            TTVideoLandingPageActivity.this.gA = z;
            if (TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (z) {
                Pj.pvs((View) TTVideoLandingPageActivity.this.pvs, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.kj.getLayoutParams();
                TTVideoLandingPageActivity.this.cR = marginLayoutParams.leftMargin;
                TTVideoLandingPageActivity.this.vA = marginLayoutParams.topMargin;
                TTVideoLandingPageActivity.this.zM = marginLayoutParams.width;
                TTVideoLandingPageActivity.this.uc = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                TTVideoLandingPageActivity.this.kj.setLayoutParams(marginLayoutParams);
                return;
            }
            Pj.pvs((View) TTVideoLandingPageActivity.this.pvs, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.kj.getLayoutParams();
            marginLayoutParams2.width = TTVideoLandingPageActivity.this.zM;
            marginLayoutParams2.height = TTVideoLandingPageActivity.this.uc;
            marginLayoutParams2.leftMargin = TTVideoLandingPageActivity.this.cR;
            marginLayoutParams2.topMargin = TTVideoLandingPageActivity.this.vA;
            TTVideoLandingPageActivity.this.kj.setLayoutParams(marginLayoutParams2);
        }
    };
    private final ny.pvs thO = new ny.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.ny.pvs
        public void pvs(Context context, Intent intent, boolean z, final int i) {
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    pvs(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pvs(int i) {
            if (TTVideoLandingPageActivity.this.gSd == 0 && i != 0 && TTVideoLandingPageActivity.this.pvs != null && TTVideoLandingPageActivity.this.sP != null) {
                TTVideoLandingPageActivity.this.pvs.a_(TTVideoLandingPageActivity.this.sP);
            }
            if (TTVideoLandingPageActivity.this.IP != null && TTVideoLandingPageActivity.this.IP.getNativeVideoController() != null && !TTVideoLandingPageActivity.this.dx && TTVideoLandingPageActivity.this.gSd != i) {
                ((com.bytedance.sdk.openadsdk.core.video.nativevideo.vG) TTVideoLandingPageActivity.this.IP.getNativeVideoController()).vG(i);
            }
            TTVideoLandingPageActivity.this.gSd = i;
        }
    };

    protected abstract boolean NB();

    protected abstract View pvs();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!Ju.NB()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            mnm.pvs(this);
        } catch (Throwable unused2) {
        }
        this.gSd = com.bytedance.sdk.component.utils.mnm.vG(getApplicationContext());
        try {
            setContentView(pvs());
            this.NB = this;
            Intent intent = getIntent();
            this.sUS = intent.getIntExtra("sdk_version", 1);
            this.so = intent.getStringExtra("adid");
            this.Mxy = intent.getStringExtra("log_extra");
            this.qh = intent.getIntExtra(FirebaseAnalytics.Param.SOURCE, -1);
            this.sP = intent.getStringExtra(ImagesContract.URL);
            String stringExtra = intent.getStringExtra("web_title");
            this.jlb = intent.getStringExtra("event_tag");
            this.SE = intent.getStringExtra("gecko_id");
            this.cRf = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.bNS = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.mnm = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                cR cRVar = this.mnm;
                if (cRVar != null) {
                    this.Ju = cRVar.Ye();
                }
            } else {
                cR icD = OT.pvs().icD();
                this.mnm = icD;
                if (icD != null) {
                    this.Ju = icD.Ye();
                }
                OT.pvs().sUS();
            }
            if (this.mnm == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.SE)) {
                this.ea = com.bytedance.sdk.openadsdk.Jd.icD.pvs().icD();
                int pvs2 = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.ea, this.SE);
                this.cnN = pvs2;
                this.OyE = pvs2 > 0 ? 2 : 0;
            }
            if (stringExtra2 != null) {
                try {
                    this.qD = com.bytedance.sdk.openadsdk.multipro.icD.pvs.pvs(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.icD.pvs pvsVar = this.qD;
                if (pvsVar != null) {
                    this.bNS = pvsVar.yiw;
                }
            }
            if (bundle != null) {
                String string = bundle.getString("material_meta");
                if (this.mnm == null) {
                    try {
                        this.mnm = com.bytedance.sdk.openadsdk.core.icD.pvs(new JSONObject(string));
                    } catch (Throwable unused5) {
                    }
                }
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.bNS = j;
                }
            }
            vG();
            Mxy();
            Ju();
            pvs(4);
            if (this.pvs != null) {
                com.bytedance.sdk.openadsdk.core.widget.pvs.vG.pvs(this.NB).pvs(true).icD(false).pvs(this.pvs.getWebView());
                qh pvs3 = new qh(this.mnm, this.pvs.getWebView(), new Wyp() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.icD.Wyp
                    public void pvs(int i) {
                        vG.pvs.pvs(TTVideoLandingPageActivity.this.cnN, TTVideoLandingPageActivity.this.BSi.get(), TTVideoLandingPageActivity.this.CjQ.get(), TTVideoLandingPageActivity.this.ZsW.get() - TTVideoLandingPageActivity.this.CjQ.get(), TTVideoLandingPageActivity.this.mnm, "landingpage_split_screen", i);
                    }
                }, this.OyE).pvs(true);
                this.od = pvs3;
                this.yWX = pvs3.pvs;
                this.od.pvs("landingpage_split_screen");
            }
            SSWebView sSWebView = this.pvs;
            if (sSWebView != null) {
                sSWebView.setLandingPage(true);
                this.pvs.setTag("landingpage_split_screen");
                this.pvs.setMaterialMeta(this.mnm.xa());
                this.pvs.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(this.NB, this.Wyp, this.so, this.od, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (!TextUtils.isEmpty(TTVideoLandingPageActivity.this.SE)) {
                                TTVideoLandingPageActivity.this.ZsW.incrementAndGet();
                                WebResourceResponseModel pvs4 = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(TTVideoLandingPageActivity.this.ea, TTVideoLandingPageActivity.this.SE, str);
                                if (pvs4 != null && pvs4.getWebResourceResponse() != null) {
                                    TTVideoLandingPageActivity.this.CjQ.incrementAndGet();
                                    return pvs4.getWebResourceResponse();
                                }
                                if (pvs4 != null && pvs4.getMsg() == 2) {
                                    TTVideoLandingPageActivity.this.BSi.incrementAndGet();
                                }
                                return super.shouldInterceptRequest(webView, str);
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.Ju.pvs("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                SSWebView sSWebView2 = this.pvs;
                sSWebView2.setUserAgentString(bNS.pvs(sSWebView2.getWebView(), this.sUS));
            }
            SSWebView sSWebView3 = this.pvs;
            if (sSWebView3 != null) {
                sSWebView3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.mnm, "landingpage_split_screen", this.OyE);
            vA.pvs(this.pvs, this.sP);
            this.pvs.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.Wyp, this.od) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.Jd, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.pvs.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                    if (TTVideoLandingPageActivity.this.ae != null) {
                        TTVideoLandingPageActivity.this.ae.Jd();
                    }
                }
            });
            TextView textView = this.Jd;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = uc.pvs(this, "tt_web_title_default");
                }
                textView.setText(stringExtra);
            }
            Wyp();
            Jd();
            kj();
            vG.pvs.pvs(SystemClock.elapsedRealtime() - elapsedRealtime, this.mnm, "landingpage_split_screen", this.ea, this.SE);
        } catch (Throwable unused6) {
            finish();
        }
    }

    private void kj() {
        cR cRVar = this.mnm;
        if (cRVar == null || cRVar.jhZ() != 4) {
            return;
        }
        this.CvL.setVisibility(0);
        Button button = (Button) findViewById(kj.rcB);
        this.Gp = button;
        if (button != null) {
            pvs(icD());
            this.Gp.setOnClickListener(this.sq);
            this.Gp.setOnTouchListener(this.sq);
        }
    }

    protected String icD() {
        cR cRVar = this.mnm;
        if (cRVar != null && !TextUtils.isEmpty(cRVar.Cwg())) {
            this.rCZ = this.mnm.Cwg();
        }
        return this.rCZ;
    }

    private void pvs(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.Gp) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (TTVideoLandingPageActivity.this.Gp == null || TTVideoLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.Gp.setText(str);
            }
        });
    }

    protected void vG() {
        this.CvL = (PangleViewStub) findViewById(kj.thO);
        this.pvs = (SSWebView) findViewById(kj.sq);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.icD = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.pvs != null) {
                        if (TTVideoLandingPageActivity.this.yWX != null) {
                            TTVideoLandingPageActivity.this.yWX.pvs();
                        }
                        if (!TTVideoLandingPageActivity.this.pvs.NB()) {
                            if (TTVideoLandingPageActivity.this.vA()) {
                                TTVideoLandingPageActivity.this.onBackPressed();
                                return;
                            } else {
                                com.bytedance.sdk.openadsdk.icD.vG.pvs(TTVideoLandingPageActivity.this.mnm, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.sUS(), TTVideoLandingPageActivity.this.yiw(), (TTVideoLandingPageActivity.this.IP == null || TTVideoLandingPageActivity.this.IP.getNativeVideoController() == null) ? null : jlb.pvs(TTVideoLandingPageActivity.this.mnm, TTVideoLandingPageActivity.this.IP.getNativeVideoController().sUS(), TTVideoLandingPageActivity.this.IP.getNativeVideoController().kj()), (yiw) null);
                                TTVideoLandingPageActivity.this.finish();
                                return;
                            }
                        }
                        TTVideoLandingPageActivity.this.pvs.sUS();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.cRf);
        }
        ImageView imageView2 = (ImageView) findViewById(kj.qD);
        this.vG = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.IP != null) {
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(TTVideoLandingPageActivity.this.mnm, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.sUS(), TTVideoLandingPageActivity.this.yiw(), TTVideoLandingPageActivity.this.IP.getNativeVideoController() != null ? jlb.pvs(TTVideoLandingPageActivity.this.mnm, TTVideoLandingPageActivity.this.IP.getNativeVideoController().sUS(), TTVideoLandingPageActivity.this.IP.getNativeVideoController().kj()) : null, (yiw) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.Jd = (TextView) findViewById(kj.FFl);
        this.kj = (FrameLayout) findViewById(kj.gSd);
        this.OT = (RelativeLayout) findViewById(kj.od);
        this.ny = (TextView) findViewById(kj.jhZ);
        this.dyT = (TextView) findViewById(kj.SE);
        this.dX = (TextView) findViewById(kj.yWX);
        this.ZhG = (CornerIV) findViewById(kj.OhP);
        so();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kj();
    }

    protected void Jd() {
        if (NB()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.NB, this.mnm, true, null);
                this.IP = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.IP.getNativeVideoController().pvs(false);
                }
                if (this.dx) {
                    this.kj.setVisibility(0);
                    this.kj.removeAllViews();
                    this.kj.addView(this.IP);
                    this.IP.icD(true);
                } else {
                    if (!this.cRf) {
                        this.bNS = 0L;
                    }
                    if (this.qD != null && this.IP.getNativeVideoController() != null) {
                        this.IP.getNativeVideoController().icD(this.qD.yiw);
                        this.IP.getNativeVideoController().vG(this.qD.NB);
                        this.IP.setIsQuiet(mnm.Jd().vG(String.valueOf(this.mnm.yTz())));
                    }
                    if (this.IP.pvs(this.bNS, this.Pj, this.dx)) {
                        this.kj.setVisibility(0);
                        this.kj.removeAllViews();
                        this.kj.addView(this.IP);
                    }
                    if (this.IP.getNativeVideoController() != null) {
                        this.IP.getNativeVideoController().pvs(false);
                        this.IP.getNativeVideoController().pvs(this.joF);
                    }
                }
                String pvs2 = this.mnm.BSi().get(0).pvs();
                com.bytedance.sdk.openadsdk.sUS.Jd.pvs().pvs(pvs2).pvs(this.mnm.BSi().get(0).icD()).icD(this.mnm.BSi().get(0).vG()).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).vG(2).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(this.mnm, pvs2, new com.bytedance.sdk.component.NB.mnm<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(com.bytedance.sdk.component.NB.qh<Bitmap> qhVar) {
                        try {
                            new pvs(qhVar.icD(), TTVideoLandingPageActivity.this.IP.getNativeVideoController().Ju()).execute(new Void[0]);
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.IP.findViewById(520093726).setOnTouchListener(null);
                this.IP.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTVideoLandingPage", e.getMessage());
                if (this.IP == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.gSd == 0) {
                try {
                    Toast.makeText(this, uc.icD(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    protected long sUS() {
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0L;
        }
        return this.IP.getNativeVideoController().so();
    }

    protected int yiw() {
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.IP.getNativeVideoController().Wyp();
    }

    protected void so() {
        String OhP;
        cR cRVar = this.mnm;
        if (cRVar == null || cRVar.jhZ() != 4) {
            return;
        }
        Pj.pvs((View) this.OT, 0);
        if (!TextUtils.isEmpty(this.mnm.qd())) {
            OhP = this.mnm.qd();
        } else if (!TextUtils.isEmpty(this.mnm.rW())) {
            OhP = this.mnm.rW();
        } else {
            OhP = !TextUtils.isEmpty(this.mnm.OhP()) ? this.mnm.OhP() : "";
        }
        if (this.mnm.ea() != null && this.mnm.ea().pvs() != null) {
            Pj.pvs((View) this.ZhG, 0);
            Pj.pvs((View) this.ny, 4);
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.mnm.ea(), this.ZhG, this.mnm);
        } else if (!TextUtils.isEmpty(OhP)) {
            Pj.pvs((View) this.ZhG, 4);
            Pj.pvs((View) this.ny, 0);
            this.ny.setText(OhP.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.mnm.Cwg())) {
            this.dX.setText(this.mnm.Cwg());
        }
        if (!TextUtils.isEmpty(OhP)) {
            this.dyT.setText(OhP);
        }
        Pj.pvs((View) this.dyT, 0);
        Pj.pvs((View) this.dX, 0);
    }

    public void Mxy() {
        cR cRVar = this.mnm;
        if (cRVar == null) {
            return;
        }
        this.ae = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this, cRVar, this.jlb);
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.icD.pvs(this, this.mnm, this.jlb, this.qh);
        this.sq = pvsVar;
        pvsVar.pvs(false);
        this.sq.vG(true);
        this.dX.setOnClickListener(this.sq);
        this.dX.setOnTouchListener(this.sq);
        this.sq.pvs(this.ae);
    }

    private void Ju() {
        CvL cvL = new CvL(this);
        this.Wyp = cvL;
        cvL.icD(this.pvs).vG(this.so).Jd(this.Mxy).icD(this.qh).pvs(this.mnm).pvs(this.mnm.sP()).pvs(this.pvs).icD("landingpage_split_screen").NB(this.mnm.Sn());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.gA && (nativeVideoTsView = this.IP) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((com.bykv.vk.openvk.component.video.api.Jd.pvs) this.IP.getNativeVideoController()).NB(null, null);
            this.gA = false;
        } else if (vA() && !this.OhP.getAndSet(true)) {
            cR();
            pvs(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        cR cRVar = this.mnm;
        bundle.putString("material_meta", cRVar != null ? cRVar.wjr().toString() : null);
        bundle.putLong("video_play_position", this.bNS);
        bundle.putBoolean("is_complete", this.dx);
        long j = this.bNS;
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            j = this.IP.getNativeVideoController().NB();
        }
        bundle.putLong("video_play_position", j);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.Pj) {
            IP();
        }
        this.Pj = false;
        CvL cvL = this.Wyp;
        if (cvL != null) {
            cvL.Wyp();
        }
        qh qhVar = this.od;
        if (qhVar != null) {
            qhVar.yiw();
        }
    }

    private void IP() {
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null || mnm()) {
            return;
        }
        this.IP.Ju();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        bNS();
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return;
        }
        pvs(this.IP.getNativeVideoController());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        qh qhVar = this.od;
        if (qhVar != null) {
            qhVar.so();
        }
    }

    private void pvs(com.bykv.vk.openvk.component.video.api.Jd.vG vGVar) {
        this.dx = this.dx || vGVar.bNS();
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.dx));
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(vGVar.NB()));
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(vGVar.so() + vGVar.sUS()));
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_native_video_data", "key_video_duration", Long.valueOf(vGVar.so()));
    }

    private void bNS() {
        if (this.IP == null || mnm()) {
            return;
        }
        this.IP.Ju();
    }

    private boolean mnm() {
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return true;
        }
        return this.IP.getNativeVideoController().bNS();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        qh();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.mnm.sUS(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.pvs;
        if (sSWebView != null) {
            gA.pvs(sSWebView.getWebView());
        }
        this.pvs = null;
        CvL cvL = this.Wyp;
        if (cvL != null) {
            cvL.qh();
        }
        NativeVideoTsView nativeVideoTsView = this.IP;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            this.IP.getNativeVideoController().Jd();
        }
        this.IP = null;
        this.mnm = null;
        qh qhVar = this.od;
        if (qhVar != null) {
            qhVar.vG(true);
        }
        if (!TextUtils.isEmpty(this.SE)) {
            vG.pvs.pvs(this.CjQ.get(), this.ZsW.get(), this.mnm);
        }
        com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.ea);
    }

    protected void Wyp() {
        ny.pvs(this.thO, this.NB);
    }

    protected void qh() {
        try {
            ny.pvs(this.thO);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vA() {
        return !TextUtils.isEmpty(this.sP) && this.sP.contains("__luban_sdk");
    }

    private void pvs(final int i) {
        if (this.vG == null || !vA()) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                Pj.pvs((View) TTVideoLandingPageActivity.this.vG, i);
            }
        });
    }

    private void cR() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.Wyp.pvs("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yiw.Jd
    public void pvs(boolean z, JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.jhZ = jSONArray;
    }

    private static class pvs extends AsyncTask<Void, Void, Drawable> {
        private final WeakReference<com.bykv.vk.openvk.component.video.api.Jd.icD> icD;
        private final Bitmap pvs;

        private pvs(Bitmap bitmap, com.bykv.vk.openvk.component.video.api.Jd.icD icd) {
            this.pvs = bitmap;
            this.icD = new WeakReference<>(icd);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap pvs = com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(mnm.pvs(), this.pvs, 25);
                if (pvs == null) {
                    return null;
                }
                return new BitmapDrawable(mnm.pvs().getResources(), pvs);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.component.video.api.Jd.icD> weakReference;
            if (drawable == null || (weakReference = this.icD) == null || weakReference.get() == null) {
                return;
            }
            this.icD.get().pvs(drawable);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.vG.pvs(this, this.mnm);
    }
}
