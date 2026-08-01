package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.gA;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LandingPageModel.java */
/* loaded from: classes2.dex */
public class mnm implements Handler.Callback {
    private int BSi;
    private ImageView CvL;
    private View Gp;
    com.bytedance.sdk.openadsdk.core.icD.icD IP;
    FrameLayout Jd;
    com.bytedance.sdk.openadsdk.core.icD.pvs Ju;
    ObjectAnimator Mxy;
    View NB;
    private CvL OT;
    private com.bytedance.sdk.openadsdk.common.icD OyE;
    private final com.bytedance.sdk.openadsdk.core.video.vG.icD Pj;
    private com.bytedance.sdk.openadsdk.core.widget.pvs.NB SE;
    ObjectAnimator Wyp;
    private FrameLayout ZhG;
    private long ae;
    private Handler bNS;
    private TextView cR;
    private final View cRf;
    private int cnN;
    private View dX;
    private String dx;
    private LandingPageLoadingLayout dyT;
    private com.com.bytedance.overseas.sdk.pvs.vG gSd;
    FrameLayout icD;
    private boolean jhZ;
    private final Activity jlb;
    vG.pvs kj;
    private View mnm;
    private SSWebView ny;
    private boolean od;
    ImageView pvs;
    private com.bytedance.sdk.openadsdk.icD.qh qD;
    ObjectAnimator qh;
    private TextView rCZ;
    private int sP;
    RelativeLayout sUS;
    FrameLayout so;
    private ILoader sq;
    private TTRoundRectImageView uc;
    private View vA;
    TextView vG;
    private String yWX;
    final cR yiw;
    private TextView zM;
    private final AtomicBoolean gA = new AtomicBoolean(false);
    private final AtomicBoolean OhP = new AtomicBoolean(false);
    private volatile int ea = 0;
    private volatile int ZsW = 0;
    private volatile int CjQ = 0;

    static /* synthetic */ int IP(mnm mnmVar) {
        int i = mnmVar.ea;
        mnmVar.ea = i + 1;
        return i;
    }

    static /* synthetic */ int mnm(mnm mnmVar) {
        int i = mnmVar.ZsW;
        mnmVar.ZsW = i + 1;
        return i;
    }

    static /* synthetic */ int vA(mnm mnmVar) {
        int i = mnmVar.CjQ;
        mnmVar.CjQ = i + 1;
        return i;
    }

