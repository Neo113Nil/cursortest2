package com.bytedance.sdk.openadsdk.core.mw.zn;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.btk.btk;
import com.bytedance.sdk.component.adexpress.fs.rc;
import com.bytedance.sdk.component.adexpress.fs.rt;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.iv.cyb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.olo;
import com.bytedance.sdk.openadsdk.core.widget.zmn.hhw;
import com.bytedance.sdk.openadsdk.utils.iqz;
import com.bytedance.sdk.openadsdk.utils.vlj;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class fb implements rc, zn<nps> {
    private String btk;
    private boolean bvs = false;
    private fkt fb;
    private nqi fs;
    private com.bytedance.sdk.openadsdk.core.mw.zn.zmn hhw;
    private zmn iv;
    private int nps;
    private final boolean zg;
    private Context zmn;
    private nps zn;

    public interface zmn {
        void nps();
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(rt rtVar) {
    }

    public fb(Context context, nqi nqiVar, boolean z) {
        this.nps = 1;
        this.zmn = context;
        this.fs = nqiVar;
        this.nps = nqiVar.ol();
        this.zg = z;
        if (z) {
            this.btk = olo.fs(this.fs).zmn(this.nps == 1);
        } else {
            this.btk = olo.zn(this.fs).zmn(this.nps == 1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zn
    public void zmn() {
        this.zn = new nps(this.zmn, nps.zn.EASY_PLAYABLE);
        nps();
        zg();
        if (this.zg) {
            return;
        }
        vlj.zmn(this.zn, false, this.fs.sft(), false, new vlj.fs() { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.fb.1
            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void zmn(View view, boolean z) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void zmn(boolean z) {
                fb.this.zmn(z);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void zmn() {
                fb.this.zmn(true);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vlj.fs
            public void fs() {
                fb.this.zmn(false);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zn
    public void fs() {
        if (TextUtils.isEmpty(this.btk)) {
            this.zn.setVisibility(8);
        } else {
            this.zn.a_(this.btk);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zn
    public void zmn(com.bytedance.sdk.openadsdk.core.mw.zn.zmn zmnVar) {
        this.hhw = zmnVar;
    }

    public fkt btk() {
        return this.fb;
    }

    private void nps() {
        this.zn.setBackgroundColor(0);
        this.zn.setBackgroundResource(R.color.transparent);
        this.zn.setVisibility(8);
        zmn(this.zn);
        if (this.fs != null) {
            this.zn.setWebViewClient(new hhw(this.zmn, this.fb, this.fs.ji(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.mw.zn.fb.2
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

                @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.hhw, com.bytedance.sdk.component.bvs.nps.zmn, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
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
                    if (fb.this.iv != null) {
                        fb.this.iv.nps();
                    }
                }
            });
        }
        btk.zmn().zmn(this.zn, this.fb);
        this.zn.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zmn.btk(this.fb));
    }

    private void zmn(nps npsVar) {
        if (npsVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(this.zmn).zmn(false).zmn(npsVar.getWebView());
            npsVar.setVerticalScrollBarEnabled(false);
            npsVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.zmn.fb.zmn(npsVar);
            npsVar.mw();
            npsVar.setUserAgentString(iqz.zmn(npsVar.getWebView(), BuildConfig.VERSION_CODE));
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
        } catch (Exception unused) {
        }
    }

    private void zg() {
        fkt fktVar = new fkt(this.zmn);
        this.fb = fktVar;
        fktVar.fs(this.zn).zmn(this.fs).zn(this.fs.ji()).fb(this.fs.ze()).btk(this.fs.gor()).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(0.0f, 0.0f, false, this.fs, null, null)).zmn(this).zmn(this.zn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zn
    public void zmn(cyb cybVar) {
        fkt fktVar = this.fb;
        if (fktVar != null) {
            fktVar.zmn(cybVar);
        }
    }

    public void zmn(boolean z) {
        if (z == this.bvs) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z ? 1 : 0);
        } catch (Exception e) {
            e.getMessage();
        }
        this.fb.zmn("visibleStateChange", jSONObject);
        this.bvs = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zn
    public void zn() {
        fkt fktVar = this.fb;
        if (fktVar != null) {
            fktVar.zn();
        }
        this.fb = null;
        try {
            nps npsVar = this.zn;
            if (npsVar != null) {
                ViewGroup viewGroup = (ViewGroup) npsVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.zn);
                }
                this.zn.cn();
            }
        } catch (Throwable unused) {
        }
        if (this.iv != null) {
            this.iv = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zn
    /* renamed from: hhw, reason: merged with bridge method [inline-methods] */
    public nps fb() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
        com.bytedance.sdk.openadsdk.core.mw.zn.zmn zmnVar = this.hhw;
        if (zmnVar != null) {
            zmnVar.zmn(view, i, znVar);
        }
    }

    public void zmn(zmn zmnVar) {
        this.iv = zmnVar;
    }
}
