package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.Jd.so;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.gA;
import com.bytedance.sdk.openadsdk.core.icD.icD;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.pvs.sUS;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.vA;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullWebViewManager.java */
/* loaded from: classes2.dex */
public class bNS implements com.bytedance.sdk.openadsdk.Mxy.yiw {
    private ILoader BSi;
    private String CjQ;
    private long CvL;
    private boolean Cwg;
    private int IP;
    protected String Jd;
    private final boolean Ju;
    com.bytedance.sdk.openadsdk.icD.qh NB;
    private boolean OT;
    private boolean OhP;
    private boolean Pj;
    private final cR Wyp;
    private View ZhG;
    private int bNS;
    private boolean cGU;
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs cRf;
    private float dX;
    private com.bytedance.sdk.openadsdk.common.so dx;
    private float dyT;
    private int ea;
    private com.bytedance.sdk.openadsdk.core.widget.pvs.NB gSd;
    CvL icD;
    private boolean jhZ;
    private int kj;
    private SSWebView mnm;
    private String neB;
    private View ny;
    private boolean od;
    CvL pvs;
    private boolean qD;
    private sUS.pvs qd;
    private final String qh;
    private boolean rCZ;
    private com.bytedance.sdk.openadsdk.common.icD rW;
    protected com.bytedance.sdk.openadsdk.icD.vG.NB so;
    private boolean thO;
    private boolean uc;
    private SSWebView vA;
    private long yWX;
    protected boolean vG = true;
    private boolean cR = false;
    private final AtomicBoolean zM = new AtomicBoolean(true);
    int sUS = 0;
    String yiw = "";
    boolean Mxy = false;
    private SparseArray<vG.pvs> Gp = new SparseArray<>();
    private boolean ae = true;
    private float gA = -1.0f;
    private float jlb = -1.0f;
    private boolean sP = false;
    private long SE = -1;
    private volatile int sq = 0;
    private int ZsW = -1;
    private volatile int cnN = 0;
    private volatile int OyE = 0;
    private long joF = 0;
    private int Ca = -1;

    /* compiled from: RewardFullWebViewManager.java */
    public interface Jd {
        void pvs(WebView webView, int i);

        void pvs(WebView webView, String str);

        void pvs(WebView webView, String str, Bitmap bitmap);
    }

    static /* synthetic */ int IP(bNS bns) {
        int i = bns.cnN;
        bns.cnN = i + 1;
        return i;
    }

    static /* synthetic */ int mnm(bNS bns) {
        int i = bns.OyE;
        bns.OyE = i + 1;
        return i;
    }

    static /* synthetic */ int vA(bNS bns) {
        int i = bns.sq;
        bns.sq = i + 1;
        return i;
    }

    public bNS(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.cRf = pvsVar;
        this.Wyp = pvsVar.icD;
        this.qh = pvsVar.NB;
        this.Ju = pvsVar.Jd;
    }