    public mnm(Activity activity, final cR cRVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.video.vG.icD icd, View view) {
        this.jlb = activity;
        this.yiw = cRVar;
        this.dx = str;
        this.Pj = icd;
        this.cRf = view;
        this.sP = jlb.pvs(str);
        if (cRVar != null) {
            this.yWX = cRVar.tQ();
        }
        if (!TextUtils.isEmpty(this.yWX)) {
            this.sq = com.bytedance.sdk.openadsdk.Jd.icD.pvs().icD();
            int pvs = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.sq, this.yWX);
            this.BSi = pvs;
            this.cnN = pvs > 0 ? 2 : 0;
        }
        boolean vG = vG(cRVar);
        boolean Jd = Jd(cRVar);
        if (icD(cRVar)) {
            this.dx = "landingpage_split_screen";
        } else if (vG) {
            this.dx = "landingpage_direct";
        } else if (Jd) {
            this.dx = "aggregate_page";
        }
        this.Ju = new com.bytedance.sdk.openadsdk.core.icD.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), cRVar, this.dx, jlb.pvs(str));
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        this.Ju.pvs(hashMap);
        View findViewById = activity.findViewById(R.id.content);
        this.Ju.pvs(findViewById);
        com.bytedance.sdk.openadsdk.core.icD.icD icd2 = new com.bytedance.sdk.openadsdk.core.icD.icD(activity, cRVar, this.dx, jlb.pvs(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.1
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD
            public boolean pvs(Wyp wyp, Map<String, Object> map) {
                if (mnm.yiw(cRVar) && mnm.this.SE != null) {
                    mnm.this.SE.pvs(wyp);
                    mnm.this.SE.pvs(map);
                    if (mnm.sUS(mnm.this.yiw) || mnm.this.jhZ) {
                        return true;
                    }
                }
                return super.pvs(wyp, map);
            }
        };
        this.IP = icd2;
        icd2.pvs(hashMap);
        this.IP.pvs(findViewById);
        this.so = frameLayout;
        if (vG || Jd) {
            try {
                Handler handler = new Handler(Looper.getMainLooper(), this);
                this.bNS = handler;
                handler.sendMessage(handler.obtainMessage(100, 0, 0));
            } catch (Exception e) {
                Log.e("LandingPageModel", "LandingPageModel: ", e);
            }
        }
    }

    public void pvs(vG.pvs pvsVar) {
        this.kj = pvsVar;
    }

    public void pvs() {
        long pvs;
        View view;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        SSWebView sSWebView = (SSWebView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.rCZ);
        this.ny = sSWebView;
        if (sSWebView != null && !cR.pvs(this.yiw)) {
            this.ny.g_();
        } else {
            Pj.pvs((View) this.ny, 8);
        }
        this.ZhG = (FrameLayout) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.uc);
        this.dyT = (LandingPageLoadingLayout) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.dyT);
        this.dX = this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.OT);
        this.CvL = (ImageView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.ny);
        this.Gp = this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.Pj);
        this.icD = (FrameLayout) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.cR);
        this.pvs = (ImageView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.zM);
        this.sUS = (RelativeLayout) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.ZhG);
        this.vG = (TextView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.wS);
        this.Jd = (FrameLayout) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.Wyp);
        View findViewById = this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.dX);
        this.mnm = findViewById;
        if (findViewById == null) {
            this.mnm = this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.sP);
        }
        this.vA = this.jlb.findViewById(com.bytedance.sdk.openadsdk.utils.kj.CvL);
        this.cR = (TextView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.ae);
        this.zM = (TextView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.gA);
        this.uc = (TTRoundRectImageView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.Gp);
        this.rCZ = (TextView) this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.jlb);
        if (this.vG != null && this.yiw.Mxy() != null) {
            this.vG.setText(this.yiw.Mxy().NB());
        }
        this.NB = this.cRf.findViewById(com.bytedance.sdk.openadsdk.utils.kj.dx);
        if ((vG(this.yiw) || icD(this.yiw) || Jd(this.yiw)) && this.yiw.Mxy() != null) {
            View view2 = this.NB;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (Jd(this.yiw)) {
                pvs = this.yiw.Mxy().vG();
            } else {
                pvs = this.yiw.Mxy().pvs();
            }
            com.bytedance.sdk.openadsdk.core.Ju.vG().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.8
                @Override // java.lang.Runnable
                public void run() {
                    if (mnm.this.gA.get()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(mnm.this.yiw, mnm.this.dx, System.currentTimeMillis() - mnm.this.ae, false);
                    mnm.this.kj();
                }
            }, pvs * 1000);
        }
        so();
        if (icD(this.yiw)) {
            IP();
            if (!vG()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ZhG.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.ZhG.setLayoutParams(layoutParams);
            }
        }
        if ((vG(this.yiw) || Jd(this.yiw)) && (view = this.Gp) != null) {
            view.setVisibility(8);
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.dyT;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.pvs(this.yiw, this.dx);
        }
        vG.pvs.pvs(SystemClock.elapsedRealtime() - valueOf.longValue(), this.yiw, this.dx, this.sq, this.yWX);
    }

    private void so() {
        LandingPageLoadingLayout landingPageLoadingLayout;
        SSWebView sSWebView = this.ny;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.pvs.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs(false).icD(false).pvs(this.ny.getWebView());
            SSWebView sSWebView2 = this.ny;
            if (sSWebView2 != null && sSWebView2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.icD.qh pvs = new com.bytedance.sdk.openadsdk.icD.qh(this.yiw, this.ny.getWebView(), new com.bytedance.sdk.openadsdk.icD.Wyp() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.9
                    @Override // com.bytedance.sdk.openadsdk.icD.Wyp
                    public void pvs(int i) {
                        vG.pvs.pvs(mnm.this.BSi, mnm.this.CjQ, mnm.this.ZsW, mnm.this.ea - mnm.this.ZsW, mnm.this.yiw, mnm.this.dx, i);
                    }
                }, this.cnN).pvs(true);
                this.qD = pvs;
                pvs.pvs(this.dx);
                com.bytedance.sdk.openadsdk.common.icD pvs2 = jlb.pvs(this.yiw, this.ny, this.jlb, this.dx);
                this.OyE = pvs2;
                if (pvs2 != null) {
                    pvs2.pvs(this.dx);
                }
                jlb.pvs(this.yiw, this.ny);
            }
            Mxy();
            this.ny.setLandingPage(true);
            this.ny.setTag(this.dx);
            this.ny.setMaterialMeta(this.yiw.xa());
            com.bytedance.sdk.openadsdk.core.widget.pvs.NB nb = new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(com.bytedance.sdk.openadsdk.core.mnm.pvs(), this.OT, this.yiw.neB(), this.OyE, this.qD, true) { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.10
                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    mnm.this.Wyp();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    mnm.this.Pj.qh();
                    mnm.this.ae = System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String Jd = Jd(str2);
                    if (this.sUS != null) {
                        this.sUS.pvs(webView, i, str, str2, Jd(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z = Jd != null && Jd.startsWith("image");
                    boolean z2 = Jd != null && Jd.startsWith("mp4");
                    if (z || z2 || mnm.this.gA.get()) {
                        return;
                    }
                    mnm.this.kj();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        mnm.this.kj();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(mnm.this.yWX)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        mnm.IP(mnm.this);
                        WebResourceResponseModel pvs3 = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(mnm.this.sq, mnm.this.yWX, str);
                        if (pvs3 != null && pvs3.getWebResourceResponse() != null) {
                            mnm.mnm(mnm.this);
                            return pvs3.getWebResourceResponse();
                        }
                        if (pvs3 != null && pvs3.getMsg() == 2) {
                            mnm.vA(mnm.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.Ju.pvs("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.SE = nb;
            this.ny.setWebViewClient(nb);
            this.SE.pvs(this.yiw);
            this.SE.pvs(this.dx);
            this.ny.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.OT, this.qD, this.OyE) { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.11
                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.Jd, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (mnm.this.jlb != null && !mnm.this.jlb.isFinishing() && i == 100) {
                        mnm.this.Wyp();
                    }
                    if (mnm.this.dyT != null) {
                        mnm.this.dyT.pvs(i);
                    }
                }
            });
            if (this.gSd == null) {
                this.gSd = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), this.yiw, this.dx);
            }
            this.ny.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.12
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (mnm.this.gSd != null) {
                        mnm.this.gSd.Jd();
                    }
                }
            });
            SSWebView sSWebView3 = this.ny;
            sSWebView3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.bNS.pvs(sSWebView3.getWebView(), BuildConfig.VERSION_CODE));
            this.ny.setMixedContentMode(0);
            this.ny.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.13
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (mnm.this.qD != null) {
                        mnm.this.qD.icD(i2);
                    }
                }
            });
            this.ny.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.14
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if ((!mnm.this.jhZ || mnm.yiw(mnm.this.yiw)) && !mnm.Jd(mnm.this.yiw)) {
                        mnm.this.IP.onTouch(view, motionEvent);
                    }
                    if ((!mnm.this.jhZ || mnm.yiw(mnm.this.yiw)) && !mnm.Jd(mnm.this.yiw) && motionEvent.getAction() == 1 && mnm.this.IP.yiw()) {
                        mnm.this.ny.getWebView().performClick();
                        mnm.this.jhZ = true;
                    }
                    if (mnm.this.qD == null) {
                        return false;
                    }
                    mnm.this.qD.pvs(motionEvent);
                    return false;
                }
            });
            this.ny.getWebView().setOnClickListener(this.IP);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.yiw, this.dx, this.cnN);
            com.bytedance.sdk.openadsdk.utils.vA.pvs(this.ny, this.yiw.CjQ());
            this.od = true;
        }
        if (this.ny == null || (landingPageLoadingLayout = this.dyT) == null) {
            return;
        }
        landingPageLoadingLayout.pvs();
    }

    private void Mxy() {
        CvL cvL = new CvL(this.jlb);
        this.OT = cvL;
        cvL.icD(this.ny).vG(this.yiw.neB()).Jd(this.yiw.HWd()).pvs(this.yiw).icD(Jd(this.yiw) ? this.sP : -1).pvs(this.yiw.sP()).icD(this.dx).NB(this.yiw.Sn()).pvs(this.ny).pvs(new com.bytedance.sdk.openadsdk.core.widget.icD() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.15
            @Override // com.bytedance.sdk.openadsdk.core.widget.icD
            public void pvs() {
                if (!mnm.Jd(mnm.this.yiw) || !(mnm.this.jlb instanceof com.bytedance.sdk.openadsdk.core.video.vG.icD)) {
                    if (mnm.this.SE != null) {
                        mnm.this.SE.icD();
                        return;
                    }
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.video.vG.icD) mnm.this.jlb).c_();
            }
        });
    }

    public static boolean pvs(cR cRVar) {
        if (cRVar == null || so(cRVar)) {
            return false;
        }
        return vG(cRVar) || icD(cRVar) || Jd(cRVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wyp() {
        if (this.gA.get() || this.OhP.get()) {
            return;
        }
        this.gA.set(true);
        com.bytedance.sdk.openadsdk.icD.vG.pvs(this.yiw, this.dx, System.currentTimeMillis() - this.ae, true);
        qh();
    }

    private void qh() {
        this.sUS.setVisibility(8);
        if (vG(this.yiw) || Jd(this.yiw) || !vG()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.qh = ofFloat;
        ofFloat.setDuration(100L);
        this.qh.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mnm.this.ZhG.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                mnm.this.pvs((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                mnm.this.ZhG.setLayoutParams(layoutParams);
            }
        });
        this.qh.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kj() {
        if (this.gA.get()) {
            return;
        }
        Ju();
        this.OhP.set(true);
        this.Pj.so();
        LandingPageLoadingLayout landingPageLoadingLayout = this.dyT;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.icD();
        }
        if (Jd(this.yiw)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), this.yiw, this.dx, "show_agg_backup");
            View view = this.vA;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.vA.getLayoutParams();
                layoutParams.addRule(13);
                layoutParams.addRule(10, 0);
                this.vA.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.sUS;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.mnm.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mnm.getLayoutParams();
        layoutParams2.addRule(13);
        layoutParams2.addRule(10, 0);
        this.mnm.setLayoutParams(layoutParams2);
        if (this.yiw.ea() != null && !TextUtils.isEmpty(this.yiw.ea().pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.yiw.ea().pvs(), this.yiw.ea().icD(), this.yiw.ea().vG(), this.uc, this.yiw);
        }
        this.cR.setText(this.yiw.OhP());
        this.zM.setText(this.yiw.rW());
        if (this.rCZ != null) {
            icD();
            this.rCZ.setClickable(true);
            this.rCZ.setOnClickListener(this.Ju);
            this.rCZ.setOnTouchListener(this.Ju);
        }
    }

    private void Ju() {
        if ((vG(this.yiw) || Jd(this.yiw)) && (this.jlb instanceof com.bytedance.sdk.openadsdk.core.video.vG.icD)) {
            this.Pj.qh();
            this.Pj.kj();
        }
    }

    protected void icD() {
        cR cRVar = this.yiw;
        if (cRVar == null || TextUtils.isEmpty(cRVar.Cwg())) {
            return;
        }
        this.rCZ.setText(this.yiw.Cwg());
    }

    private void IP() {
        if (vG()) {
            this.dX.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.CvL, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.Mxy = duration;
            duration.setRepeatMode(2);
            this.Mxy.setRepeatCount(-1);
            this.Mxy.start();
            this.dX.setClickable(true);
            this.dX.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.4
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!mnm.this.jhZ) {
                        mnm.this.IP.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    mnm.this.Wyp = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    mnm.this.Wyp.setDuration(200L);
                    mnm.this.Wyp.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mnm.this.ZhG.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            mnm.this.pvs((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            mnm.this.ZhG.setLayoutParams(layoutParams);
                        }
                    });
                    if (mnm.this.IP.yiw()) {
                        mnm.this.dX.performClick();
                        mnm.this.jhZ = true;
                    }
                    mnm.this.Wyp.start();
                    mnm.this.dX.setVisibility(8);
                    return true;
                }
            });
            this.dX.setOnClickListener(this.IP);
        }
        if (!bNS()) {
            this.so.setVisibility(8);
            this.icD.setVisibility(0);
            this.pvs.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.pvs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.icD.vG.icD(mnm.this.yiw, mnm.this.dx);
                }
            });
            cR cRVar = this.yiw;
            if (cRVar != null && cRVar.BSi() != null && this.yiw.BSi().size() > 0 && this.yiw.BSi().get(0) != null && !TextUtils.isEmpty(this.yiw.BSi().get(0).pvs())) {
                com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.yiw.BSi().get(0), this.pvs, this.yiw);
            }
        }
        try {
            String pvs = this.yiw.BSi().get(0).pvs();
            com.bytedance.sdk.openadsdk.sUS.Jd.pvs().pvs(pvs).pvs(this.yiw.BSi().get(0).icD()).icD(this.yiw.BSi().get(0).vG()).NB(Pj.Jd(com.bytedance.sdk.openadsdk.core.mnm.pvs())).Jd(Pj.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs())).vG(2).pvs(new com.bytedance.sdk.component.NB.so() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.7
                @Override // com.bytedance.sdk.component.NB.so
                public Bitmap pvs(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), bitmap, 25);
                }
            }).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(this.yiw, pvs, new com.bytedance.sdk.component.NB.mnm<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.mnm.6
                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(com.bytedance.sdk.component.NB.qh<Bitmap> qhVar) {
                    try {
                        Bitmap icD = qhVar.icD();
                        if (icD != null && qhVar.vG() != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.mnm.pvs().getResources(), icD);
                            if (!mnm.this.bNS()) {
                                mnm.this.icD.setBackground(bitmapDrawable);
                                return;
                            }
                            mnm.this.Jd.setBackground(bitmapDrawable);
                            View Wyp = mnm.this.Pj.Wyp();
                            if (Wyp == null || !(Wyp.getParent() instanceof View)) {
                                return;
                            }
                            View view = (View) Wyp.getParent();
                            View view2 = view;
                            view.setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bNS() {
        return cR.NB(this.yiw);
    }

    public boolean vG() {
        return this.yiw.Ye() == 15 || this.yiw.Ye() == 16;
    }

    public void pvs(float f) {
        try {
            this.Pj.Mxy();
        } catch (Throwable unused) {
        }
    }

    public static boolean icD(cR cRVar) {
        return cRVar != null && cRVar.jhZ() == 3 && cRVar.mnm() == 6 && !rCZ.icD(cRVar) && cRVar.rcB() == 1 && (cRVar.UYh() == 0.0f || cRVar.UYh() == 100.0f);
    }

    public static boolean vG(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        if (so(cRVar)) {
            return true;
        }
        return cRVar.jhZ() == 3 && cRVar.mnm() == 5 && !rCZ.icD(cRVar) && (cRVar.UYh() == 0.0f || cRVar.UYh() == 100.0f);
    }

    public static boolean Jd(cR cRVar) {
        return cRVar != null && cRVar.mnm() == 33;
    }

    public static boolean NB(cR cRVar) {
        return vG(cRVar) && !so(cRVar);
    }

    public static boolean sUS(cR cRVar) {
        return (cRVar == null || cRVar.eOd() == 1 || !yiw(cRVar)) ? false : true;
    }

    public static boolean yiw(cR cRVar) {
        if (cRVar != null) {
            return cRVar.mnm() == 19 || cRVar.mnm() == 20;
        }
        return false;
    }

    public static boolean so(cR cRVar) {
        return cRVar != null && cRVar.mnm() == 19;
    }

    public static boolean Mxy(cR cRVar) {
        return (cRVar == null || !com.bytedance.sdk.openadsdk.core.mnm.Jd().ny() || !cRVar.cRf() || icD(cRVar) || vG(cRVar) || Jd(cRVar)) ? false : true;
    }

    public void Jd() {
        FrameLayout frameLayout = this.ZhG;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.Gp;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public void NB() {
        SSWebView sSWebView;
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.qD;
        if (qhVar != null && (sSWebView = this.ny) != null) {
            qhVar.pvs(sSWebView);
        }
        Handler handler = this.bNS;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ObjectAnimator objectAnimator = this.Wyp;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.Wyp.cancel();
        }
        ObjectAnimator objectAnimator2 = this.qh;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.qh.cancel();
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.dyT;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.icD();
        }
        ObjectAnimator objectAnimator3 = this.Mxy;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        SSWebView sSWebView2 = this.ny;
        if (sSWebView2 != null) {
            gA.pvs(sSWebView2.getWebView());
        }
        this.ny = null;
        CvL cvL = this.OT;
        if (cvL != null) {
            cvL.qh();
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar2 = this.qD;
        if (qhVar2 != null) {
            qhVar2.vG(true);
        }
        if (!TextUtils.isEmpty(this.yWX) && this.od) {
            vG.pvs.pvs(this.ZsW, this.ea, this.yiw);
        }
        com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.sq);
    }

    public void sUS() {
        CvL cvL = this.OT;
        if (cvL != null) {
            cvL.Wyp();
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.qD;
        if (qhVar != null) {
            qhVar.yiw();
        }
    }

    public void yiw() {
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.qD;
        if (qhVar != null) {
            qhVar.so();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long Jd;
        cR cRVar;
        cR cRVar2;
        if (message.what == 100) {
            int i = message.arg1;
            if (vG(this.yiw) && (cRVar2 = this.yiw) != null && cRVar2.Mxy() != null) {
                Jd = this.yiw.Mxy().icD();
            } else {
                Jd = (!Jd(this.yiw) || (cRVar = this.yiw) == null || cRVar.Mxy() == null) ? 20L : this.yiw.Mxy().Jd();
            }
            vG.pvs pvsVar = this.kj;
            if (pvsVar != null) {
                pvsVar.pvs(i * 1000, Jd * 1000);
            }
            long j = i;
            if (j >= Jd) {
                vG.pvs pvsVar2 = this.kj;
                if (pvsVar2 != null) {
                    pvsVar2.pvs(Jd * 1000, 100);
                }
            } else if (j < Jd && this.bNS != null) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i + 1;
                this.bNS.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }
}
