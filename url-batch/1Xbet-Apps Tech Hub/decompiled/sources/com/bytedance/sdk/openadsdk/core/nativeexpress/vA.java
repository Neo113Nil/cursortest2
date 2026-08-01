package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.zM;
import com.bytedance.sdk.openadsdk.utils.Gp;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewRender.java */
/* loaded from: classes2.dex */
public class vA extends com.bytedance.sdk.component.adexpress.NB.pvs {
    private com.bytedance.sdk.openadsdk.icD.qh IP;
    private String Ju;
    private String Mxy;
    private final Runnable OT;
    private cR Wyp;
    private final Map<String, com.com.bytedance.overseas.sdk.pvs.vG> bNS;
    private cR.pvs cR;
    private com.bytedance.sdk.openadsdk.icD.vG.NB kj;
    private CvL mnm;
    private JSONObject qh;
    private final com.bytedance.sdk.component.so.so rCZ;
    private Context so;
    private so uc;
    private com.bytedance.sdk.component.adexpress.icD.yiw vA;
    com.bytedance.sdk.openadsdk.utils.pvs yiw;
    private volatile int zM;

    public vA(Context context, com.bytedance.sdk.component.adexpress.icD.Ju ju, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.icD.vG.NB nb, cR cRVar) {
        super(context, ju, themeStatusBroadcastReceiver);
        this.bNS = Collections.synchronizedMap(new HashMap());
        this.zM = 0;
        this.rCZ = new com.bytedance.sdk.component.so.so("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.vA.1
            @Override // java.lang.Runnable
            public void run() {
                if (vA.this.sUS.get()) {
                    return;
                }
                if ((vA.this.Wyp instanceof zM) && ((zM) vA.this.Wyp).aSt()) {
                    vA.this.icD(true);
                }
                vA vAVar = vA.this;
                vAVar.qh = vAVar.qh().vG();
                vA vAVar2 = vA.this;
                vAVar2.pvs(vAVar2.qh);
                if (vA.this.Wyp != null && vA.this.Wyp.gSd() != null) {
                    vA vAVar3 = vA.this;
                    vAVar3.NB = com.bytedance.sdk.component.adexpress.pvs.icD.icD.vG(vAVar3.Wyp.gSd().NB());
                }
                if (vA.this.zM == 0) {
                    vA.this.vA();
                }
                com.bytedance.sdk.openadsdk.core.Ju.vG().post(vA.this.OT);
            }
        };
        this.OT = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.vA.2
            @Override // java.lang.Runnable
            public void run() {
                if (vA.this.sUS.get() || vA.this.vA == null) {
                    return;
                }
                vA.this.kj();
                vA vAVar = vA.this;
                vA.super.pvs(vAVar.vA);
            }
        };
        if (this.vG == null) {
            return;
        }
        this.so = context;
        this.Mxy = ju.Jd();
        this.Wyp = cRVar;
        this.kj = nb;
        themeStatusBroadcastReceiver.pvs(this);
        vA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vA() {
        if (this.vG.getWebView() != null && ae.NB()) {
            cR();
        } else {
            this.zM = 1;
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.vA.3
                @Override // java.lang.Runnable
                public void run() {
                    vA.this.cR();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cR() {
        if (this.vG == null || this.vG.getWebView() == null || this.zM == 2) {
            return;
        }
        this.Ju = pvs(this.Wyp);
        this.vG.setDisplayZoomControls(false);
        pvs(Gp.pvs(this.Ju));
        Ju();
        CvL cvL = new CvL(this.so);
        this.mnm = cvL;
        cvL.Jd(true);
        IP();
        this.zM = 2;
    }

    public static String pvs(cR cRVar) {
        cR.pvs gSd;
        return com.bytedance.sdk.component.adexpress.pvs.icD.icD.Jd((cRVar == null || (gSd = cRVar.gSd()) == null) ? null : gSd.kj());
    }

    public void kj() {
        CvL cvL;
        if (this.vG == null || this.vG.getWebView() == null || (cvL = this.mnm) == null) {
            return;
        }
        cvL.icD(this.vG).pvs(this.Wyp).vG(this.Wyp.neB()).Jd(this.Wyp.HWd()).icD(jlb.pvs(this.Mxy)).NB(this.Wyp.Sn()).pvs(this).pvs(this.qh).pvs(this.vG).pvs(this.kj);
    }

    public void Ju() {
        cR cRVar = this.Wyp;
        if (cRVar == null || cRVar.gSd() == null) {
            return;
        }
        this.cR = this.Wyp.gSd();
    }

    public void IP() {
        if (this.vG == null || this.vG.getWebView() == null) {
            return;
        }
        this.vG.setBackgroundColor(0);
        this.vG.setBackgroundResource(R.color.transparent);
        pvs(this.vG);
        if (pvs() != null) {
            this.IP = new com.bytedance.sdk.openadsdk.icD.qh(this.Wyp, pvs().getWebView()).pvs(false);
        }
        this.IP.pvs(this.kj);
        this.uc = new so(this.so, this.mnm, this.Wyp, this.IP);
        this.vG.setWebViewClient(this.uc);
        this.vG.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.mnm, this.IP));
        com.bytedance.sdk.component.adexpress.NB.NB.pvs().pvs(this.vG, this.mnm);
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    protected void Mxy() {
        super.Mxy();
        com.bytedance.sdk.openadsdk.utils.pvs NB = com.bytedance.sdk.openadsdk.core.IP.pvs().NB();
        this.yiw = NB;
        NB.pvs(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    protected void Wyp() {
        super.Wyp();
        com.bytedance.sdk.openadsdk.utils.pvs pvsVar = this.yiw;
        if (pvsVar != null) {
            pvsVar.icD(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs, com.bytedance.sdk.component.adexpress.icD.Jd
    public void pvs(com.bytedance.sdk.component.adexpress.icD.yiw yiwVar) {
        this.vA = yiwVar;
        ae.icD(this.rCZ);
    }

    private void pvs(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.pvs.vG.pvs(this.so).pvs(false).pvs(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.pvs(true);
            sSWebView.Wyp();
            sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.bNS.pvs(sSWebView.getWebView(), BuildConfig.VERSION_CODE));
            sSWebView.setMixedContentMode(0);
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setAllowFileAccess(false);
            sSWebView.setSupportZoom(true);
            sSWebView.setBuiltInZoomControls(true);
            sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            sSWebView.setUseWideViewPort(true);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.WebViewRender", e.toString());
        }
    }

    public so bNS() {
        return this.uc;
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    public SSWebView pvs() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    public void Jd() {
        if (this.sUS.get()) {
            return;
        }
        CvL cvL = this.mnm;
        if (cvL != null) {
            cvL.icD();
            this.mnm.qh();
            this.mnm = null;
        }
        com.bytedance.sdk.openadsdk.icD.qh qhVar = this.IP;
        if (qhVar != null) {
            qhVar.vG(false);
        }
        super.Jd();
        com.bytedance.sdk.openadsdk.core.Ju.vG().removeCallbacks(this.OT);
        this.bNS.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    public void sUS() {
        if (pvs() == null) {
            return;
        }
        try {
            pvs().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    public void so() {
        super.so();
        if (this.mnm == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.mnm.pvs("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    public void yiw() {
        CvL cvL = this.mnm;
        if (cvL == null) {
            return;
        }
        cvL.pvs("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs
    public void icD(int i) {
        if (i == this.Jd) {
            return;
        }
        this.Jd = i;
        vG(i == 0);
    }

    private void vG(boolean z) {
        if (this.mnm == null || this.vG == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.mnm.pvs("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    public CvL mnm() {
        return this.mnm;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.pvs
    public void pvs(int i) {
        if (this.mnm == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
        } catch (JSONException unused) {
        }
        this.mnm.pvs("themeChange", jSONObject);
    }

    public static boolean icD(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.pvs, com.bytedance.sdk.component.adexpress.icD.qh
    public void pvs(com.bytedance.sdk.component.adexpress.icD.IP ip) {
        super.pvs(ip);
        if (this.icD) {
            com.bytedance.sdk.component.utils.so.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.vA.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = vA.this.vG.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }
}