    public void pvs() {
        if (this.OT) {
            return;
        }
        this.OT = true;
        this.kj = this.cRf.cnN;
        this.IP = this.cRf.joF;
        this.bNS = this.cRf.thO;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        icD();
        this.joF = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    void icD() {
        com.bytedance.sdk.openadsdk.common.so soVar;
        this.ny = this.cRf.od.findViewById(R.id.content);
        boolean z = this.cRf.yiw;
        this.Pj = z;
        if (z && (soVar = this.dx) != null) {
            this.mnm = soVar.Jd();
        } else {
            SSWebView sSWebView = (SSWebView) this.cRf.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.IP);
            this.mnm = sSWebView;
            if (sSWebView != null && cR.icD(this.Wyp)) {
                this.mnm.g_();
            } else {
                Pj.pvs((View) this.mnm, 8);
            }
        }
        SSWebView sSWebView2 = (SSWebView) this.cRf.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.mnm);
        this.vA = sSWebView2;
        if (sSWebView2 != null && rCZ.icD(this.Wyp)) {
            this.vA.g_();
            this.vA.setDisplayZoomControls(false);
        } else {
            Pj.pvs((View) this.vA, 8);
        }
        SSWebView sSWebView3 = this.mnm;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (bNS.this.mnm == null || bNS.this.mnm.getViewTreeObserver() == null) {
                        return;
                    }
                    bNS.this.mnm.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = bNS.this.mnm.getMeasuredWidth();
                    int measuredHeight = bNS.this.mnm.getMeasuredHeight();
                    if (bNS.this.mnm.getVisibility() == 0) {
                        bNS.this.pvs(measuredWidth, measuredHeight);
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.vA;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.vA.setTag(rCZ.icD(this.Wyp) ? this.qh : "landingpage_endcard");
            this.vA.setWebViewClient(new SSWebView.pvs());
            this.vA.setMaterialMeta(this.Wyp.xa());
        }
    }

    public void pvs(String str, final com.bytedance.sdk.openadsdk.core.video.vG.icD icd) {
        pvs(str, new Jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.10
            @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.Jd
            public void pvs(WebView webView, String str2) {
                if (bNS.this.cRf.od.isFinishing()) {
                    return;
                }
                bNS.this.cRf.dyT.sUS(bNS.this.mnm());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.Jd
            public void pvs(WebView webView, String str2, Bitmap bitmap) {
                if (bNS.this.sP || !rCZ.qh(bNS.this.cRf.icD)) {
                    return;
                }
                bNS.this.sP = true;
                bNS.this.cRf.dyT.pvs(bNS.this.cRf.sUS, bNS.this.cRf.icD, bNS.this.cRf.icD.FJ());
                if (!rCZ.vG(bNS.this.Wyp)) {
                    bNS.this.cRf.SE.sendEmptyMessageDelayed(600, bNS.this.cRf.dyT.qh() * 1000);
                }
                bNS.this.cRf.dyT.yiw();
                bNS.this.cRf.OhP.qh();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.Jd
            public void pvs(WebView webView, int i) {
                try {
                    if (!rCZ.qh(bNS.this.cRf.icD) || !bNS.this.cRf.icD.SLG() || bNS.this.cRf.od.isFinishing()) {
                        if (!bNS.this.cRf.yiw || bNS.this.cRf.cGU == null) {
                            return;
                        }
                        bNS.this.cRf.cGU.pvs(webView, i, bNS.this.qd);
                        return;
                    }
                    bNS.this.cRf.dyT.vG(i);
                } catch (Exception unused) {
                }
            }
        });
        if (rCZ.qh(this.cRf.icD)) {
            pvs(this.vA);
            this.cRf.dyT.pvs(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.11
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                    bNS.this.cRf.ZhG.icD();
                    com.bytedance.sdk.openadsdk.core.video.vG.icD icd2 = icd;
                    if (icd2 != null) {
                        icd2.Jd();
                    }
                }
            });
        }
        this.cRf.dyT.pvs(this.cRf.Cwg);
        pvs(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.12
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                bNS.this.cRf.ZhG.icD();
                com.bytedance.sdk.openadsdk.core.video.vG.icD icd2 = icd;
                if (icd2 != null) {
                    icd2.Jd();
                }
            }
        });
    }

    public void pvs(com.bytedance.sdk.openadsdk.Mxy.NB nb, String str, final com.bytedance.sdk.openadsdk.core.video.vG.icD icd) {
        if (this.mnm == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (rCZ.icD(this.Wyp)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.so = jhZ();
        CvL cvL = new CvL(this.cRf.od);
        this.pvs = cvL;
        cvL.pvs(this.cRf.OhP);
        String Sn = this.Wyp.Sn();
        this.pvs.icD(this.mnm).pvs(this.Wyp).vG(this.Wyp.neB()).Jd(this.Wyp.HWd()).icD(this.Wyp.FJ() ? 7 : 5).pvs(new icD(this.mnm)).NB(Sn).pvs(this.mnm).icD(bNS() ? "landingpage_endcard" : str).pvs(hashMap).pvs(this.so).pvs(new com.bytedance.sdk.openadsdk.core.widget.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.icD
            public void pvs() {
                if (bNS.this.gSd != null) {
                    bNS.this.gSd.icD();
                }
                com.bytedance.sdk.openadsdk.core.video.vG.icD icd2 = icd;
                if (icd2 != null) {
                    icd2.Jd();
                }
            }
        });
        HashMap hashMap2 = new HashMap();
        if (rCZ.vG(this.Wyp)) {
            hashMap2.put("click_scence", 2);
        }
        CvL cvL2 = new CvL(this.cRf.od);
        this.icD = cvL2;
        cvL2.pvs(this.cRf.OhP);
        CvL NB = this.icD.icD(this.vA).pvs(this.Wyp).vG(this.Wyp.neB()).Jd(this.Wyp.HWd()).icD(this.Wyp.FJ() ? 7 : 5).pvs(new icD(this.vA)).pvs(this.vA).NB(Sn);
        if (bNS()) {
            str = "landingpage_endcard";
        }
        NB.icD(str).pvs(hashMap2).pvs(this.so).pvs(new com.bytedance.sdk.openadsdk.core.widget.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.15
            @Override // com.bytedance.sdk.openadsdk.core.widget.icD
            public void pvs() {
                if (bNS.this.gSd != null) {
                    bNS.this.gSd.icD();
                }
            }
        }).pvs(new CvL.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.14
            @Override // com.bytedance.sdk.openadsdk.core.CvL.pvs
            public void pvs() {
                bNS.this.od();
            }
        });
        this.pvs.pvs(new vG(this.mnm));
        this.icD.pvs(new vG(this.vA));
        this.pvs.pvs(this.cRf.gSd.Wyp()).pvs(this.cRf.Cwg).pvs(nb).pvs(this.cRf.dyT.mnm()).pvs(new com.bytedance.sdk.openadsdk.Mxy.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.16
            @Override // com.bytedance.sdk.openadsdk.Mxy.icD
            public void pvs(boolean z, int i, String str2) {
                if (z) {
                    bNS.this.cRf.dyT.vG();
                    if (bNS.this.thO) {
                        bNS.this.thO = false;
                        bNS bns = bNS.this;
                        bns.pvs(bns.cRf.ea, true);
                    }
                }
                if (!cR.Jd(bNS.this.cRf.icD) || rCZ.icD(bNS.this.cRf.icD)) {
                    return;
                }
                bNS.this.pvs(z, i, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.Mxy.icD
            public void pvs() {
                bNS.this.jhZ = true;
                bNS.this.cRf.gSd.Wyp().performClick();
            }
        });
        this.pvs.NB(this.od);
        this.icD.pvs(this.cRf.gSd.Wyp()).pvs(new com.bytedance.sdk.openadsdk.Mxy.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.17
            @Override // com.bytedance.sdk.openadsdk.Mxy.icD
            public void pvs(boolean z, int i, String str2) {
            }

            @Override // com.bytedance.sdk.openadsdk.Mxy.icD
            public void pvs() {
                bNS.this.jhZ = true;
                bNS.this.cRf.gSd.Wyp().performClick();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void od() {
        this.qD = true;
        this.cGU = false;
        this.cRf.SE.removeMessages(600);
        this.cRf.SE.removeMessages(TypedValues.TransitionType.TYPE_DURATION);
        this.cRf.SE.removeMessages(TypedValues.Custom.TYPE_INT);
        this.cRf.cRf.Jd(false);
        this.cRf.zM.set(true);
        this.cRf.Zm.mnm();
        this.Wyp.fl();
        if (this.Wyp.fl() || !jlb.so(rCZ.pvs(this.Wyp))) {
            return;
        }
        View Wyp = this.cRf.gSd.Wyp();
        View.OnClickListener onClickListener = (View.OnClickListener) Wyp.getTag(Wyp.getId());
        if (onClickListener != null) {
            pvs pvsVar = new pvs(this.cRf, Wyp, onClickListener);
            Wyp.setOnClickListener(pvsVar);
            Wyp.setOnTouchListener(pvsVar);
        }
    }

    public boolean vG() {
        return this.jhZ;
    }

    public boolean Jd() {
        return this.OhP;
    }

    public void pvs(int i, int i2) {
        if (this.pvs == null || this.cRf.od.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            this.pvs.pvs("resize", jSONObject);
        } catch (Exception e) {
            Log.e("TTAD.RFWVM", "", e);
        }
    }

    public void pvs(boolean z) {
        this.vG = z;
    }

    public void NB() {
        if (TextUtils.isEmpty(cR.pvs(this.cRf.jhZ, this.Wyp))) {
            cR cRVar = this.Wyp;
            if (cRVar != null && !cRVar.XPz() && this.BSi == null && bNS()) {
                this.CjQ = this.Wyp.tQ();
                this.BSi = com.bytedance.sdk.openadsdk.Jd.icD.pvs().icD();
                int pvs2 = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(this.BSi, this.CjQ);
                this.ea = pvs2;
                this.ZsW = pvs2 > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.CjQ)) {
                    com.bytedance.sdk.openadsdk.icD.qh qhVar = this.NB;
                    if (qhVar != null) {
                        qhVar.pvs(this.ZsW);
                    }
                    vG.pvs.pvs(this.joF, this.Wyp, "landingpage_endcard", this.BSi, this.CjQ);
                }
            }
            if ((!TextUtils.isEmpty(this.Jd) && this.Jd.contains("play.google.com/store")) || com.bytedance.sdk.openadsdk.core.model.mnm.NB(this.Wyp) || com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.Wyp)) {
                this.Mxy = true;
                return;
            }
            if (this.vG) {
                if (this.mnm != null && !TextUtils.isEmpty(this.Jd) && cR.icD(this.Wyp)) {
                    if (this.Cwg) {
                        return;
                    }
                    String str = this.Jd + "&is_pre_render=1";
                    new StringBuilder("preLoadEndCard: ").append(str).append(", ").append(this.mnm.getWebView());
                    com.bytedance.sdk.openadsdk.icD.qh qhVar2 = this.NB;
                    if (qhVar2 != null) {
                        qhVar2.Jd();
                    }
                    vA.pvs(this.mnm, str);
                    this.cRf.dyT.vG(str);
                    this.Cwg = true;
                    return;
                }
                if (cR.vG(this.Wyp)) {
                    this.cRf.Pj.vG();
                }
            }
        }
    }

    public void sUS() {
        com.bykv.vk.openvk.component.video.api.vG.icD od = this.Wyp.od();
        if (od == null) {
            return;
        }
        String kj = od.kj();
        this.neB = kj;
        if (TextUtils.isEmpty(kj)) {
            return;
        }
        this.neB = pvs(this.neB, this.Wyp, this.kj, this.bNS, this.IP);
        this.vA.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(com.bytedance.sdk.openadsdk.core.mnm.pvs(), this.icD, this.Wyp.neB(), this.NB, this.Wyp.cRf() || rCZ.icD(this.Wyp)) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                if (bNS.this.pvs(str2)) {
                    return;
                }
                bNS.this.rCZ = false;
                bNS.this.sUS = i;
                bNS.this.yiw = str;
                if (bNS.this.so != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                        bNS.this.so.pvs(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !bNS.this.pvs(webResourceRequest.getUrl().toString())) {
                    bNS.this.rCZ = false;
                    if (bNS.this.so != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            bNS.this.so.pvs(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceError != null) {
                        bNS.this.sUS = webResourceError.getErrorCode();
                        bNS.this.yiw = String.valueOf(webResourceError.getDescription());
                    }
                    if (webResourceRequest == null) {
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    bNS.this.rCZ = false;
                    if (webResourceResponse != null) {
                        bNS.this.sUS = webResourceResponse.getStatusCode();
                        bNS.this.yiw = "onReceivedHttpError";
                    }
                }
                if (bNS.this.so != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (webResourceResponse != null) {
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        }
                        bNS.this.so.pvs(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (bNS.this.so != null) {
                    bNS.this.so.sUS();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (bNS.this.so != null) {
                    bNS.this.so.NB();
                }
            }
        });
        this.vA.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.icD, this.NB) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.Jd, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (!bNS.this.cRf.yiw || bNS.this.cRf.cGU == null) {
                    return;
                }
                bNS.this.cRf.cGU.pvs(webView, i, bNS.this.qd);
            }
        });
        vA.pvs(this.vA, this.neB);
        this.rCZ = true;
    }

    public void yiw() {
        if (this.mnm == null) {
            return;
        }
        this.zM.set(this.rCZ);
        if (this.vA.getVisibility() == 0 && this.rCZ) {
            OhP();
            return;
        }
        this.cRf.cRf.vG(false);
        this.cRf.dyT.NB();
        pvs(this.pvs, true, false);
        icD(this.pvs, false);
        pvs(this.pvs, false);
        this.mnm.kj();
        if (this.rCZ) {
            this.vA.setVisibility(0);
            pvs(this.icD, this.cRf.ea, true);
            icD(this.icD, true);
            pvs(this.icD, true);
            this.cRf.SE.removeMessages(600);
            if (!this.cRf.sP.icD(this.cRf.Zm)) {
                this.cRf.Zm.dyT();
            }
        } else {
            if (this.cRf.dyT.zM()) {
                this.cRf.dyT.icD(5);
            }
            this.cRf.sP.Jd();
            this.cRf.Ye.pvs(this.cRf.so);
        }
        this.cGU = true;
    }

    private void OhP() {
        this.icD.pvs("showPlayableEndCardOverlay", (JSONObject) null);
        this.cRf.SE.sendEmptyMessageDelayed(600, 1000L);
        this.cRf.SE.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.4
            @Override // java.lang.Runnable
            public void run() {
                bNS.this.od();
            }
        }, 1000L);
        if (this.cRf.Ye != null) {
            this.cRf.Ye.pvs(0L);
        }
    }

    public SSWebView so() {
        return this.mnm;
    }

    public SSWebView Mxy() {
        return this.vA;
    }

    public CvL Wyp() {
        return this.pvs;
    }

    public CvL qh() {
        return this.icD;
    }

    public com.bytedance.sdk.openadsdk.icD.qh kj() {
        return this.NB;
    }

    public void Ju() {
        String sUS = rCZ.sUS(this.Wyp);
        this.Jd = sUS;
        String pvs2 = pvs(sUS, this.Wyp, this.kj, this.bNS, this.IP);
        this.Jd = pvs2;
        if (TextUtils.isEmpty(pvs2)) {
            return;
        }
        this.od = this.Jd.contains("use_second_endcard=1");
    }

    private static String pvs(String str, cR cRVar, int i, int i2, int i3) {
        String str2;
        String str3;
        float UYh = cRVar.UYh();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    str3 = str + "&";
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + "&";
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + UYh;
        }
        return !rCZ.icD(cRVar) ? com.bytedance.sdk.openadsdk.utils.Jd.pvs(str) : str;
    }

    public void IP() {
        SSWebView sSWebView = this.mnm;
        if (sSWebView != null) {
            gA.pvs(sSWebView.getWebView());
        }
        SSWebView sSWebView2 = this.vA;
        if (sSWebView2 != null) {
            gA.pvs(sSWebView2.getWebView());
        }
        long j = this.yWX;
        if (j > 0) {
            if (this.SE > 0) {
                this.yWX = j + (SystemClock.elapsedRealtime() - this.SE);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", cR.vG(this.Wyp) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.cRf.icD, this.qh, "second_endcard_duration", jSONObject, this.yWX);
        }
        this.mnm = null;
        if (this.so != null && !com.bytedance.sdk.openadsdk.core.model.mnm.vG(this.Wyp) && !com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.Wyp) && !cR.vG(this.Wyp)) {
            this.so.pvs(true);
            this.so.kj();
        }
        CvL cvL = this.pvs;
        if (cvL != null) {
            cvL.qh();
        }
        CvL cvL2 = this.icD;
        if (cvL2 != null) {
            cvL2.qh();
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.NB;
        if (qhVar != null) {
            qhVar.vG(this.Wyp.cRf() || rCZ.icD(this.Wyp));
        }
        DeviceUtils.AudioInfoReceiver.icD(this);
    }

    public void icD(int i) {
        Pj.pvs((View) this.mnm, i);
        SSWebView sSWebView = this.mnm;
        if (sSWebView != null) {
            Pj.pvs((View) sSWebView.getWebView(), i);
        }
        if (this.mnm != null && (this.Wyp.cRf() || rCZ.icD(this.Wyp))) {
            this.mnm.setLandingPage(true);
            this.mnm.setTag(rCZ.icD(this.Wyp) ? this.qh : "landingpage_endcard");
            this.mnm.setMaterialMeta(this.Wyp.xa());
        }
        if (i == 0 && rCZ.vG(this.Wyp)) {
            sUS();
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.common.so soVar) {
        this.dx = soVar;
    }

    public void pvs(float f) {
        Pj.pvs(this.mnm, f);
    }

    public void icD(boolean z) {
        pvs(this.pvs, z);
    }

    public void pvs(CvL cvL, boolean z) {
        if (this.pvs == null || this.cRf.od.isFinishing()) {
            return;
        }
        cvL.icD(z);
    }

    private void pvs(String str, final Jd jd) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.mnm;
        if (sSWebView2 != null && sSWebView2.getWebView() != null) {
            com.bytedance.sdk.openadsdk.icD.qh pvs2 = new com.bytedance.sdk.openadsdk.icD.qh(this.Wyp, this.mnm.getWebView(), new com.bytedance.sdk.openadsdk.icD.Wyp() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.5
                @Override // com.bytedance.sdk.openadsdk.icD.Wyp
                public void pvs(int i) {
                    if (TextUtils.isEmpty(bNS.this.CjQ)) {
                        return;
                    }
                    vG.pvs.pvs(bNS.this.ea, bNS.this.sq, bNS.this.OyE, bNS.this.cnN - bNS.this.OyE, bNS.this.Wyp, "landingpage_endcard", i);
                }
            }, this.ZsW).pvs(true);
            this.NB = pvs2;
            this.qd = pvs2.pvs;
            this.NB.pvs(bNS() ? "landingpage_endcard" : str);
            this.NB.icD(this.qh);
            this.NB.icD(true);
            this.mnm.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.6
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (bNS.this.NB != null) {
                        bNS.this.NB.icD(i2);
                    }
                }
            });
            com.bytedance.sdk.openadsdk.common.icD pvs3 = jlb.pvs(this.Wyp, this.mnm, this.cRf.od, this.qh);
            this.rW = pvs3;
            if (pvs3 != null) {
                if (bNS()) {
                    str = "landingpage_endcard";
                }
                pvs3.pvs(str);
            }
            if (bNS()) {
                jlb.pvs(this.Wyp, this.mnm);
            }
            com.bytedance.sdk.openadsdk.core.widget.pvs.NB nb = new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(com.bytedance.sdk.openadsdk.core.mnm.pvs(), this.pvs, this.Wyp.neB(), this.rW, this.NB, this.Wyp.cRf() || rCZ.icD(this.Wyp)) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.7
                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    if (!rCZ.icD(bNS.this.Wyp)) {
                        try {
                            if (TextUtils.isEmpty(bNS.this.CjQ)) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            bNS.IP(bNS.this);
                            WebResourceResponseModel pvs4 = com.bytedance.sdk.openadsdk.Jd.icD.pvs().pvs(bNS.this.BSi, bNS.this.CjQ, str2);
                            if (pvs4 != null && pvs4.getWebResourceResponse() != null) {
                                bNS.mnm(bNS.this);
                                return pvs4.getWebResourceResponse();
                            }
                            if (pvs4 != null && pvs4.getMsg() == 2) {
                                bNS.vA(bNS.this);
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse pvs5 = com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(bNS.this.Wyp.od().Ju(), rCZ.sUS(bNS.this.Wyp), str2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (bNS.this.so != null) {
                        so.pvs pvs6 = com.bytedance.sdk.component.adexpress.Jd.so.pvs(str2);
                        int i = pvs5 != null ? 1 : 2;
                        if (pvs6 == so.pvs.HTML) {
                            bNS.this.so.pvs(str2, currentTimeMillis, currentTimeMillis2, i);
                        } else if (pvs6 == so.pvs.JS) {
                            bNS.this.so.icD(str2, currentTimeMillis, currentTimeMillis2, i);
                        }
                    }
                    return pvs5;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str2, String str3) {
                    super.onReceivedError(webView, i, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !bNS.this.pvs(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            bNS.this.cRf.dyT.pvs(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            bNS.this.zM.set(false);
                            bNS.this.Cwg = false;
                        }
                        if (bNS.this.so != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                }
                                bNS.this.so.pvs(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            bNS.this.sUS = webResourceError.getErrorCode();
                            bNS.this.yiw = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    bNS.this.cRf.dyT.pvs(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        bNS.this.zM.set(false);
                        bNS.this.Cwg = false;
                        if (webResourceResponse != null) {
                            bNS.this.sUS = webResourceResponse.getStatusCode();
                            bNS.this.yiw = "onReceivedHttpError";
                        }
                    }
                    if (bNS.this.so != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceResponse != null) {
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                            }
                            bNS.this.so.pvs(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    bNS.this.Cwg = false;
                    bNS.this.uc = true;
                    DeviceUtils.AudioInfoReceiver.pvs(bNS.this);
                    bNS.this.Ca = DeviceUtils.yiw();
                    if (bNS.this.so != null) {
                        bNS.this.so.sUS();
                    }
                    bNS.this.cRf.dyT.icD(str2);
                    Jd jd2 = jd;
                    if (jd2 != null) {
                        jd2.pvs(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    if (bNS.this.so != null) {
                        bNS.this.so.NB();
                    }
                    Jd jd2 = jd;
                    if (jd2 != null) {
                        jd2.pvs(webView, str2, bitmap);
                    }
                }
            };
            this.gSd = nb;
            this.mnm.setWebViewClient(nb);
            this.gSd.pvs(this.Wyp);
            this.gSd.pvs(this.Ju ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (this.Wyp.cRf() && (sSWebView = this.mnm) != null && sSWebView.getWebView() != null) {
                this.mnm.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.8
                    private final int icD = com.bytedance.sdk.openadsdk.core.mnm.icD();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i;
                        if (bNS.this.NB != null) {
                            bNS.this.NB.pvs(motionEvent);
                        }
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 0) {
                                int i2 = 3;
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        i2 = actionMasked != 3 ? -1 : 4;
                                    } else {
                                        float rawX = motionEvent.getRawX();
                                        float rawY = motionEvent.getRawY();
                                        if (Math.abs(rawX - bNS.this.dyT) >= this.icD || Math.abs(rawY - bNS.this.dX) >= this.icD) {
                                            bNS.this.ae = false;
                                        }
                                        bNS.this.gA += Math.abs(motionEvent.getX() - bNS.this.dyT);
                                        bNS.this.jlb += Math.abs(motionEvent.getY() - bNS.this.dX);
                                        int i3 = (System.currentTimeMillis() - bNS.this.CvL <= 200 || (bNS.this.gA <= 8.0f && bNS.this.jlb <= 8.0f)) ? 2 : 1;
                                        if (bNS.this.Pj) {
                                            if (rawY - bNS.this.dX > 8.0f) {
                                                bNS.this.dx.pvs();
                                            }
                                            if (rawY - bNS.this.dX < -8.0f) {
                                                bNS.this.dx.icD();
                                            }
                                        }
                                        i = i3;
                                    }
                                }
                                i = i2;
                            } else {
                                bNS.this.ae = true;
                                bNS.this.Gp = new SparseArray();
                                bNS.this.dyT = motionEvent.getRawX();
                                bNS.this.dX = motionEvent.getRawY();
                                bNS.this.CvL = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = bNS.this.mnm.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < bNS.this.CvL) {
                                        bNS.this.CvL = landingPageClickBegin;
                                        bNS.this.mnm.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                bNS.this.gA = -1.0f;
                                bNS.this.jlb = -1.0f;
                                i = 0;
                            }
                            bNS.this.Gp.put(motionEvent.getActionMasked(), new vG.pvs(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() != 1 || view.getVisibility() != 0 || Float.valueOf(view.getAlpha()).intValue() != 1) {
                                return false;
                            }
                            if ((bNS.this.cR && !com.bytedance.sdk.openadsdk.core.model.mnm.yiw(bNS.this.Wyp)) || !bNS.this.ae) {
                                return false;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", bNS.this.dyT);
                            jSONObject.put("down_y", bNS.this.dX);
                            jSONObject.put("down_time", bNS.this.CvL);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = bNS.this.mnm.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < currentTimeMillis) {
                                    try {
                                        bNS.this.mnm.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    currentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", currentTimeMillis);
                            int[] iArr = new int[2];
                            if (bNS.this.Pj) {
                                bNS bns = bNS.this;
                                bns.ZhG = bns.cRf.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.Ye);
                            } else {
                                bNS bns2 = bNS.this;
                                bns2.ZhG = bns2.cRf.qD.findViewById(520093713);
                            }
                            if (bNS.this.ZhG != null) {
                                bNS.this.ZhG.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", bNS.this.ZhG.getWidth());
                                jSONObject.put("button_height", bNS.this.ZhG.getHeight());
                            }
                            if (bNS.this.ny != null) {
                                int[] iArr2 = new int[2];
                                bNS.this.ny.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", bNS.this.ny.getWidth());
                                jSONObject.put("height", bNS.this.ny.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put(FirebaseAnalytics.Param.SOURCE, motionEvent.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.Wyp.pvs(bNS.this.Gp, com.bytedance.sdk.openadsdk.core.so.icD().pvs() ? 1 : 2));
                            jSONObject.put("user_behavior_type", bNS.this.ae ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (bNS.this.gSd != null) {
                                bNS.this.gSd.pvs(jSONObject);
                            }
                            if (!bNS.this.cR && !com.bytedance.sdk.openadsdk.core.model.mnm.sUS(bNS.this.Wyp)) {
                                if (bNS.this.Ju) {
                                    com.bytedance.sdk.openadsdk.icD.vG.pvs(bNS.this.Wyp, "rewarded_video", "click", jSONObject);
                                } else {
                                    com.bytedance.sdk.openadsdk.icD.vG.pvs(bNS.this.Wyp, "fullscreen_interstitial_ad", "click", jSONObject);
                                }
                                bNS.this.cR = true;
                                return false;
                            }
                            return false;
                        } catch (Throwable th) {
                            Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                            return false;
                        }
                    }
                });
            }
            SSWebView sSWebView3 = this.mnm;
            if (sSWebView3 != null) {
                sSWebView3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.pvs, this.NB, this.rW) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.bNS.9
                    @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.Jd, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                        Jd jd2 = jd;
                        if (jd2 != null) {
                            jd2.pvs(webView, i);
                        }
                    }
                });
            }
            pvs(this.mnm);
            this.mnm.setLayerType(1, null);
            this.mnm.setBackgroundColor(-1);
            this.mnm.setDisplayZoomControls(false);
        }
        NB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.Wyp.cRf() && str.endsWith(".mp4");
    }

    public boolean bNS() {
        String str = this.Jd;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void pvs(DownloadListener downloadListener) {
        SSWebView sSWebView = this.mnm;
        if (sSWebView == null || downloadListener == null) {
            return;
        }
        sSWebView.setDownloadListener(downloadListener);
    }

    public boolean mnm() {
        return this.zM.get();
    }

    public void pvs(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pvs.vG.pvs(this.cRf.od).pvs(false).icD(false).pvs(sSWebView.getWebView());
        sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.bNS.pvs(sSWebView.getWebView(), BuildConfig.VERSION_CODE));
        sSWebView.setMixedContentMode(0);
    }

    public void vA() {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.so;
        if (nb != null) {
            nb.Mxy();
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.NB;
        if (qhVar != null) {
            qhVar.so();
        }
    }

    public void cR() {
        SSWebView sSWebView = this.mnm;
        if (sSWebView != null) {
            sSWebView.qh();
        }
        SSWebView sSWebView2 = this.vA;
        if (sSWebView2 != null) {
            sSWebView2.qh();
        }
        if (this.SE > 0) {
            this.yWX += SystemClock.elapsedRealtime() - this.SE;
            this.SE = 0L;
        }
        CvL cvL = this.pvs;
        if (cvL != null) {
            cvL.icD(false);
            icD(this.pvs, false);
            pvs(this.pvs, true, false);
        }
        if (this.icD == null || !rCZ.vG(this.Wyp)) {
            return;
        }
        this.icD.icD(false);
        icD(this.icD, false);
        pvs(this.icD, true, false);
    }

    public void vG(boolean z) {
        icD(this.pvs, z);
    }

    public void icD(CvL cvL, boolean z) {
        try {
            this.cRf.dyT.Jd(z);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            cvL.pvs("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void pvs(boolean z, boolean z2) {
        pvs(this.pvs, z, z2);
    }

    public void pvs(CvL cvL, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put("endcard_show", z2);
            com.bytedance.sdk.openadsdk.activity.sUS sus = this.cRf.elv;
            if (sus != null) {
                jSONObject.put("multi_ads_show", sus.ny().sUS());
            }
            cvL.pvs("endcard_control_event", jSONObject);
            if (z2) {
                if (this.uc) {
                    return;
                }
                this.thO = true;
                return;
            }
            this.thO = false;
        } catch (Exception unused) {
        }
    }

    public void Jd(boolean z) {
        if (this.pvs == null || this.cRf.od.isFinishing()) {
            return;
        }
        this.cRf.dyT.NB(z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            this.pvs.pvs("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void zM() {
        SSWebView sSWebView = this.mnm;
        if (sSWebView != null) {
            sSWebView.Mxy();
        }
        SSWebView sSWebView2 = this.vA;
        if (sSWebView2 != null) {
            sSWebView2.Mxy();
        }
        if (this.SE == 0) {
            this.SE = SystemClock.elapsedRealtime();
        }
        CvL cvL = this.pvs;
        if (cvL != null) {
            cvL.Wyp();
            SSWebView sSWebView3 = this.mnm;
            if (sSWebView3 != null) {
                if (sSWebView3.getVisibility() == 0) {
                    this.pvs.icD(true);
                    icD(this.pvs, true);
                    pvs(this.pvs, false, true);
                } else {
                    this.pvs.icD(false);
                    icD(this.pvs, false);
                    pvs(this.pvs, true, false);
                }
            }
        }
        if (this.icD != null && rCZ.vG(this.Wyp)) {
            this.icD.Wyp();
            SSWebView sSWebView4 = this.vA;
            if (sSWebView4 != null) {
                if (sSWebView4.getVisibility() == 0) {
                    this.icD.icD(true);
                    icD(this.icD, true);
                    pvs(this.icD, false, true);
                    if (!this.qD && this.cRf.icD.fl()) {
                        OhP();
                    }
                } else {
                    this.icD.icD(false);
                    icD(this.icD, false);
                    pvs(this.icD, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.NB;
        if (qhVar != null) {
            qhVar.yiw();
        }
    }

    public int uc() {
        return this.sUS;
    }

    public String rCZ() {
        return this.yiw;
    }

    public String OT() {
        return this.Jd;
    }

    public boolean ny() {
        return cR.vG(this.Wyp) ? this.od && !this.OhP && this.cRf.Pj.kj() : this.od && !this.OhP && this.zM.get() && this.uc;
    }

    public void ZhG() {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.so;
        if (nb != null) {
            nb.so();
        }
    }

    public void pvs(boolean z, int i, String str) {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.so;
        if (nb == null) {
            return;
        }
        if (z) {
            nb.icD();
        } else {
            nb.pvs(i, str);
        }
    }

    public void dyT() {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.so;
        if (nb != null) {
            nb.yiw();
        }
    }

    public void dX() {
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.NB;
        if (qhVar != null) {
            qhVar.pvs(System.currentTimeMillis());
        }
    }

    public boolean CvL() {
        return this.Mxy;
    }

    public void Gp() {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.so;
        if (nb != null) {
            nb.vG();
            this.so.Jd();
        }
    }

    public void ae() {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.so;
        if (nb != null) {
            nb.Wyp();
        }
    }

    private com.bytedance.sdk.openadsdk.icD.vG.NB jhZ() {
        return new com.bytedance.sdk.openadsdk.icD.vA(rCZ.icD(this.Wyp) ? 3 : 2, this.Ju ? "rewarded_video" : "fullscreen_interstitial_ad", this.Wyp);
    }

    public boolean gA() {
        CvL cvL = this.pvs;
        if (cvL == null) {
            return false;
        }
        return cvL.so();
    }

    @Override // com.bytedance.sdk.openadsdk.Mxy.yiw
    public void pvs(int i) {
        int i2 = this.Ca;
        if (i2 <= 0 && i > 0) {
            Jd(false);
        } else if (i2 > 0 && i == 0) {
            Jd(true);
        }
        this.Ca = i;
    }

    public void jlb() {
        Pj.pvs((View) this.mnm, 0);
        Pj.pvs((View) this.vA, 8);
    }

    public void dx() {
        Pj.pvs((View) this.vA, 8);
    }

    public void NB(boolean z) {
        this.OhP = true;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("endcard_overlay_render_type", cR.vG(this.Wyp) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.Wyp, this.qh, "use_second_endcard", jSONObject);
        this.SE = SystemClock.elapsedRealtime();
        try {
            if (!cR.vG(this.Wyp)) {
                this.pvs.pvs("click_endcard_close", (JSONObject) null);
            } else if (z) {
                this.cRf.Pj.so();
                com.bytedance.sdk.openadsdk.icD.vG.icD(this.Wyp, this.qh, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        this.cRf.Ye.pvs(this.cRf.so);
    }

    public boolean Pj() {
        return this.uc && this.zM.get();
    }

    public boolean cRf() {
        return this.cGU;
    }

    public boolean sP() {
        SSWebView sSWebView = this.mnm;
        return sSWebView == null || sSWebView.getWebView() == null;
    }

    /* compiled from: RewardFullWebViewManager.java */
    private static class icD implements com.bytedance.sdk.openadsdk.Mxy.pvs {
        private final View pvs;

        public icD(View view) {
            this.pvs = view;
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.pvs
        public int pvs() {
            View view = this.pvs;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? Pj.Jd(com.bytedance.sdk.openadsdk.core.mnm.pvs()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.pvs
        public int icD() {
            View view = this.pvs;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? Pj.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs()) : measuredWidth;
        }
    }

    /* compiled from: RewardFullWebViewManager.java */
    private static class vG implements com.bytedance.sdk.openadsdk.Mxy.Mxy {
        private final SSWebView pvs;

        private vG(SSWebView sSWebView) {
            this.pvs = sSWebView;
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.Mxy
        public void pvs() {
            SSWebView sSWebView = this.pvs;
            if (sSWebView == null) {
                return;
            }
            sSWebView.qh();
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.Mxy
        public void icD() {
            SSWebView sSWebView = this.pvs;
            if (sSWebView == null) {
                return;
            }
            sSWebView.IP();
        }
    }

    public void gSd() {
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.NB;
        if (qhVar != null) {
            qhVar.NB();
        }
    }

    /* compiled from: RewardFullWebViewManager.java */
    private static class pvs extends com.bytedance.sdk.openadsdk.core.icD.pvs implements icD.pvs {
        private final View icD;
        private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvs;
        private final View.OnClickListener vG;

        public pvs(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar, View view, View.OnClickListener onClickListener) {
            super(pvsVar.od, pvsVar.icD, pvsVar.NB, pvsVar.Jd ? 7 : 5);
            this.pvs = pvsVar;
            this.icD = view;
            this.vG = onClickListener;
            HashMap hashMap = new HashMap();
            hashMap.put("close_auto_click", Boolean.TRUE);
            hashMap.put("click_scence", 2);
            pvs(hashMap);
            pvs(pvsVar.ZhG.vG());
            pvs(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.icD.pvs, com.bytedance.sdk.openadsdk.core.icD.icD, com.bytedance.sdk.openadsdk.core.icD.vG
        public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
            if (this.sUS.fl()) {
                this.vG.onClick(view);
                this.icD.setOnTouchListener(null);
                this.icD.setOnClickListener(this.vG);
            } else {
                super.pvs(view, f, f2, f3, f4, sparseArray, z);
                this.pvs.OhP.c_();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
        public void pvs(View view, int i) {
            this.icD.setOnTouchListener(null);
            this.icD.setOnClickListener(this.vG);
        }
    }

    public boolean qD() {
        return this.qD;
    }
}
