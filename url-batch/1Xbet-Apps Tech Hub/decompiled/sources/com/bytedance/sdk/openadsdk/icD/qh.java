package com.bytedance.sdk.openadsdk.icD;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.pvs.sUS;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.card.MaterialCardViewHelper;
import io.ktor.http.LinkHeader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LandingPageLog.java */
/* loaded from: classes2.dex */
public class qh {
    private static final int[] icD = {10, 30, 50, 75, 100};
    private final AtomicInteger CvL;
    private WebView Gp;
    private final Context IP;
    private long Jd;
    private String Ju;
    private final AtomicBoolean Mxy;
    private int NB;
    private long OT;
    private volatile long OhP;
    private volatile long Pj;
    private volatile long SE;
    private int Wyp;
    private long ZhG;
    private boolean ae;
    private com.bytedance.sdk.openadsdk.core.widget.pvs.sUS bNS;
    private final cR cR;
    private final AtomicInteger cRf;
    private final boolean dX;
    private Wyp dx;
    private boolean dyT;
    private long ea;
    private com.bytedance.sdk.openadsdk.icD.vG.NB gA;
    private final AtomicBoolean gSd;
    private volatile long jhZ;
    private boolean jlb;
    private String kj;
    private boolean mnm;
    private long ny;
    private int od;
    public sUS.pvs pvs;
    private volatile int qD;
    private boolean qh;
    private long rCZ;
    private final AtomicInteger sP;
    private final AtomicBoolean sUS;
    private final AtomicBoolean so;
    private String sq;
    private long uc;
    private so vA;
    private int vG;
    private final AtomicBoolean yWX;
    private final AtomicBoolean yiw;
    private String zM;

    public cR pvs() {
        return this.cR;
    }

    public qh(cR cRVar, WebView webView, Wyp wyp, int i) {
        this(cRVar, webView);
        this.dx = wyp;
        this.od = i;
    }

