package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.core.zn.fs;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.video.POBVastError;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class kgc implements com.bytedance.sdk.openadsdk.mw.bvs {
    private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs am;
    private com.bytedance.sdk.openadsdk.common.btk bxw;
    private com.bytedance.sdk.component.bvs.nps cn;
    private ILoader cud;
    private String dgt;
    private float doe;
    com.bytedance.sdk.openadsdk.fb.mw fb;
    private boolean fkt;
    private boolean hgd;
    private View iqz;
    private final String iv;
    private boolean kgc;
    private final boolean klz;
    private boolean kw;
    private nps.zmn mhu;
    private int mw;
    private boolean na;
    protected com.bytedance.sdk.openadsdk.fb.fb.btk nps;
    private float nqi;
    private boolean nu;
    private long oub;
    private View phc;
    private int rc;
    private int rt;
    private com.bytedance.sdk.openadsdk.core.widget.zmn.hhw so;
    private com.bytedance.sdk.openadsdk.rt.fb tet;
    private boolean tf;
    private long uqh;
    private int vlj;
    private boolean xrr;
    private boolean yo;
    fkt zmn;
    protected String zn;
    protected boolean fs = true;
    private boolean cyb = false;
    private final AtomicBoolean olo = new AtomicBoolean(true);
    int btk = 0;
    String hhw = "";
    boolean zg = false;
    private SparseArray<zn.zmn> bjh = new SparseArray<>();
    private boolean rp = true;
    private float kjb = -1.0f;
    private float zak = -1.0f;
    private boolean yj = false;
    private long ev = 0;
    private long ww = -1;
    private volatile int jy = 0;
    private int yof = -1;
    private volatile int gn = 0;
    private volatile int uqd = 0;
    private long kra = 0;
    public boolean bvs = false;
    private int ve = -1;

    public interface fs {
        void zmn(WebView webView, String str);
    }

    static /* synthetic */ int mw(kgc kgcVar) {
        int i = kgcVar.uqd;
        kgcVar.uqd = i + 1;
        return i;
    }

    static /* synthetic */ int rc(kgc kgcVar) {
        int i = kgcVar.gn;
        kgcVar.gn = i + 1;
        return i;
    }

    static /* synthetic */ int rt(kgc kgcVar) {
        int i = kgcVar.jy;
        kgcVar.jy = i + 1;
        return i;
    }

    public kgc(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.am = fsVar;
        this.iv = fsVar.btk;
        this.klz = fsVar.fb;
    }

    public void zmn() {
        if (this.kw) {
            return;
        }
        this.kw = true;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.am;
        this.rc = fsVar.kra;
        this.mw = fsVar.mhu;
        this.rt = fsVar.bxw;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fs();
        this.kra = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    void fs() {
        this.iqz = this.am.nu.findViewById(R.id.content);
        com.bytedance.sdk.component.bvs.nps npsVar = (com.bytedance.sdk.component.bvs.nps) this.am.hgd.findViewById(com.bytedance.sdk.openadsdk.utils.olo.cyb);
        this.cn = npsVar;
        if (npsVar != null && nqi.fs(this.am.fs)) {
            this.cn.btk();
        } else {
            jy.zmn((View) this.cn, 8);
        }
        com.bytedance.sdk.component.bvs.nps npsVar2 = this.cn;
        if (npsVar2 != null) {
            npsVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (kgc.this.cn == null || kgc.this.cn.getViewTreeObserver() == null) {
                        return;
                    }
                    kgc.this.cn.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = kgc.this.cn.getMeasuredWidth();
                    int measuredHeight = kgc.this.cn.getMeasuredHeight();
                    if (kgc.this.cn.getVisibility() == 0) {
                        kgc.this.zmn(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public void zmn(String str, final com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        zmn(str, new fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.fs
            public void zmn(WebView webView, String str2) {
                if (kgc.this.am.nu.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs unused = kgc.this.am;
                kgc.this.mw();
            }
        });
        zmn(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                kgc.this.am.doe.fs();
                com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar2 = fsVar;
                if (fsVar2 != null) {
                    fsVar2.xrr();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        this.am.iqz.get();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.am;
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar2.tdm;
        if (zgVar == null || !zgVar.klz || fsVar2.iqz.get()) {
            return;
        }
        this.am.iqz.set(true);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.am;
        if (fsVar3.rje && iqz.rt(fsVar3.fs) && fsVar != null) {
            fsVar.btk();
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.mw.nps npsVar, String str, final com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        if (this.cn == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        final nqi nqiVar = this.am.fs;
        hashMap.put("click_scence", 2);
        this.nps = fkt();
        fkt fktVar = new fkt(this.am.nu);
        this.zmn = fktVar;
        fktVar.zmn(this.am.ww);
        fkt zmn2 = this.zmn.fs(this.cn).zmn(nqiVar).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(nqiVar)).zn(nqiVar.ji()).fb(nqiVar.ze()).fs(nqiVar.bv() ? 7 : 5).zmn(new com.bytedance.sdk.openadsdk.core.iv.zmn.zn(this.cn)).btk(nqiVar.gor()).zmn(this.cn);
        if (klz()) {
            str = "landingpage_endcard";
        }
        zmn2.fs(str).zmn(hashMap).zmn(this.nps).zmn(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.btk
            public void zmn() {
                if (kgc.this.so != null) {
                    kgc.this.so.zn();
                }
                com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar2 = fsVar;
                if (fsVar2 != null) {
                    fsVar2.xrr();
                }
            }
        }).zmn(new fkt.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.7
            @Override // com.bytedance.sdk.openadsdk.core.fkt.zmn
            public void zmn() {
                kgc.this.tf();
            }
        });
        this.zmn.zmn(new com.bytedance.sdk.openadsdk.core.iv.zmn.fb(this.cn));
        this.zmn.zmn(this.am.fkt.iv()).zmn(this.am.nqi.zn()).zmn(new com.bytedance.sdk.openadsdk.mw.zn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.9
            @Override // com.bytedance.sdk.openadsdk.mw.zn
            public void zmn(boolean z, int i, String str2) {
                if (z) {
                    kgc kgcVar = kgc.this;
                    kgcVar.bvs = true;
                    if (kgcVar.na) {
                        kgc.this.na = false;
                        kgc kgcVar2 = kgc.this;
                        kgcVar2.zmn(kgcVar2.am.dgt, true);
                    }
                }
                if (nqi.fb(nqiVar)) {
                    kgc.this.zmn(z, i, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.mw.zn
            public void zmn() {
                kgc.this.nu = true;
                kgc.this.am.fkt.iv().performClick();
            }
        });
        this.zmn.hhw(this.fkt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tf() {
        this.tf = true;
        this.xrr = false;
        this.am.jy.removeMessages(600);
        this.am.jy.removeMessages(700);
        this.am.jy.removeMessages(POBVastError.UNDEFINED_ERROR);
        this.am.ev.fb(false);
        this.am.cyb.set(true);
        this.am.f3739io.mw();
        nqi nqiVar = this.am.fs;
        nqiVar.dv();
        if (nqiVar.dv() || !oub.zg(am.zmn(nqiVar))) {
            return;
        }
        View iv = this.am.fkt.iv();
        View.OnClickListener onClickListener = (View.OnClickListener) iv.getTag(iv.getId());
        if (onClickListener != null) {
            zmn zmnVar = new zmn(this.am, iv, onClickListener);
            iv.setOnClickListener(zmnVar);
            iv.setOnTouchListener(zmnVar);
        }
    }

    public boolean zn() {
        return this.nu;
    }

    public boolean fb() {
        return this.hgd;
    }

    public void zmn(int i, int i2) {
        if (this.zmn == null || this.am.nu.isFinishing()) {
            return;
        }
        this.zmn.zmn(i, i2);
    }

    public void zmn(boolean z) {
        this.fs = z;
    }

    public void btk() {
        if (am.btk(this.am.fs) && this.am.skn) {
            return;
        }
        hhw();
    }

    public void hhw() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.am;
        nqi nqiVar = fsVar.fs;
        if (TextUtils.isEmpty(nqi.zmn(fsVar.oub, nqiVar))) {
            if (nqiVar != null && !nqiVar.fkt() && this.cud == null && klz()) {
                this.dgt = nqiVar.ltf();
                this.cud = com.bytedance.sdk.openadsdk.nps.fs.zmn().fs();
                int zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.cud, this.dgt);
                this.vlj = zmn2;
                this.yof = zmn2 > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.dgt)) {
                    com.bytedance.sdk.openadsdk.fb.mw mwVar = this.fb;
                    if (mwVar != null) {
                        mwVar.zmn(this.yof);
                    }
                    zn.zmn.zmn(this.kra, nqiVar, "landingpage_endcard", this.cud, this.dgt);
                }
            }
            if ((!TextUtils.isEmpty(this.zn) && this.zn.contains("play.google.com/store")) || ((nqiVar != null && !nqiVar.dgt() && iqz.bvs(nqiVar)) || iqz.zg(nqiVar))) {
                this.zg = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.fs + ",webViewIsLoading " + this.yo);
            if (this.fs) {
                boolean z = this.am.nkt;
                if (this.cn != null && ((z || !TextUtils.isEmpty(this.zn)) && nqi.fs(nqiVar))) {
                    if (this.yo) {
                        return;
                    }
                    String str = this.zn + "&is_pre_render=1";
                    com.bytedance.sdk.openadsdk.fb.mw mwVar2 = this.fb;
                    if (mwVar2 != null) {
                        mwVar2.fb();
                    }
                    com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.cn, str);
                    this.yo = true;
                    return;
                }
                if (nqi.zn(nqiVar)) {
                    this.am.so.zn();
                }
            }
        }
    }

    public void nps() {
        this.zmn.zmn("showPlayableEndCardOverlay", (JSONObject) null);
        this.am.jy.sendEmptyMessageDelayed(600, 1000L);
        this.am.jy.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.10
            @Override // java.lang.Runnable
            public void run() {
                kgc.this.tf();
            }
        }, 1000L);
    }

    public com.bytedance.sdk.component.bvs.nps zg() {
        return this.cn;
    }

    public fkt bvs() {
        return this.zmn;
    }

    public void iv() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        nqi nqiVar = this.am.fs;
        String zg = nqiVar.zg();
        if (!TextUtils.isEmpty(zg) && (zgVar = this.am.tdm) != null && (zgVar.nu() || this.am.tdm.jy().rp())) {
            this.zn = zg;
        } else if (am.btk(nqiVar)) {
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
            if (mrt != null) {
                this.zn = mrt.klz();
            }
        } else {
            this.zn = am.klz(nqiVar);
        }
        String zmn2 = zmn(this.zn, nqiVar, this.rc, this.rt, this.mw);
        this.zn = zmn2;
        if (TextUtils.isEmpty(zmn2)) {
            return;
        }
        this.fkt = this.zn.contains("use_second_endcard=1");
    }

    private static String zmn(String str, nqi nqiVar, int i, int i2, int i3) {
        String str2;
        String str3;
        float fu = nqiVar.fu();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    str3 = str + X3.j.c;
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + X3.j.c;
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + fu;
        }
        return !am.fs(nqiVar) ? com.bytedance.sdk.openadsdk.utils.hhw.zmn(str) : str;
    }

    public void rc() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.cn;
        if (npsVar != null) {
            zak.zmn(npsVar);
        }
        nqi nqiVar = this.am.fs;
        long j = this.oub;
        if (j > 0) {
            if (this.ww > 0) {
                this.oub = j + (SystemClock.elapsedRealtime() - this.ww);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", nqi.zn(nqiVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.am.fs, this.iv, "second_endcard_duration", jSONObject, this.oub);
        }
        this.cn = null;
        if (this.nps != null && !iqz.fb(nqiVar) && !iqz.zg(nqiVar) && !nqi.zn(nqiVar)) {
            this.nps.zmn(true);
            this.nps.rc();
        }
        fkt fktVar = this.zmn;
        if (fktVar != null) {
            fktVar.klz();
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.fb;
        if (mwVar != null) {
            mwVar.fb(nqiVar.vtz());
        }
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.tet;
        if (fbVar != null) {
            fbVar.zn();
        }
        DeviceUtils.AudioInfoReceiver.fs(this);
    }

    public void zmn(int i) {
        if (this.kgc || !this.olo.get()) {
            zmn(0, this.am.ww);
        }
        jy.zmn((View) this.cn, i);
        com.bytedance.sdk.component.bvs.nps npsVar = this.cn;
        if (npsVar != null) {
            jy.zmn((View) npsVar.getWebView(), i);
        }
        nqi nqiVar = this.am.fs;
        if (this.cn == null || !nqiVar.vtz()) {
            return;
        }
        this.cn.setLandingPage(true);
        this.cn.setTag("landingpage_endcard");
        this.cn.setMaterialMeta(nqiVar.xz());
    }

    public void zmn(float f) {
        jy.zmn(this.cn, f);
    }

    public void fs(boolean z) {
        zmn(this.zmn, z);
    }

    public void zmn(fkt fktVar, boolean z) {
        if (this.zmn == null || this.am.nu.isFinishing()) {
            return;
        }
        fktVar.fs(z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zmn(String str, final fs fsVar) {
        com.bytedance.sdk.component.bvs.nps npsVar;
        final nqi nqiVar = this.am.fs;
        com.bytedance.sdk.component.bvs.nps npsVar2 = this.cn;
        if (npsVar2 != null && npsVar2.getWebView() != null) {
            com.bytedance.sdk.openadsdk.fb.mw fs2 = new com.bytedance.sdk.openadsdk.fb.mw(nqiVar, this.cn.getWebView(), new com.bytedance.sdk.openadsdk.fb.klz() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.11
                @Override // com.bytedance.sdk.openadsdk.fb.klz
                public void zmn(int i) {
                    if (TextUtils.isEmpty(kgc.this.dgt)) {
                        return;
                    }
                    zn.zmn.zmn(kgc.this.vlj, kgc.this.jy, kgc.this.uqd, kgc.this.gn - kgc.this.uqd, nqiVar, "landingpage_endcard", i);
                }
            }, this.yof).fs(true);
            this.fb = fs2;
            this.mhu = fs2.zmn;
            fs2.zmn(klz() ? "landingpage_endcard" : str);
            this.fb.fs(this.iv);
            this.fb.zn(true);
            this.cn.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.12
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    com.bytedance.sdk.openadsdk.fb.mw mwVar = kgc.this.fb;
                    if (mwVar != null) {
                        mwVar.fs(i2);
                    }
                }
            });
            bvs bvsVar = this.am.nqi;
            if (bvsVar != null) {
                this.fb.zmn(bvsVar.zmn());
            }
            com.bytedance.sdk.openadsdk.common.btk zmn2 = oub.zmn(nqiVar, this.cn, this.am.nu, this.iv);
            this.bxw = zmn2;
            if (zmn2 != null) {
                if (klz()) {
                    str = "landingpage_endcard";
                }
                zmn2.zmn(str);
            }
            if (klz()) {
                oub.zmn(nqiVar, this.cn);
            }
            this.tet = new com.bytedance.sdk.openadsdk.rt.fb(this.fb);
            com.bytedance.sdk.openadsdk.core.widget.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(com.bytedance.sdk.openadsdk.core.kgc.zmn(), this.zmn, nqiVar.ji(), this.bxw, this.fb, nqiVar.vtz()) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onLoadResource(WebView view, String url) {
                    super.onLoadResource(view, url);
                    CreativeInfoManager.onResourceLoaded(h.u, view, url);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zmn/kgc$2;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                    BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str2);
                    safedk_kgc$2_onPageStarted_9982f881b5c06b7bee2c9cfe6b38370c(webView, str2, bitmap);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str2, String str3) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zmn/kgc$2;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                    BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i, str2, str3);
                    safedk_kgc$2_onReceivedError_0f265c3db895a1fb574c14895ee7ca93(webView, i, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                @TargetApi(23)
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zmn/kgc$2;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
                    BrandSafetyUtils.onWebViewReceivedError(h.u, webView, webResourceRequest, webResourceError);
                    safedk_kgc$2_onReceivedError_0a58e85942d4b937d889023a6e8269dd(webView, webResourceRequest, webResourceError);
                }

                /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                @TargetApi(21)
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zmn/kgc$2;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
                    return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, webView, webResourceRequest, safedk_kgc$2_shouldInterceptRequest_d2e51a643b69250dd1e8374d753f949d(webView, webResourceRequest));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zmn/kgc$2;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                    return CreativeInfoManager.onWebViewResponse(h.u, webView, str2, safedk_kgc$2_shouldInterceptRequest_0ea1a84e97477f3dd58f783a27181bf6(webView, str2));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                    BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                    return shouldOverrideUrlLoading;
                }

                public WebResourceResponse safedk_kgc$2_shouldInterceptRequest_0ea1a84e97477f3dd58f783a27181bf6(WebView p0, String p1) {
                    try {
                        if (TextUtils.isEmpty(kgc.this.dgt)) {
                            return super.shouldInterceptRequest(p0, p1);
                        }
                        kgc.rc(kgc.this);
                        WebResourceResponseModel zmn3 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(kgc.this.cud, kgc.this.dgt, p1);
                        if (zmn3 != null && zmn3.getWebResourceResponse() != null) {
                            kgc.mw(kgc.this);
                            return zmn3.getWebResourceResponse();
                        }
                        if (zmn3 != null && zmn3.getMsg() == 2) {
                            kgc.rt(kgc.this);
                        }
                        return super.shouldInterceptRequest(p0, p1);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(p0, p1);
                    }
                }

                @TargetApi(21)
                public WebResourceResponse safedk_kgc$2_shouldInterceptRequest_d2e51a643b69250dd1e8374d753f949d(WebView p0, WebResourceRequest p1) {
                    try {
                        return shouldInterceptRequest(p0, p1.getUrl().toString());
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(p0, p1);
                    }
                }

                public void safedk_kgc$2_onReceivedError_0f265c3db895a1fb574c14895ee7ca93(WebView p0, int p1, String p2, String p3) {
                    super.onReceivedError(p0, p1, p2, p3);
                }

                @TargetApi(23)
                public void safedk_kgc$2_onReceivedError_0a58e85942d4b937d889023a6e8269dd(WebView p0, WebResourceRequest p1, WebResourceError p2) {
                    super.onReceivedError(p0, p1, p2);
                    if (p2 != null && p1 != null && p1.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) p2.getDescription()) + "  url =" + p1.getUrl().toString());
                    }
                    if (p1 == null || p1.getUrl() == null || !kgc.this.zmn(p1.getUrl().toString())) {
                        if (p2 != null && p1 != null && p1.isForMainFrame()) {
                            com.bytedance.sdk.openadsdk.component.reward.zmn.fs unused = kgc.this.am;
                            p2.getErrorCode();
                            String.valueOf(p2.getDescription());
                            String.valueOf(p1.getUrl());
                        }
                        if (p1 == null || p1.isForMainFrame()) {
                            kgc.this.olo.set(false);
                            kgc.this.yo = false;
                            kgc.this.zmn(p2 != null ? p2.getErrorCode() : -1, kgc.this.am.ww);
                        }
                        if (kgc.this.nps != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (p2 != null) {
                                    jSONObject.put("code", p2.getErrorCode());
                                    jSONObject.put("msg", p2.getDescription());
                                }
                                kgc.this.nps.zmn(jSONObject);
                            } catch (JSONException unused2) {
                            }
                        }
                        if (p2 != null) {
                            kgc.this.btk = p2.getErrorCode();
                            kgc.this.hhw = String.valueOf(p2.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                @TargetApi(21)
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs unused = kgc.this.am;
                    webResourceRequest.isForMainFrame();
                    webResourceRequest.getUrl();
                    webResourceResponse.getStatusCode();
                    if (webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest.isForMainFrame()) {
                        kgc.this.olo.set(false);
                        kgc.this.yo = false;
                        kgc.this.btk = webResourceResponse.getStatusCode();
                        kgc kgcVar = kgc.this;
                        kgcVar.hhw = "onReceivedHttpError";
                        kgcVar.zmn(kgcVar.btk, kgcVar.am.ww);
                    }
                    if (kgc.this.nps != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            kgc.this.nps.zmn(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    kgc.this.yo = false;
                    kgc.this.kgc = true;
                    kgc kgcVar = kgc.this;
                    kgcVar.zmn(100, kgcVar.am.ww);
                    if (kgc.this.am.yj.iqz()) {
                        View iv = kgc.this.am.fkt.iv();
                        if (iv instanceof com.bytedance.sdk.openadsdk.core.hhw.fb) {
                            ((com.bytedance.sdk.openadsdk.core.hhw.fb) iv).setImageResource(doe.fb(kgc.this.am.oub, "tt_skip_btn"));
                        }
                    }
                    DeviceUtils.AudioInfoReceiver.zmn(kgc.this);
                    kgc.this.ve = DeviceUtils.nps();
                    com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = kgc.this.nps;
                    if (btkVar != null) {
                        btkVar.btk();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs unused = kgc.this.am;
                    fs fsVar2 = fsVar;
                    if (fsVar2 != null) {
                        fsVar2.zmn(webView, str2);
                    }
                }

                public void safedk_kgc$2_onPageStarted_9982f881b5c06b7bee2c9cfe6b38370c(WebView p0, String p1, Bitmap p2) {
                    super.onPageStarted(p0, p1, p2);
                    com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = kgc.this.nps;
                    if (btkVar != null) {
                        btkVar.fb();
                    }
                }
            };
            this.so = hhwVar;
            this.cn.setWebViewClient(hhwVar);
            this.so.zmn(nqiVar);
            this.so.zmn(this.klz ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (nqiVar.vtz() && (npsVar = this.cn) != null && npsVar.getWebView() != null) {
                this.cn.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.3
                    private final int zn = com.bytedance.sdk.openadsdk.core.kgc.fs();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zmn/kgc$3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                        return safedk_kgc$3_onTouch_6d987f7c51ebe3398f33720cb33b939b(view, motionEvent);
                    }

                    public boolean safedk_kgc$3_onTouch_6d987f7c51ebe3398f33720cb33b939b(View p0, MotionEvent p1) {
                        int i;
                        com.bytedance.sdk.openadsdk.fb.mw mwVar = kgc.this.fb;
                        if (mwVar != null) {
                            mwVar.zmn(p1);
                        }
                        if (kgc.this.bxw != null) {
                            kgc.this.bxw.zmn(p1);
                        }
                        if (kgc.this.tet != null) {
                            kgc.this.tet.zmn();
                        }
                        try {
                            int actionMasked = p1.getActionMasked();
                            if (actionMasked != 0) {
                                int i2 = 3;
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        i2 = actionMasked != 3 ? -1 : 4;
                                    } else {
                                        float rawX = p1.getRawX();
                                        float rawY = p1.getRawY();
                                        if (Math.abs(rawX - kgc.this.doe) < this.zn) {
                                            if (Math.abs(rawY - kgc.this.nqi) >= this.zn) {
                                            }
                                            kgc.this.kjb += Math.abs(p1.getX() - kgc.this.doe);
                                            kgc.this.zak += Math.abs(p1.getY() - kgc.this.nqi);
                                            i = (System.currentTimeMillis() - kgc.this.uqh > 200 || (kgc.this.kjb <= 8.0f && kgc.this.zak <= 8.0f)) ? 2 : 1;
                                        }
                                        kgc.this.rp = false;
                                        kgc.this.kjb += Math.abs(p1.getX() - kgc.this.doe);
                                        kgc.this.zak += Math.abs(p1.getY() - kgc.this.nqi);
                                        if (System.currentTimeMillis() - kgc.this.uqh > 200) {
                                        }
                                    }
                                }
                                i = i2;
                            } else {
                                kgc.this.rp = true;
                                kgc.this.bjh = new SparseArray();
                                kgc.this.doe = p1.getRawX();
                                kgc.this.nqi = p1.getRawY();
                                kgc.this.uqh = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = kgc.this.cn.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < kgc.this.uqh) {
                                        kgc.this.uqh = landingPageClickBegin;
                                        kgc.this.cn.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                kgc.this.kjb = -1.0f;
                                kgc.this.zak = -1.0f;
                                i = 0;
                            }
                            kgc.this.bjh.put(p1.getActionMasked(), new zn.zmn(i, p1.getSize(), p1.getPressure(), System.currentTimeMillis()));
                            if (p1.getAction() == 1 && iqz.nps(kgc.this.am.fs) && kgc.this.am.ww != null) {
                                kgc.this.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        kgc.this.am.ww.yo();
                                    }
                                });
                            }
                            if (p1.getAction() != 1 || p0.getVisibility() != 0 || Float.valueOf(p0.getAlpha()).intValue() != 1) {
                                return false;
                            }
                            if ((kgc.this.cyb && !iqz.rc(nqiVar)) || !kgc.this.rp) {
                                return false;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", kgc.this.doe);
                            jSONObject.put("down_y", kgc.this.nqi);
                            jSONObject.put("down_time", kgc.this.uqh);
                            jSONObject.put("up_x", p1.getRawX());
                            jSONObject.put("up_y", p1.getRawY());
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = kgc.this.cn.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < currentTimeMillis) {
                                    try {
                                        kgc.this.cn.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    currentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", currentTimeMillis);
                            int[] iArr = new int[2];
                            kgc kgcVar = kgc.this;
                            kgcVar.phc = kgcVar.am.hgd.findViewById(520093713);
                            if (kgc.this.phc != null) {
                                kgc.this.phc.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", kgc.this.phc.getWidth());
                                jSONObject.put("button_height", kgc.this.phc.getHeight());
                            }
                            if (kgc.this.iqz != null) {
                                int[] iArr2 = new int[2];
                                kgc.this.iqz.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", kgc.this.iqz.getWidth());
                                jSONObject.put("height", kgc.this.iqz.getHeight());
                            }
                            jSONObject.put("toolType", p1.getToolType(0));
                            jSONObject.put("deviceId", p1.getDeviceId());
                            jSONObject.put("source", p1.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.klz.zmn(kgc.this.bjh, com.bytedance.sdk.openadsdk.core.iv.fs().zmn() ? 1 : 2));
                            jSONObject.put("user_behavior_type", kgc.this.rp ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (kgc.this.so != null) {
                                kgc.this.so.zmn(jSONObject);
                            }
                            if (kgc.this.cyb || iqz.iv(nqiVar)) {
                                return false;
                            }
                            if (kgc.this.klz) {
                                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "rewarded_video", "click", jSONObject);
                            } else {
                                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "fullscreen_interstitial_ad", "click", jSONObject);
                            }
                            kgc.this.cyb = true;
                            return false;
                        } catch (Throwable th) {
                            Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                            return false;
                        }
                    }
                });
            }
            com.bytedance.sdk.component.bvs.nps npsVar3 = this.cn;
            if (npsVar3 != null) {
                npsVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.zmn, this.fb, this.bxw) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kgc.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                    }
                });
            }
            zmn(this.cn);
            this.cn.setLayerType(1, null);
            this.cn.setBackgroundColor(-1);
            this.cn.setDisplayZoomControls(false);
        }
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.tet;
        if (fbVar != null) {
            this.so.zmn(fbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.am.fs.vtz() && str.endsWith(".mp4");
    }

    public boolean klz() {
        String str = this.zn;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void zmn(DownloadListener downloadListener) {
        com.bytedance.sdk.component.bvs.nps npsVar = this.cn;
        if (npsVar == null || downloadListener == null) {
            return;
        }
        npsVar.setDownloadListener(downloadListener);
    }

    public boolean mw() {
        return this.olo.get();
    }

    public boolean rt() {
        return this.kgc;
    }

    public void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        if (npsVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(this.am.nu).zmn(false).fs(false).zmn(npsVar.getWebView());
        npsVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.iqz.zmn(npsVar.getWebView(), BuildConfig.VERSION_CODE));
        npsVar.setMixedContentMode(0);
    }

    public void cn() {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zg();
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.fb;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    public void cyb() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.cn;
        if (npsVar != null) {
            npsVar.rt();
        }
        if (this.ww > 0) {
            this.oub += SystemClock.elapsedRealtime() - this.ww;
            this.ww = 0L;
        }
        fkt fktVar = this.zmn;
        if (fktVar != null) {
            fktVar.fs(false);
            fs(this.zmn, false);
            zmn(this.zmn, true, false);
        }
    }

    public void zn(boolean z) {
        fs(this.zmn, z);
    }

    public void fs(fkt fktVar, boolean z) {
        try {
            fktVar.zg(z);
        } catch (Exception unused) {
        }
    }

    public void zmn(boolean z, boolean z2) {
        zmn(this.zmn, z, z2);
    }

    public void zmn(fkt fktVar, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.am.tdm;
            String str = "end";
            if (zgVar != null) {
                jSONObject.put("multi_ads_show", zgVar.jy().iv());
                if (!zgVar.olo) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", "end");
            }
            fktVar.zmn("endcard_control_event", jSONObject);
            if (z2) {
                if (this.kgc) {
                    return;
                }
                this.na = true;
                return;
            }
            this.na = false;
        } catch (Exception unused) {
        }
    }

    public void fb(boolean z) {
        if (am.fs(this.am.fs)) {
            return;
        }
        btk(z);
    }

    public void btk(boolean z) {
        if (this.zmn == null || this.am.nu.isFinishing()) {
            return;
        }
        this.zmn.nps(z);
    }

    public void olo() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.cn;
        if (npsVar != null) {
            npsVar.klz();
        }
        if (this.ww == 0) {
            this.ww = SystemClock.elapsedRealtime();
        }
        nqi nqiVar = this.am.fs;
        fkt fktVar = this.zmn;
        if (fktVar != null) {
            fktVar.rc();
            com.bytedance.sdk.component.bvs.nps npsVar2 = this.cn;
            if (npsVar2 != null) {
                if (npsVar2.getVisibility() == 0) {
                    this.zmn.fs(true);
                    fs(this.zmn, true);
                    zmn(this.zmn, false, true);
                    if (am.zg(nqiVar) && !this.tf && this.am.fs.dv()) {
                        nps();
                    }
                } else {
                    this.zmn.fs(false);
                    fs(this.zmn, false);
                    zmn(this.zmn, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.fb;
        if (mwVar != null) {
            mwVar.nps();
        }
    }

    public int kgc() {
        return this.btk;
    }

    public String kw() {
        return this.hhw;
    }

    public boolean iqz() {
        return nqi.zn(this.am.fs) ? this.fkt && !this.hgd && this.am.so.klz() : this.fkt && !this.hgd && this.olo.get() && this.kgc;
    }

    public void phc() {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.nps();
        }
    }

    public void zmn(boolean z, int i, String str) {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.nps;
        if (btkVar == null) {
            return;
        }
        if (z) {
            btkVar.fs();
        } else {
            btkVar.zmn(i, str);
        }
    }

    public void doe() {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.hhw();
        }
    }

    public void nqi() {
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.fb;
        if (mwVar != null) {
            mwVar.zmn(System.currentTimeMillis());
        }
    }

    public boolean uqh() {
        return this.zg;
    }

    public void fs(int i) {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn(i);
            this.nps.zn();
        }
    }

    public void bjh() {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.bvs();
        }
    }

    private com.bytedance.sdk.openadsdk.fb.fb.btk fkt() {
        return new com.bytedance.sdk.openadsdk.fb.kw(2, this.klz ? "rewarded_video" : "fullscreen_interstitial_ad", this.am.fs);
    }

    public boolean rp() {
        fkt fktVar = this.zmn;
        if (fktVar == null) {
            return false;
        }
        return fktVar.bvs();
    }

    @Override // com.bytedance.sdk.openadsdk.mw.bvs
    public void zn(int i) {
        int i2 = this.ve;
        if (i2 <= 0 && i > 0) {
            fb(false);
        } else if (i2 > 0 && i == 0) {
            fb(true);
        }
        this.ve = i;
    }

    public void hhw(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.am;
        com.bytedance.sdk.openadsdk.utils.rt rtVar = fsVar.hwg;
        if (rtVar != null) {
            rtVar.zmn(fsVar, 5000L);
        }
        this.hgd = true;
        JSONObject jSONObject = new JSONObject();
        nqi nqiVar = this.am.fs;
        try {
            jSONObject.put("endcard_overlay_render_type", nqi.zn(nqiVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, this.iv, "use_second_endcard", jSONObject);
        this.ww = SystemClock.elapsedRealtime();
        try {
            if (!nqi.zn(nqiVar)) {
                this.zmn.zmn("click_endcard_close", (JSONObject) null);
            } else if (z) {
                this.am.so.zg();
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, this.iv, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
    }

    public boolean kjb() {
        this.olo.get();
        return this.kgc && this.olo.get();
    }

    public boolean zak() {
        return this.xrr;
    }

    public boolean am() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.cn;
        return npsVar == null || npsVar.getWebView() == null;
    }

    public void yj() {
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.fb;
        if (mwVar != null) {
            mwVar.btk();
        }
    }

    private static class zmn extends com.bytedance.sdk.openadsdk.core.zn.zmn implements fs.zmn {
        private final View fs;
        private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn;
        private final View.OnClickListener zn;

        public zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, View view, View.OnClickListener onClickListener) {
            super(fsVar.nu, fsVar.fs, fsVar.btk, fsVar.fb ? 7 : 5);
            this.zmn = fsVar;
            this.fs = view;
            this.zn = onClickListener;
            HashMap hashMap = new HashMap();
            hashMap.put("close_auto_click", Boolean.TRUE);
            hashMap.put("click_scence", 2);
            zmn(hashMap);
            zmn(fsVar.doe.zn());
            zmn(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.zn.zmn, com.bytedance.sdk.openadsdk.core.zn.fs, com.bytedance.sdk.openadsdk.core.zn.zn
        public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
            if (this.zmn.fs.dv()) {
                this.zn.onClick(view);
                this.fs.setOnTouchListener(null);
                this.fs.setOnClickListener(this.zn);
            } else {
                super.zmn(view, f, f2, f3, f4, sparseArray, z);
                this.zmn.ww.tf();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.zn.fs.zmn
        public void zmn(View view, int i) {
            this.fs.setOnTouchListener(null);
            this.fs.setOnClickListener(this.zn);
        }
    }

    public boolean so() {
        return this.tf;
    }

    public void nps(boolean z) {
        this.xrr = z;
    }

    public boolean ev() {
        return this.bvs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.ev < 100) {
            return false;
        }
        this.ev = currentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
