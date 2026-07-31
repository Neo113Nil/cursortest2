package com.bytedance.sdk.openadsdk.core.iv;

import android.R;
import android.content.Context;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.hgd;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kjb extends com.bytedance.sdk.component.adexpress.btk.zmn {
    private com.bytedance.sdk.openadsdk.fb.mw bvs;
    protected fkt cn;
    protected rc cyb;
    private volatile int doe;
    private com.bytedance.sdk.component.adexpress.fs.nps iqz;
    protected Context iv;
    com.bytedance.sdk.openadsdk.utils.zmn kgc;
    protected com.bytedance.sdk.openadsdk.core.model.nqi klz;
    private final Map<String, com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn> kw;
    protected JSONObject mw;
    private final com.bytedance.sdk.component.zg.fs.zn nqi;
    protected com.bytedance.sdk.openadsdk.core.cn.fb.fs olo;
    private nqi.zmn phc;
    protected String rc;
    protected com.bytedance.sdk.openadsdk.fb.fb.btk rt;
    private final Runnable uqh;
    private String zg;

    public void kgc() {
    }

    public kjb(Context context, com.bytedance.sdk.component.adexpress.fs.mw mwVar, com.bytedance.sdk.openadsdk.fb.fb.btk btkVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        super(context, mwVar);
        this.kw = Collections.synchronizedMap(new HashMap());
        this.doe = 0;
        this.nqi = new com.bytedance.sdk.component.zg.fs.zn("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.iv.kjb.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.btk.zmn) kjb.this).nps.get()) {
                    return;
                }
                kjb kjbVar = kjb.this;
                kjbVar.mw = kjbVar.rt().zn();
                kjb kjbVar2 = kjb.this;
                kjbVar2.zmn(kjbVar2.mw);
                if (kjb.this.doe == 0) {
                    kjb.this.kw();
                }
                com.bytedance.sdk.openadsdk.core.cn.zn().post(kjb.this.uqh);
            }
        };
        this.uqh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.kjb.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.btk.zmn) kjb.this).nps.get() || kjb.this.iqz == null) {
                    return;
                }
                kjb.this.olo();
                kjb.this.cyb();
            }
        };
        if (this.btk == null) {
            return;
        }
        this.iv = context;
        this.rc = mwVar.fb();
        this.klz = nqiVar;
        this.rt = btkVar;
        kw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kw() {
        if (this.btk.getWebView() != null && nu.hhw()) {
            iqz();
        } else {
            this.doe = 1;
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.kjb.3
                @Override // java.lang.Runnable
                public void run() {
                    kjb.this.iqz();
                }
            });
        }
        if (!cn.fs(this.klz) || this.zn) {
            return;
        }
        cn.zmn(this.klz);
    }

    protected void cyb() {
        com.bytedance.sdk.component.adexpress.fs.nps npsVar = this.iqz;
        if (npsVar != null) {
            super.zmn(npsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iqz() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.btk;
        if (npsVar == null || npsVar.getWebView() == null || this.doe == 2) {
            return;
        }
        this.zg = zmn(this.klz);
        Log.d("TTAD.WebViewRender", "initWebViewRender: url = " + this.zg);
        this.btk.setDisplayZoomControls(false);
        zmn(hgd.zmn(this.zg));
        doe();
        fkt fktVar = new fkt(this.iv);
        this.cn = fktVar;
        fktVar.btk(true);
        cn();
        this.doe = 2;
    }

    public static String zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        return com.bytedance.sdk.component.adexpress.zmn.fs.fs.fb((nqiVar == null || !nqiVar.sxr()) ? null : "v3");
    }

    public void olo() {
        fkt fktVar;
        com.bytedance.sdk.component.bvs.nps npsVar = this.btk;
        if (npsVar == null || npsVar.getWebView() == null || (fktVar = this.cn) == null) {
            return;
        }
        fktVar.fs(this.btk).zmn(this.klz).zn(this.klz.ji()).fb(this.klz.ze()).fs(oub.zmn(this.rc)).btk(this.klz.gor()).zmn(this).zmn(this.mw).zmn(this.btk).zmn(this.rt);
    }

    public void doe() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.klz;
        if (nqiVar == null || nqiVar.ouf() == null) {
            return;
        }
        this.phc = this.klz.ouf();
    }

    public void cn() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.btk;
        if (npsVar == null || npsVar.getWebView() == null) {
            return;
        }
        this.btk.setBackgroundColor(0);
        this.btk.setBackgroundResource(R.color.transparent);
        zmn(this.btk);
        if (fb() != null) {
            this.bvs = new com.bytedance.sdk.openadsdk.fb.mw(this.klz, fb().getWebView()).fs(false);
        }
        this.bvs.zmn(this.rt);
        rc rcVar = new rc(this.iv, this.cn, this.klz, this.bvs, rt());
        this.cyb = rcVar;
        this.btk.setWebViewClient(rcVar);
        this.btk.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.cn, this.bvs));
        phc();
    }

    protected void phc() {
        com.bytedance.sdk.component.adexpress.btk.btk.zmn().zmn(this.btk, this.cn);
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    protected void klz() {
        super.klz();
        com.bytedance.sdk.openadsdk.utils.zmn btk = com.bytedance.sdk.openadsdk.core.cyb.zmn().btk();
        this.kgc = btk;
        btk.zmn(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    protected void mw() {
        super.mw();
        com.bytedance.sdk.openadsdk.utils.zmn zmnVar = this.kgc;
        if (zmnVar != null) {
            zmnVar.fs(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn, com.bytedance.sdk.component.adexpress.fs.fb
    public void zmn(com.bytedance.sdk.component.adexpress.fs.nps npsVar) {
        this.iqz = npsVar;
        nu.zn((Runnable) this.nqi);
    }

    private void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        if (npsVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(this.iv).zmn(false).zmn(npsVar.getWebView());
            npsVar.setVerticalScrollBarEnabled(false);
            npsVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(npsVar);
            npsVar.mw();
            npsVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.iqz.zmn(npsVar.getWebView(), BuildConfig.VERSION_CODE));
            npsVar.setMixedContentMode(0);
            npsVar.setJavaScriptEnabled(true);
            npsVar.setJavaScriptCanOpenWindowsAutomatically(true);
            npsVar.setDomStorageEnabled(true);
            npsVar.setDatabaseEnabled(true);
            npsVar.setAllowFileAccess(false);
            npsVar.setSupportZoom(true);
            npsVar.setBuiltInZoomControls(true);
            npsVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            npsVar.setUseWideViewPort(true);
            npsVar.setCacheMode(-1);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.WebViewRender", e.toString());
        }
    }

    public rc nqi() {
        return this.cyb;
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    public com.bytedance.sdk.component.bvs.nps fb() {
        return this.btk;
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    public void zg() {
        if (this.nps.get()) {
            return;
        }
        super.zg();
        fkt fktVar = this.cn;
        if (fktVar != null) {
            fktVar.zn();
            this.cn.klz();
            this.cn = null;
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.bvs;
        if (mwVar != null) {
            mwVar.fb(false);
        }
        com.bytedance.sdk.openadsdk.core.cn.zn().removeCallbacks(this.uqh);
        this.kw.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn, com.bytedance.sdk.component.adexpress.fs.fb
    public int zn() {
        return this.klz.skn();
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    public void bvs() {
        if (fb() == null) {
            return;
        }
        try {
            fb().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    public void rc() {
        super.rc();
        if (this.cn == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.cn.zmn("expressShow", jSONObject);
            this.cn.zn(true);
        } catch (Exception unused) {
        }
    }

    public void fs(int i) {
        if (this.cn == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i);
            this.cn.zmn("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.WebViewRender", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    public void iv() {
        fkt fktVar = this.cn;
        if (fktVar == null) {
            return;
        }
        fktVar.zmn("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    public void zmn(int i) {
        if (i == this.hhw) {
            return;
        }
        this.hhw = i;
        zn(i == 0);
    }

    private void zn(boolean z) {
        if (this.cn == null || this.btk == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.cn.zmn("expressAdShow", jSONObject);
            this.cn.fs(z);
        } catch (Exception unused) {
        }
    }

    public fkt uqh() {
        return this.cn;
    }

    public static boolean fs(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn, com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        super.zmn(rtVar);
        if (this.fb) {
            com.bytedance.sdk.component.utils.bvs.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.kjb.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.btk.zmn) kjb.this).btk.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        this.olo = fsVar;
        fkt fktVar = this.cn;
        if (fktVar != null) {
            fktVar.zmn(fsVar);
        }
    }
}