    public qh(cR cRVar, WebView webView) {
        this.vG = 0;
        this.Jd = -1L;
        this.NB = 1;
        this.sUS = new AtomicBoolean(false);
        this.yiw = new AtomicBoolean(false);
        this.so = new AtomicBoolean(false);
        this.Mxy = new AtomicBoolean(false);
        this.Wyp = -1;
        this.zM = "landingpage";
        this.uc = 0L;
        this.rCZ = 0L;
        this.OT = 0L;
        this.ny = 0L;
        this.ZhG = 0L;
        this.dyT = false;
        this.dX = false;
        this.CvL = new AtomicInteger(0);
        this.ae = false;
        this.jlb = false;
        this.Pj = 0L;
        this.cRf = new AtomicInteger(0);
        this.sP = new AtomicInteger(0);
        this.gSd = new AtomicBoolean(false);
        this.qD = 0;
        this.od = -1;
        this.yWX = new AtomicBoolean(false);
        Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        this.IP = pvs2;
        this.cR = cRVar;
        this.Gp = webView;
        if (cRVar != null && cRVar.SE()) {
            com.bytedance.sdk.openadsdk.core.widget.pvs.sUS sus = new com.bytedance.sdk.openadsdk.core.widget.pvs.sUS(this.Gp, cRVar, pvs2);
            this.bNS = sus;
            this.pvs = sus.vG();
        }
        if (webView == null) {
            return;
        }
        if (cRVar != null && cRVar.SE() && com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().mRq()) {
            this.vA = new so(cRVar, webView);
        }
        if (webView instanceof PangleWebView) {
            this.ea = ((PangleWebView) this.Gp).pvs;
        } else {
            this.ea = System.currentTimeMillis();
        }
        try {
            this.Gp.addJavascriptInterface(new pvs(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("LandingPageLog", "addJavascriptInterface exception", e);
        }
        if (cRVar == null || cRVar.Je() == null) {
            return;
        }
        this.Jd = cRVar.Je().optLong("page_id", -1L);
    }

    public void pvs(long j) {
        this.rCZ = j;
    }

    public void pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pvs.sUS sus = this.bNS;
        if (sus != null) {
            sus.pvs(str);
        }
        so soVar = this.vA;
        if (soVar != null) {
            soVar.Jd(str);
        }
        this.zM = str;
    }

    public void pvs(int i) {
        this.od = i;
    }

    public com.bytedance.sdk.openadsdk.icD.vG.NB icD() {
        return this.gA;
    }

    public void pvs(com.bytedance.sdk.openadsdk.icD.vG.NB nb) {
        this.gA = nb;
    }

    public qh pvs(boolean z) {
        this.ae = z;
        return this;
    }

    public boolean vG() {
        return this.jlb;
    }

    public void icD(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.sq = str;
    }

    public void icD(boolean z) {
        this.jlb = z;
    }

    public void Jd() {
        if (Mxy()) {
            this.OhP = SystemClock.elapsedRealtime();
            vG.pvs(this.cR, this.sq);
        }
    }

    public void NB() {
        if (Mxy()) {
            this.jhZ = SystemClock.elapsedRealtime();
            sUS();
        }
    }

    public void sUS() {
        if (Mxy() && this.jhZ > 0 && this.SE > 0 && !this.yWX.getAndSet(true)) {
            vG.icD(this.SE - this.jhZ, this.cR, this.sq, (String) null);
        }
    }

    public void pvs(WebView webView, int i) {
        if (webView == null) {
            return;
        }
        if (this.Pj == 0) {
            this.Pj = SystemClock.elapsedRealtime();
        }
        if (this.OT == 0 && i > 0) {
            this.OT = System.currentTimeMillis();
        } else if (this.ny == 0 && i == 100) {
            this.ny = System.currentTimeMillis();
        }
        if (this.vG != icD.length && ("landingpage".equals(this.zM) || "landingpage_endcard".equals(this.zM) || "landingpage_split_screen".equals(this.zM) || "landingpage_direct".equals(this.zM) || "aggregate_page".equals(this.zM))) {
            int i2 = this.vG;
            while (true) {
                int[] iArr = icD;
                if (i2 >= iArr.length || i < iArr[this.vG]) {
                    break;
                }
                int i3 = i2 + 1;
                this.vG = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ImagesContract.URL, webView.getUrl());
                    long j = this.Jd;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception unused) {
                }
                pvs("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            pvs(webView.getUrl(), "progress", Math.min(this.ny - this.OT, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void pvs(String str, String str2, long j) {
        if (this.so.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int indexOf = str.indexOf(38, 200);
                    int i = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION;
                    if (indexOf == -1 || indexOf > 300) {
                        indexOf = str.indexOf(63);
                    }
                    if (indexOf != -1 && indexOf <= 300) {
                        i = indexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put(ImagesContract.URL, str);
                jSONObject.put(LinkHeader.Parameters.Type, str2);
            } catch (Throwable unused) {
            }
            pvs("load_finish_progress", jSONObject, j);
        }
    }

    public void pvs(WebView webView, String str, Bitmap bitmap, boolean z) {
        this.mnm = z;
        com.bytedance.sdk.openadsdk.core.widget.pvs.sUS sus = this.bNS;
        if (sus != null && z) {
            sus.icD(str);
            this.bNS.icD();
        }
        so soVar = this.vA;
        if (soVar != null && z) {
            soVar.pvs(str);
        }
        WebView webView2 = this.Gp;
        if (webView2 != null) {
            try {
                WebBackForwardList copyBackForwardList = webView2.copyBackForwardList();
                if (copyBackForwardList != null && copyBackForwardList.getCurrentIndex() > this.qD) {
                    this.cRf.incrementAndGet();
                }
                this.qD = copyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.Pj == 0) {
            this.Pj = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.gA;
        if (nb != null) {
            nb.NB();
        }
        if (this.sUS.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i = this.od;
                if (i >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i));
                }
            } catch (Exception unused) {
            }
            pvs("load_start", jSONObject);
        }
    }

    public void pvs(WebView webView, String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.pvs.sUS sus = this.bNS;
        if (sus != null && z) {
            sus.pvs();
        }
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.gA;
        if (nb != null) {
            nb.sUS();
        }
        so soVar = this.vA;
        if (soVar != null && z) {
            soVar.icD(str);
        }
        if (webView != null && !this.dyT && this.ae) {
            this.dyT = true;
            com.bytedance.sdk.component.utils.kj.pvs(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.yiw.compareAndSet(false, true)) {
            if (this.NB != 3) {
                this.NB = 2;
            }
            this.uc = System.currentTimeMillis();
            boolean z2 = this.NB == 2;
            int Wyp = Wyp();
            if (z2) {
                long j = this.ny - this.OT;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.Wyp);
                    jSONObject.put("error_msg", this.kj);
                    jSONObject.put("error_url", this.Ju);
                    int i = this.od;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", Wyp);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put(ImagesContract.URL, this.cR.CjQ());
                    jSONObject.put("preload_h5_type", this.cR.CL());
                } catch (Exception unused) {
                }
                pvs(z, "0");
                long min = Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME);
                pvs("load_finish", jSONObject, min);
                if (Mxy()) {
                    this.SE = SystemClock.elapsedRealtime();
                    sUS();
                    vG.pvs(this.cR, this.sq, this.SE - this.OhP);
                }
                pvs(str, "load_finish", min);
                Wyp wyp = this.dx;
                if (wyp != null) {
                    wyp.pvs(Wyp);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.Wyp);
                jSONObject2.put("error_msg", this.kj);
                jSONObject2.put("error_url", this.Ju);
                jSONObject2.put("first_page", Wyp);
                int i2 = this.od;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put(ImagesContract.URL, this.cR.CjQ());
                jSONObject2.put("preload_h5_type", this.cR.CL());
            } catch (Exception unused2) {
            }
            pvs(z, ExifInterface.GPS_MEASUREMENT_2D);
            pvs("load_fail", jSONObject2);
            if (Mxy()) {
                vG.pvs(this.cR, this.sq, SystemClock.elapsedRealtime() - this.OhP, this.Wyp, this.kj, this.Ju);
            }
            if (this.qh) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                pvs("load_fail_main", jSONObject2);
            }
        }
    }

    private boolean Mxy() {
        cR cRVar;
        return this.jlb && (cRVar = this.cR) != null && cRVar.XPz();
    }

    private String vG(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void pvs(WebView webView, int i, String str, String str2, String str3, boolean z) {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb = this.gA;
        if (nb != null) {
            nb.pvs((JSONObject) null);
        }
        if (!(str3 != null && str3.startsWith("image")) && this.NB != 2) {
            this.NB = 3;
        }
        this.Wyp = i;
        this.kj = str;
        this.Ju = str2;
        this.qh = z;
    }

    public void yiw() {
        if (this.ZhG == 0) {
            this.ZhG = System.currentTimeMillis();
        }
        this.uc = System.currentTimeMillis();
    }

    public void so() {
        if ("landingpage".equals(this.zM) || "landingpage_endcard".equals(this.zM) || "landingpage_split_screen".equals(this.zM) || "landingpage_direct".equals(this.zM) || "aggregate_page".equals(this.zM)) {
            if (this.NB == 2) {
                if (this.rCZ > 0 || !vG()) {
                    long currentTimeMillis = System.currentTimeMillis() - Math.max(this.uc, this.rCZ);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("load_status", this.NB);
                        jSONObject.put("max_scroll_percent", this.CvL.get());
                        jSONObject.put("jump_times", this.cRf.getAndSet(0));
                        jSONObject.put("click_times", this.sP.getAndSet(0));
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                    } catch (JSONException unused) {
                    }
                    this.Mxy.set(true);
                    pvs("stay_page", jSONObject, Math.min(currentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                }
            }
        }
    }

    public void pvs(SSWebView sSWebView) {
        int cGU;
        Bitmap pvs2;
        cR cRVar;
        if ((!"landingpage".equals(this.zM) && !"landingpage_endcard".equals(this.zM) && !"landingpage_split_screen".equals(this.zM) && !"landingpage_direct".equals(this.zM) && !"aggregate_page".equals(this.zM)) || (cGU = com.bytedance.sdk.openadsdk.core.mnm.Jd().cGU()) == 0 || new Random().nextInt(100) + 1 > cGU || sSWebView == null || sSWebView.getWebView() == null || sSWebView.getVisibility() != 0 || (pvs2 = Pj.pvs(sSWebView)) == null || (cRVar = this.cR) == null) {
            return;
        }
        Pj.pvs(cRVar, this.zM, "landing_page_blank", pvs2, sSWebView.getUrl(), this.Jd);
    }

    public void vG(boolean z) {
        WebView webView = this.Gp;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.yiw.compareAndSet(false, true)) {
            pvs(z, "1");
            if (this.ae) {
                vG.pvs(this.cR, this.zM, System.currentTimeMillis() - this.ZhG, this.od, Wyp());
            }
        } else if (this.NB == 2 && !this.Mxy.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.NB);
                jSONObject.put("max_scroll_percent", this.CvL.get());
                jSONObject.put("jump_times", this.cRf.getAndSet(0));
                jSONObject.put("click_times", this.sP.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            pvs("stay_page", jSONObject, 0L);
        }
        this.Gp = null;
    }

    public void icD(WebView webView, String str, boolean z) {
        so soVar = this.vA;
        if (soVar == null || !z) {
            return;
        }
        soVar.pvs(webView, str);
    }

    private void pvs(String str, JSONObject jSONObject) {
        pvs(str, jSONObject, -1L);
    }

    private void pvs(String str, final JSONObject jSONObject, final long j) {
        if (!this.ae || this.cR == null || TextUtils.isEmpty(str)) {
            return;
        }
        vG.pvs(System.currentTimeMillis(), this.cR, this.zM, str, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.qh.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    return null;
                }
                try {
                    int i = 1;
                    jSONObject2.put("is_playable", rCZ.icD(qh.this.cR) ? 1 : 0);
                    JSONObject jSONObject3 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(qh.this.cR)) {
                        i = 0;
                    }
                    jSONObject3.put("usecache", i);
                } catch (JSONException unused) {
                }
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("ad_extra_data", jSONObject.toString());
                        long j2 = j;
                        if (j2 > 0) {
                            jSONObject4.put(TypedValues.TransitionType.S_DURATION, j2);
                        }
                    } catch (JSONException unused2) {
                    }
                    return jSONObject4;
                } catch (JSONException unused3) {
                    return null;
                }
            }
        });
    }

    /* compiled from: LandingPageLog.java */
    private class pvs {
        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        private pvs() {
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i = 100;
                } else if (intValue >= 0) {
                    i = intValue;
                }
            } catch (Throwable unused) {
            }
            qh.this.CvL.set(i);
        }
    }

    public void pvs(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.pvs.sUS sus = this.bNS;
        if (sus != null && this.mnm) {
            sus.pvs(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.Pj != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.sP.incrementAndGet();
                if (this.gSd.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ImagesContract.URL, this.cR.CjQ());
                } catch (JSONException unused) {
                }
                pvs("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.Pj, 0L));
            }
        }
    }

    public void pvs(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.pvs.sUS sus = this.bNS;
        if (sus != null && z) {
            sus.vG(str);
        }
        so soVar = this.vA;
        if (soVar == null || !z) {
            return;
        }
        soVar.vG(str);
    }

    public void icD(int i) {
        com.bytedance.sdk.openadsdk.core.widget.pvs.sUS sus = this.bNS;
        if (sus == null || !this.mnm) {
            return;
        }
        sus.pvs(i);
    }

    private void pvs(boolean z, final String str) {
        if (z) {
            final int Wyp = Wyp();
            vG.pvs(new com.bytedance.sdk.component.so.so("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.icD.qh.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.yiw dX = com.bytedance.sdk.openadsdk.core.mnm.Jd().dX();
                        boolean pvs2 = qh.this.pvs(dX, str);
                        if (pvs2) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.yiw.icD)) {
                                qh.this.pvs(Wyp, str);
                                return;
                            }
                            if (TextUtils.isEmpty(dX.vG) || !pvs2) {
                                return;
                            }
                            String str2 = dX.vG;
                            com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
                            vG.icD(str2);
                            HashMap hashMap = new HashMap();
                            hashMap.put("content-type", "application/json; charset=utf-8");
                            vG.Jd(hashMap);
                            vG.pvs(9);
                            vG.pvs("sendPrefLog");
                            vG.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.icD.qh.2.1
                                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.yiw.icD = icd.Jd();
                                        qh.this.pvs(Wyp, str);
                                    } catch (Exception e) {
                                        com.bytedance.sdk.component.utils.Ju.pvs("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.yiw.icD)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.yiw.icD);
            jSONObject.putOpt("cid", pvs().neB());
            jSONObject.putOpt("ad_id", pvs().neB());
            jSONObject.put("log_extra", pvs().HWd());
            jlb.pvs(sb, "\"/** adInfo **/\"", jSONObject.toString());
            jlb.pvs(sb, "\"/** first_page **/\"", String.valueOf(i));
            jlb.pvs(sb, "\"/** ix_to_externalurl **/\"", this.Jd != -1 ? "1" : "0");
            jlb.pvs(sb, "\"/** preload_status **/\"", this.od == 2 ? ExifInterface.GPS_MEASUREMENT_2D : "0");
            jlb.pvs(sb, "\"/** scene_state **/\"", str);
            jlb.pvs(sb, "\"/** web_init_time **/\"", String.valueOf(this.ea));
            jlb.pvs(sb, "\"/** channel_name **/\"", "\"" + pvs().tQ() + "\"");
            jlb.pvs(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            jlb.pvs(sb, "\"/** web_url **/\"", "\"" + pvs().CjQ() + "\"");
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return;
            }
            final String vG = vG(sb2);
            if (TextUtils.isEmpty(vG) || this.Gp == null) {
                return;
            }
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.icD.qh.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.kj.pvs(qh.this.Gp, vG);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
        }
    }

    private int Wyp() {
        WebView webView = this.Gp;
        if (webView != null) {
            try {
                WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                if (copyBackForwardList != null) {
                    if (copyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pvs(com.bytedance.sdk.openadsdk.core.settings.yiw yiwVar, String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return yiwVar.Jd;
            case "1":
                return yiwVar.NB;
            case "2":
                return yiwVar.sUS;
            default:
                return false;
        }
    }
}
