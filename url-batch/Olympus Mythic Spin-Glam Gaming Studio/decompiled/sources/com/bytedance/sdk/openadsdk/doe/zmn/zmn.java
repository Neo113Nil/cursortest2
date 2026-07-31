package com.bytedance.sdk.openadsdk.doe.zmn;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.zmn.cn;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.bvs;
import com.bytedance.sdk.openadsdk.core.widget.iv;
import com.bytedance.sdk.openadsdk.core.widget.zmn.hhw;
import com.bytedance.sdk.openadsdk.doe.btk;
import com.bytedance.sdk.openadsdk.doe.nps;
import com.bytedance.sdk.openadsdk.doe.zg;
import com.bytedance.sdk.openadsdk.fb.kw;
import com.bytedance.sdk.openadsdk.mw.nps;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zmn {
    private StringBuilder bjh;
    private final FrameLayout btk;
    private final String bvs;
    private int cn;
    private AtomicBoolean cyb;
    private int doe;
    private final int fb;
    private final Context fs;

    @Nullable
    private iv hhw;
    private fs iqz;
    private zg iv;
    private bvs kgc;
    private boolean klz;
    private com.bytedance.sdk.openadsdk.core.zn.zmn kw;
    private volatile boolean mw;
    private fkt nps;
    private int nqi;
    private AtomicBoolean olo;
    private boolean phc;

    @Nullable
    private nps rc;
    private InterfaceC0188zmn rp;
    private volatile boolean rt;
    private long uqh;
    private String zg;
    protected com.bytedance.sdk.component.bvs.nps zmn;
    private final nqi zn;

    public interface fs {
        void zmn();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.doe.zmn.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0188zmn {
        void zmn(int i);
    }

    public zmn(Context context, nqi nqiVar, int i, boolean z, FrameLayout frameLayout) {
        this(context, nqiVar, i, z, frameLayout, false);
    }

    public zmn(Context context, nqi nqiVar, int i, boolean z, FrameLayout frameLayout, boolean z2) {
        this(context, nqiVar, i, z, frameLayout, z2, 0);
    }

    public zmn(Context context, nqi nqiVar, int i, boolean z, FrameLayout frameLayout, boolean z2, int i2) {
        this.klz = true;
        this.cyb = new AtomicBoolean(false);
        this.olo = new AtomicBoolean(false);
        this.nqi = 0;
        this.uqh = 0L;
        this.fs = context;
        this.zn = nqiVar;
        this.doe = i2;
        if (nqiVar != null && nqiVar.fb() != null && nqiVar.fb().btk() != null) {
            this.nqi = nqiVar.fb().btk().size();
        }
        this.fb = i;
        String zn = oub.zn(nqiVar.utx().getDurationSlotType());
        this.zg = zn;
        int zmn = oub.zmn(zn);
        this.phc = z2;
        if (z2) {
            this.zg = oub.fs(zmn);
        }
        this.bvs = am.klz(nqiVar);
        this.btk = frameLayout;
        zmn(frameLayout);
        zmn(zmn);
        zn(z);
        zg();
    }

    public void zmn(InterfaceC0188zmn interfaceC0188zmn) {
        this.rp = interfaceC0188zmn;
    }

    private void zmn(FrameLayout frameLayout) {
        com.bytedance.sdk.component.bvs.nps npsVar = new com.bytedance.sdk.component.bvs.nps(this.fs, true, nps.zn.PLAYABLE);
        this.zmn = npsVar;
        npsVar.btk();
        this.zmn.setLayerType(2, null);
        this.zmn.setVisibility(4);
        this.zmn.setBackgroundColor(-16777216);
        this.zmn.setEnabled(true);
        this.zmn.setTag(this.zg);
        this.zmn.setMaterialMeta(this.zn.xz());
        this.zmn.setLandingPage(true);
        frameLayout.addView(this.zmn, new FrameLayout.LayoutParams(-1, -1));
        bvs bvsVar = new bvs(this.fs);
        this.kgc = bvsVar;
        bvsVar.zmn(this.zn, this.zg, this.kw, this.phc);
        frameLayout.addView(this.kgc, new FrameLayout.LayoutParams(-1, -1));
        if (this.zn.ry()) {
            iv ivVar = new iv(this.fs);
            this.hhw = ivVar;
            ivVar.fs();
            frameLayout.addView(this.hhw, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void zmn(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 3);
        this.nps = new fkt(this.fs);
        String gor = this.zn.gor();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.zn.dgt());
            jSONObject.put("currentIndex", this.doe);
            jSONObject.put("totalAdCount", this.nqi);
        } catch (JSONException unused) {
        }
        this.nps.fs(this.zmn).zmn(this.zn).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(this.zn, true, jSONObject)).zn(this.zn.ji()).fb(this.zn.ze()).fs(i).btk(gor).zmn(this.zmn).fs(this.zg).zmn(hashMap).zmn(new kw(3, this.zg, this.zn));
    }

    private void zn(boolean z) {
        cn fs2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.zn.ji());
            jSONObject.put("log_extra", this.zn.ze());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.iv.fs().cn()) {
            com.bytedance.sdk.openadsdk.doe.nps.zmn(new nps.zmn() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.1
            });
        }
        zg zmn = zg.zmn(kgc.zmn(), this.zmn.getWebView(), new com.bytedance.sdk.openadsdk.doe.zn() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.2
            @Override // com.bytedance.sdk.openadsdk.doe.zn
            public void zmn(String str, JSONObject jSONObject2) {
                if (zmn.this.nps != null) {
                    zmn.this.nps.zmn(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.doe.zmn() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.3
            @Override // com.bytedance.sdk.openadsdk.doe.zmn
            public com.bytedance.sdk.openadsdk.doe.fb zmn() {
                String zg = com.bytedance.sdk.openadsdk.common.zn.zg();
                zg.hashCode();
                switch (zg) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.doe.fb.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.doe.fb.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.doe.fb.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.doe.fb.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.doe.fb.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.doe.fb.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.doe.zmn
            public void fs() {
                zmn.this.nps.fb(true);
                if (zmn.this.rc != null) {
                    zmn.this.rc.zmn();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.doe.zmn
            public void zn() {
                if (zmn.this.nps.rt() != null) {
                    zmn.this.nps.rt().zmn(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.doe.zmn
            public void zmn(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), zmn.this.zn, zmn.this.zg, "playable_track", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.3.1
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zn() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zmn() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (zmn.this.zn.bl()) {
                                jSONObject3.put("is_pre_render", 1);
                            }
                            return jSONObject3;
                        } catch (JSONException e) {
                            iqz.zn("PlayableManager", e.getMessage());
                            return null;
                        }
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.doe.zmn
            public void zmn(int i, String str) {
                zmn.this.klz = false;
                if (i == 2 || i == 3 || i == 4) {
                    zmn.this.zmn(2, i);
                } else if (i == 5) {
                    zmn.this.zmn(3, i);
                } else {
                    zmn.this.zmn(1, 0);
                }
            }
        });
        this.iv = zmn;
        zmn.nps(this.bvs).btk(com.bytedance.sdk.openadsdk.common.zn.zmn(kgc.zmn())).fs(com.bytedance.sdk.openadsdk.common.zn.nps()).zmn(com.bytedance.sdk.openadsdk.common.zn.zmn()).fb(com.bytedance.sdk.openadsdk.common.zn.hhw()).zn(jSONObject).zn(am.iv(this.zn)).fb(true).zmn(z).zn(false).zmn(am.olo(this.zn)).fs(am.olo(this.zn)).zmn("sdkEdition", com.bytedance.sdk.openadsdk.common.zn.zn()).btk(am.hhw(this.zn)).hhw(this.zg);
        this.iv.zmn(btk.fs(this.fs));
        Set<String> rc = this.iv.rc();
        final WeakReference weakReference = new WeakReference(this.iv);
        for (String str : rc) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (fs2 = this.nps.fs()) != null) {
                fs2.zmn(str, new com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.4
                    @Override // com.bytedance.sdk.component.zmn.fb
                    public JSONObject zmn(String str2, @NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.zmn.btk btkVar) {
                        try {
                            zg zgVar = (zg) weakReference.get();
                            if (zgVar == null) {
                                return null;
                            }
                            return zgVar.fb(zmn(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void zg() {
        hhw hhwVar = new hhw(kgc.zmn(), this.nps, this.zn.ji(), null, true) { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.5
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
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/doe/zmn/zmn$5;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
                BrandSafetyUtils.onWebViewReceivedError(h.u, webView, i, str, str2);
                safedk_zmn$5_onReceivedError_b5a3c079420a39a62c8f896e623e8f66(webView, i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            @RequiresApi
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/doe/zmn/zmn$5;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
                BrandSafetyUtils.onWebViewReceivedError(h.u, webView, webResourceRequest, webResourceError);
                safedk_zmn$5_onReceivedError_3fc1a8bbe5fc7b8a056291798be68753(webView, webResourceRequest, webResourceError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/doe/zmn/zmn$5;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(h.u, webView, str, safedk_zmn$5_shouldInterceptRequest_f979ae6272ab540b1d1b7b2c1540d004(webView, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, shouldOverrideUrlLoading);
                return shouldOverrideUrlLoading;
            }

            public WebResourceResponse safedk_zmn$5_shouldInterceptRequest_f979ae6272ab540b1d1b7b2c1540d004(WebView p0, String p1) {
                try {
                    if (zmn.this.zn.mrt() != null && !TextUtils.isEmpty(zmn.this.zn.mrt().mw())) {
                        if (zmn.this.iv != null) {
                            zmn.this.iv.iv(p1);
                        }
                        String klz = am.klz(zmn.this.zn);
                        WebResourceResponse zmn = com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(zmn.this.zn.mrt().mw(), klz, p1);
                        if (zmn != null) {
                            if (zmn.this.iv != null) {
                                zmn.this.iv.rc(p1);
                            }
                            return zmn;
                        }
                        return super.shouldInterceptRequest(p0, p1);
                    }
                    return super.shouldInterceptRequest(p0, p1);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(p0, p1);
                }
            }

            public void safedk_zmn$5_onReceivedError_b5a3c079420a39a62c8f896e623e8f66(WebView p0, int p1, String p2, String p3) {
                super.onReceivedError(p0, p1, p2, p3);
                zmn.this.klz = false;
                if (zmn.this.iv != null) {
                    zmn.this.iv.hhw(com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(zmn.this.zn));
                    zmn.this.iv.zmn(p1, p2, p3);
                }
            }

            @RequiresApi
            public void safedk_zmn$5_onReceivedError_3fc1a8bbe5fc7b8a056291798be68753(WebView p0, WebResourceRequest p1, WebResourceError p2) {
                super.onReceivedError(p0, p1, p2);
                if (p1.isForMainFrame()) {
                    zmn.this.klz = false;
                    if (zmn.this.iv == null || p2 == null) {
                        return;
                    }
                    zmn.this.iv.hhw(com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(zmn.this.zn));
                    zmn.this.iv.zmn(p2.getErrorCode(), String.valueOf(p2.getDescription()), String.valueOf(p1.getUrl()));
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    zmn.this.klz = false;
                    if (zmn.this.iv != null) {
                        zmn.this.iv.hhw(com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(zmn.this.zn));
                        zmn.this.iv.zmn(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (zmn.this.iv != null) {
                    zmn.this.iv.bvs(str);
                }
                if (zmn.this.klz) {
                    zmn.this.zmn(0, 0);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), zmn.this.zn, zmn.this.zg, "py_loading_success");
                }
            }
        };
        hhwVar.zmn(this.zn);
        this.zmn.setWebViewClient(hhwVar);
        this.zmn.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.nps) { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.btk, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (zmn.this.hhw == null || zmn.this.hhw.getVisibility() != 0) {
                    return;
                }
                zmn.this.hhw.setProgress(i);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(this.fs).zmn(false).fs(false).zmn(this.zmn.getWebView());
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        npsVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.iqz.zmn(npsVar.getWebView(), BuildConfig.VERSION_CODE));
        this.zmn.setMixedContentMode(0);
    }

    public void zmn(boolean z, com.bytedance.sdk.openadsdk.mw.nps npsVar) {
        this.rc = npsVar;
        this.iv.fs(z);
        com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().fs(this.zn);
        this.zmn.a_(this.bvs);
        zg zgVar = this.iv;
        if (zgVar != null) {
            zgVar.hhw(com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(this.zn));
            this.iv.zg(this.bvs);
        }
    }

    public void zmn() {
        iv ivVar;
        final boolean z = true;
        if (this.cyb.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.btk;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.rt && (ivVar = this.hhw) != null) {
            ivVar.fs(this.zn, this.fb);
            zg zgVar = this.iv;
            if (zgVar != null) {
                zgVar.yj();
            }
        } else {
            this.iv.zn(true);
            fkt fktVar = this.nps;
            if (fktVar != null && fktVar.rt() != null) {
                this.nps.rt().btk();
            }
            InterfaceC0188zmn interfaceC0188zmn = this.rp;
            if (interfaceC0188zmn != null) {
                interfaceC0188zmn.zmn(this.cn);
            }
            z = false;
        }
        if (this.iv != null) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), this.zn, this.zg, "playable_track", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.7
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zn() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zmn() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", zmn.this.iv.oub());
                        jSONObject.put("has_loading", z);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.iv.hhw(com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(this.zn));
        }
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar != null) {
            npsVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.8
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (zmn.this.bjh != null) {
                        jSONObject.put("destroy_stack_trace", zmn.this.bjh.toString());
                    }
                    jSONObject.put("destroy_ts", zmn.this.uqh);
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("plb_npe_crash").fs(jSONObject.toString());
                }
            });
        }
    }

    public void zmn(final int i, final int i2) {
        InterfaceC0188zmn interfaceC0188zmn;
        zg zgVar;
        fs fsVar;
        if (this.rt) {
            return;
        }
        this.rt = true;
        this.cn = i;
        if (i == 2) {
            this.mw = true;
            this.iv.zmn(3);
        } else if (i == 1) {
            this.mw = true;
            this.iv.zmn(2);
        } else if (i == 3) {
            this.mw = true;
            this.iv.zmn(4);
        } else if (i == 0) {
            this.iv.zmn(1);
        }
        if (this.mw && (fsVar = this.iqz) != null) {
            fsVar.zmn();
        }
        if (this.cyb.get() && (zgVar = this.iv) != null) {
            zgVar.zn(true);
        }
        fkt fktVar = this.nps;
        if (fktVar != null && fktVar.rt() != null) {
            this.nps.rt().btk();
        }
        if (!this.mw && (interfaceC0188zmn = this.rp) != null) {
            interfaceC0188zmn.zmn(i);
        }
        iv ivVar = this.hhw;
        if (ivVar != null) {
            ivVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.9
                @Override // java.lang.Runnable
                public void run() {
                    if (zmn.this.mw) {
                        zmn.this.kgc.setVisibility(0);
                        if (zmn.this.rp != null) {
                            zmn.this.rp.zmn(i);
                        }
                        zmn.this.zmn(true);
                    }
                    zmn.this.iv.nps(zmn.this.mw);
                    zmn.this.hhw.zn();
                    if (zmn.this.cyb.get()) {
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), zmn.this.zn, zmn.this.zg, "playable_track", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.zmn.9.1
                            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                            public JSONObject zn() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                            public JSONObject zmn() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i);
                                    jSONObject.put("remove_loading_page_reason", i2);
                                    jSONObject.put("playable_url", zmn.this.bvs);
                                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, zmn.this.hhw.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void zmn(boolean z) {
        zg zgVar = this.iv;
        if (zgVar != null) {
            zgVar.zmn(z);
        }
    }

    public void fs() {
        zg zgVar;
        if (!this.cyb.get() || (zgVar = this.iv) == null) {
            return;
        }
        zgVar.zn(true);
    }

    public void zn() {
        zg zgVar;
        if (!this.cyb.get() || (zgVar = this.iv) == null) {
            return;
        }
        zgVar.zn(false);
    }

    public void fb() {
        zg zgVar = this.iv;
        if (zgVar != null) {
            zgVar.hgd();
        }
        com.bytedance.sdk.component.bvs.nps npsVar = this.zmn;
        if (npsVar != null) {
            npsVar.cn();
        }
        fkt fktVar = this.nps;
        if (fktVar != null) {
            fktVar.klz();
        }
        this.uqh = System.currentTimeMillis();
        this.bjh = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb = this.bjh;
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        } catch (Throwable th) {
            iqz.zmn("PlayableManager", "onDestroy() error", th);
        }
        this.zmn = null;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        this.kw = zmnVar;
        iv ivVar = this.hhw;
        if (ivVar != null && ivVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.hhw.zg downloadButton = this.hhw.getDownloadButton();
            downloadButton.setOnClickListener(zmnVar);
            downloadButton.setOnTouchListener(zmnVar);
        }
        bvs bvsVar = this.kgc;
        if (bvsVar != null) {
            bvsVar.setClickListener(zmnVar);
        }
    }

    public boolean btk() {
        return this.mw;
    }

    public void zmn(fs fsVar) {
        this.iqz = fsVar;
    }

    public boolean hhw() {
        fkt fktVar = this.nps;
        if (fktVar != null) {
            return fktVar.hhw();
        }
        return false;
    }

    public void fs(boolean z) {
        zg zgVar = this.iv;
        if (zgVar != null) {
            zgVar.btk(z);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        fkt fktVar = this.nps;
        if (fktVar != null) {
            fktVar.zmn(fsVar);
        }
    }

    public fkt nps() {
        return this.nps;
    }
}
