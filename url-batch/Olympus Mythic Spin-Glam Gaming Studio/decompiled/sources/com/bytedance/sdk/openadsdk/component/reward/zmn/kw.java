package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.oub;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class kw implements com.bytedance.sdk.openadsdk.mw.bvs {
    private boolean btk;
    private final fs bvs;
    private ImageView fb;
    private final nqi fs;
    private com.bytedance.sdk.openadsdk.core.zn.nps hhw;
    private int iv;
    private final AtomicBoolean nps = new AtomicBoolean(false);
    private volatile boolean zg;
    private final Activity zmn;
    private com.bytedance.sdk.component.bvs.nps zn;

    public kw(fs fsVar) {
        this.bvs = fsVar;
        this.fs = fsVar.fs;
        this.zmn = fsVar.nu;
    }

    public void zmn() {
        DeviceUtils.AudioInfoReceiver.zmn(this);
        this.iv = DeviceUtils.nps();
        if (this.fs.bm() != null) {
            this.hhw = new com.bytedance.sdk.openadsdk.core.zn.nps("VAST_END_CARD", this.fs.bm()) { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kw.1
            };
            com.bytedance.sdk.openadsdk.core.rt.zn zn = this.fs.bm().zn();
            if (zn != null) {
                String fb = zn.fb();
                if (!TextUtils.isEmpty(fb)) {
                    this.btk = true;
                    this.fb = (ImageView) this.bvs.hgd.findViewById(com.bytedance.sdk.openadsdk.utils.olo.iv);
                    zmn(zn.zmn(), zn.fs());
                    com.bytedance.sdk.openadsdk.iv.fb.zmn(fb).zmn(zn.zmn()).fs(zn.fs()).btk(jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn())).fb(jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn())).zn(1).zmn(new com.bytedance.sdk.openadsdk.iv.fs(this.fs, fb, new zmn(this.fb, fb, this, this.nps)));
                    return;
                }
                com.bytedance.sdk.component.bvs.nps npsVar = (com.bytedance.sdk.component.bvs.nps) this.bvs.hgd.findViewById(com.bytedance.sdk.openadsdk.utils.olo.rc);
                this.zn = npsVar;
                if (npsVar == null) {
                    return;
                }
                fb();
                String zn2 = zn.zn();
                if (zn2 != null) {
                    this.btk = true;
                    if (zn2.startsWith("http")) {
                        this.zn.a_(zn2);
                        return;
                    }
                    String zmn2 = com.bytedance.sdk.openadsdk.core.rt.btk.zmn(zn2);
                    String str = TextUtils.isEmpty(zmn2) ? zn2 : zmn2;
                    this.zn.setDefaultTextEncodingName("UTF -8");
                    this.zn.zmn(null, str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        zmn(Integer.MAX_VALUE, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final int i, final String str) {
        if (this.zg) {
            return;
        }
        this.zg = true;
        if (i == Integer.MAX_VALUE) {
            nqi nqiVar = this.fs;
            com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, nqiVar.btk(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kw.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.fb.zn.fs(kw.this.fs, kw.this.fs.btk(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void fb() {
        this.zn.btk();
        zmn(this.zn);
        this.zn.setDisplayZoomControls(false);
        this.zn.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kw.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    kw.this.zn();
                }
            }
        });
        this.zn.setWebViewClient(new nps.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.kw.4
            @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(h.u, view, url);
            }

            @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted(h.u, view, url);
            }

            @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
            }

            @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zmn/kw$4;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                boolean safedk_kw$4_shouldOverrideUrlLoading_069f23e881302e8c815c8697381e2b04 = safedk_kw$4_shouldOverrideUrlLoading_069f23e881302e8c815c8697381e2b04(webView, str);
                BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, webView, str, safedk_kw$4_shouldOverrideUrlLoading_069f23e881302e8c815c8697381e2b04);
                return safedk_kw$4_shouldOverrideUrlLoading_069f23e881302e8c815c8697381e2b04;
            }

            public boolean safedk_kw$4_shouldOverrideUrlLoading_069f23e881302e8c815c8697381e2b04(WebView p0, String p1) {
                if (kw.this.zmn(p1)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(p0, p1);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    kw.this.zmn(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                kw.this.zn();
            }
        });
    }

    private void zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        npsVar.setVerticalScrollBarEnabled(false);
        npsVar.setHorizontalScrollBarEnabled(false);
        npsVar.setMixedContentMode(0);
        npsVar.setJavaScriptEnabled(true);
        npsVar.setJavaScriptCanOpenWindowsAutomatically(true);
        npsVar.setDomStorageEnabled(true);
        npsVar.setDatabaseEnabled(true);
        npsVar.setCacheMode(-1);
        npsVar.setAllowFileAccess(false);
        npsVar.setSupportZoom(true);
        npsVar.setBuiltInZoomControls(true);
        npsVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        npsVar.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(String str) {
        nqi nqiVar;
        if (str == null || (nqiVar = this.fs) == null || nqiVar.bm() == null || this.hhw == null) {
            return false;
        }
        this.fs.bm().hhw(str);
        this.hhw.onClick(this.zn);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zmn(int i, int i2) {
        if (i == 0 || i2 == 0 || this.fb == null) {
            return;
        }
        int zn = jy.zn((Context) this.zmn);
        int btk = jy.btk(this.zmn);
        if (i / i2 <= zn / btk) {
            zn = (int) Math.ceil(r5 * r4);
        } else {
            btk = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.fb.getLayoutParams();
        layoutParams.width = zn;
        layoutParams.height = btk;
        layoutParams.gravity = 17;
        this.fb.setLayoutParams(layoutParams);
        this.fb.setOnClickListener(this.hhw);
        this.fb.setOnTouchListener(this.hhw);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean zmn(olo oloVar) {
        com.bytedance.sdk.openadsdk.core.rt.zn zn;
        if (!this.btk) {
            return false;
        }
        if (this.fb != null && this.nps.get()) {
            this.fb.setVisibility(0);
        } else {
            com.bytedance.sdk.component.bvs.nps npsVar = this.zn;
            if (npsVar != null) {
                npsVar.setVisibility(0);
                if (this.zn.getWebView() != null) {
                    this.zn.getWebView().setOnTouchListener(this.hhw);
                }
            }
        }
        nqi nqiVar = this.fs;
        if (nqiVar == null || nqiVar.bm() == null || (zn = this.fs.bm().zn()) == null) {
            return true;
        }
        zn.fs(oloVar != null ? oloVar.mw() : -1L);
        return true;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.btk btkVar) {
        com.bytedance.sdk.openadsdk.core.zn.nps npsVar = this.hhw;
        if (npsVar != null) {
            npsVar.zmn(btkVar);
        }
    }

    public void fs() {
        DeviceUtils.AudioInfoReceiver.fs(this);
        com.bytedance.sdk.component.bvs.nps npsVar = this.zn;
        if (npsVar != null) {
            oub.zmn(npsVar.getWebView());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mw.bvs
    public void zn(int i) {
        int i2 = this.iv;
        if (i2 == 0 && i > 0) {
            this.fs.bm().zmn().bvs(this.bvs.phc.mw());
        } else if (i2 > 0 && i == 0) {
            this.fs.bm().zmn().zg(this.bvs.phc.mw());
        }
        this.iv = i;
    }

    private static class zmn implements com.bytedance.sdk.component.btk.cyb {
        private final AtomicBoolean fb;
        private final String fs;
        private final WeakReference<ImageView> zmn;
        private final WeakReference<kw> zn;

        public zmn(ImageView imageView, String str, kw kwVar, AtomicBoolean atomicBoolean) {
            this.zmn = new WeakReference<>(imageView);
            this.fs = str;
            this.zn = new WeakReference<>(kwVar);
            this.fb = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            kw kwVar;
            ImageView imageView = this.zmn.get();
            if (imageView == null || (kwVar = this.zn.get()) == null || rcVar == null) {
                return;
            }
            Object fs = rcVar.fs();
            if (fs == null) {
                kwVar.zmn(-1, this.fs);
                return;
            }
            if (fs instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) fs);
            } else if (fs instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fs)) {
                    zn$$ExternalSyntheticApiModelOutline0.m(fs).start();
                }
                imageView.setImageDrawable((Drawable) fs);
            }
            this.fb.set(true);
            kwVar.zn();
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, @Nullable Throwable th) {
            kw kwVar;
            ImageView imageView = this.zmn.get();
            if (imageView == null || (kwVar = this.zn.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            kwVar.zmn(-2, this.fs);
        }
    }
}
