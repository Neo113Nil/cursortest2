package com.bytedance.sdk.openadsdk.component.reward.zn.zmn;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.hhw;
import com.bytedance.sdk.openadsdk.fb.klz;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fs extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private btk bjh;
    private fb btk;
    private String bvs;
    private hhw cn;
    private String cyb;
    private int doe;
    private nps fb;
    com.bytedance.sdk.openadsdk.core.zn.fs fs;
    private long hhw;
    private volatile int iqz;
    private int iv;
    private volatile int kgc;
    private AtomicBoolean kjb;
    private mw klz;
    private volatile int kw;
    private boolean mw;
    private final AtomicBoolean nps;
    private com.bytedance.sdk.openadsdk.common.btk nqi;
    private ILoader olo;
    private int phc;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn rc;
    private AtomicBoolean rp;
    private boolean rt;
    private zmn uqh;
    private AtomicBoolean zak;
    private final Activity zg;
    final nqi zmn;
    private fkt zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    static /* synthetic */ int iv(fs fsVar) {
        int i = fsVar.kgc;
        fsVar.kgc = i + 1;
        return i;
    }

    static /* synthetic */ int klz(fs fsVar) {
        int i = fsVar.kw;
        fsVar.kw = i + 1;
        return i;
    }

    static /* synthetic */ int mw(fs fsVar) {
        int i = fsVar.iqz;
        fsVar.iqz = i + 1;
        return i;
    }

    public fs(Activity activity, nqi nqiVar) {
        super(activity);
        this.nps = new AtomicBoolean(false);
        this.kgc = 0;
        this.kw = 0;
        this.iqz = 0;
        this.rp = new AtomicBoolean(false);
        this.kjb = new AtomicBoolean(false);
        this.zak = new AtomicBoolean(false);
        this.zg = activity;
        this.zmn = nqiVar;
    }

    public void zmn(fb fbVar) {
        this.btk = fbVar;
        String bvs = fbVar.bvs();
        this.bvs = bvs;
        this.iv = oub.zmn(bvs);
        nqi nqiVar = this.zmn;
        if (nqiVar != null) {
            this.cyb = nqiVar.ltf();
        }
        if (!TextUtils.isEmpty(this.cyb)) {
            this.olo = com.bytedance.sdk.openadsdk.nps.fs.zmn().fs();
            int zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.olo, this.cyb);
            this.phc = zmn2;
            this.doe = zmn2 > 0 ? 2 : 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        hashMap.put("dynamic_show_type", 11);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_sequence", 11);
        } catch (JSONException unused) {
        }
        hashMap.put("pag_json_data", jSONObject);
        View findViewById = this.zg.findViewById(R.id.content);
        Activity activity = this.zg;
        nqi nqiVar2 = this.zmn;
        String str = this.bvs;
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar = new com.bytedance.sdk.openadsdk.core.zn.fs(activity, nqiVar2, str, oub.zmn(str), true);
        this.fs = fsVar;
        fsVar.zmn(hashMap);
        this.fs.fs(findViewById);
    }

    public void setLoadStatusListener(btk btkVar) {
        this.bjh = btkVar;
    }

    public void zmn() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.fb = new nps(this.zg, nps.zn.LANDING_PAGE);
        iv();
        if (iqz.btk(this.zmn)) {
            fs();
        }
        zn.zmn.zmn(SystemClock.elapsedRealtime() - elapsedRealtime, this.zmn, this.bvs, this.olo, this.cyb);
    }

    public void fs() {
        nqi nqiVar = this.zmn;
        if (nqiVar == null || nqiVar.uqh() == null) {
            return;
        }
        cn.zn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs.1
            @Override // java.lang.Runnable
            public void run() {
                if (fs.this.nps.get()) {
                    return;
                }
                fs fsVar = fs.this;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(fsVar.zmn, fsVar.bvs, System.currentTimeMillis() - fs.this.hhw, false);
                if (fs.this.bjh == null || fs.this.kjb.get()) {
                    return;
                }
                fs.this.kjb.set(true);
                fs.this.bjh.zmn(fs.this.btk != null ? fs.this.btk.zmn() : "", 3, -1);
            }
        }, this.zmn.uqh().zmn() * 1000);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void iv() {
        nps npsVar = this.fb;
        if (npsVar == null || npsVar.getWebView() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(kgc.zmn()).zmn(false).fs(false).zmn(this.fb.getWebView());
        nps npsVar2 = this.fb;
        if (npsVar2 != null && npsVar2.getWebView() != null) {
            this.uqh = new zmn(this.phc, this.zmn, this.bvs, this);
            mw fs = new mw(this.zmn, this.fb.getWebView(), this.uqh, this.doe).fs(true);
            this.klz = fs;
            fs.zmn(this.bvs);
            com.bytedance.sdk.openadsdk.common.btk zmn2 = oub.zmn(this.zmn, this.fb, this.zg, this.bvs);
            this.nqi = zmn2;
            if (zmn2 != null) {
                zmn2.zmn(this.bvs);
            }
            oub.zmn(this.zmn, this.fb);
        }
        rc();
        this.fb.setLandingPage(true);
        this.fb.setTag(this.bvs);
        this.fb.setMaterialMeta(this.zmn.xz());
        hhw hhwVar = new hhw(kgc.zmn(), this.zn, this.zmn.ji(), this.nqi, this.klz, true) { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zn/zmn/fs$2;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
                safedk_fs$2_onPageStarted_de9ee22b6f62f71bdc6479abec86e785(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zn/zmn/fs$2;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i, str, str2);
                safedk_fs$2_onReceivedError_45e6fc9ef7ce3a303d97a3f9467d1577(webView, i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zn/zmn/fs$2;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_fs$2_shouldInterceptRequest_6f01424ac2d65e54c4fbc1615e869c29(webView, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                return shouldOverrideUrlLoading;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                fs.this.klz();
            }

            public void safedk_fs$2_onPageStarted_de9ee22b6f62f71bdc6479abec86e785(WebView p0, String p1, Bitmap p2) {
                super.onPageStarted(p0, p1, p2);
                if (fs.this.bjh != null && !fs.this.rp.get()) {
                    fs.this.rp.set(true);
                    fs.this.bjh.zmn(fs.this.btk != null ? fs.this.btk.zmn() : "", 1, 0);
                }
                fs.this.hhw = System.currentTimeMillis();
            }

            public void safedk_fs$2_onReceivedError_45e6fc9ef7ce3a303d97a3f9467d1577(WebView p0, int p1, String p2, String p3) {
                super.onReceivedError(p0, p1, p2, p3);
                String fb = hhw.fb(p3);
                boolean z = false;
                if (this.hhw != null) {
                    this.hhw.zmn(p0, p1, p2, p3, hhw.fb(p3), (p0 == null || p3 == null || !p3.equals(p0.getUrl())) ? false : true);
                }
                WebView p02 = (fb == null || !fb.startsWith("image")) ? null : 1;
                if (fb != null && fb.startsWith(n.d)) {
                    z = true;
                }
                if (p02 != null || z || fs.this.nps.get() || fs.this.bjh == null || fs.this.kjb.get()) {
                    return;
                }
                fs.this.kjb.set(true);
                fs.this.bjh.zmn(fs.this.btk != null ? fs.this.btk.zmn() : "", 3, p1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (sslErrorHandler != null && fs.this.bjh != null && !fs.this.kjb.get()) {
                    fs.this.kjb.set(true);
                    fs.this.bjh.zmn(fs.this.btk != null ? fs.this.btk.zmn() : "", 3, sslError != null ? sslError.getPrimaryError() : 0);
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            public WebResourceResponse safedk_fs$2_shouldInterceptRequest_6f01424ac2d65e54c4fbc1615e869c29(WebView p0, String p1) {
                try {
                    if (TextUtils.isEmpty(fs.this.cyb)) {
                        return super.shouldInterceptRequest(p0, p1);
                    }
                    fs.iv(fs.this);
                    WebResourceResponseModel zmn3 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(fs.this.olo, fs.this.cyb, p1);
                    if (zmn3 != null && zmn3.getWebResourceResponse() != null) {
                        fs.klz(fs.this);
                        return zmn3.getWebResourceResponse();
                    }
                    if (zmn3 != null && zmn3.getMsg() == 2) {
                        fs.mw(fs.this);
                    }
                    return super.shouldInterceptRequest(p0, p1);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zmn("LandingPageModel", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(p0, p1);
                }
            }
        };
        this.cn = hhwVar;
        this.fb.setWebViewClient(hhwVar);
        this.cn.zmn(this.zmn);
        this.cn.zmn(this.bvs);
        this.fb.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.zn, this.klz, this.nqi) { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (fs.this.zg == null || fs.this.zg.isFinishing() || i != 100) {
                    return;
                }
                fs.this.klz();
            }
        });
        if (this.rc == null) {
            this.rc = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(kgc.zmn(), this.bvs);
        }
        this.fb.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs.4
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (fs.this.rc != null) {
                    fs.this.rc.zmn(fs.this.zmn);
                }
            }
        });
        nps npsVar3 = this.fb;
        npsVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.iqz.zmn(npsVar3.getWebView(), BuildConfig.VERSION_CODE));
        this.fb.setMixedContentMode(0);
        this.fb.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs.5
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (fs.this.klz != null) {
                    fs.this.klz.fs(i2);
                }
            }
        });
        this.fb.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zn/zmn/fs$6;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                return safedk_fs$6_onTouch_d66b958b6d9d1edad7b17729a553bf3d(view, motionEvent);
            }

            public boolean safedk_fs$6_onTouch_d66b958b6d9d1edad7b17729a553bf3d(View p0, MotionEvent p1) {
                if (!fs.this.rt) {
                    fs.this.fs.onTouch(p0, p1);
                }
                if (!fs.this.rt && p1.getAction() == 1 && fs.this.fs.hhw()) {
                    View p02 = fs.this.fb.getWebView();
                    p02.performClick();
                    fs.this.rt = true;
                }
                if (fs.this.klz != null) {
                    fs.this.klz.zmn(p1);
                }
                if (fs.this.nqi == null) {
                    return false;
                }
                fs.this.nqi.zmn(p1);
                return false;
            }
        });
        this.fb.getWebView().setOnClickListener(this.fs);
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.zmn, this.bvs, this.doe);
    }

    public void zn() {
        if (this.btk == null) {
            return;
        }
        zmn();
        String fb = this.btk.fb();
        if (TextUtils.isEmpty(fb)) {
            btk btkVar = this.bjh;
            if (btkVar != null) {
                btkVar.zmn(this.btk.zmn(), 3, -2);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.fb, fb);
        this.mw = true;
    }

    public boolean fb() {
        return this.mw;
    }

    public void btk() {
        fb fbVar = this.btk;
        if (fbVar == null || this.fb == null) {
            return;
        }
        float btk = fbVar.btk();
        float hhw = this.btk.hhw();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.btk.nps(), (int) this.btk.zg());
        layoutParams.leftMargin = (int) btk;
        layoutParams.topMargin = (int) hhw;
        this.fb.setLayoutParams(layoutParams);
        addView(this.fb);
    }

    private void rc() {
        fkt fktVar = new fkt(this.zg);
        this.zn = fktVar;
        fktVar.fs(this.fb).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(this.zmn)).zn(this.zmn.ji()).fb(this.zmn.ze()).zmn(this.zmn).fs(-1).zmn(this.zmn.mig()).fs(this.bvs).btk(this.zmn.gor()).zmn(this.fb).zmn(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fs.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.btk
            public void zmn() {
                if (fs.this.cn != null) {
                    fs.this.cn.zn();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void klz() {
        this.nps.get();
        if (this.nps.get()) {
            return;
        }
        this.nps.set(true);
        if (this.bjh != null && !this.kjb.get()) {
            this.kjb.set(true);
            btk btkVar = this.bjh;
            fb fbVar = this.btk;
            btkVar.zmn(fbVar != null ? fbVar.zmn() : "", 2, 0);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.zmn, this.bvs, System.currentTimeMillis() - this.hhw, true);
    }

    public boolean hhw() {
        return this.nps.get();
    }

    public void nps() {
        if (this.fb != null) {
            this.zak.set(true);
            this.fb.setVisibility(8);
            com.bytedance.sdk.openadsdk.core.oub.zmn(this.fb.getWebView());
        }
    }

    public void zg() {
        fkt fktVar = this.zn;
        if (fktVar != null) {
            fktVar.rc();
        }
        mw mwVar = this.klz;
        if (mwVar != null) {
            mwVar.nps();
        }
    }

    public void bvs() {
        mw mwVar = this.klz;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    public static class zmn implements klz {
        private final WeakReference<fs> fb;
        private final nqi fs;
        private final int zmn;
        private final String zn;

        public zmn(int i, nqi nqiVar, String str, fs fsVar) {
            this.zmn = i;
            this.fs = nqiVar;
            this.zn = str;
            this.fb = new WeakReference<>(fsVar);
        }

        @Override // com.bytedance.sdk.openadsdk.fb.klz
        public void zmn(int i) {
            fs fsVar = this.fb.get();
            if (fsVar != null) {
                zn.zmn.zmn(this.zmn, fsVar.iqz, fsVar.kw, fsVar.kgc - fsVar.kw, this.fs, this.zn, i);
            }
        }
    }
}
