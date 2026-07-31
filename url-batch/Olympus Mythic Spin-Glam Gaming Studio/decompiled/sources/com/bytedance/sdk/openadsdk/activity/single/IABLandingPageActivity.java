package com.bytedance.sdk.openadsdk.activity.single;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.cn;
import com.bytedance.sdk.openadsdk.common.klz;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.rt.fs;
import com.bytedance.sdk.openadsdk.utils.iqz;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.phc;
import com.bytedance.sdk.openadsdk.utils.rt;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public class IABLandingPageActivity extends TTBaseLandingPageActivity {
    private static final LinkedList<WeakReference<Activity>> ww = new LinkedList<>();
    protected boolean am;
    protected com.bytedance.sdk.openadsdk.rt.fs btk;
    protected com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn bvs;
    protected String cn;
    protected int cyb;
    RelativeLayout doe;
    protected int ev;
    protected klz fb;
    protected ImageView fs;
    private Button hgd;
    protected nqi hhw;
    protected ILoader iqz;
    protected rt iv;
    protected String kgc;
    protected int kjb;
    protected com.bytedance.sdk.openadsdk.common.btk klz;
    protected String kw;
    protected com.bytedance.sdk.openadsdk.core.widget.zmn.hhw mw;
    protected fkt nps;
    private cn nu;
    protected String olo;
    private boolean oub;
    protected com.bytedance.sdk.openadsdk.rt.zmn.zmn phc;
    protected nps.zmn rc;
    protected String rt;
    private com.bytedance.sdk.openadsdk.rt.fb vlj;
    protected int zak;
    protected mw zg;
    protected com.bytedance.sdk.component.bvs.nps zmn;
    protected com.bytedance.sdk.openadsdk.core.hhw.hhw zn;
    int nqi = -1;
    protected final AtomicInteger uqh = new AtomicInteger(0);
    protected final AtomicInteger bjh = new AtomicInteger(0);
    protected final AtomicInteger rp = new AtomicInteger(0);
    protected boolean yj = false;
    protected long so = 0;
    private volatile boolean jy = false;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    public static void zmn(Context context, nqi nqiVar, String str) {
        if (nqiVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.fs ew = nqiVar.ew();
        if (!TextUtils.isEmpty(ew.zn())) {
            zmn(context, nqiVar, zmn(ew.zn(), nqiVar), 1);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, str, "open_policy");
        com.bytedance.sdk.openadsdk.component.fb.zmn.zmn(nqiVar, nqiVar.pge());
    }

    public static void fs(Context context, nqi nqiVar, String str) {
        zmn(context, nqiVar, str, 2);
    }

    private static void zmn(Context context, nqi nqiVar, String str, int i) {
        if (context == null || nqiVar == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) IABLandingPageActivity.class);
        intent.putExtra("scene", i);
        intent.putExtra("meta_index", am.zmn().zmn(nqiVar));
        intent.putExtra("landing_url", str);
        com.bytedance.sdk.component.utils.fs.zmn(context, intent, null);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.cn.btk()) {
            finish();
            return;
        }
        try {
            kgc.fs(this);
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!zmn(bundle)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.rt.btk.zmn(this);
        try {
            setContentView(zn());
            if (this.oub) {
                zn.zmn.zmn(SystemClock.elapsedRealtime() - elapsedRealtime, this.hhw, "landingpage", this.iqz, this.kw);
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    private boolean zmn(Bundle bundle) {
        Intent intent = getIntent();
        this.ev = intent.getIntExtra("scene", 0);
        this.kgc = intent.getStringExtra("landing_url");
        int i = this.ev;
        this.oub = i == 0 || i == 2;
        if (bundle != null) {
            try {
                int i2 = bundle.getInt("meta_index", -1);
                this.nqi = i2;
                if (i2 >= 0) {
                    this.hhw = am.zmn().zmn(this.nqi);
                }
            } catch (Throwable unused) {
            }
        }
        if (this.hhw == null) {
            this.hhw = am.zmn().zmn(am.zmn(intent));
        }
        if (this.hhw == null || TextUtils.isEmpty(this.kgc)) {
            return false;
        }
        zmn(this.hhw, this.ev);
        if (this.ev == 2) {
            doe();
        }
        if (zmn()) {
            phc.zmn(this.hhw);
        }
        return true;
    }

    private static String zmn(String str, nqi nqiVar) {
        String zak = nqiVar != null ? nqiVar.zak() : null;
        if (!TextUtils.isEmpty(zak) && !TextUtils.isEmpty(str)) {
            try {
                String encode = URLEncoder.encode(zak);
                if (str.contains("?")) {
                    str = str + "&gdid_encrypted=" + encode;
                } else {
                    str = str + "?gdid_encrypted=" + encode;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private void zmn(nqi nqiVar, int i) {
        if (i == 0) {
            this.am = nqiVar.rt();
            nqiVar.lbc(0);
        }
        this.rt = nqiVar.ji();
        this.cn = nqiVar.ze();
        this.kw = nqiVar.ltf();
        this.cyb = nqiVar.mw();
        this.olo = nqiVar.klz();
    }

    protected boolean zmn() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false) && this.ev == 0;
    }

    protected boolean fs() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_iab_history", true) && this.oub;
    }

    protected View zn() {
        final Bundle bundle;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        if (Build.VERSION.SDK_INT >= 35) {
            znVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        btkVar.setOrientation(1);
        znVar.addView(btkVar, new FrameLayout.LayoutParams(-1, -1));
        if (zmn()) {
            String str = System.identityHashCode(this.hhw) + "_" + this.kgc;
            bundle = phc.zmn(str);
            this.zmn = phc.zmn(new MutableContextWrapper(getApplicationContext()), str);
        } else {
            bundle = null;
            this.zmn = null;
            this.yj = false;
        }
        this.btk = new com.bytedance.sdk.openadsdk.rt.fs(this, this.hhw, this.ev);
        if (this.zmn != null && bundle != null && !bundle.isEmpty()) {
            this.btk.zmn(this.zmn);
        }
        btkVar.addView(this.btk.hhw(), new FrameLayout.LayoutParams(-1, -1));
        this.btk.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.1
            @Override // com.bytedance.sdk.openadsdk.rt.fs.zmn
            public void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
                IABLandingPageActivity iABLandingPageActivity = IABLandingPageActivity.this;
                iABLandingPageActivity.zmn = npsVar;
                iABLandingPageActivity.doe = iABLandingPageActivity.btk.zmn();
                IABLandingPageActivity iABLandingPageActivity2 = IABLandingPageActivity.this;
                iABLandingPageActivity2.fs = iABLandingPageActivity2.btk.btk();
                IABLandingPageActivity iABLandingPageActivity3 = IABLandingPageActivity.this;
                iABLandingPageActivity3.zn = iABLandingPageActivity3.btk.fb();
                IABLandingPageActivity.this.fs(bundle);
            }
        });
        cn cnVar = new cn(this, new cn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.cn.zmn
            public View zmn(Context context) {
                return new com.bytedance.sdk.openadsdk.common.zg(context);
            }
        });
        cnVar.setId(olo.xrr);
        this.nu = cnVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        btkVar.addView(cnVar, layoutParams);
        if (this.ev == 0) {
            zmn(znVar);
        }
        return znVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(Bundle bundle) {
        olo();
        kw();
        if (this.oub) {
            iqz();
            rc();
        }
        hhw();
        bvs();
        iv();
        btk();
        if (this.zmn != null && bundle != null && !bundle.isEmpty() && this.zmn.getWebView() != null) {
            this.zmn.getWebView().restoreState(bundle);
            this.btk.zmn(bundle);
            this.yj = true;
        }
        mw();
        if (zmn()) {
            phc();
        }
    }

    private void zmn(FrameLayout frameLayout) {
        klz klzVar = new klz(this);
        this.fb = klzVar;
        klzVar.setOnlyLoading(this.am);
        this.fb.setId(520093721);
        frameLayout.addView(this.fb, new FrameLayout.LayoutParams(-1, -1));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void btk() {
        oub.zmn(this.hhw, this.zmn);
        klz klzVar = this.fb;
        if (klzVar != null) {
            klzVar.zmn(this.hhw);
            this.fb.zmn();
        }
        this.fs = (ImageView) findViewById(520093716);
    }

    private void olo() {
        try {
            com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
            if (npsVar != null) {
                WebView webView = npsVar.getWebView();
                this.zmn.setJavaScriptEnabled(true);
                this.zmn.setDomStorageEnabled(true);
                this.zmn.setMixedContentMode(0);
                if (this.oub) {
                    com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(this).zmn(false).fs(false).zmn(webView);
                    this.zmn.setLandingPage(this.oub);
                    this.zmn.setTag("landingpage");
                    this.zmn.setMaterialMeta(this.hhw.xz());
                    this.zmn.setUserAgentString(iqz.zmn(webView, BuildConfig.VERSION_CODE));
                    return;
                }
                webView.getSettings().setSavePassword(false);
                this.zmn.setAllowFileAccess(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void kw() {
        if (TextUtils.isEmpty(this.kw)) {
            return;
        }
        this.iqz = com.bytedance.sdk.openadsdk.nps.fs.zmn().fs();
        int zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.iqz, this.kw);
        this.kjb = zmn2;
        this.zak = zmn2 > 0 ? 2 : 0;
    }

    private void iqz() {
        fkt fktVar = new fkt(this);
        this.nps = fktVar;
        fktVar.fs(this.zmn).zn(this.rt).fb(this.cn).zmn(this.hhw).fs(this.cyb).zmn(this.hhw.mig()).btk(this.hhw.gor()).zmn(this.zmn).fs("landingpage");
    }

    protected void hhw() {
        if (this.oub) {
            zmn zmnVar = new zmn(this.kjb, this.hhw, "landingpage", this);
            mw fs2 = new mw(this.hhw, this.zmn.getWebView(), zmnVar, this.zak).fs(true);
            this.zg = fs2;
            this.rc = fs2.zmn;
            this.klz = oub.zmn(this.hhw, this.zmn, this, this.olo);
            this.zg.btk(this.yj);
            this.hhw.kw(this.yj);
            this.vlj = new com.bytedance.sdk.openadsdk.rt.fb(this.zg);
        }
        com.bytedance.sdk.openadsdk.core.widget.zmn.hhw nps = nps();
        this.mw = nps;
        nps.zmn(this.hhw);
        this.mw.zmn("landingpage");
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.vlj;
        if (fbVar != null) {
            this.mw.zmn(fbVar);
        }
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar != null) {
            npsVar.setWebViewClient(this.mw);
        }
        if (this.oub) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.hhw, "landingpage", this.zak);
        }
    }

    private void phc() {
        if (TextUtils.isEmpty(this.kgc)) {
            return;
        }
        com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.kgc.fb
            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                zmnVar.fs("lp_reuse");
                zmnVar.fb(IABLandingPageActivity.this.olo);
                zmnVar.zmn(BuildConfig.VERSION_NAME);
                return zmnVar;
            }
        });
        if (this.yj) {
            mw mwVar = this.zg;
            if (mwVar != null) {
                mwVar.btk(true);
                this.hhw.kw(true);
            }
            com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("lp_reuse");
                    zmnVar.fb(IABLandingPageActivity.this.olo);
                    zmnVar.zmn(BuildConfig.VERSION_NAME);
                    return zmnVar;
                }
            });
            com.bytedance.sdk.openadsdk.cyb.fb.zmn(true);
            return;
        }
        this.yj = false;
        com.bytedance.sdk.openadsdk.cyb.fb.zmn(false);
        com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.kgc.fb
            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                zmnVar.fs("lp_reuse");
                zmnVar.fb(IABLandingPageActivity.this.olo);
                zmnVar.zmn(BuildConfig.VERSION_NAME);
                return zmnVar;
            }
        });
    }

    protected com.bytedance.sdk.openadsdk.core.widget.zmn.hhw nps() {
        return new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(this, this.nps, this.rt, this.klz, this.zg, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/IABLandingPageActivity$7;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
                safedk_IABLandingPageActivity$7_onPageStarted_4c9c5a71600eeef0796bc8925780f9ac(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/IABLandingPageActivity$7;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_IABLandingPageActivity$7_shouldInterceptRequest_39fdde9c47db8a142f7c58b103d58f22(webView, str));
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
                IABLandingPageActivity.this.zg();
            }

            public WebResourceResponse safedk_IABLandingPageActivity$7_shouldInterceptRequest_39fdde9c47db8a142f7c58b103d58f22(WebView p0, String p1) {
                try {
                    if (TextUtils.isEmpty(IABLandingPageActivity.this.kw)) {
                        return super.shouldInterceptRequest(p0, p1);
                    }
                    WebView webView = IABLandingPageActivity.this.zmn.getWebView();
                    IABLandingPageActivity.this.uqh.incrementAndGet();
                    com.bytedance.sdk.openadsdk.nps.fs zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn();
                    IABLandingPageActivity iABLandingPageActivity = IABLandingPageActivity.this;
                    WebResourceResponseModel zmn3 = zmn2.zmn(iABLandingPageActivity.iqz, iABLandingPageActivity.kw, p1);
                    if (zmn3 != null && zmn3.getWebResourceResponse() != null) {
                        IABLandingPageActivity.this.rp.incrementAndGet();
                        return zmn3.getWebResourceResponse();
                    }
                    if (zmn3 != null && zmn3.getMsg() == 2) {
                        IABLandingPageActivity.this.bjh.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, p1);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(p0, p1);
                }
            }

            public void safedk_IABLandingPageActivity$7_onPageStarted_4c9c5a71600eeef0796bc8925780f9ac(WebView p0, String p1, Bitmap p2) {
                super.onPageStarted(p0, p1, p2);
                com.bytedance.sdk.openadsdk.core.hhw.hhw hhwVar = IABLandingPageActivity.this.zn;
                if (hhwVar != null) {
                    hhwVar.setVisibility(0);
                    IABLandingPageActivity.this.zn.setProgress(0);
                }
            }
        };
    }

    protected void zg() {
        try {
            if (this.zn != null && !isFinishing()) {
                this.zn.setVisibility(8);
            }
        } catch (Throwable unused) {
        }
        klz klzVar = this.fb;
        if (klzVar != null) {
            klzVar.fs();
        }
    }

    protected void bvs() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar == null) {
            return;
        }
        npsVar.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.nps, this.zg, this.klz) { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.8
            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                super.onReceivedTitle(webView, str);
                IABLandingPageActivity.this.zmn(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                IABLandingPageActivity.this.zmn(i);
            }
        });
    }

    protected void zmn(WebView webView, String str) {
        this.btk.zmn(str);
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        this.btk.fs(url);
        if (fs()) {
            fs(webView, str);
        }
    }

    private void fs(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.kgc;
            }
            this.phc = new com.bytedance.sdk.openadsdk.rt.zmn.zmn();
            this.phc.fs(this.hhw.fb().fs());
            this.phc.zn(String.valueOf(System.currentTimeMillis()));
            this.phc.btk(webView.getUrl());
            this.phc.fs(this.hhw.il());
            this.phc.zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zn(this.hhw.iyj()));
            this.phc.fb(str);
            com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().fs(this.phc);
        } catch (Exception unused) {
        }
    }

    protected void zmn(int i) {
        klz klzVar = this.fb;
        if (klzVar != null) {
            klzVar.zmn(i);
        }
        if (this.zn != null && !isFinishing()) {
            if (i == 100 && this.zn.isShown()) {
                this.zn.setVisibility(8);
            } else {
                this.zn.setProgress(i);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.so >= 200 || i == 100) {
            cyb();
            this.so = currentTimeMillis;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void iv() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar == null || npsVar.getWebView() == null) {
            return;
        }
        WebView webView = this.zmn.getWebView();
        webView.setOnScrollChangeListener(new fs(this.zg));
        webView.setOnTouchListener(new zn(this.zg, this.klz) { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.9
            private final int fs = kgc.fs();
            private float zn;

            @Override // com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.zn, android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/IABLandingPageActivity$9;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                return safedk_IABLandingPageActivity$9_onTouch_908a9999ad281e436095558816224140(view, motionEvent);
            }

            public boolean safedk_IABLandingPageActivity$9_onTouch_908a9999ad281e436095558816224140(View p0, MotionEvent p1) {
                if (IABLandingPageActivity.this.vlj != null) {
                    IABLandingPageActivity.this.vlj.zmn();
                }
                int actionMasked = p1.getActionMasked();
                if (actionMasked == 0) {
                    this.zn = p1.getRawY();
                } else if (actionMasked == 2) {
                    float rawY = p1.getRawY();
                    if (rawY - this.zn > this.fs) {
                        IABLandingPageActivity.this.btk.fs();
                    }
                    if (rawY - this.zn < (-this.fs)) {
                        IABLandingPageActivity.this.btk.zn();
                    }
                }
                return super.onTouch(p0, p1);
            }
        });
        if (this.oub) {
            this.zmn.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.10
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    IABLandingPageActivity iABLandingPageActivity = IABLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar = iABLandingPageActivity.bvs;
                    if (znVar != null) {
                        znVar.zmn(iABLandingPageActivity.hhw);
                    }
                }
            });
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void rc() {
        nqi nqiVar = this.hhw;
        if (nqiVar == null || nqiVar.va() != 4) {
            return;
        }
        cn cnVar = this.nu;
        if (cnVar != null) {
            cnVar.setVisibility(0);
        }
        Button button = (Button) findViewById(olo.ouf);
        this.hgd = button;
        if (button == null) {
            return;
        }
        zmn(klz());
        if (this.bvs == null) {
            this.bvs = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this, TextUtils.isEmpty(this.olo) ? oub.fs(this.cyb) : this.olo);
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(this, this.hhw, this.olo, this.cyb);
        zmnVar.zmn(false);
        zmnVar.zn(true);
        zmnVar.zmn(this.bvs);
        this.hgd.setOnClickListener(zmnVar);
        this.hgd.setOnTouchListener(zmnVar);
    }

    protected String klz() {
        nqi nqiVar = this.hhw;
        if (nqiVar != null && !TextUtils.isEmpty(nqiVar.gt())) {
            return this.hhw.gt();
        }
        return getString(doe.fs(this, "tt_native_banner_download"));
    }

    protected void zmn(String str) {
        if (TextUtils.isEmpty(str) || this.hgd == null || isFinishing()) {
            return;
        }
        this.hgd.setText(str);
    }

    protected void mw() {
        mw mwVar;
        if (this.zmn == null || TextUtils.isEmpty(this.kgc)) {
            return;
        }
        if (this.oub) {
            if (zmn()) {
                if (this.yj && (mwVar = this.zg) != null) {
                    mwVar.zn(this.kgc);
                    this.zg.fb(this.kgc);
                    this.zg.zmn(this.kgc, 0L);
                    klz klzVar = this.fb;
                    if (klzVar != null) {
                        klzVar.fs();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.zmn, this.kgc);
                return;
            }
            com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.zmn, this.kgc);
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.zmn, this.kgc);
        } catch (Throwable th) {
            th.getMessage();
            this.zmn.a_(this.kgc);
        }
    }

    private void doe() {
        LinkedList<WeakReference<Activity>> linkedList = ww;
        linkedList.add(new WeakReference<>(this));
        if (linkedList.size() > 30) {
            nqi();
        }
    }

    private void nqi() {
        Activity activity;
        while (true) {
            LinkedList<WeakReference<Activity>> linkedList = ww;
            if (linkedList.isEmpty()) {
                return;
            }
            WeakReference<Activity> pollFirst = linkedList.pollFirst();
            if (pollFirst != null && (activity = pollFirst.get()) != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int zmn2 = this.hhw != null ? am.zmn().zmn(this.hhw) : -1;
            this.nqi = zmn2;
            bundle.putInt("meta_index", zmn2);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    @CallSuper
    protected void onResume() {
        super.onResume();
        nqi nqiVar = this.hhw;
        if (nqiVar != null) {
            nqiVar.lbc(1);
        }
        fkt fktVar = this.nps;
        if (fktVar != null) {
            fktVar.rc();
        }
        mw mwVar = this.zg;
        if (mwVar != null) {
            mwVar.nps();
        }
        rt rtVar = this.iv;
        if (rtVar != null) {
            rtVar.zmn();
        }
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar != null) {
            npsVar.klz();
            uqh();
        }
        com.bytedance.sdk.openadsdk.rt.fs fsVar = this.btk;
        if (fsVar != null) {
            fsVar.nps();
        }
    }

    private void uqh() {
        final com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar == null) {
            return;
        }
        npsVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.2
            @Override // java.lang.Runnable
            public void run() {
                npsVar.scrollBy(0, 1);
                npsVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (npsVar == null || IABLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        npsVar.scrollBy(0, -1);
                    }
                }, 10L);
            }
        }, 200L);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    @CallSuper
    protected void onPause() {
        super.onPause();
        rt rtVar = this.iv;
        if (rtVar != null) {
            rtVar.fs();
        }
        nqi nqiVar = this.hhw;
        if (nqiVar != null) {
            nqiVar.nps(SystemClock.elapsedRealtime());
            this.hhw.lbc(0);
        }
    }

    @Override // android.app.Activity
    @CallSuper
    protected void onStop() {
        super.onStop();
        nqi nqiVar = this.hhw;
        if (nqiVar != null) {
            nqiVar.lbc(0);
        }
        mw mwVar = this.zg;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    @Override // android.app.Activity
    @CallSuper
    protected void onStart() {
        super.onStart();
        if (this.nqi >= 0) {
            am.zmn().zn(this.nqi);
            this.nqi = -1;
        }
        com.bytedance.sdk.openadsdk.utils.fb.zmn(this, this.hhw);
        nqi nqiVar = this.hhw;
        if (nqiVar != null) {
            nqiVar.lbc(1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    @CallSuper
    protected void onDestroy() {
        bjh();
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar != null) {
            npsVar.nps();
        }
        rp();
        kjb();
        com.bytedance.sdk.openadsdk.rt.fs fsVar = this.btk;
        if (fsVar != null) {
            fsVar.zg();
        }
        if (this.ev == 2) {
            zak();
        }
        this.zmn = null;
        this.jy = true;
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.vlj;
        if (fbVar != null) {
            fbVar.zn();
        }
        super.onDestroy();
    }

    private void bjh() {
        com.bytedance.sdk.component.bvs.nps npsVar;
        com.bytedance.sdk.component.bvs.nps npsVar2;
        if (zmn()) {
            nqi nqiVar = this.hhw;
            if (nqiVar != null) {
                nqiVar.lbc(0);
            }
            mw mwVar = this.zg;
            if (mwVar != null && (npsVar2 = this.zmn) != null) {
                mwVar.zmn(npsVar2);
            }
        } else {
            mw mwVar2 = this.zg;
            if (mwVar2 != null && (npsVar = this.zmn) != null) {
                mwVar2.zmn(npsVar);
            }
            com.bytedance.sdk.component.bvs.nps npsVar3 = this.zmn;
            if (npsVar3 != null) {
                zak.zmn(npsVar3);
            }
        }
        this.zmn = null;
    }

    private void rp() {
        try {
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        } catch (Throwable unused) {
        }
        fkt fktVar = this.nps;
        if (fktVar != null) {
            fktVar.klz();
        }
        mw mwVar = this.zg;
        if (mwVar != null) {
            mwVar.fb(true);
        }
        if (!TextUtils.isEmpty(this.kw)) {
            zn.zmn.zmn(this.rp.get(), this.uqh.get(), this.hhw);
        }
        com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.iqz);
        rt rtVar = this.iv;
        if (rtVar != null) {
            rtVar.zn();
        }
    }

    private void kjb() {
        if (fs() && this.ev == 0) {
            com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().fs();
        }
    }

    private void zak() {
        Iterator<WeakReference<Activity>> it = ww.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity == this || activity == null) {
                it.remove();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        rc();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        cn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void rt() {
        cn();
    }

    protected void cn() {
        try {
            super.onBackPressed();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    protected void cyb() {
        com.bytedance.sdk.component.bvs.nps npsVar;
        com.bytedance.sdk.openadsdk.rt.fs fsVar = this.btk;
        if (fsVar == null || (npsVar = this.zmn) == null) {
            return;
        }
        fsVar.zmn(npsVar.getWebView(), this.rc);
    }

    public static class zmn implements com.bytedance.sdk.openadsdk.fb.klz {
        private final WeakReference<IABLandingPageActivity> fb;
        private final nqi fs;
        private final int zmn;
        private final String zn;

        public zmn(int i, nqi nqiVar, String str, IABLandingPageActivity iABLandingPageActivity) {
            this.zmn = i;
            this.fs = nqiVar;
            this.zn = str;
            this.fb = new WeakReference<>(iABLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.fb.klz
        public void zmn(int i) {
            IABLandingPageActivity iABLandingPageActivity = this.fb.get();
            if (iABLandingPageActivity == null || iABLandingPageActivity.jy) {
                return;
            }
            zn.zmn.zmn(this.zmn, iABLandingPageActivity.bjh.get(), iABLandingPageActivity.rp.get(), iABLandingPageActivity.uqh.get() - iABLandingPageActivity.rp.get(), this.fs, this.zn, i);
        }
    }

    @RequiresApi
    protected static class fs implements View.OnScrollChangeListener {
        private final WeakReference<mw> zmn;

        public fs(mw mwVar) {
            this.zmn = new WeakReference<>(mwVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            mw mwVar = this.zmn.get();
            if (mwVar != null) {
                mwVar.fs(i2);
            }
        }
    }

    protected static class zn implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.common.btk> fs;
        private final WeakReference<mw> zmn;

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/IABLandingPageActivity$zn;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
            return safedk_IABLandingPageActivity$zn_onTouch_a3c50587ebd949f4a28cb6fcb354f176(view, motionEvent);
        }

        public zn(mw mwVar, com.bytedance.sdk.openadsdk.common.btk btkVar) {
            this.zmn = new WeakReference<>(mwVar);
            this.fs = new WeakReference<>(btkVar);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean safedk_IABLandingPageActivity$zn_onTouch_a3c50587ebd949f4a28cb6fcb354f176(View p0, MotionEvent p1) {
            mw mwVar = this.zmn.get();
            if (mwVar != null) {
                mwVar.zmn(p1);
            }
            com.bytedance.sdk.openadsdk.common.btk btkVar = this.fs.get();
            if (btkVar == null) {
                return false;
            }
            btkVar.zmn(p1);
            return false;
        }
    }
}
