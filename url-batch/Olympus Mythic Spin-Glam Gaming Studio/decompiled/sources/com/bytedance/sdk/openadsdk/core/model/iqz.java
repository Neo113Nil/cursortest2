package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class iqz implements Handler.Callback {
    private long am;
    private com.bytedance.sdk.openadsdk.common.klz bjh;
    View btk;
    ObjectAnimator bvs;
    private com.bytedance.sdk.openadsdk.common.btk bxw;
    private AtomicBoolean cd;
    private Handler cn;
    private ILoader cud;
    private View cyb;
    private String dgt;
    private fkt doe;
    private String ev;
    FrameLayout fb;
    private final View fkt;
    FrameLayout fs;
    private int hgd;
    RelativeLayout hhw;

    /* renamed from: io, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.hhw.zg f3742io;
    private com.bytedance.sdk.openadsdk.core.widget.olo iqz;
    ValueAnimator iv;
    private TextView kgc;
    private ImageView kjb;
    zn.zmn klz;
    private TextView kw;
    private LinearLayout.LayoutParams lbc;
    private com.bytedance.sdk.openadsdk.core.widget.olo lt;
    private int mhu;
    private final boolean mpi;
    com.bytedance.sdk.openadsdk.core.zn.zmn mw;
    private int na;
    private ValueAnimator nkt;
    final nqi nps;
    private com.bytedance.sdk.component.bvs.nps nqi;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn nu;
    private View olo;
    private boolean oub;
    private TextView phc;
    ObjectAnimator rc;
    private View rp;
    com.bytedance.sdk.openadsdk.core.zn.fs rt;
    private com.bytedance.sdk.openadsdk.rt.fb skn;
    private final Activity so;
    private com.bytedance.sdk.openadsdk.core.hhw.fb tet;
    private final com.bytedance.sdk.openadsdk.core.cn.fb.fs tf;
    private FrameLayout uqh;
    private boolean vlj;
    private com.bytedance.sdk.openadsdk.fb.mw ww;
    private FrameLayout xrr;
    private com.bytedance.sdk.openadsdk.core.iv.phc yo;
    private com.bytedance.sdk.openadsdk.core.widget.zmn.hhw yof;
    private View zak;
    FrameLayout zg;
    private fs zi;
    ImageView zmn;
    TextView zn;
    private final AtomicBoolean yj = new AtomicBoolean(false);
    private final AtomicBoolean jy = new AtomicBoolean(false);
    private volatile int gn = 0;
    private volatile int uqd = 0;
    private volatile int kra = 0;
    private float ve = -1.0f;
    private final AtomicBoolean hwg = new AtomicBoolean(false);
    private long rje = -1;
    private final AtomicBoolean oep = new AtomicBoolean(false);
    private long tdm = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zn(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5;
    }

    static /* synthetic */ int cn(iqz iqzVar) {
        int i = iqzVar.kra;
        iqzVar.kra = i + 1;
        return i;
    }

    static /* synthetic */ int klz(iqz iqzVar) {
        int i = iqzVar.gn;
        iqzVar.gn = i + 1;
        return i;
    }

    static /* synthetic */ int rt(iqz iqzVar) {
        int i = iqzVar.uqd;
        iqzVar.uqd = i + 1;
        return i;
    }

    public iqz(Activity activity, final nqi nqiVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar, View view) {
        this.so = activity;
        this.nps = nqiVar;
        this.ev = str;
        this.tf = fsVar;
        this.fkt = view;
        this.hgd = oub.zmn(str);
        if (nqiVar != null) {
            this.dgt = nqiVar.ltf();
        }
        this.mpi = nqiVar.dgt() && hhw(nqiVar);
        if (!TextUtils.isEmpty(this.dgt)) {
            this.cud = com.bytedance.sdk.openadsdk.nps.fs.zmn().fs();
            int zmn2 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.cud, this.dgt);
            this.na = zmn2;
            this.mhu = zmn2 > 0 ? 2 : 0;
        }
        boolean fb = fb(nqiVar);
        boolean zg = zg(nqiVar);
        boolean fs2 = fs(nqiVar);
        if (fs2) {
            this.ev = "landingpage_split_screen";
        } else if (fb) {
            this.ev = "landingpage_direct";
        } else if (zg) {
            this.ev = "aggregate_page";
        } else if (zn(nqiVar)) {
            this.ev = "landingpage_split_ceiling";
        }
        this.mw = new com.bytedance.sdk.openadsdk.core.zn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), nqiVar, this.ev, oub.zmn(str));
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        this.mw.zmn(hashMap);
        View findViewById = activity.findViewById(R.id.content);
        this.mw.fs(findViewById);
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar2 = new com.bytedance.sdk.openadsdk.core.zn.fs(activity, nqiVar, this.ev, oub.zmn(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.1
            @Override // com.bytedance.sdk.openadsdk.core.zn.fs
            public boolean zmn(klz klzVar, Map<String, Object> map) {
                if (iqz.rc(nqiVar) && iqz.this.yof != null) {
                    iqz.this.yof.zmn(klzVar);
                    iqz.this.yof.zmn(map);
                    if (iqz.iv(iqz.this.nps) || iqz.this.vlj) {
                        return true;
                    }
                }
                return super.zmn(klzVar, map);
            }
        };
        this.rt = fsVar2;
        fsVar2.zmn(hashMap);
        this.rt.fs(findViewById);
        this.zg = frameLayout;
        if (fs2 || fb || zg) {
            try {
                this.cn = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e) {
                Log.e("LandingPageModel", "LandingPageModel: ", e);
                return;
            }
        }
        if (nqiVar.dgt()) {
            return;
        }
        if (fb || zg) {
            Handler handler = this.cn;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    public void zmn(zn.zmn zmnVar) {
        this.klz = zmnVar;
    }

    public void zmn() {
        long zmn2;
        View view;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.bvs.nps npsVar = (com.bytedance.sdk.component.bvs.nps) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.doe);
        this.nqi = npsVar;
        if (npsVar != null && !nqi.zmn(this.nps)) {
            if (!this.nqi.k_()) {
                this.nqi.btk();
            }
        } else {
            jy.zmn((View) this.nqi, 8);
        }
        this.uqh = (FrameLayout) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.phc);
        this.bjh = (com.bytedance.sdk.openadsdk.common.klz) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.rp);
        this.rp = this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.nqi);
        this.kjb = (ImageView) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.uqh);
        this.zak = this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.fkt);
        this.fs = (FrameLayout) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.kw);
        this.zmn = (ImageView) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.iqz);
        this.hhw = (RelativeLayout) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.bjh);
        this.zn = (TextView) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.ufa);
        this.fb = (FrameLayout) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.klz);
        View findViewById = this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.kjb);
        this.cyb = findViewById;
        if (findViewById == null) {
            this.cyb = this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.nu);
        }
        this.olo = this.so.findViewById(com.bytedance.sdk.openadsdk.utils.olo.zak);
        this.kgc = (TextView) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.yj);
        this.kw = (TextView) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.so);
        this.iqz = (com.bytedance.sdk.openadsdk.core.widget.olo) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.am);
        this.phc = (TextView) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.ev);
        if (this.zn != null && this.nps.uqh() != null) {
            this.zn.setText(this.nps.uqh().btk());
        }
        this.btk = this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.tf);
        this.tet = (com.bytedance.sdk.openadsdk.core.hhw.fb) this.fkt.findViewById(com.bytedance.sdk.openadsdk.utils.olo.ghr);
        if ((fb(this.nps) || fs(this.nps) || zg(this.nps) || zn(this.nps)) && this.nps.uqh() != null) {
            View view2 = this.btk;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (zg(this.nps)) {
                zmn2 = this.nps.uqh().zn();
            } else {
                zmn2 = this.nps.uqh().zmn();
            }
            com.bytedance.sdk.openadsdk.core.cn.zn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.11
                @Override // java.lang.Runnable
                public void run() {
                    if (iqz.this.yj.get()) {
                        return;
                    }
                    iqz iqzVar = iqz.this;
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(iqzVar.nps, iqzVar.ev, System.currentTimeMillis() - iqz.this.am, false);
                    iqz.this.cn();
                }
            }, zmn2 * 1000);
        }
        rc();
        if (fs(this.nps)) {
            kgc();
            if (!fb()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.uqh.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.uqh.setLayoutParams(layoutParams);
            }
        }
        if ((fb(this.nps) || zg(this.nps)) && (view = this.zak) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.klz klzVar = this.bjh;
        if (klzVar != null) {
            klzVar.zmn(this.nps);
        }
        if (zn(this.nps)) {
            olo();
        }
        zn.zmn.zmn(SystemClock.elapsedRealtime() - elapsedRealtime, this.nps, this.ev, this.cud, this.dgt);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void rc() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.nqi;
        if (npsVar != null && npsVar.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()).zmn(false).fs(false).zmn(this.nqi.getWebView());
            com.bytedance.sdk.component.bvs.nps npsVar2 = this.nqi;
            if (npsVar2 != null && npsVar2.getWebView() != null) {
                this.zi = new fs(this.na, this.nps, this.ev, this);
                if (this.nqi.k_() && (this.nqi.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.zmn.hhw)) {
                    com.bytedance.sdk.openadsdk.fb.mw fs2 = ((com.bytedance.sdk.openadsdk.core.widget.zmn.hhw) this.nqi.getWebViewClient()).fs();
                    this.ww = fs2;
                    if (fs2 != null) {
                        fs2.zmn(this.zi);
                        this.ww.fs(true);
                    }
                } else {
                    this.ww = new com.bytedance.sdk.openadsdk.fb.mw(this.nps, this.nqi.getWebView(), this.zi, this.mhu).fs(true);
                }
                this.ww.zmn(this.ev);
                this.skn = new com.bytedance.sdk.openadsdk.rt.fb(this.ww);
                com.bytedance.sdk.openadsdk.common.btk zmn2 = oub.zmn(this.nps, this.nqi, this.so, this.ev);
                this.bxw = zmn2;
                if (zmn2 != null) {
                    zmn2.zmn(this.ev);
                }
                oub.zmn(this.nps, this.nqi);
            }
            klz();
            if (this.nqi.k_()) {
                iqz();
            }
            this.nqi.setLandingPage(true);
            this.nqi.setTag(this.ev);
            this.nqi.setMaterialMeta(this.nps.xz());
            com.bytedance.sdk.openadsdk.core.widget.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.widget.zmn.hhw(com.bytedance.sdk.openadsdk.core.kgc.zmn(), this.doe, this.nps.ji(), this.bxw, this.ww, true) { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onLoadResource(WebView view, String url) {
                    super.onLoadResource(view, url);
                    CreativeInfoManager.onResourceLoaded(h.u, view, url);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$12;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
                    BrandSafetyUtils.onWebViewPageStarted(h.u, webView, str);
                    safedk_iqz$12_onPageStarted_633c328d2cee2b1d87c852d7f2501a6c(webView, str, bitmap);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$12;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                    BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i, str, str2);
                    safedk_iqz$12_onReceivedError_493a2f0c1ceed169b27b97f69981efe7(webView, i, str, str2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$12;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                    return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_iqz$12_shouldInterceptRequest_1ff9db585352ae61a0a6a6c46763d277(webView, str));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$12;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                    boolean safedk_iqz$12_shouldOverrideUrlLoading_e4331e61a3bffadaf259a830a2d7d16d = safedk_iqz$12_shouldOverrideUrlLoading_e4331e61a3bffadaf259a830a2d7d16d(webView, str);
                    BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView, str, safedk_iqz$12_shouldOverrideUrlLoading_e4331e61a3bffadaf259a830a2d7d16d);
                    return safedk_iqz$12_shouldOverrideUrlLoading_e4331e61a3bffadaf259a830a2d7d16d;
                }

                public boolean safedk_iqz$12_shouldOverrideUrlLoading_e4331e61a3bffadaf259a830a2d7d16d(WebView p0, String p1) {
                    if (iqz.zn(iqz.this.nps) && oub.zmn(p0) == 1) {
                        Intent intent = new Intent(iqz.this.so, (Class<?>) TTCeilingLandingPageActivity.class);
                        iqz.this.nps.btk(p1);
                        intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.am.zmn().zmn(iqz.this.nps));
                        com.bytedance.sdk.component.utils.fs.zmn(this.fb, intent, null);
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(p0, p1);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    iqz.this.mw();
                }

                public void safedk_iqz$12_onPageStarted_633c328d2cee2b1d87c852d7f2501a6c(WebView p0, String p1, Bitmap p2) {
                    super.onPageStarted(p0, p1, p2);
                    iqz.this.tf.lt();
                    iqz.this.am = System.currentTimeMillis();
                    if (!iqz.fs(iqz.this.nps) || iqz.this.cn == null || nqi.btk(iqz.this.nps)) {
                        return;
                    }
                    iqz.this.cn.sendEmptyMessageDelayed(101, 2000L);
                }

                public void safedk_iqz$12_onReceivedError_493a2f0c1ceed169b27b97f69981efe7(WebView p0, int p1, String p2, String p3) {
                    super.onReceivedError(p0, p1, p2, p3);
                    String fb = com.bytedance.sdk.openadsdk.core.widget.zmn.hhw.fb(p3);
                    boolean z = false;
                    if (this.hhw != null) {
                        this.hhw.zmn(p0, p1, p2, p3, com.bytedance.sdk.openadsdk.core.widget.zmn.hhw.fb(p3), (p0 == null || p3 == null || !p3.equals(p0.getUrl())) ? false : true);
                    }
                    WebView p02 = (fb == null || !fb.startsWith("image")) ? null : 1;
                    if (fb != null && fb.startsWith(n.d)) {
                        z = true;
                    }
                    if (p02 != null || z || iqz.this.yj.get()) {
                        return;
                    }
                    iqz.this.cn();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        iqz.this.cn();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                public WebResourceResponse safedk_iqz$12_shouldInterceptRequest_1ff9db585352ae61a0a6a6c46763d277(WebView p0, String p1) {
                    try {
                        if (TextUtils.isEmpty(iqz.this.dgt)) {
                            return super.shouldInterceptRequest(p0, p1);
                        }
                        iqz.klz(iqz.this);
                        WebResourceResponseModel zmn3 = com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(iqz.this.cud, iqz.this.dgt, p1);
                        if (zmn3 != null && zmn3.getWebResourceResponse() != null) {
                            iqz.rt(iqz.this);
                            return zmn3.getWebResourceResponse();
                        }
                        if (zmn3 != null && zmn3.getMsg() == 2) {
                            iqz.cn(iqz.this);
                        }
                        return super.shouldInterceptRequest(p0, p1);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zmn("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(p0, p1);
                    }
                }
            };
            this.yof = hhwVar;
            this.nqi.setWebViewClient(hhwVar);
            this.yof.zmn(this.nps);
            this.yof.zmn(this.ev);
            this.yof.zmn(this.tf);
            com.bytedance.sdk.openadsdk.rt.fb fbVar = this.skn;
            if (fbVar != null) {
                this.yof.zmn(fbVar);
            }
            this.nqi.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.doe, this.ww, this.bxw) { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (iqz.this.so != null && !iqz.this.so.isFinishing() && i == 100) {
                        iqz.this.mw();
                    }
                    if (iqz.this.bjh != null) {
                        iqz.this.bjh.zmn(i);
                    }
                }
            });
            if (this.nu == null) {
                this.nu = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), this.ev);
            }
            this.nqi.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (iqz.this.nu != null) {
                        iqz.this.nu.zmn(iqz.this.nps);
                    }
                }
            });
            com.bytedance.sdk.component.bvs.nps npsVar3 = this.nqi;
            npsVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.iqz.zmn(npsVar3.getWebView(), BuildConfig.VERSION_CODE));
            this.nqi.setMixedContentMode(0);
            this.nqi.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (iqz.this.ww != null) {
                        iqz.this.ww.fs(i2);
                    }
                }
            });
            this.nqi.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$16;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                    return safedk_iqz$16_onTouch_c2e08a8e2ffc1171e0a97c8b146ce240(view, motionEvent);
                }

                public boolean safedk_iqz$16_onTouch_c2e08a8e2ffc1171e0a97c8b146ce240(View p0, MotionEvent p1) {
                    if (iqz.this.bvs()) {
                        int action = p1.getAction();
                        if (action == 0) {
                            iqz.this.ve = p1.getY();
                        } else if (action == 1) {
                            if (jy.zmn(iqz.this.ve, p1.getY(), iqz.this.so)) {
                                iqz.this.fs(5);
                            }
                        } else if (action == 2) {
                            p1.setAction(3);
                        }
                    }
                    if (iqz.this.mpi && p1.getAction() == 1 && iqz.this.tf != null) {
                        iqz.this.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                iqz.this.tf.yo();
                            }
                        });
                    }
                    if ((!iqz.this.vlj || iqz.rc(iqz.this.nps)) && !iqz.zg(iqz.this.nps)) {
                        iqz.this.rt.onTouch(p0, p1);
                    }
                    if ((!iqz.this.vlj || iqz.rc(iqz.this.nps)) && !iqz.zg(iqz.this.nps) && p1.getAction() == 1 && iqz.this.rt.hhw()) {
                        View p02 = iqz.this.nqi.getWebView();
                        p02.performClick();
                        iqz.this.vlj = true;
                    }
                    if (iqz.this.ww != null) {
                        iqz.this.ww.zmn(p1);
                    }
                    if (iqz.this.bxw != null) {
                        iqz.this.bxw.zmn(p1);
                    }
                    if (iqz.this.skn == null) {
                        return false;
                    }
                    iqz.this.skn.zmn();
                    return false;
                }
            });
            this.nqi.getWebView().setOnClickListener(this.rt);
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.nps, this.ev, this.mhu);
            if (!this.nqi.k_()) {
                com.bytedance.sdk.component.utils.iqz.zmn("LandingPageModel", "loadUrlWithRefer url  = " + this.nps.pl());
                com.bytedance.sdk.openadsdk.utils.nqi.zmn(this.nqi, this.nps.pl());
            }
            this.oub = true;
        }
        com.bytedance.sdk.component.bvs.nps npsVar4 = this.nqi;
        if (npsVar4 == null || this.bjh == null || npsVar4.zn()) {
            return;
        }
        this.bjh.zmn();
    }

    public static class fs implements com.bytedance.sdk.openadsdk.fb.klz {
        private final WeakReference<iqz> fb;
        private final nqi fs;
        private final int zmn;
        private final String zn;

        public fs(int i, nqi nqiVar, String str, iqz iqzVar) {
            this.zmn = i;
            this.fs = nqiVar;
            this.zn = str;
            this.fb = new WeakReference<>(iqzVar);
        }

        @Override // com.bytedance.sdk.openadsdk.fb.klz
        public void zmn(int i) {
            iqz iqzVar = this.fb.get();
            if (iqzVar != null) {
                zn.zmn.zmn(this.zmn, iqzVar.kra, iqzVar.uqd, iqzVar.gn - iqzVar.uqd, this.fs, this.zn, i);
            }
        }
    }

    private void klz() {
        fkt fktVar = new fkt(this.so);
        this.doe = fktVar;
        fktVar.zmn(this.tf);
        this.doe.fs(this.nqi).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(this.nps)).zn(this.nps.ji()).fb(this.nps.ze()).zmn(this.nps).fs(zg(this.nps) ? this.hgd : -1).zmn(this.nps.mig()).fs(this.ev).btk(this.nps.gor()).zmn(this.nqi).zmn(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.btk
            public void zmn() {
                if (!iqz.zg(iqz.this.nps) || !(iqz.this.so instanceof com.bytedance.sdk.openadsdk.core.cn.fb.fs)) {
                    if (iqz.this.yof != null) {
                        iqz.this.yof.zn();
                        return;
                    }
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.cn.fb.fs) iqz.this.so).tf();
            }
        });
    }

    public static boolean zmn(nqi nqiVar) {
        if (nqiVar == null || klz(nqiVar) || nps(nqiVar) || hhw(nqiVar)) {
            return false;
        }
        return fb(nqiVar) || fs(nqiVar) || zg(nqiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mw() {
        this.yj.get();
        this.jy.get();
        if (this.yj.get() || this.jy.get()) {
            return;
        }
        this.yj.set(true);
        zmn(0);
        long elapsedRealtime = this.rje == -1 ? 0L : SystemClock.elapsedRealtime() - this.rje;
        if (zn(this.nps)) {
            com.bytedance.sdk.openadsdk.fb.zn.zn(this.nps, this.ev, elapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.nps, this.ev, System.currentTimeMillis() - this.am, true);
        rt();
    }

    private void rt() {
        this.hhw.setVisibility(8);
        if (fb(this.nps) || zg(this.nps) || !fb() || zn(this.nps)) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.rc = ofFloat;
        ofFloat.setDuration(100L);
        this.rc.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iqz.this.uqh.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                iqz.this.zmn((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                iqz.this.uqh.setLayoutParams(layoutParams);
            }
        });
        this.rc.start();
    }

    public void zmn(int i) {
        com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar = this.tf;
        if (fsVar != null) {
            fsVar.btk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void cn() {
        LinearLayout.LayoutParams layoutParams;
        if (this.yj.get()) {
            return;
        }
        cyb();
        this.jy.set(true);
        zmn(-1);
        this.tf.klz();
        com.bytedance.sdk.openadsdk.common.klz klzVar = this.bjh;
        if (klzVar != null) {
            klzVar.fs();
        }
        if (zg(this.nps)) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), this.nps, this.ev, "show_agg_backup");
            View view = this.olo;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.olo.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.olo.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.hhw;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$2;->onClick(Landroid/view/View;)V");
                            CreativeInfoManager.onViewClicked(h.u, view2);
                            safedk_iqz$2_onClick_5197dc8c3987cfa1bf4ec8cae83f2a11(view2);
                        }

                        public void safedk_iqz$2_onClick_5197dc8c3987cfa1bf4ec8cae83f2a11(View p0) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.cyb.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.cyb.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.cyb.setLayoutParams(layoutParams3);
        if (this.nps.uaq() != null && !TextUtils.isEmpty(this.nps.uaq().zmn())) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.nps.uaq().zmn(), this.nps.uaq().fs(), this.nps.uaq().zn(), this.iqz, this.nps);
        }
        this.kgc.setText(this.nps.dey());
        this.kw.setText(this.nps.pf());
        if (this.phc != null) {
            fs();
            this.phc.setClickable(true);
            this.phc.setOnClickListener(this.mw);
            this.phc.setOnTouchListener(this.mw);
        }
        if (!zn(this.nps) || (layoutParams = this.lbc) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            fb(8);
        } else {
            fb(0);
        }
    }

    private void cyb() {
        if ((fb(this.nps) || zg(this.nps)) && (this.so instanceof com.bytedance.sdk.openadsdk.core.cn.fb.fs)) {
            this.tf.lt();
            this.tf.olo();
        }
    }

    protected void fs() {
        nqi nqiVar = this.nps;
        if (nqiVar == null || TextUtils.isEmpty(nqiVar.gt())) {
            return;
        }
        this.phc.setText(this.nps.gt());
    }

    private void olo() {
        com.bytedance.sdk.openadsdk.common.rc loadingStyle;
        com.bytedance.sdk.openadsdk.common.klz klzVar = this.bjh;
        if (klzVar != null && (loadingStyle = klzVar.getLoadingStyle()) != null) {
            this.lt = loadingStyle.fs();
            this.f3742io = loadingStyle.zn();
        }
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.tet;
        if (fbVar != null) {
            fbVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_iqz$3_onClick_3ab50f724b6a658d6fb5cad909493497(view);
                }

                public void safedk_iqz$3_onClick_3ab50f724b6a658d6fb5cad909493497(View p0) {
                    View p02 = iqz.this.tet;
                    if (p02.getTag() != null) {
                        View p03 = iqz.this.tet;
                        if (!p03.getTag().equals(1)) {
                            View p04 = iqz.this.tet;
                            if (p04.getTag().equals(2)) {
                                iqz.this.fs(4);
                                return;
                            }
                            return;
                        }
                        iqz.this.fs(3);
                    }
                }
            });
        }
    }

    public void zn() {
        if (kw()) {
            try {
                String iv = this.nps.mrt().iv();
                com.bytedance.sdk.openadsdk.iv.fb.zmn().zmn(iv).zmn(this.nps.mrt().zn()).fs(this.nps.mrt().fs()).btk(jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fb(jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn())).zn(2).zmn(new zmn()).zmn(new com.bytedance.sdk.openadsdk.iv.fs(this.nps, iv, new com.bytedance.sdk.component.btk.cyb() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.4
                    @Override // com.bytedance.sdk.component.btk.cyb
                    public void zmn(int i, String str, @Nullable Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.btk.cyb
                    public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
                        try {
                            Object fs2 = rcVar.fs();
                            if (fs2 != null && rcVar.zn() != null) {
                                BitmapDrawable bitmapDrawable = fs2 instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.kgc.zmn().getResources(), (Bitmap) fs2) : null;
                                View cyb = iqz.this.tf.cyb();
                                if (bitmapDrawable == null || cyb == null || !(cyb.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) cyb.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.iqz.zn("LandingPageModel", th.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    private void kgc() {
        if (fb()) {
            this.rp.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.kjb, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.bvs = duration;
            duration.setRepeatMode(2);
            this.bvs.setRepeatCount(-1);
            this.bvs.start();
            this.rp.setClickable(true);
            this.rp.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$5;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                    return safedk_iqz$5_onTouch_10b940e53ce22f07a1e11752c0f8adf2(view, motionEvent);
                }

                public boolean safedk_iqz$5_onTouch_10b940e53ce22f07a1e11752c0f8adf2(View p0, MotionEvent p1) {
                    if (!iqz.this.vlj) {
                        iqz.this.rt.onTouch(p0, p1);
                    }
                    if (p1.getAction() != 3 && p1.getAction() != 1) {
                        return false;
                    }
                    iqz.this.iv = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    iqz.this.iv.setDuration(200L);
                    iqz.this.iv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iqz.this.uqh.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            iqz.this.zmn((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            iqz.this.uqh.setLayoutParams(layoutParams);
                        }
                    });
                    if (iqz.this.rt.hhw()) {
                        View p02 = iqz.this.rp;
                        p02.performClick();
                        iqz.this.vlj = true;
                    }
                    iqz.this.iv.start();
                    View p03 = iqz.this.rp;
                    p03.setVisibility(8);
                    return true;
                }
            });
            this.rp.setOnClickListener(this.rt);
        }
        if (!kw()) {
            this.zg.setVisibility(8);
            this.fs.setVisibility(0);
            this.zmn.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.zmn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/iqz$6;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_iqz$6_onClick_1527e54029d0e33f88986d9292eb8d43(view);
                }

                public void safedk_iqz$6_onClick_1527e54029d0e33f88986d9292eb8d43(View p0) {
                    iqz iqzVar = iqz.this;
                    com.bytedance.sdk.openadsdk.fb.zn.fs(iqzVar.nps, iqzVar.ev);
                }
            });
            nqi nqiVar = this.nps;
            if (nqiVar != null && nqiVar.tj() != null && this.nps.tj().size() > 0 && this.nps.tj().get(0) != null && !TextUtils.isEmpty(this.nps.tj().get(0).zmn())) {
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.nps.tj().get(0), this.zmn, this.nps, new com.bytedance.sdk.component.btk.cyb() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.7
                    @Override // com.bytedance.sdk.component.btk.cyb
                    public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
                        if (iqz.this.cn != null) {
                            iqz.this.cn.removeMessages(101);
                        }
                    }

                    @Override // com.bytedance.sdk.component.btk.cyb
                    public void zmn(int i, String str, @Nullable Throwable th) {
                        if (iqz.this.cn != null) {
                            iqz.this.cn.removeMessages(101);
                        }
                        iqz.this.iv();
                    }
                });
            }
        }
        try {
            String zmn2 = this.nps.tj().get(0).zmn();
            com.bytedance.sdk.openadsdk.iv.fb.zmn().zmn(zmn2).zmn(this.nps.tj().get(0).fs()).fs(this.nps.tj().get(0).zn()).btk(jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fb(jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn())).zn(1).zmn(new zmn()).zmn(new com.bytedance.sdk.openadsdk.iv.fs(this.nps, zmn2, new com.bytedance.sdk.component.btk.cyb() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.8
                @Override // com.bytedance.sdk.component.btk.cyb
                public void zmn(int i, String str, @Nullable Throwable th) {
                }

                @Override // com.bytedance.sdk.component.btk.cyb
                public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
                    Drawable drawable;
                    try {
                        Object fs2 = rcVar.fs();
                        if (fs2 != null && rcVar.zn() != null) {
                            if (fs2 instanceof Bitmap) {
                                drawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.kgc.zmn().getResources(), (Bitmap) fs2);
                            } else if (fs2 instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fs2)) {
                                    zn$$ExternalSyntheticApiModelOutline0.m(fs2).start();
                                }
                                drawable = (Drawable) fs2;
                            } else {
                                drawable = null;
                            }
                            if (!iqz.this.kw()) {
                                iqz.this.fs.setBackground(drawable);
                                return;
                            }
                            iqz.this.fb.setBackground(drawable);
                            View cyb = iqz.this.tf.cyb();
                            if (cyb == null || !(cyb.getParent() instanceof View)) {
                                return;
                            }
                            ((View) cyb.getParent()).setBackground(drawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    private static class zmn implements com.bytedance.sdk.component.btk.zg {
        @Override // com.bytedance.sdk.component.btk.zg
        public Bitmap zmn(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.fb.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), bitmap, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kw() {
        return nqi.btk(this.nps);
    }

    public boolean fb() {
        return this.nps.zq() == 15 || this.nps.zq() == 16;
    }

    public void zmn(float f) {
        try {
            this.tf.cn();
        } catch (Throwable unused) {
        }
    }

    public static boolean fs(nqi nqiVar) {
        return nqiVar != null && nqiVar.va() == 3 && nqiVar.cd() == 6 && !am.fs(nqiVar) && nqiVar.ol() == 1 && (nqiVar.fu() == 0.0f || nqiVar.fu() == 100.0f);
    }

    public static boolean zn(nqi nqiVar) {
        return nqiVar != null && nqiVar.va() == 3 && nqiVar.lt() == 38 && nqiVar.ol() == 1;
    }

    public static boolean fb(nqi nqiVar) {
        if (nqiVar == null) {
            return false;
        }
        if (klz(nqiVar)) {
            return true;
        }
        return nqiVar.va() == 3 && (btk(nqiVar) || hhw(nqiVar)) && !am.fs(nqiVar) && (nqiVar.fu() == 0.0f || nqiVar.fu() == 100.0f);
    }

    public static boolean btk(nqi nqiVar) {
        return nqiVar != null && nqiVar.va() == 3 && nqiVar.cd() == 5;
    }

    public static boolean hhw(nqi nqiVar) {
        rp xcf;
        return nqiVar != null && nqiVar.va() == 3 && !am.fs(nqiVar) && (nqiVar.fu() == 0.0f || nqiVar.fu() == 100.0f) && (xcf = nqiVar.xcf()) != null && xcf.zmn() == 1;
    }

    public static boolean nps(nqi nqiVar) {
        rp xcf;
        return (nqiVar == null || (xcf = nqiVar.xcf()) == null || xcf.zmn() != 2) ? false : true;
    }

    public static boolean zg(nqi nqiVar) {
        return nqiVar != null && nqiVar.cd() == 33;
    }

    public static boolean bvs(nqi nqiVar) {
        return fb(nqiVar) && !klz(nqiVar);
    }

    public static boolean iv(nqi nqiVar) {
        return (nqiVar == null || nqiVar.efd() == 1 || !rc(nqiVar)) ? false : true;
    }

    public static boolean rc(nqi nqiVar) {
        if (nqiVar != null) {
            return nqiVar.cd() == 19 || nqiVar.cd() == 20;
        }
        return false;
    }

    public static boolean klz(nqi nqiVar) {
        return nqiVar != null && nqiVar.cd() == 19;
    }

    public static boolean mw(nqi nqiVar) {
        return nqiVar != null && nqiVar.cd() == 8 && nqiVar.io() == 1;
    }

    public static boolean rt(nqi nqiVar) {
        if (nqiVar != null) {
            return hhw(nqiVar) || nps(nqiVar);
        }
        return false;
    }

    public void btk() {
        FrameLayout frameLayout = this.uqh;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.zak;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public void hhw() {
        com.bytedance.sdk.component.bvs.nps npsVar;
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.ww;
        if (mwVar != null && (npsVar = this.nqi) != null) {
            mwVar.zmn(npsVar);
        }
        Handler handler = this.cn;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.nkt;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.nkt.cancel();
        }
        ValueAnimator valueAnimator2 = this.iv;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.iv.cancel();
        }
        ObjectAnimator objectAnimator = this.rc;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.rc.cancel();
        }
        com.bytedance.sdk.openadsdk.common.klz klzVar = this.bjh;
        if (klzVar != null) {
            klzVar.fs();
        }
        ObjectAnimator objectAnimator2 = this.bvs;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.bvs.nps npsVar2 = this.nqi;
        if (npsVar2 != null) {
            com.bytedance.sdk.openadsdk.core.oub.zmn(npsVar2.getWebView());
        }
        this.nqi = null;
        fkt fktVar = this.doe;
        if (fktVar != null) {
            fktVar.klz();
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar2 = this.ww;
        if (mwVar2 != null) {
            mwVar2.fb(true);
        }
        com.bytedance.sdk.openadsdk.rt.fb fbVar = this.skn;
        if (fbVar != null) {
            fbVar.zn();
        }
        if (!TextUtils.isEmpty(this.dgt) && this.oub) {
            zn.zmn.zmn(this.uqd, this.gn, this.nps);
        }
        com.bytedance.sdk.openadsdk.nps.fs.zmn().zmn(this.cud);
    }

    public void nps() {
        fkt fktVar = this.doe;
        if (fktVar != null) {
            fktVar.rc();
        }
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.ww;
        if (mwVar != null) {
            mwVar.nps();
        }
    }

    public void zg() {
        com.bytedance.sdk.openadsdk.fb.mw mwVar = this.ww;
        if (mwVar != null) {
            mwVar.zg();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        long fb;
        nqi nqiVar;
        nqi nqiVar2;
        int i = message.what;
        if (i == 100) {
            int i2 = message.arg1;
            if (fb(this.nps) && (nqiVar2 = this.nps) != null && nqiVar2.uqh() != null) {
                fb = this.nps.uqh().fs();
            } else {
                fb = (!zg(this.nps) || (nqiVar = this.nps) == null || nqiVar.uqh() == null) ? 20L : this.nps.uqh().fb();
            }
            zn.zmn zmnVar = this.klz;
            if (zmnVar != null) {
                zmnVar.zmn(i2 * 1000, fb * 1000);
            }
            long j = i2;
            if (j >= fb) {
                zn.zmn zmnVar2 = this.klz;
                if (zmnVar2 != null) {
                    zmnVar2.zmn(fb * 1000, 100);
                }
            } else if (j < fb && this.cn != null) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i2 + 1;
                this.cn.sendMessageDelayed(obtain, 1000L);
            }
        } else if (i == 101) {
            iv();
        }
        return true;
    }

    public void zmn(@NonNull com.bytedance.sdk.openadsdk.core.iv.phc phcVar, FrameLayout frameLayout) {
        this.yo = phcVar;
        this.xrr = frameLayout;
    }

    public boolean bvs() {
        AtomicBoolean atomicBoolean;
        return (!zn(this.nps) || (atomicBoolean = this.cd) == null || atomicBoolean.get()) ? false : true;
    }

    public void fs(int i) {
        com.bytedance.sdk.openadsdk.core.iv.phc phcVar = this.yo;
        if (phcVar != null) {
            phcVar.btk(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(final int i, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        float f;
        int hhw;
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.fb.mw mwVar;
        if (i == 3 || zn(i)) {
            if (this.xrr == null || rtVar == null) {
                return;
            }
            AtomicBoolean atomicBoolean = this.cd;
            if (atomicBoolean != null) {
                if (i == 1) {
                    return;
                }
                if (i == 5 && atomicBoolean.get()) {
                    return;
                }
            }
            final LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.zak.getLayoutParams();
            this.lbc = (LinearLayout.LayoutParams) this.uqh.getLayoutParams();
            final float f2 = layoutParams2.weight;
            kw rp = this.nps.rp();
            if (!zn(i)) {
                if (rp != null) {
                    hhw = rp.hhw();
                    f = hhw;
                    final float f3 = f;
                    layoutParams = (FrameLayout.LayoutParams) this.xrr.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    final FrameLayout.LayoutParams layoutParams3 = layoutParams;
                    final int i2 = layoutParams3.height;
                    final int i3 = layoutParams3.width;
                    final int i4 = layoutParams3.leftMargin;
                    final int i5 = layoutParams3.topMargin;
                    final int fs2 = jy.fs(this.so, (float) rtVar.nps());
                    final int fs3 = jy.fs(this.so, (float) rtVar.zg());
                    final int fs4 = jy.fs(this.so, (float) rtVar.btk());
                    final int fs5 = jy.fs(this.so, (float) rtVar.hhw());
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.iv = ofFloat;
                    ofFloat.setDuration(500L);
                    this.iv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.9
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                            float f4 = f2;
                            layoutParams4.weight = f4 + ((f3 - f4) * floatValue);
                            iqz.this.lbc.weight = 100.0f - layoutParams2.weight;
                            if (iqz.this.zak != null) {
                                iqz.this.zak.setLayoutParams(layoutParams2);
                            }
                            if (iqz.this.uqh != null) {
                                iqz.this.uqh.setLayoutParams(iqz.this.lbc);
                            }
                            if (iqz.this.lbc.weight < 30.0f) {
                                iqz.this.fb(8);
                            } else {
                                iqz.this.fb(0);
                            }
                            FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                            layoutParams5.width = i3 + ((int) ((fs2 - r2) * floatValue));
                            layoutParams5.height = i2 + ((int) ((fs3 - r2) * floatValue));
                            layoutParams5.leftMargin = i4 + ((int) ((fs4 - r2) * floatValue));
                            layoutParams5.topMargin = i5 + ((int) ((fs5 - r2) * floatValue));
                            if (iqz.this.xrr != null) {
                                iqz.this.xrr.setLayoutParams(layoutParams3);
                            }
                            iqz.this.zmn(0.0f);
                            if (floatValue == 1.0f) {
                                if (iqz.this.tet != null) {
                                    jy.zmn((View) iqz.this.tet, 0);
                                    if (iqz.this.zn(i)) {
                                        iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_down"));
                                        iqz.this.tet.setTag(1);
                                    } else {
                                        iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_up"));
                                        iqz.this.tet.setTag(2);
                                    }
                                }
                                if (iqz.this.cd == null) {
                                    iqz.this.cd = new AtomicBoolean();
                                }
                                iqz.this.cd.set(iqz.this.zn(i));
                            }
                        }
                    });
                    com.bytedance.sdk.openadsdk.fb.zn.fb(this.nps, this.ev, i);
                    this.iv.start();
                    if (this.hwg.compareAndSet(false, true)) {
                    }
                    mwVar = this.ww;
                    if (mwVar != null) {
                    }
                    jy.zmn((View) this.tet, 8);
                }
                f = 70.0f;
                final float f32 = f;
                layoutParams = (FrameLayout.LayoutParams) this.xrr.getLayoutParams();
                if (layoutParams == null) {
                }
                final FrameLayout.LayoutParams layoutParams32 = layoutParams;
                final int i22 = layoutParams32.height;
                final int i32 = layoutParams32.width;
                final int i42 = layoutParams32.leftMargin;
                final int i52 = layoutParams32.topMargin;
                final int fs22 = jy.fs(this.so, (float) rtVar.nps());
                final int fs32 = jy.fs(this.so, (float) rtVar.zg());
                final int fs42 = jy.fs(this.so, (float) rtVar.btk());
                final int fs52 = jy.fs(this.so, (float) rtVar.hhw());
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.iv = ofFloat2;
                ofFloat2.setDuration(500L);
                this.iv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                        float f4 = f2;
                        layoutParams4.weight = f4 + ((f32 - f4) * floatValue);
                        iqz.this.lbc.weight = 100.0f - layoutParams2.weight;
                        if (iqz.this.zak != null) {
                            iqz.this.zak.setLayoutParams(layoutParams2);
                        }
                        if (iqz.this.uqh != null) {
                            iqz.this.uqh.setLayoutParams(iqz.this.lbc);
                        }
                        if (iqz.this.lbc.weight < 30.0f) {
                            iqz.this.fb(8);
                        } else {
                            iqz.this.fb(0);
                        }
                        FrameLayout.LayoutParams layoutParams5 = layoutParams32;
                        layoutParams5.width = i32 + ((int) ((fs22 - r2) * floatValue));
                        layoutParams5.height = i22 + ((int) ((fs32 - r2) * floatValue));
                        layoutParams5.leftMargin = i42 + ((int) ((fs42 - r2) * floatValue));
                        layoutParams5.topMargin = i52 + ((int) ((fs52 - r2) * floatValue));
                        if (iqz.this.xrr != null) {
                            iqz.this.xrr.setLayoutParams(layoutParams32);
                        }
                        iqz.this.zmn(0.0f);
                        if (floatValue == 1.0f) {
                            if (iqz.this.tet != null) {
                                jy.zmn((View) iqz.this.tet, 0);
                                if (iqz.this.zn(i)) {
                                    iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_down"));
                                    iqz.this.tet.setTag(1);
                                } else {
                                    iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_up"));
                                    iqz.this.tet.setTag(2);
                                }
                            }
                            if (iqz.this.cd == null) {
                                iqz.this.cd = new AtomicBoolean();
                            }
                            iqz.this.cd.set(iqz.this.zn(i));
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.fb.zn.fb(this.nps, this.ev, i);
                this.iv.start();
                if (this.hwg.compareAndSet(false, true)) {
                }
                mwVar = this.ww;
                if (mwVar != null) {
                }
                jy.zmn((View) this.tet, 8);
            }
            if (rp != null) {
                hhw = rp.btk();
                f = hhw;
                final float f322 = f;
                layoutParams = (FrameLayout.LayoutParams) this.xrr.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                }
                final FrameLayout.LayoutParams layoutParams322 = layoutParams;
                final int i222 = layoutParams322.height;
                final int i322 = layoutParams322.width;
                final int i422 = layoutParams322.leftMargin;
                final int i522 = layoutParams322.topMargin;
                final int fs222 = jy.fs(this.so, (float) rtVar.nps());
                final int fs322 = jy.fs(this.so, (float) rtVar.zg());
                final int fs422 = jy.fs(this.so, (float) rtVar.btk());
                final int fs522 = jy.fs(this.so, (float) rtVar.hhw());
                ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.iv = ofFloat22;
                ofFloat22.setDuration(500L);
                this.iv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                        float f4 = f2;
                        layoutParams4.weight = f4 + ((f322 - f4) * floatValue);
                        iqz.this.lbc.weight = 100.0f - layoutParams2.weight;
                        if (iqz.this.zak != null) {
                            iqz.this.zak.setLayoutParams(layoutParams2);
                        }
                        if (iqz.this.uqh != null) {
                            iqz.this.uqh.setLayoutParams(iqz.this.lbc);
                        }
                        if (iqz.this.lbc.weight < 30.0f) {
                            iqz.this.fb(8);
                        } else {
                            iqz.this.fb(0);
                        }
                        FrameLayout.LayoutParams layoutParams5 = layoutParams322;
                        layoutParams5.width = i322 + ((int) ((fs222 - r2) * floatValue));
                        layoutParams5.height = i222 + ((int) ((fs322 - r2) * floatValue));
                        layoutParams5.leftMargin = i422 + ((int) ((fs422 - r2) * floatValue));
                        layoutParams5.topMargin = i522 + ((int) ((fs522 - r2) * floatValue));
                        if (iqz.this.xrr != null) {
                            iqz.this.xrr.setLayoutParams(layoutParams322);
                        }
                        iqz.this.zmn(0.0f);
                        if (floatValue == 1.0f) {
                            if (iqz.this.tet != null) {
                                jy.zmn((View) iqz.this.tet, 0);
                                if (iqz.this.zn(i)) {
                                    iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_down"));
                                    iqz.this.tet.setTag(1);
                                } else {
                                    iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_up"));
                                    iqz.this.tet.setTag(2);
                                }
                            }
                            if (iqz.this.cd == null) {
                                iqz.this.cd = new AtomicBoolean();
                            }
                            iqz.this.cd.set(iqz.this.zn(i));
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.fb.zn.fb(this.nps, this.ev, i);
                this.iv.start();
                if (this.hwg.compareAndSet(false, true)) {
                    this.rje = SystemClock.elapsedRealtime();
                }
                mwVar = this.ww;
                if (mwVar != null) {
                    mwVar.zmn(true, SystemClock.elapsedRealtime());
                }
                jy.zmn((View) this.tet, 8);
            }
            f = 30.0f;
            final float f3222 = f;
            layoutParams = (FrameLayout.LayoutParams) this.xrr.getLayoutParams();
            if (layoutParams == null) {
            }
            final FrameLayout.LayoutParams layoutParams3222 = layoutParams;
            final int i2222 = layoutParams3222.height;
            final int i3222 = layoutParams3222.width;
            final int i4222 = layoutParams3222.leftMargin;
            final int i5222 = layoutParams3222.topMargin;
            final int fs2222 = jy.fs(this.so, (float) rtVar.nps());
            final int fs3222 = jy.fs(this.so, (float) rtVar.zg());
            final int fs4222 = jy.fs(this.so, (float) rtVar.btk());
            final int fs5222 = jy.fs(this.so, (float) rtVar.hhw());
            ValueAnimator ofFloat222 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.iv = ofFloat222;
            ofFloat222.setDuration(500L);
            this.iv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LinearLayout.LayoutParams layoutParams4 = layoutParams2;
                    float f4 = f2;
                    layoutParams4.weight = f4 + ((f3222 - f4) * floatValue);
                    iqz.this.lbc.weight = 100.0f - layoutParams2.weight;
                    if (iqz.this.zak != null) {
                        iqz.this.zak.setLayoutParams(layoutParams2);
                    }
                    if (iqz.this.uqh != null) {
                        iqz.this.uqh.setLayoutParams(iqz.this.lbc);
                    }
                    if (iqz.this.lbc.weight < 30.0f) {
                        iqz.this.fb(8);
                    } else {
                        iqz.this.fb(0);
                    }
                    FrameLayout.LayoutParams layoutParams5 = layoutParams3222;
                    layoutParams5.width = i3222 + ((int) ((fs2222 - r2) * floatValue));
                    layoutParams5.height = i2222 + ((int) ((fs3222 - r2) * floatValue));
                    layoutParams5.leftMargin = i4222 + ((int) ((fs4222 - r2) * floatValue));
                    layoutParams5.topMargin = i5222 + ((int) ((fs5222 - r2) * floatValue));
                    if (iqz.this.xrr != null) {
                        iqz.this.xrr.setLayoutParams(layoutParams3222);
                    }
                    iqz.this.zmn(0.0f);
                    if (floatValue == 1.0f) {
                        if (iqz.this.tet != null) {
                            jy.zmn((View) iqz.this.tet, 0);
                            if (iqz.this.zn(i)) {
                                iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_down"));
                                iqz.this.tet.setTag(1);
                            } else {
                                iqz.this.tet.setImageDrawable(com.bytedance.sdk.component.utils.doe.zn(iqz.this.so, "tt_ad_zoom_up"));
                                iqz.this.tet.setTag(2);
                            }
                        }
                        if (iqz.this.cd == null) {
                            iqz.this.cd = new AtomicBoolean();
                        }
                        iqz.this.cd.set(iqz.this.zn(i));
                    }
                }
            });
            com.bytedance.sdk.openadsdk.fb.zn.fb(this.nps, this.ev, i);
            this.iv.start();
            if (this.hwg.compareAndSet(false, true)) {
            }
            mwVar = this.ww;
            if (mwVar != null) {
            }
            jy.zmn((View) this.tet, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb(int i) {
        jy.zmn((View) this.lt, i);
        jy.zmn((View) this.f3742io, i);
        if (this.jy.get()) {
            jy.zmn((View) this.kgc, i);
            jy.zmn((View) this.kw, i);
            jy.zmn((View) this.iqz, i);
            jy.zmn((View) this.phc, 0);
        }
    }

    private void iqz() {
        com.bytedance.sdk.component.bvs.nps npsVar = this.nqi;
        if (npsVar == null || npsVar.getWebView() == null) {
            return;
        }
        this.gn = this.nqi.zmn;
        this.uqd = this.nqi.fs;
        this.kra = this.nqi.zn;
        if (this.nqi.fs()) {
            this.tf.lt();
            this.am = System.currentTimeMillis();
        }
        if (this.nqi.fb()) {
            mw();
        }
        if (this.nqi.zn()) {
            mw();
            int zmn2 = oub.zmn(this.nqi.getWebView());
            fs fsVar = this.zi;
            if (fsVar != null) {
                fsVar.zmn(zmn2 != 1 ? 0 : 1);
            }
        }
    }

    public void iv() {
        if ("landingpage_split_screen".equals(this.ev) && com.bytedance.sdk.openadsdk.uqh.btk.zmn("default_split_style", false) && this.oep.compareAndSet(false, true)) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.10
                @Override // java.lang.Runnable
                public void run() {
                    iqz.this.nkt = ValueAnimator.ofFloat(1.0f, 0.0f);
                    iqz.this.nkt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.iqz.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (iqz.this.zak != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iqz.this.zak.getLayoutParams();
                                layoutParams.weight = floatValue;
                                iqz.this.zak.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    iqz.this.nkt.setDuration(500L);
                    iqz.this.nkt.start();
                    if (iqz.this.rp != null) {
                        iqz.this.rp.setVisibility(8);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.tdm < 100) {
            return false;
        }
        this.tdm = currentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
