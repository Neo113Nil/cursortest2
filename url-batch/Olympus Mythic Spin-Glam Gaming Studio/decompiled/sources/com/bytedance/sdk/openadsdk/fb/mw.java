package com.bytedance.sdk.openadsdk.fb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class mw {
    private static final int[] zn = {10, 30, 50, 75, 100};
    private long am;
    private final nqi bjh;
    private long btk;
    private final AtomicBoolean bvs;
    private final AtomicBoolean bxw;
    private boolean cd;
    private final Context cn;
    private final AtomicBoolean cud;
    private com.bytedance.sdk.openadsdk.core.widget.zmn.nps cyb;
    private final AtomicInteger dgt;
    private long doe;
    private boolean ev;
    private int fb;
    private final int[] fkt;
    AtomicBoolean fs;
    private volatile int gn;
    private WeakReference<WebView> hgd;
    private int hhw;
    private boolean iqz;
    private final AtomicBoolean iv;
    private klz jy;
    private com.bytedance.sdk.openadsdk.doe.zg kgc;
    private long kjb;
    private boolean klz;
    private volatile long kra;
    private bvs kw;
    private volatile long mhu;
    private String mw;
    private volatile long na;
    private final AtomicBoolean nps;
    private long nqi;
    private boolean nu;
    private boolean olo;
    private boolean oub;
    private int phc;
    private int rc;
    private String rp;
    private String rt;
    private long so;
    private String tet;
    private final boolean tf;
    private int uqd;
    private int uqh;
    private String ve;
    private volatile long vlj;
    private com.bytedance.sdk.openadsdk.fb.fb.btk ww;
    private final AtomicBoolean xrr;
    private long yj;
    private long yo;
    private final AtomicInteger yof;
    private long zak;
    private final AtomicBoolean zg;
    public nps.zmn zmn;

    public nqi zmn() {
        return this.bjh;
    }

    public mw(nqi nqiVar, WebView webView, klz klzVar, int i) {
        this(nqiVar, webView);
        this.jy = klzVar;
        this.uqd = i;
    }

    public mw(nqi nqiVar, WebView webView) {
        this(nqiVar, webView, false);
    }

    public mw(nqi nqiVar, WebView webView, boolean z) {
        this.fb = 0;
        this.btk = -1L;
        this.hhw = 1;
        this.nps = new AtomicBoolean(false);
        this.zg = new AtomicBoolean(false);
        this.bvs = new AtomicBoolean(false);
        this.iv = new AtomicBoolean(false);
        this.rc = -1;
        this.iqz = false;
        this.phc = 0;
        this.fs = new AtomicBoolean(false);
        this.rp = "landingpage";
        this.kjb = 0L;
        this.zak = 0L;
        this.am = 0L;
        this.yj = 0L;
        this.so = 0L;
        this.ev = false;
        this.tf = false;
        int[] iArr = {0};
        this.fkt = iArr;
        this.nu = false;
        this.oub = false;
        this.vlj = 0L;
        this.yof = new AtomicInteger(0);
        this.dgt = new AtomicInteger(0);
        this.cud = new AtomicBoolean(false);
        this.gn = 0;
        this.uqd = -1;
        this.bxw = new AtomicBoolean(false);
        this.xrr = new AtomicBoolean(false);
        this.cd = false;
        Context zmn2 = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        this.cn = zmn2;
        this.bjh = nqiVar;
        if (webView == null) {
            return;
        }
        this.iqz = z;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.hgd = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (nqiVar != null && nqiVar.vpd()) {
            com.bytedance.sdk.openadsdk.core.widget.zmn.nps npsVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.nps(webView2, nqiVar, zmn2, this.iqz);
            this.cyb = npsVar;
            this.zmn = npsVar.zn();
        }
        if (nqiVar != null && nqiVar.lwz() && com.bytedance.sdk.openadsdk.core.settings.rc.fs().nqi()) {
            this.kw = new bvs(nqiVar, webView, this.iqz);
        }
        if (webView instanceof com.bytedance.sdk.component.bvs.hhw) {
            this.yo = ((com.bytedance.sdk.component.bvs.hhw) webView2).zmn;
        } else {
            this.yo = System.currentTimeMillis();
        }
        try {
            PangleNetworkBridge.webviewAddJavascriptInterface(webView2, new zmn(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e) {
            iqz.zmn("LandingPageLog", "addJavascriptInterface exception", e);
        }
        if (nqiVar != null && nqiVar.wu() != null) {
            this.btk = nqiVar.wu().optLong("page_id", -1L);
        }
        this.ve = String.valueOf(SystemClock.elapsedRealtime());
    }

    public void zmn(boolean z) {
        if (z) {
            this.phc = 1;
        }
    }

    public void zmn(klz klzVar) {
        this.jy = klzVar;
    }

    public void zmn(long j) {
        this.zak = j;
    }

    public void zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.zmn.nps npsVar = this.cyb;
        if (npsVar != null) {
            npsVar.zmn(str);
        }
        bvs bvsVar = this.kw;
        if (bvsVar != null) {
            bvsVar.zn(str);
        }
        this.rp = str;
    }

    public void zmn(int i) {
        this.uqd = i;
    }

    public com.bytedance.sdk.openadsdk.fb.fb.btk fs() {
        return this.ww;
    }

    public void zmn(com.bytedance.sdk.openadsdk.fb.fb.btk btkVar) {
        this.ww = btkVar;
    }

    public mw fs(boolean z) {
        this.nu = z;
        return this;
    }

    public boolean zn() {
        return this.oub;
    }

    public void fs(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.tet = str;
    }

    public void zmn(com.bytedance.sdk.openadsdk.doe.zg zgVar) {
        this.kgc = zgVar;
    }

    public void zn(boolean z) {
        this.oub = z;
    }

    public void fb() {
        if (bvs()) {
            this.kra = SystemClock.elapsedRealtime();
            zn.zmn(this.bjh, this.tet);
        }
    }

    public void btk() {
        if (bvs()) {
            this.na = SystemClock.elapsedRealtime();
            hhw();
        }
    }

    public void hhw() {
        if (bvs() && this.na > 0 && this.mhu > 0 && !this.bxw.getAndSet(true)) {
            zn.fs(this.mhu - this.na, this.bjh, this.tet, (String) null);
        }
    }

    public void zmn(WebView webView, int i) {
        if (webView == null) {
            return;
        }
        if (this.vlj == 0) {
            this.vlj = SystemClock.elapsedRealtime();
        }
        if (this.am == 0 && i > 0) {
            this.am = System.currentTimeMillis();
        } else if (this.yj == 0 && i == 100) {
            this.yj = System.currentTimeMillis();
        }
        if (this.fb != zn.length && ("landingpage".equals(this.rp) || "landingpage_endcard".equals(this.rp) || "landingpage_split_screen".equals(this.rp) || "landingpage_direct".equals(this.rp) || "aggregate_page".equals(this.rp))) {
            int i2 = this.fb;
            while (true) {
                int[] iArr = zn;
                if (i2 >= iArr.length || i < iArr[this.fb]) {
                    break;
                }
                int i3 = i2 + 1;
                this.fb = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.btk;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception unused) {
                }
                zmn("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            zmn(false, SystemClock.elapsedRealtime());
            fs(webView.getUrl(), "progress", Math.min(this.yj - this.am, 600000L));
        }
    }

    private void fs(String str, String str2, long j) {
        if (this.bvs.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int indexOf = str.indexOf(38, 200);
                    int i = 300;
                    if (indexOf == -1 || indexOf > 300) {
                        indexOf = str.indexOf(63);
                    }
                    if (indexOf != -1 && indexOf <= 300) {
                        i = indexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            zmn("load_finish_progress", jSONObject, j);
        }
    }

    public void zmn(WebView webView, String str, Bitmap bitmap, boolean z, int i) {
        this.olo = z;
        this.uqh++;
        com.bytedance.sdk.openadsdk.core.widget.zmn.nps npsVar = this.cyb;
        if (npsVar != null && z) {
            npsVar.fs(str);
            this.cyb.fs();
        }
        bvs bvsVar = this.kw;
        if (bvsVar != null && z) {
            bvsVar.zmn(str, i);
        }
        WeakReference<WebView> weakReference = this.hgd;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList copyBackForwardList = webView2.copyBackForwardList();
                if (copyBackForwardList != null && copyBackForwardList.getCurrentIndex() > this.gn) {
                    this.yof.incrementAndGet();
                }
                this.gn = copyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                iqz.zmn("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.vlj == 0) {
            this.vlj = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.ww;
        if (btkVar != null) {
            btkVar.fb();
        }
        if (this.nps.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i2 = this.uqd;
                if (i2 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i2));
                }
            } catch (Exception unused) {
            }
            zmn("load_start", jSONObject);
        }
    }

    public void zmn(WebView webView, String str, boolean z) {
        zmn(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.zmn.nps npsVar = this.cyb;
        if (npsVar != null && z) {
            npsVar.zmn();
        }
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.ww;
        if (btkVar != null) {
            btkVar.btk();
        }
        bvs bvsVar = this.kw;
        if (bvsVar != null && z) {
            bvsVar.zmn(str);
        }
        if (webView != null && !this.ev && this.nu) {
            this.ev = true;
            com.bytedance.sdk.component.utils.rt.zmn(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.zg.compareAndSet(false, true)) {
            if (this.hhw != 3) {
                this.hhw = 2;
            }
            this.kjb = System.currentTimeMillis();
            boolean z2 = this.hhw == 2;
            int iv = iv();
            if (z2) {
                long j = this.yj - this.am;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.rc);
                    jSONObject.put("error_msg", this.mw);
                    jSONObject.put("error_url", this.rt);
                    int i = this.uqd;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", iv);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.bjh.pl());
                    jSONObject.put("preload_h5_type", this.bjh.ww());
                } catch (Exception unused) {
                }
                zmn(z, "0");
                long min = Math.min(j, 600000L);
                zmn("load_finish", jSONObject, min);
                if (bvs()) {
                    this.mhu = SystemClock.elapsedRealtime();
                    hhw();
                    zn.zmn(this.bjh, this.tet, this.mhu - this.kra);
                }
                fs(str, "load_finish", min);
                klz klzVar = this.jy;
                if (klzVar != null) {
                    klzVar.zmn(iv);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.rc);
                jSONObject2.put("error_msg", this.mw);
                jSONObject2.put("error_url", this.rt);
                jSONObject2.put("first_page", iv);
                int i2 = this.uqd;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.bjh.pl());
                jSONObject2.put("preload_h5_type", this.bjh.ww());
            } catch (Exception unused2) {
            }
            zmn(z, "2");
            zmn("load_fail", jSONObject2);
            if (bvs()) {
                zn.zmn(this.bjh, this.tet, SystemClock.elapsedRealtime() - this.kra, this.rc, this.mw, this.rt);
            }
            if (this.klz) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                zmn("load_fail_main", jSONObject2);
            }
        }
    }

    private boolean bvs() {
        nqi nqiVar;
        return this.oub && (nqiVar = this.bjh) != null && nqiVar.fkt();
    }

    private String btk(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void zmn(WebView webView, int i, String str, String str2, String str3, boolean z) {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.ww;
        if (btkVar != null) {
            btkVar.zmn((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.hhw != 2) {
            this.hhw = 3;
        }
        this.rc = i;
        this.mw = str;
        this.rt = str2;
        this.klz = z;
    }

    public void nps() {
        if (this.so == 0) {
            this.so = System.currentTimeMillis();
        }
        this.kjb = System.currentTimeMillis();
        if ("landingpage".equals(this.rp) || "landingpage_endcard".equals(this.rp) || "landingpage_split_screen".equals(this.rp) || "landingpage_direct".equals(this.rp) || "aggregate_page".equals(this.rp)) {
            if (this.xrr.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("landingStart", this.bjh, this.ve);
            } else {
                com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("landingContinue", this.bjh, this.ve);
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.iqz.bvs(this.bjh) || com.bytedance.sdk.openadsdk.core.model.iqz.fs(this.bjh)) {
            zmn(true, SystemClock.elapsedRealtime());
        }
    }

    public void zg() {
        if (("landingpage".equals(this.rp) || "landingpage_endcard".equals(this.rp) || "landingpage_split_screen".equals(this.rp) || "landingpage_direct".equals(this.rp) || "aggregate_page".equals(this.rp) || "landingpage_split_ceiling".equals(this.rp)) && this.hhw == 2) {
            if (this.zak > 0 || !zn()) {
                long currentTimeMillis = System.currentTimeMillis() - Math.max(this.kjb, this.zak);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.hhw);
                    jSONObject.put("max_scroll_percent", this.fkt[0]);
                    jSONObject.put("jump_times", this.yof.getAndSet(0));
                    jSONObject.put("click_times", this.dgt.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.iv.set(true);
                zmn("stay_page", jSONObject, Math.min(currentTimeMillis, 600000L));
                com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("landingPause", this.bjh, this.ve);
            }
        }
    }

    public void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        int hwg;
        Bitmap zmn2;
        nqi nqiVar;
        if ((!"landingpage".equals(this.rp) && !"landingpage_endcard".equals(this.rp) && !"landingpage_split_screen".equals(this.rp) && !"landingpage_direct".equals(this.rp) && !"aggregate_page".equals(this.rp)) || (hwg = com.bytedance.sdk.openadsdk.core.kgc.fb().hwg()) == 0 || new Random().nextInt(100) + 1 > hwg || npsVar == null || npsVar.getWebView() == null || npsVar.getVisibility() != 0 || (zmn2 = jy.zmn(npsVar)) == null || (nqiVar = this.bjh) == null) {
            return;
        }
        jy.zmn(nqiVar, this.rp, "landing_page_blank", zmn2, npsVar.getUrl(), this.btk);
    }

    public void fb(boolean z) {
        WeakReference<WebView> weakReference = this.hgd;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                iqz.zmn("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.zg.compareAndSet(false, true)) {
            zmn(z, "1");
            if (this.nu) {
                zn.zmn(this.bjh, this.rp, System.currentTimeMillis() - this.so, this.uqd, iv());
            }
        } else if (this.hhw == 2 && !this.iv.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.hhw);
                jSONObject.put("max_scroll_percent", this.fkt[0]);
                jSONObject.put("jump_times", this.yof.getAndSet(0));
                jSONObject.put("click_times", this.dgt.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            zmn("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.rp) || "landingpage_endcard".equals(this.rp) || "landingpage_split_screen".equals(this.rp) || "landingpage_direct".equals(this.rp) || "aggregate_page".equals(this.rp) || "landingpage_split_ceiling".equals(this.rp)) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("landingFinish", this.bjh, this.ve);
        }
    }

    public void fs(WebView webView, String str, boolean z) {
        bvs bvsVar = this.kw;
        if (bvsVar == null || !z) {
            return;
        }
        bvsVar.zmn(webView, str);
    }

    private void zmn(String str, JSONObject jSONObject) {
        zmn(str, jSONObject, -1L);
    }

    private void zmn(final String str, final JSONObject jSONObject, final long j) {
        if (!this.nu || this.bjh == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.doe.zg zgVar = this.kgc;
        final int nu = zgVar != null ? zgVar.nu() : -1;
        zn.zmn(System.currentTimeMillis(), this.bjh, this.rp, str, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.mw.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 > 0) {
                        jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j2);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zn() {
                if (jSONObject != null) {
                    try {
                        boolean fs = am.fs(mw.this.bjh);
                        int i = 0;
                        jSONObject.put("is_playable", fs ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(mw.this.bjh) ? 1 : 0);
                        if (fs && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", nu);
                        }
                        if ("stay_page".equals(str)) {
                            JSONObject jSONObject2 = jSONObject;
                            if (mw.this.uqh <= 1) {
                                i = 1;
                            }
                            jSONObject2.put("first_page", i);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = mw.this.rp;
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                        jSONObject2.put("is_reused", mw.this.cd ? 1 : 0);
                    }
                    if (com.bytedance.sdk.openadsdk.rt.zn.zn(mw.this.bjh)) {
                        jSONObject2.put("is_lp_pre_render", mw.this.phc);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    private static class zmn {
        private final int[] zmn;

        public zmn(int[] iArr) {
            this.zmn = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x000f, code lost:
        
            if (r4 < 0) goto L8;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void readPercent(String str) {
            int i;
            try {
                i = Float.valueOf(str).intValue();
                if (i > 100) {
                    i = 100;
                }
            } catch (Throwable unused) {
            }
            int[] iArr = this.zmn;
            if (iArr != null || iArr.length <= 0) {
            }
            iArr[0] = i;
            return;
            i = 0;
            int[] iArr2 = this.zmn;
            if (iArr2 != null) {
            }
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }
    }

    public void zmn(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.zmn.nps npsVar = this.cyb;
        if (npsVar != null && this.olo) {
            npsVar.zmn(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.vlj != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.dgt.incrementAndGet();
                this.dgt.get();
                if (this.cud.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.bjh.pl());
                } catch (JSONException unused) {
                }
                zmn("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.vlj, 0L));
            }
        }
    }

    public void zmn(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.zmn.nps npsVar = this.cyb;
        if (npsVar != null && z) {
            npsVar.zn(str);
        }
        bvs bvsVar = this.kw;
        if (bvsVar == null || !z) {
            return;
        }
        bvsVar.fs(str);
    }

    public void fs(int i) {
        com.bytedance.sdk.openadsdk.core.widget.zmn.nps npsVar = this.cyb;
        if (npsVar == null || !this.olo) {
            return;
        }
        npsVar.zmn(i);
    }

    private void zmn(boolean z, final String str) {
        if (z) {
            final int iv = iv();
            zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.fb.mw.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.hhw ev = com.bytedance.sdk.openadsdk.core.kgc.fb().ev();
                        boolean zmn2 = mw.this.zmn(ev, str);
                        if (zmn2) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.hhw.fs)) {
                                mw.this.zmn(iv, str);
                                return;
                            }
                            if (TextUtils.isEmpty(ev.zn) || !zmn2) {
                                return;
                            }
                            String str2 = ev.zn;
                            com.bytedance.sdk.component.nps.fs.fs zn2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
                            zn2.zn(str2);
                            HashMap hashMap = new HashMap();
                            hashMap.put("content-type", "application/json; charset=utf-8");
                            zn2.fb(hashMap);
                            zn2.zmn(9);
                            zn2.fs("sendPrefLog");
                            zn2.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.mw.2.1
                                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.nps.zmn.zmn
                                public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.hhw.fs = fsVar.fb();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        mw.this.zmn(iv, str);
                                    } catch (Exception e) {
                                        iqz.zmn("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        iqz.zn(th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.hhw.fs)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.hhw.fs);
            jSONObject.putOpt("cid", zmn().ji());
            jSONObject.putOpt(CreativeInfo.c, zmn().ji());
            jSONObject.put("log_extra", zmn().ze());
            oub.zmn(sb, "\"/** adInfo **/\"", jSONObject.toString());
            oub.zmn(sb, "\"/** first_page **/\"", String.valueOf(i));
            oub.zmn(sb, "\"/** ix_to_externalurl **/\"", this.btk != -1 ? "1" : "0");
            oub.zmn(sb, "\"/** preload_status **/\"", this.uqd == 2 ? "2" : "0");
            oub.zmn(sb, "\"/** scene_state **/\"", str);
            oub.zmn(sb, "\"/** web_init_time **/\"", String.valueOf(this.yo));
            oub.zmn(sb, "\"/** channel_name **/\"", "\"" + zmn().ltf() + "\"");
            oub.zmn(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            oub.zmn(sb, "\"/** web_url **/\"", "\"" + zmn().pl() + "\"");
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return;
            }
            final String btk = btk(sb2);
            WeakReference<WebView> weakReference = this.hgd;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(btk) || webView == null) {
                return;
            }
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fb.mw.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.rt.zmn(webView, btk);
                }
            });
        } catch (Throwable th) {
            iqz.zn(th.getMessage(), new Object[0]);
        }
    }

    private int iv() {
        WeakReference<WebView> weakReference = this.hgd;
        WebView webView = weakReference != null ? weakReference.get() : null;
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
    public boolean zmn(com.bytedance.sdk.openadsdk.core.settings.hhw hhwVar, String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return hhwVar.fb;
            case "1":
                return hhwVar.btk;
            case "2":
                return hhwVar.hhw;
            default:
                return false;
        }
    }

    public void zmn(boolean z, long j) {
        if (z) {
            this.doe = j;
        } else {
            this.nqi = j;
        }
        if (this.doe <= 0 || this.nqi <= 0 || !this.olo || !this.fs.compareAndSet(false, true)) {
            return;
        }
        zmn(this.bjh, this.rp, this.nqi - this.doe, this.phc, this.cd);
    }

    public static void zmn(final nqi nqiVar, final String str, final long j, final int i, final boolean z) {
        zn.zmn(System.currentTimeMillis(), nqiVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.mw.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i);
                    jSONObject.put("meta_pre_render", nqiVar.gu() ? 1 : 0);
                    com.bytedance.sdk.openadsdk.core.model.kw rp = nqiVar.rp();
                    if (rp == null) {
                        rp = new com.bytedance.sdk.openadsdk.core.model.kw();
                    }
                    jSONObject.put("pre_render_status", rp.zn());
                    jSONObject.put("pre_render_use_gecko", rp.fs());
                    jSONObject.put("pre_render_add_type", rp.zmn());
                    jSONObject.put("is_reused", z ? 1 : 0);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public void zn(String str) {
        if (!this.nu || this.bjh == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.uqd;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.bjh.pl();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        zmn("load_start", jSONObject);
    }

    public void fb(String str) {
        if (!this.nu || this.bjh == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.uqd;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.bjh.pl();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        zmn("progress_load_finish", jSONObject);
    }

    public void zmn(String str, long j) {
        if (!this.nu || this.bjh == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", this.rc);
            jSONObject.put("error_msg", this.mw);
            jSONObject.put("error_url", this.rt);
            int i = this.uqd;
            if (i >= 0) {
                jSONObject.put("preload_status", i);
            }
            jSONObject.put("first_page", iv());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.bjh.pl();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.bjh.ww());
        } catch (Exception unused) {
        }
        zmn("load_finish", jSONObject, Math.min(j, 600000L));
    }

    public void btk(boolean z) {
        this.cd = z;
    }

    public void zmn(final String str, final String str2, final long j) {
        if (!this.nu || this.bjh == null) {
            return;
        }
        zn.zmn(System.currentTimeMillis(), this.bjh, this.rp, "lp_redirect_duration", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.fb.mw.5
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    String str3 = "";
                    jSONObject.put("first_url", TextUtils.isEmpty(str) ? "" : str);
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = str2;
                    }
                    jSONObject.put("current_url", str3);
                    jSONObject.put("time_since_last_touch", j);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }
}
