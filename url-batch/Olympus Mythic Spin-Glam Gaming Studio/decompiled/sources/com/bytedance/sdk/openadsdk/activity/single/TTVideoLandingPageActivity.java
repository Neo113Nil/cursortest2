package com.bytedance.sdk.openadsdk.activity.single;

import android.annotation.SuppressLint;
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
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.rc;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.cn;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.fb.klz;
import com.bytedance.sdk.openadsdk.fb.mw;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.utils.iqz;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.rc.fb {
    protected String am;
    protected cn bjh;
    protected Context btk;
    protected int bvs;
    private int bxw;
    protected nps.zmn dgt;
    protected com.bytedance.sdk.openadsdk.core.widget.zmn doe;
    protected TextView fb;
    protected ImageView fs;
    protected String hhw;
    protected RelativeLayout iqz;
    protected FrameLayout iv;
    protected com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn kjb;
    protected com.bytedance.sdk.openadsdk.core.cn.fs.hhw klz;
    protected long mw;
    protected String nps;
    protected TextView nqi;
    protected int nu;
    protected mw oub;
    protected TextView phc;
    protected Button rp;
    protected nqi rt;
    private int tet;
    private ILoader uqd;
    protected TextView uqh;
    protected com.bytedance.sdk.openadsdk.kw.zn.zmn ww;
    protected String yof;
    protected fkt zg;
    protected com.bytedance.sdk.component.bvs.nps zmn;
    protected ImageView zn;
    protected int rc = -1;
    protected int cn = 0;
    protected int cyb = 0;
    protected int olo = 0;
    protected int kgc = 0;
    protected String kw = "ダウンロード";
    protected boolean zak = false;
    protected boolean yj = false;
    protected boolean so = true;
    protected boolean ev = false;
    protected String hgd = null;
    protected AtomicBoolean jy = new AtomicBoolean(true);
    protected JSONArray vlj = null;
    private final AtomicInteger kra = new AtomicInteger(0);
    private final AtomicInteger na = new AtomicInteger(0);
    private final AtomicInteger mhu = new AtomicInteger(0);
    int cud = -1;
    protected com.bytedance.sdk.openadsdk.core.zn.zmn gn = null;
    private final zn.fs yo = new zn.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.fs
        public void zmn(boolean z) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.zak = z;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (z) {
                jy.zmn((View) TTVideoLandingPageActivity.this.zmn, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.iv.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                tTVideoLandingPageActivity2.cyb = marginLayoutParams.leftMargin;
                tTVideoLandingPageActivity2.cn = marginLayoutParams.topMargin;
                tTVideoLandingPageActivity2.olo = marginLayoutParams.width;
                tTVideoLandingPageActivity2.kgc = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                tTVideoLandingPageActivity2.iv.setLayoutParams(marginLayoutParams);
                return;
            }
            jy.zmn((View) TTVideoLandingPageActivity.this.zmn, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.iv.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            marginLayoutParams2.width = tTVideoLandingPageActivity3.olo;
            marginLayoutParams2.height = tTVideoLandingPageActivity3.kgc;
            marginLayoutParams2.leftMargin = tTVideoLandingPageActivity3.cyb;
            marginLayoutParams2.topMargin = tTVideoLandingPageActivity3.cn;
            tTVideoLandingPageActivity3.iv.setLayoutParams(marginLayoutParams2);
        }
    };
    private final rp.zmn xrr = new rp.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.rp.zmn
        public void zmn(Context context, Intent intent, boolean z, final int i) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zmn(int i) {
            com.bytedance.sdk.component.bvs.nps npsVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.nu == 0 && i != 0 && (npsVar = tTVideoLandingPageActivity.zmn) != null && (str = tTVideoLandingPageActivity.hgd) != null) {
                npsVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = TTVideoLandingPageActivity.this.klz;
            if (hhwVar != null && hhwVar.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.yj && tTVideoLandingPageActivity2.nu != i) {
                    tTVideoLandingPageActivity2.klz.getNativeVideoController().zn(i);
                }
            }
            TTVideoLandingPageActivity.this.nu = i;
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    protected abstract boolean hhw();

    protected abstract View zmn();

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.cn.btk()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            kgc.fs(this);
        } catch (Throwable unused2) {
        }
        this.nu = com.bytedance.sdk.component.utils.kgc.zn(getApplicationContext());
        try {
            setContentView(zmn());
            this.btk = this;
            Intent intent = getIntent();
            this.ev = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.mw = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            nqi zmn2 = am.zmn().zmn(am.zmn(intent));
            this.rt = zmn2;
            if (zmn2 != null) {
                this.rc = zmn2.zq();
                this.hhw = this.rt.ji();
                this.nps = this.rt.ze();
                str = this.rt.db();
                this.yof = this.rt.ltf();
                this.hgd = this.rt.rc();
                this.bvs = this.rt.mw();
                this.am = this.rt.klz();
            } else {
                str = null;
            }
            if (this.rt == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.yof)) {
                this.uqd = com.bytedance.sdk.openadsdk.nps.fs.zmn().fs();
                int zmn3 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.uqd, this.yof);
                this.bxw = zmn3;
                this.tet = zmn3 > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.ww = com.bytedance.sdk.openadsdk.kw.zn.zmn.zmn(new JSONObject(stringExtra));
                } catch (Exception unused3) {
                }
                com.bytedance.sdk.openadsdk.kw.zn.zmn zmnVar = this.ww;
                if (zmnVar != null) {
                    this.mw = zmnVar.nps;
                }
            }
            if (bundle != null) {
                this.rt = am.zmn().zmn(bundle.getInt("meta_index", -1));
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.mw = j;
                }
            }
            zn();
            iv();
            cyb();
            zmn(4);
            if (this.zmn != null) {
                com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(this.btk).zmn(true).fs(false).zmn(this.zmn.getWebView());
                mw fs = new mw(this.rt, this.zmn.getWebView(), new klz() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.fb.klz
                    public void zmn(int i) {
                        zn.zmn.zmn(TTVideoLandingPageActivity.this.bxw, TTVideoLandingPageActivity.this.mhu.get(), TTVideoLandingPageActivity.this.na.get(), TTVideoLandingPageActivity.this.kra.get() - TTVideoLandingPageActivity.this.na.get(), TTVideoLandingPageActivity.this.rt, "landingpage_split_screen", i);
                    }
                }, this.tet).fs(true);
                this.oub = fs;
                this.dgt = fs.zmn;
                fs.zmn("landingpage_split_screen");
            }
            com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
            if (npsVar != null) {
                npsVar.setLandingPage(true);
                this.zmn.setTag("landingpage_split_screen");
                this.zmn.setMaterialMeta(this.rt.xz());
                this.zmn.setWebViewClient(mw());
                com.bytedance.sdk.component.bvs.nps npsVar2 = this.zmn;
                npsVar2.setUserAgentString(iqz.zmn(npsVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.bvs.nps npsVar3 = this.zmn;
            if (npsVar3 != null) {
                npsVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.rt, "landingpage_split_screen", this.tet);
            com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.zmn, this.hgd);
            this.zmn.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.zg, this.oub) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.zmn.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.5
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j2) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar = tTVideoLandingPageActivity.kjb;
                    if (znVar != null) {
                        znVar.zmn(tTVideoLandingPageActivity.rt);
                    }
                }
            });
            TextView textView = this.fb;
            if (textView != null) {
                if (TextUtils.isEmpty(str)) {
                    str = doe.zmn(this, "tt_web_title_default");
                }
                textView.setText(str);
            }
            rc();
            btk();
            cn();
            zn.zmn.zmn(SystemClock.elapsedRealtime() - elapsedRealtime, this.rt, "landingpage_split_screen", this.uqd, this.yof);
        } catch (Throwable unused4) {
            finish();
        }
    }

    @NonNull
    private com.bytedance.sdk.openadsdk.core.widget.zmn.hhw mw() {
        com.bytedance.sdk.openadsdk.core.widget.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(this.btk, this.zg, this.hhw, this.oub, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted(h.u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageActivity$6;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_TTVideoLandingPageActivity$6_shouldInterceptRequest_afcaec3e526e5dc7d62f2ff616c28b33(webView, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                return shouldOverrideUrlLoading;
            }

            public WebResourceResponse safedk_TTVideoLandingPageActivity$6_shouldInterceptRequest_afcaec3e526e5dc7d62f2ff616c28b33(WebView p0, String p1) {
                try {
                    if (!TextUtils.isEmpty(TTVideoLandingPageActivity.this.yof)) {
                        TTVideoLandingPageActivity.this.kra.incrementAndGet();
                        WebResourceResponseModel zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(TTVideoLandingPageActivity.this.uqd, TTVideoLandingPageActivity.this.yof, p1);
                        if (zmn2 != null && zmn2.getWebResourceResponse() != null) {
                            TTVideoLandingPageActivity.this.na.incrementAndGet();
                            return zmn2.getWebResourceResponse();
                        }
                        if (zmn2 != null && zmn2.getMsg() == 2) {
                            TTVideoLandingPageActivity.this.mhu.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(p0, p1);
                    }
                    return super.shouldInterceptRequest(p0, p1);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zmn("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(p0, p1);
                }
            }
        };
        hhwVar.zmn(this.rt);
        return hhwVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void cn() {
        nqi nqiVar = this.rt;
        if (nqiVar == null || nqiVar.va() != 4) {
            return;
        }
        this.bjh.setVisibility(0);
        Button button = (Button) findViewById(olo.ouf);
        this.rp = button;
        if (button != null) {
            zmn(fs());
            this.rp.setOnClickListener(this.gn);
            this.rp.setOnTouchListener(this.gn);
        }
    }

    protected String fs() {
        nqi nqiVar = this.rt;
        if (nqiVar != null && !TextUtils.isEmpty(nqiVar.gt())) {
            this.kw = this.rt.gt();
        }
        return this.kw;
    }

    private void zmn(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.rp) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.rp == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.rp.setText(str);
            }
        });
    }

    protected void zn() {
        this.bjh = (cn) findViewById(olo.xrr);
        this.zmn = (com.bytedance.sdk.component.bvs.nps) findViewById(olo.gn);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.fs = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageActivity$8;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTVideoLandingPageActivity$8_onClick_d2e633c42e8dde1f70b3411aea63afa9(view);
                }

                public void safedk_TTVideoLandingPageActivity$8_onClick_d2e633c42e8dde1f70b3411aea63afa9(View p0) {
                    JSONObject jSONObject;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.zmn != null) {
                        nps.zmn zmnVar = tTVideoLandingPageActivity.dgt;
                        if (zmnVar != null) {
                            zmnVar.zmn();
                        }
                        if (!TTVideoLandingPageActivity.this.zmn.zg()) {
                            if (TTVideoLandingPageActivity.this.doe()) {
                                TTVideoLandingPageActivity.this.onBackPressed();
                                return;
                            }
                            com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = TTVideoLandingPageActivity.this.klz;
                            if (hhwVar == null || hhwVar.getNativeVideoController() == null) {
                                jSONObject = null;
                            } else {
                                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                                jSONObject = oub.zmn(tTVideoLandingPageActivity2.rt, tTVideoLandingPageActivity2.klz.getNativeVideoController().nps(), TTVideoLandingPageActivity.this.klz.getNativeVideoController().rc());
                            }
                            JSONObject jSONObject2 = jSONObject;
                            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                            com.bytedance.sdk.openadsdk.fb.zn.zmn(tTVideoLandingPageActivity3.rt, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.nps(), TTVideoLandingPageActivity.this.zg(), jSONObject2, (com.bytedance.sdk.openadsdk.fb.nps) null);
                            TTVideoLandingPageActivity.this.finish();
                            return;
                        }
                        TTVideoLandingPageActivity.this.zmn.bvs();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar != null) {
            hhwVar.setIsAutoPlay(this.ev);
        }
        ImageView imageView2 = (ImageView) findViewById(olo.oub);
        this.zn = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTVideoLandingPageActivity$9;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTVideoLandingPageActivity$9_onClick_b5158268a863b4fe567da2329b78ee1a(view);
                }

                public void safedk_TTVideoLandingPageActivity$9_onClick_b5158268a863b4fe567da2329b78ee1a(View p0) {
                    JSONObject jSONObject;
                    com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar2 = TTVideoLandingPageActivity.this.klz;
                    if (hhwVar2 != null) {
                        if (hhwVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObject = oub.zmn(tTVideoLandingPageActivity.rt, tTVideoLandingPageActivity.klz.getNativeVideoController().nps(), TTVideoLandingPageActivity.this.klz.getNativeVideoController().rc());
                        } else {
                            jSONObject = null;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(tTVideoLandingPageActivity2.rt, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.nps(), TTVideoLandingPageActivity.this.zg(), jSONObject2, (com.bytedance.sdk.openadsdk.fb.nps) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.fb = (TextView) findViewById(olo.ob);
        this.iv = (FrameLayout) findViewById(olo.ww);
        this.iqz = (RelativeLayout) findViewById(olo.jy);
        this.phc = (TextView) findViewById(olo.yof);
        this.nqi = (TextView) findViewById(olo.dgt);
        this.uqh = (TextView) findViewById(olo.cud);
        this.doe = (com.bytedance.sdk.openadsdk.core.widget.zmn) findViewById(olo.vlj);
        bvs();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cn();
    }

    protected void btk() {
        if (hhw()) {
            try {
                com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.cn.fs.hhw(this.btk, this.rt, true, null);
                this.klz = hhwVar;
                if (hhwVar.getNativeVideoController() != null) {
                    this.klz.getNativeVideoController().zmn(false);
                }
                if (this.yj) {
                    this.iv.setVisibility(0);
                    this.iv.removeAllViews();
                    this.iv.addView(this.klz);
                    this.klz.fs(true);
                } else {
                    if (!this.ev) {
                        this.mw = 0L;
                    }
                    if (this.ww != null && this.klz.getNativeVideoController() != null) {
                        this.klz.getNativeVideoController().zn(this.ww.nps);
                        this.klz.getNativeVideoController().fb(this.ww.btk);
                        this.klz.zmn(kgc.fb().zn(String.valueOf(this.rt.qvo())), "landingPageInit");
                    }
                    if (this.klz.zmn(this.mw, this.so, this.yj)) {
                        this.iv.setVisibility(0);
                        this.iv.removeAllViews();
                        this.iv.addView(this.klz);
                    }
                    if (this.klz.getNativeVideoController() != null) {
                        this.klz.getNativeVideoController().zmn(false);
                        this.klz.getNativeVideoController().zmn(this.yo);
                    }
                }
                String zmn2 = this.rt.tj().get(0).zmn();
                com.bytedance.sdk.openadsdk.iv.fb.zmn().zmn(zmn2).zmn(this.rt.tj().get(0).fs()).fs(this.rt.tj().get(0).zn()).btk(jy.btk(kgc.zmn())).fb(jy.zn(kgc.zmn())).zn(2).zmn(new com.bytedance.sdk.openadsdk.iv.fs(this.rt, zmn2, new cyb() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.btk.cyb
                    public void zmn(int i, String str, @Nullable Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.btk.cyb
                    public void zmn(rc rcVar) {
                        try {
                            Object fs = rcVar.fs();
                            if (fs instanceof Bitmap) {
                                new zmn((Bitmap) fs, TTVideoLandingPageActivity.this.klz.getNativeVideoController().klz()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.klz.findViewById(520093726).setOnTouchListener(null);
                this.klz.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zn("TTVideoLandingPage", e.getMessage());
                if (this.klz == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.nu == 0) {
                try {
                    Toast.makeText(this, doe.zmn(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    protected long nps() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar == null || hhwVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.klz.getNativeVideoController().bvs();
    }

    protected int zg() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar == null || hhwVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.klz.getNativeVideoController().iv();
    }

    protected void bvs() {
        String str;
        nqi nqiVar = this.rt;
        if (nqiVar == null || nqiVar.va() != 4) {
            return;
        }
        jy.zmn((View) this.iqz, 0);
        if (!TextUtils.isEmpty(this.rt.db())) {
            str = this.rt.db();
        } else if (!TextUtils.isEmpty(this.rt.pf())) {
            str = this.rt.pf();
        } else if (TextUtils.isEmpty(this.rt.dey())) {
            str = "";
        } else {
            str = this.rt.dey();
        }
        if (this.rt.uaq() != null && this.rt.uaq().zmn() != null) {
            jy.zmn((View) this.doe, 0);
            jy.zmn((View) this.phc, 4);
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.rt.uaq(), this.doe, this.rt);
        } else if (!TextUtils.isEmpty(str)) {
            jy.zmn((View) this.doe, 4);
            jy.zmn((View) this.phc, 0);
            this.phc.setText(str.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.rt.gt())) {
            this.uqh.setText(this.rt.gt());
        }
        if (!TextUtils.isEmpty(str)) {
            this.nqi.setText(str);
        }
        jy.zmn((View) this.nqi, 0);
        jy.zmn((View) this.uqh, 0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void iv() {
        if (this.rt == null) {
            return;
        }
        this.kjb = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this, this.am);
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(this, this.rt, this.am, this.bvs);
        this.gn = zmnVar;
        zmnVar.zmn(false);
        this.gn.zn(true);
        this.uqh.setOnClickListener(this.gn);
        this.uqh.setOnTouchListener(this.gn);
        this.gn.zmn(this.kjb);
    }

    private void cyb() {
        fkt fktVar = new fkt(this);
        this.zg = fktVar;
        fktVar.fs(this.zmn).zn(this.hhw).fb(this.nps).fs(this.bvs).zmn(this.rt).zmn(this.rt.mig()).zmn(this.zmn).fs("landingpage_split_screen").btk(this.rt.gor());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        olo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void rt() {
        olo();
    }

    private void olo() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar;
        if (this.zak && (hhwVar = this.klz) != null && hhwVar.getNativeVideoController() != null) {
            this.klz.getNativeVideoController().btk(null, null);
            this.zak = false;
        } else if (doe() && !this.jy.getAndSet(true)) {
            nqi();
            zmn(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int zmn2 = this.rt != null ? am.zmn().zmn(this.rt) : -1;
        this.cud = zmn2;
        bundle.putInt("meta_index", zmn2);
        bundle.putLong("video_play_position", this.mw);
        bundle.putBoolean("is_complete", this.yj);
        long j = this.mw;
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar != null && hhwVar.getNativeVideoController() != null) {
            j = this.klz.getNativeVideoController().hhw();
        }
        bundle.putLong("video_play_position", j);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.so) {
            kw();
        }
        this.so = false;
        fkt fktVar = this.zg;
        if (fktVar != null) {
            fktVar.rc();
        }
        mw mwVar = this.oub;
        if (mwVar != null) {
            mwVar.nps();
        }
    }

    private void kw() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar == null || hhwVar.getNativeVideoController() == null || phc()) {
            return;
        }
        this.klz.rt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        iqz();
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar == null || hhwVar.getNativeVideoController() == null) {
            return;
        }
        zmn(this.klz.getNativeVideoController());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        mw mwVar = this.oub;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    private void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar) {
        this.yj = this.yj || znVar.mw();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.yj));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(znVar.hhw()));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(znVar.bvs() + znVar.nps()));
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("sp_multi_native_video_data", "key_video_duration", Long.valueOf(znVar.bvs()));
    }

    private void iqz() {
        if (this.klz == null || phc()) {
            return;
        }
        this.klz.rt();
    }

    private boolean phc() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar == null || hhwVar.getNativeVideoController() == null) {
            return true;
        }
        return this.klz.getNativeVideoController().mw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        klz();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.rt.rt(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar != null) {
            com.bytedance.sdk.openadsdk.core.oub.zmn(npsVar.getWebView());
        }
        this.zmn = null;
        fkt fktVar = this.zg;
        if (fktVar != null) {
            fktVar.klz();
        }
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.klz;
        if (hhwVar != null && hhwVar.getNativeVideoController() != null) {
            this.klz.getNativeVideoController().btk();
        }
        this.klz = null;
        this.rt = null;
        mw mwVar = this.oub;
        if (mwVar != null) {
            mwVar.fb(true);
        }
        if (!TextUtils.isEmpty(this.yof)) {
            zn.zmn.zmn(this.na.get(), this.kra.get(), this.rt);
        }
        com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.uqd);
    }

    protected void rc() {
        rp.zmn(this.xrr, this.btk);
    }

    protected void klz() {
        try {
            rp.zmn(this.xrr);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean doe() {
        return !TextUtils.isEmpty(this.hgd) && this.hgd.contains("__luban_sdk");
    }

    private void zmn(final int i) {
        if (this.zn == null || !doe()) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                jy.zmn((View) TTVideoLandingPageActivity.this.zn, i);
            }
        });
    }

    private void nqi() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.zg.zmn("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rc.fb
    public void zmn(boolean z, JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.vlj = jSONArray;
    }

    @SuppressLint({"StaticFieldLeak"})
    private static class zmn extends AsyncTask<Void, Void, Drawable> {
        private final WeakReference<com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs> fs;
        private final Bitmap zmn;

        private zmn(Bitmap bitmap, com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar) {
            this.zmn = bitmap;
            this.fs = new WeakReference<>(fsVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap zmn = com.bytedance.sdk.component.adexpress.fb.zmn.zmn(kgc.zmn(), this.zmn, 25);
                if (zmn == null) {
                    return null;
                }
                return new BitmapDrawable(kgc.zmn().getResources(), zmn);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs> weakReference;
            if (drawable == null || (weakReference = this.fs) == null || weakReference.get() == null) {
                return;
            }
            this.fs.get().zmn(drawable);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.cud >= 0) {
            am.zmn().zn(this.cud);
            this.cud = -1;
        }
        com.bytedance.sdk.openadsdk.utils.fb.zmn(this, this.rt);
    }
}
